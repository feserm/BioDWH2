package de.unibi.agbi.biodwh2.reactome.entities.Regulation;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_BiologicalProcess;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_MolecularFunction;
import de.unibi.agbi.biodwh2.reactome.entities.InstanceEdit;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import de.unibi.agbi.biodwh2.reactome.entities.Summation;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class Regulation extends DatabaseObject {
    public String releaseDate;

    @Relationship(type = "activeUnit", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> acitveUnit = new HashSet<>();
    @Relationship(type = "activity", direction = Relationship.INCOMING)
    public GO_MolecularFunction activity;
    @Relationship(type = "authored", direction = Relationship.INCOMING)
    public InstanceEdit authored;
    @Relationship(type = "edited", direction = Relationship.INCOMING)
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "goBiologicalProcess", direction = Relationship.INCOMING)
    public GO_BiologicalProcess goBiologicalProcess;
    @Relationship(type = "inferredFrom", direction = Relationship.INCOMING)
    public Set<Regulation> inferredFrom = new HashSet<>();
    @Relationship(type = "inferredTo", direction = Relationship.INCOMING)
    public Set<Regulation> inferredTo = new HashSet<>();
    @Relationship(type = "literatureReference", direction = Relationship.INCOMING)
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "regulatedEntity", direction = Relationship.INCOMING)
    public ReactionLikeEvent regulatedEntity;
    @Relationship(type = "regulator", direction = Relationship.INCOMING)
    public PhysicalEntity regulator;
    @Relationship(type = "reviewed", direction = Relationship.INCOMING)
    public Set<InstanceEdit> reviewed = new HashSet<>();
    @Relationship(type = "revised", direction = Relationship.INCOMING)
    public Set<InstanceEdit> revised = new HashSet<>();
    @Relationship(type = "summation", direction = Relationship.INCOMING)
    public Set<Summation> summation = new HashSet<>();

    public Regulation() {

    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public Set<PhysicalEntity> getAcitveUnit() {
        return acitveUnit;
    }

    public GO_MolecularFunction getActivity() {
        return activity;
    }

    public InstanceEdit getAuthored() {
        return authored;
    }

    public Set<InstanceEdit> getEdited() {
        return edited;
    }

    public GO_BiologicalProcess getGoBiologicalProcess() {
        return goBiologicalProcess;
    }

    public Set<Regulation> getInferredFrom() {
        return inferredFrom;
    }

    public Set<Regulation> getInferredTo() {
        return inferredTo;
    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }

    public ReactionLikeEvent getRegulatedEntity() {
        return regulatedEntity;
    }

    public PhysicalEntity getRegulator() {
        return regulator;
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
}
