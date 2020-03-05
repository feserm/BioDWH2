package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class RegulationReference extends ControlReference {
    @Relationship(type = "regulatedBy")
    public Regulation regulatedBy;
    @Relationship(type = "regulationReference")
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
