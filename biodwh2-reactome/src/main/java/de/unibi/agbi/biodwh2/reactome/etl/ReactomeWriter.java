package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.core.model.graph.Edge;
import de.unibi.agbi.biodwh2.core.model.graph.Graph;
import de.unibi.agbi.biodwh2.core.model.graph.Node;
import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;

import java.util.*;

/**
 * Created by manuel on 16.01.20.
 */
public class ReactomeWriter {
    private Graph graph = new Graph();

    public Graph getGraph() {
        return graph;
    }

    public void extendGraph(final Collection collection) {
        for (DatabaseObject o : (Collection<DatabaseObject>) collection) {
            Node reactomeNode = new Node(o.id, o.schemaClass);
            for (String f : o.getFieldNames()) {
                Map<String, Object> values = o.getFieldValues();
                reactomeNode.setProperty(f, values.get(f));
            }
            graph.addNode(reactomeNode);

            //TODO: Verallgemeinern mit reflect
            for (String f : o.getEdgeNames()) {
                if (o.getEdgeValues().get(f) instanceof Set) {
                    Class type = o.getEdgeTypes().get(f);
                    for (DatabaseObject q : (Set<DatabaseObject>) o.getEdgeValues().get(f)) {
                        Node toNode = graph.getNode(q.id);
                        if (toNode == null) {
                            toNode = new Node(q.id, q.schemaClass);
                        }
                        Edge reactomeEdge = new Edge(reactomeNode, toNode, f);
                        graph.addEdge(reactomeEdge);
                    }
                } else {
                    DatabaseObject q = (DatabaseObject) o.getEdgeValues().get(f);
                    if (q != null) {
                        Node toNode = graph.getNode(q.id);
                        if (toNode == null) {
                            toNode = new Node(q.id, q.getSchemaClass());
                        }
                        Edge reactomeEdge = new Edge(reactomeNode, toNode, f);
                        graph.addEdge(reactomeEdge);
                    }
                }
            }
        }
    }
}
