package de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent;

import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public class Reaction extends ReactionLikeEvent {
    @Relationship(type = "reverseReaction", direction = Relationship.INCOMING)
    public Reaction reverseReaction;

    public Reaction() {

    }

    public Reaction getReverseReaction() {
        return reverseReaction;
    }
}
