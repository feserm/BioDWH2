package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class Pathway extends Event {
    public String doi;
    public boolean hasDiagram;
    public boolean hasEHLD;
    public String isCanonical;


    @Relationship(type = "Event")
    public Set<Event> hasEvent = new HashSet<>();
    @Relationship(type = "Pathway")
    public Pathway normalPathway;

    public Pathway() {

    }

    public String getDoi() {
        return doi;
    }

    public boolean isHasDiagram() {
        return hasDiagram;
    }

    public boolean isHasEHLD() {
        return hasEHLD;
    }

    public Set<Event> getHasEvent() {
        return hasEvent;
    }

    public String getIsCanonical() {
        return isCanonical;
    }

    public Pathway getNormalPathway() {
        return normalPathway;
    }
}
