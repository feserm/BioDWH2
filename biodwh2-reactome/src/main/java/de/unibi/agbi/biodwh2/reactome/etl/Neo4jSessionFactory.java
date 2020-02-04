package de.unibi.agbi.biodwh2.reactome.etl;

import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

/**
 * Created by manuel on 13.01.20.
 */
public class Neo4jSessionFactory {
    private final static Configuration configuration = new Configuration.Builder().uri("http://localhost:7474")
                                                                                  .credentials("neo4j", "passwort")
                                                                                  .build();
    private final static SessionFactory sessionFactory = new SessionFactory(configuration, "de.unibi.agbi.biodwh2.reactome.entities");
    private static Neo4jSessionFactory factory = new Neo4jSessionFactory();

    public static Neo4jSessionFactory getInstance() {
        return factory;
    }

    // prevent external instantiation
    private Neo4jSessionFactory() {
    }

    public Session getNeo4jSession() {
        return sessionFactory.openSession();
    }
}

