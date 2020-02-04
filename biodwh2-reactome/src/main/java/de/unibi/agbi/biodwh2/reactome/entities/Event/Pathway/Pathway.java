package de.unibi.agbi.biodwh2.reactome.entities.Event.Pathway;

import de.unibi.agbi.biodwh2.reactome.entities.Event.Event;
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

    @Relationship(type = "hasEvent", direction = Relationship.INCOMING)
    public Set<Event> hasEvent = new HashSet<>();
    @Relationship(type = "isCanonical", direction = Relationship.INCOMING)
    public String isCanonical;
    @Relationship(type = "normalPathway", direction = Relationship.INCOMING)
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
