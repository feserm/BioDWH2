package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class Regulation extends DatabaseObject {
    public String releaseDate;

    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> acitveUnit = new HashSet<>();
    @Relationship(type = "GO_MolecularFunction")
    public GO_MolecularFunction activity;
    @Relationship(type = "InstanceEdit")
    public InstanceEdit authored;
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "GO_BiologicalProcess")
    public GO_BiologicalProcess goBiologicalProcess;
    @Relationship(type = "Regulation")
    public Set<Regulation> inferredFrom = new HashSet<>();
    @Relationship(type = "Regulation")
    public Set<Regulation> inferredTo = new HashSet<>();
    @Relationship(type = "Publication")
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "ReactionLikeEvent")
    public ReactionLikeEvent regulatedEntity;
    @Relationship(type = "PhysicalEntity")
    public PhysicalEntity regulator;
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> reviewed = new HashSet<>();
    @Relationship(type = "InstanceEdit")
    public Set<InstanceEdit> revised = new HashSet<>();
    @Relationship(type = "Summation")
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
