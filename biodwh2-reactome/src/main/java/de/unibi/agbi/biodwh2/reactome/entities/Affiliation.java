package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.Publication.Book;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class Affiliation extends DatabaseObject {
    public String address;
    public Set<String> name = new HashSet<>();
    @Relationship(type = "affiliation", direction = Relationship.OUTGOING)
    public Set<Person> affiliation = new HashSet<>();
    @Relationship(type = "publisher", direction = Relationship.OUTGOING)
    public Book publisher;

    public Affiliation() {

    }

    public String getAddress() {
        return address;
    }

    public Set<String> getName() {
        return name;
    }

    public Set<Person> getAffiliation() {
        return affiliation;
    }

    public Book getPublisher() {
        return publisher;
    }
}
