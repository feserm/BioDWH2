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

    @Relationship(type = "InstanceEdit")
    public InstanceEdit authored;
    @Relationship(type = "CatalystActivity")
    public Set<CatalystActivity> catalystActivities = new HashSet<>();
    @Relationship(type = "Compartment")
    public Set<Compartment> compartment = new HashSet<>();
    @Relationship(type = "Complex")
    public Set<Complex> componentOf = new HashSet<>();
    @Relationship(type = "ReactionLikeEvent")
    public Set<ReactionLikeEvent> consumedByEvent = new HashSet<>();
    @Relationship(type = "DatabaseIdentifier")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "Disease")
    public Set<Disease> disease = new HashSet<>();
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "Figure")
    public Set<Figure> figure = new HashSet<>();
    @Relationship(type = "GO_CellularComponent")
    public GO_CellularComponent goCellularComponent;
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> inferredFrom = new HashSet<>();
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> inferredTo = new HashSet<>();
    @Relationship(type = "Requirement")
    public Set<Requirement> isRequired = new HashSet<>();
    @Relationship(type = "Publication")
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> memberOf = new HashSet<>();
    @Relationship(type = "NegativeRegulation")
    public Set<NegativeRegulation> negativelyRegulates = new HashSet<>();
    @Relationship(type = "PositiveRegulation")
    public Set<PositiveRegulation> positivelyRegulates = new HashSet<>();
    @Relationship(type = "ReactionLikeEvent")
    public Set<ReactionLikeEvent> producedByEvent = new HashSet<>();
    @Relationship(type = "Polymer")
    public Set<Polymer> repeatedUnitOf = new HashSet<>();
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> reviewed = new HashSet<>();
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> revised = new HashSet<>();
    @Relationship(type = "Summation")
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
