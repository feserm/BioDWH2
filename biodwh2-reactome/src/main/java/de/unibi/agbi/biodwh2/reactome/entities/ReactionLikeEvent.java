package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class ReactionLikeEvent extends Event {
    public String category;
    public boolean isChimeric;
    public String systematicName;

    @Relationship(type = "catalystActivity")
    public Set<CatalystActivity> catalystActivity = new HashSet<>();
    @Relationship(type = "catalystActivityReference")
    public CatalystActivityReference catalystActivityReference;
    @Relationship(type = "entityFunctionalStatus")
    public Set<EntityFunctionalStatus> entityFunctionalStatus = new HashSet<>();
    @Relationship(type = "entityOnOtherCell")
    public Set<PhysicalEntity> entityOnOtherCell = new HashSet<>();
    @Relationship(type = "input")
    public Set<PhysicalEntity> input = new HashSet<>();
    @Relationship(type = "normalReaction")
    public ReactionLikeEvent normalReaction;
    @Relationship(type = "output")
    public Set<PhysicalEntity> output = new HashSet<>();
    @Relationship(type = "regulatedBy")
    public Set<Regulation> regulatedBy = new HashSet<>();
    @Relationship(type = "regulationReference")
    public Set<RegulationReference> regulationReference = new HashSet<>();
    @Relationship(type = "requiredInputComponent")
    public Set<PhysicalEntity> requiredInputComponent = new HashSet<>();

    public ReactionLikeEvent() {

    }

    public String getCategory() {
        return category;
    }

    public boolean isChimeric() {
        return isChimeric;
    }

    public String getSystematicName() {
        return systematicName;
    }

    public Set<CatalystActivity> getCatalystActivity() {
        return catalystActivity;
    }

    public CatalystActivityReference getCatalystActivityReference() {
        return catalystActivityReference;
    }

    public Set<EntityFunctionalStatus> getEntityFunctionalStatus() {
        return entityFunctionalStatus;
    }

    public Set<PhysicalEntity> getEntityOnOtherCell() {
        return entityOnOtherCell;
    }

    public Set<PhysicalEntity> getInput() {
        return input;
    }

    public ReactionLikeEvent getNormalReaction() {
        return normalReaction;
    }

    public Set<PhysicalEntity> getOutput() {
        return output;
    }

    public Set<Regulation> getRegulatedBy() {
        return regulatedBy;
    }

    public Set<RegulationReference> getRegulationReference() {
        return regulationReference;
    }

    public Set<PhysicalEntity> getRequiredInputComponent() {
        return requiredInputComponent;
    }
}
