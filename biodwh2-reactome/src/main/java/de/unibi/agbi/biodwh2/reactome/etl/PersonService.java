package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.reactome.entities.Person;

import java.util.Collections;
import java.util.Map;

/**
 * Created by manuel on 13.01.20.
 */
public class PersonService extends GenericService<Person> {

    @Override
    public Iterable<Person> findAll() {
        return session.loadAll(Person.class, 1);
    }

    Iterable<Map<String, Object>> getPersons() {
        String query = "MATCH (p:Person) return p";
        return Neo4jSessionFactory.getInstance().getNeo4jSession().query(query, Collections.EMPTY_MAP);
    }

    @Override
    Class<Person> getEntityType() {
        return Person.class;
    }
}
