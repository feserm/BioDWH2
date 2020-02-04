package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity;

import de.unibi.agbi.biodwh2.reactome.entities.*;
import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.Disease;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.Compartment;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.GO_CellularComponent;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.NegativeRegulation.NegativeRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.PositiveRegulation.PositiveRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.PositiveRegulation.Requirement;
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

    @Relationship(type = "authored", direction = Relationship.INCOMING)
    public InstanceEdit authored;
    @Relationship(type = "catalystActivity", direction = Relationship.INCOMING)
    public Set<CatalystActivity> catalystActivities = new HashSet<>();
    @Relationship(type = "compartment", direction = Relationship.INCOMING)
    public Set<Compartment> compartment = new HashSet<>();
    @Relationship(type = "componentOf", direction = Relationship.INCOMING)
    public Set<Complex> componentOf = new HashSet<>();
    @Relationship(type = "consumedByEvent", direction = Relationship.INCOMING)
    public Set<ReactionLikeEvent> consumedByEvent = new HashSet<>();
    @Relationship(type = "crossReference", direction = Relationship.INCOMING)
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "disease", direction = Relationship.INCOMING)
    public Set<Disease> disease = new HashSet<>();
    @Relationship(type = "edited", direction = Relationship.INCOMING)
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "figure", direction = Relationship.INCOMING)
    public Set<Figure> figure = new HashSet<>();
    @Relationship(type = "goCellularComponent", direction = Relationship.INCOMING)
    public GO_CellularComponent goCellularComponent;
    @Relationship(type = "inferredFrom", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> inferredFrom = new HashSet<>();
    @Relationship(type = "inferredTo", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> inferredTo = new HashSet<>();
    @Relationship(type = "isRequired", direction = Relationship.INCOMING)
    public Set<Requirement> isRequired = new HashSet<>();
    @Relationship(type = "literatureReference", direction = Relationship.INCOMING)
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "memberOf", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> memberOf = new HashSet<>();
    @Relationship(type = "negativelyRegulates", direction = Relationship.INCOMING)
    public Set<NegativeRegulation> negativelyRegulates = new HashSet<>();
    @Relationship(type = "posivitelyRegulates", direction = Relationship.INCOMING)
    public Set<PositiveRegulation> positivelyRegulates = new HashSet<>();
    @Relationship(type = "producedByEvent", direction = Relationship.INCOMING)
    public Set<ReactionLikeEvent> producedByEvent = new HashSet<>();
    @Relationship(type = "repeatedUnitOf", direction = Relationship.INCOMING)
    public Set<Polymer> repeatedUnitOf = new HashSet<>();
    @Relationship(type = "reviewed", direction = Relationship.INCOMING)
    public Set<InstanceEdit> reviewed = new HashSet<>();
    @Relationship(type = "revised", direction = Relationship.INCOMING)
    public Set<InstanceEdit> revised = new HashSet<>();
    @Relationship(type = "summation", direction = Relationship.INCOMING)
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
