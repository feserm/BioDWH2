package de.unibi.agbi.biodwh2.reactome.entities.ControlReference;

import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.Regulation;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class RegulationReference extends ControlReference {
    @Relationship(type = "regulatedBy", direction = Relationship.INCOMING)
    public Regulation regulatedBy;
    @Relationship(type = "regulationReference", direction = Relationship.OUTGOING)
    public Set<ReactionLikeEvent> regulationReference = new HashSet<>();

    public RegulationReference() {

    }

    public Regulation getRegulatedBy() {
        return regulatedBy;
    }

    public Set<ReactionLikeEvent> getRegulationReference() {
        return regulationReference;
    }
}
