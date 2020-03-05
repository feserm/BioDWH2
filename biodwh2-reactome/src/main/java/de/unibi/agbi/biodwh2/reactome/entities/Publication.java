package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.Person;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class Publication extends DatabaseObject {
    public String title;

    @Relationship(type = "Person")
    public Set<Person> author = new HashSet<>();

    public Publication() {

    }

    public String getTitle() {
        return title;
    }

    public Set<Person> getAuthor() {
        return author;
    }
}
