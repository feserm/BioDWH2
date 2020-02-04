package de.unibi.agbi.biodwh2.reactome.etl;


import org.neo4j.ogm.session.Session;

/**
 * Created by manuel on 13.01.20.
 */
abstract class GenericService<T> implements Service<T> {
    private static final int DEPTH_LIST = 0;
    private static final int DEPTH_ENTITY = 1;
    protected Session session = Neo4jSessionFactory.getInstance().getNeo4jSession();

    @Override
    public Iterable<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }

    @Override
    public T find(Long id) {
        return session.load(getEntityType(), id, DEPTH_ENTITY);
    }

    abstract Class<T> getEntityType();
}
