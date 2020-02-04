package de.unibi.agbi.biodwh2.reactome.entities.ControlReference;

import de.unibi.agbi.biodwh2.reactome.entities.CatalystActivity;
import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public class CatalystActivityReference extends ControlReference {
    @Relationship(type = "catalystActivity", direction = Relationship.INCOMING)
    public CatalystActivity catalystActivity;
    @Relationship(type = "catalystActivityReference", direction = Relationship.OUTGOING)
    public ReactionLikeEvent catalystActivityReference;
    public CatalystActivityReference() {

    }

    public CatalystActivity getCatalystActivity() {
        return catalystActivity;
    }

    public ReactionLikeEvent getCatalystActivityReference() {
        return catalystActivityReference;
    }
}
