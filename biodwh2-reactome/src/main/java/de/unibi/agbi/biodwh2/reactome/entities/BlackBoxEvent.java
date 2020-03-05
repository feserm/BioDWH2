package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.Event;
import de.unibi.agbi.biodwh2.reactome.entities.ReactionLikeEvent;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public class BlackBoxEvent extends ReactionLikeEvent {
    @Relationship(type = "templateEvent")
    public Event templateEvent;

    public BlackBoxEvent() {

    }

    public Event getTemplateEvent() {
        return templateEvent;
    }
}
