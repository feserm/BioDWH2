package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public class Reaction extends ReactionLikeEvent {
    @Relationship(type = "Reaction")
    public Reaction reverseReaction;

    public Reaction() {

    }

    public Reaction getReverseReaction() {
        return reverseReaction;
    }
}
