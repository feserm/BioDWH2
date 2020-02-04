package de.unibi.agbi.biodwh2.reactome.etl;

/**
 * Created by manuel on 13.01.20.
 */
interface Service<T> {
    Iterable<T> findAll();
    T find(Long id);
}
