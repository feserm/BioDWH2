package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class EntityFunctionalStatus extends DatabaseObject {
    @Relationship(type = "diseaseEntity", direction = Relationship.INCOMING)
    public PhysicalEntity diseaseEntity;
    @Relationship(type = "normalEntity", direction = Relationship.INCOMING)
    public PhysicalEntity normalEntity;
    @Relationship(type = "functionalStatus", direction = Relationship.INCOMING)
    public Set<FunctionalStatus> functionalStatus = new HashSet<>();
    @Relationship(type = "entityFunctionalStatus", direction = Relationship.OUTGOING)
    public Set<ReactionLikeEvent> entityFunctionalStatus = new HashSet<>();

    public EntityFunctionalStatus() {

    }

    public PhysicalEntity getDiseaseEntity() {
        return diseaseEntity;
    }

    public PhysicalEntity getNormalEntity() {
        return normalEntity;
    }

    public Set<FunctionalStatus> getFunctionalStatus() {
        return functionalStatus;
    }

    public Set<ReactionLikeEvent> getEntityFunctionalStatus() {
        return entityFunctionalStatus;
    }
}
