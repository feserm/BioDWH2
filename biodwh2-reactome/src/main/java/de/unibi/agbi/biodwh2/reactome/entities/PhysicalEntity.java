package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class PhysicalEntity extends DatabaseObject {
    public String definition;
    public boolean inDisease;
    public Set<String> name = new HashSet<>();
    public String systematicName;

    @Relationship(type = "authored")
    public InstanceEdit authored;
    @Relationship(type = "catalystActivity")
    public Set<CatalystActivity> catalystActivities = new HashSet<>();
    @Relationship(type = "compartment")
    public Set<Compartment> compartment = new HashSet<>();
    @Relationship(type = "componentOf")
    public Set<Complex> componentOf = new HashSet<>();
    @Relationship(type = "consumedByEvent")
    public Set<ReactionLikeEvent> consumedByEvent = new HashSet<>();
    @Relationship(type = "crossReference")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "disease")
    public Set<Disease> disease = new HashSet<>();
    @Relationship(type = "edited")
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "figure")
    public Set<Figure> figure = new HashSet<>();
    @Relationship(type = "goCellularComponent")
    public GO_CellularComponent goCellularComponent;
    @Relationship(type = "inferredFrom")
    public Set<PhysicalEntity> inferredFrom = new HashSet<>();
    @Relationship(type = "inferredTo")
    public Set<PhysicalEntity> inferredTo = new HashSet<>();
    @Relationship(type = "isRequired")
    public Set<Requirement> isRequired = new HashSet<>();
    @Relationship(type = "literatureReference")
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "memberOf")
    public Set<PhysicalEntity> memberOf = new HashSet<>();
    @Relationship(type = "negativelyRegulates")
    public Set<NegativeRegulation> negativelyRegulates = new HashSet<>();
    @Relationship(type = "posivitelyRegulates")
    public Set<PositiveRegulation> positivelyRegulates = new HashSet<>();
    @Relationship(type = "producedByEvent")
    public Set<ReactionLikeEvent> producedByEvent = new HashSet<>();
    @Relationship(type = "repeatedUnitOf")
    public Set<Polymer> repeatedUnitOf = new HashSet<>();
    @Relationship(type = "reviewed")
    public Set<InstanceEdit> reviewed = new HashSet<>();
    @Relationship(type = "revised")
    public Set<InstanceEdit> revised = new HashSet<>();
    @Relationship(type = "summation")
    public Set<Summation> summation = new HashSet<>();

    public String getDefinition() {
        return definition;
    }

    public boolean isInDisease() {
        return inDisease;
    }

    public Set<String> getName() {
        return name;
    }

    public String getSystematicName() {
        return systematicName;
    }

    public InstanceEdit getAuthored() {
        return authored;
    }

    public Set<CatalystActivity> getCatalystActivities() {
        return catalystActivities;
    }

    public Set<Compartment> getCompartment() {
        return compartment;
    }

    public Set<Complex> getComponentOf() {
        return componentOf;
    }

    public Set<ReactionLikeEvent> getConsumedByEvent() {
        return consumedByEvent;
    }

    public Set<DatabaseIdentifier> getCrossReference() {
        return crossReference;
    }

    public Set<Disease> getDisease() {
        return disease;
    }

    public Set<InstanceEdit> getEdited() {
        return edited;
    }

    public Set<Figure> getFigure() {
        return figure;
    }

    public GO_CellularComponent getGoCellularComponent() {
        return goCellularComponent;
    }

    public Set<PhysicalEntity> getInferredFrom() {
        return inferredFrom;
    }

    public Set<PhysicalEntity> getInferredTo() {
        return inferredTo;
    }

    public Set<Requirement> getIsRequired() {
        return isRequired;
    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }

    public Set<PhysicalEntity> getMemberOf() {
        return memberOf;
    }

    public Set<NegativeRegulation> getNegativelyRegulates() {
        return negativelyRegulates;
    }

    public Set<PositiveRegulation> getPositivelyRegulates() {
        return positivelyRegulates;
    }

    public Set<ReactionLikeEvent> getProducedByEvent() {
        return producedByEvent;
    }

    public Set<Polymer> getRepeatedUnitOf() {
        return repeatedUnitOf;
    }

    public Set<InstanceEdit> getReviewed() {
        return reviewed;
    }

    public Set<InstanceEdit> getRevised() {
        return revised;
    }

    public Set<Summation> getSummation() {
        return summation;
    }

    public PhysicalEntity() {

    }
}
