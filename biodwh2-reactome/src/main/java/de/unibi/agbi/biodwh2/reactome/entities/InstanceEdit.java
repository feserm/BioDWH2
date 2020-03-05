package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class InstanceEdit extends DatabaseObject {
    public String dateTime;
    public String note;

    @Relationship(type = "Person")
    public Set<Person> author = new HashSet<>();

    public InstanceEdit() {

    }

    public String getDateTime() {
        return dateTime;
    }

    public String getNote() {
        return note;
    }

    public Set<Person> getAuthor() {
        return author;
    }
}
