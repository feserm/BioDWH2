package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class Summation extends DatabaseObject {
    public String text;

    @Relationship(type = "Publication")
    public Set<Publication> literatureReference = new HashSet<>();

    public Summation() {

    }

    public String getText() {
        return text;
    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }
}
