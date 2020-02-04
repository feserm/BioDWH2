package de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent;

import de.unibi.agbi.biodwh2.reactome.entities.CatalystActivity;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.CatalystActivityReference;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.Regulation;
import de.unibi.agbi.biodwh2.reactome.entities.EntityFunctionalStatus;
import de.unibi.agbi.biodwh2.reactome.entities.Event.Event;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.RegulationReference;
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

    @Relationship(type = "catalystActivity", direction = Relationship.INCOMING)
    public Set<CatalystActivity> catalystActivity = new HashSet<>();
    @Relationship(type = "catalystActivityReference", direction = Relationship.INCOMING)
    public CatalystActivityReference catalystActivityReference;
    @Relationship(type = "entityFunctionalStatus", direction = Relationship.INCOMING)
    public Set<EntityFunctionalStatus> entityFunctionalStatus = new HashSet<>();
    @Relationship(type = "entityOnOtherCell", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> entityOnOtherCell = new HashSet<>();
    @Relationship(type = "input", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> input = new HashSet<>();
    @Relationship(type = "normalReaction", direction = Relationship.INCOMING)
    public ReactionLikeEvent normalReaction;
    @Relationship(type = "output", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> output = new HashSet<>();
    @Relationship(type = "regulatedBy", direction = Relationship.INCOMING)
    public Set<Regulation> regulatedBy = new HashSet<>();
    @Relationship(type = "regulationReference", direction = Relationship.INCOMING)
    public Set<RegulationReference> regulationReference = new HashSet<>();
    @Relationship(type = "requiredInputComponent", direction = Relationship.INCOMING)
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
