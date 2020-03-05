package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.core.DataSource;
import de.unibi.agbi.biodwh2.core.Workspace;
import de.unibi.agbi.biodwh2.core.etl.Parser;
import de.unibi.agbi.biodwh2.core.exceptions.ParserException;
import de.unibi.agbi.biodwh2.core.model.graph.Edge;
import de.unibi.agbi.biodwh2.core.model.graph.Graph;
import de.unibi.agbi.biodwh2.core.model.graph.Node;
import de.unibi.agbi.biodwh2.reactome.ReactomeDataSource;
import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import org.neo4j.ogm.session.Session;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.logging.Level;


/**
 * Created by manuel on 18.12.19.
 */
public class ReactomeParser extends Parser {

    public static void main(final String[] args) {
        java.util.logging.Logger.getLogger("org.neo4j.ogm.drivers.http.request.HttpRequest").setLevel(Level.WARNING);
        Graph graph = new Graph();
        ReactomeParser r = new ReactomeParser();
        Collection currentEntity;
        //ReactomeWriter r = new ReactomeWriter();
        for (Class entity : ReactomeModel.entitylist) {
            Session currentSession = Neo4jSessionFactory.getInstance().getNeo4jSession();
            currentEntity = currentSession.loadAll(entity, 1);
//            currentEntity = currentSession.query();
            /*String query1 = "MATCH ()<-[r]-(:Pathway) RETURN DISTINCT type(r)";
            String query2 = "MATCH (l)<-[:literatureReference]-(p:Pathway) WHERE p.stId IN ['R-HSA-9612973'] return l.pubMedIdentifier, p.stId";
            String query3 = "MATCH (f:Figure)<--(p:Pathway) return p.dbId, f.dbId";
            Iterable<Map<String, Object>> queryRes1 = currentSession.query(query1, Collections.EMPTY_MAP);
            Iterable<Map<String, Object>> queryRes2 = currentSession.query(query2, Collections.EMPTY_MAP);
            Iterable<Map<String, Object>> queryRes3 = currentSession.query(query3, Collections.EMPTY_MAP);*/
            currentSession.clear();
            r.extendGraph(currentEntity, graph);
            //TODO Pagination
        }
        System.out.print("finished.");
    }

    @Override
    public boolean parse(final Workspace workspace, final DataSource dataSource) throws ParserException {
        boolean entitylistFound = false;
        Collection currentEntity;
        for (Class entity : ReactomeModel.entitylist) {
            currentEntity = Neo4jSessionFactory.getInstance().getNeo4jSession().loadAll(entity);
            extendGraph(currentEntity, ((ReactomeDataSource) dataSource).graph);
            entitylistFound = true;
        }
        return entitylistFound;
    }

    private void extendGraph(final Collection collection, final Graph graph) {
        for (DatabaseObject o : (Collection<DatabaseObject>) collection) {
            Node reactomeNode = null;
            try {
                reactomeNode = new Node(o.getClass().getField("id").getLong(o), o.getClass().getField("schemaClass")
                                                                                 .get(o).toString());
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
            for (Field f : o.getClass().getFields()) {
                Object fieldValue = null;
                try {
                    fieldValue = f.get(o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (!Arrays.stream(ReactomeModel.entitylist).anyMatch(
                        f.getType()::equals)) {
                    if (!(f.getType().equals(Set.class) && Arrays.stream(ReactomeModel.entitylist).anyMatch(
                            ((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0]::equals))) {
                        if (reactomeNode != null) {
                            reactomeNode.setProperty(f.getName(), fieldValue);
                        }
                    }
                }
                //System.out.println(f.getName() + "\t" + f.getGenericType() + "\t" + fieldValue);
            }
            graph.addNode(reactomeNode);

            for (Field f : o.getClass().getFields()) {
                if (Arrays.stream(ReactomeModel.entitylist).anyMatch(f.getType()::equals)) {
                    DatabaseObject q = null;
                    try {
                        q = (DatabaseObject) f.get(o);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    if (q != null) {
                        Node toNode = graph.getNode(q.id);
                        if (toNode == null) {
                            toNode = new Node(q.id, q.schemaClass);
                        }
                        Edge reactomeEdge = new Edge(reactomeNode, toNode, f.getName());
                        graph.addEdge(reactomeEdge);
                    }
                } else if ((f.getType().equals(Set.class) && Arrays.stream(ReactomeModel.entitylist).anyMatch(
                        ((ParameterizedType) f.getGenericType()).getActualTypeArguments()[0]::equals))) {
                    try {
                        for (DatabaseObject q : (Set<DatabaseObject>) f.get(o)) {
                            Node toNode = graph.getNode(q.id);
                            if (toNode == null) {
                                toNode = new Node(q.id, q.schemaClass);
                            }
                            Edge reactomeEdge = new Edge(reactomeNode, toNode, f.getName());
                            graph.addEdge(reactomeEdge);
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
