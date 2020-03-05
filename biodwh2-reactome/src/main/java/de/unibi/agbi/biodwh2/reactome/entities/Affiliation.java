package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class Affiliation extends DatabaseObject {
    public String address;
    public Set<String> name = new HashSet<>();

    public Affiliation() {

    }

    public String getAddress() {
        return address;
    }

    public Set<String> getName() {
        return name;
    }

}
