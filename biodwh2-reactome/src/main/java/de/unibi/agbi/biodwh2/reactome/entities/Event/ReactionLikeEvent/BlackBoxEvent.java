package de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent;

import de.unibi.agbi.biodwh2.reactome.entities.Event.Event;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public class BlackBoxEvent extends ReactionLikeEvent {
    @Relationship(type = "templateEvent", direction = Relationship.INCOMING)
    public Event templateEvent;

    public BlackBoxEvent() {

    }

    public Event getTemplateEvent() {
        return templateEvent;
    }
}
