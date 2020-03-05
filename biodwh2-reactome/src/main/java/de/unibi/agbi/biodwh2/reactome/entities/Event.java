package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class Event extends DatabaseObject {
    public String definition;
    public boolean isInDisease;
    public boolean isInferred;
    public String[] name;
    public String releaseDate;
    public String releaseStatus;

    @Relationship(type = "authored")
    public Set<InstanceEdit> authored = new HashSet<>();
    @Relationship(type = "compartment")
    public Set<Compartment> compartment = new HashSet<>();
    @Relationship(type = "crossReference")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "disease")
    public Set<Disease> disease = new HashSet<>();
    @Relationship(type = "edited")
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "eventOf")
    public Set<Pathway> eventOf = new HashSet<>();
    @Relationship(type = "evidenceType")
    public EvidenceType evidenceType;
    @Relationship(type = "figure")
    public Set<Figure> figure = new HashSet<>();
    @Relationship(type = "followingEvent")
    public Set<Event> followingEvent = new HashSet<>();
    @Relationship(type = "goBiologicalProcess")
    public GO_BiologicalProcess goBiologicalProcess;
    @Relationship(type = "inferredFrom")
    public Set<Event> inferredFrom = new HashSet<>();
    @Relationship(type = "literatureReference")
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "orthologousEvent")
    public Set<Event> orthologousEvent = new HashSet<>();
    @Relationship(type = "precedingEvent")
    public Set<Event> precedingEvent = new HashSet<>();
    @Relationship(type = "relatedSpecies")
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "reviewed")
    public InstanceEdit reviewed;
    @Relationship(type = "revised")
    public InstanceEdit revised;
    @Relationship(type = "species")
    public Set<Species> species = new HashSet<>();
    @Relationship(type = "summation")
    public Set<Summation> summation = new HashSet<>();

    public Event() {

    }

    public String getDefinition() {
        return definition;
    }

    public boolean isInDisease() {
        return isInDisease;
    }

    public boolean isInferred() {
        return isInferred;
    }

    public String[] getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getReleaseStatus() {
        return releaseStatus;
    }

    public Set<InstanceEdit> getAuthored() {
        return authored;
    }

    public Set<Compartment> getCompartment() {
        return compartment;
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

    public Set<Pathway> getEventOf() {
        return eventOf;
    }

    public EvidenceType getEvidenceType() {
        return evidenceType;
    }

    public Set<Figure> getFigure() {
        return figure;
    }

    public Set<Event> getFollowingEvent() {
        return followingEvent;
    }

    public GO_BiologicalProcess getGoBiologicalProcess() {
        return goBiologicalProcess;
    }

    public Set<Event> getInferredFrom() {
        return inferredFrom;
    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }

    public Set<Event> getOrthologousEvent() {
        return orthologousEvent;
    }

    public Set<Event> getPrecedingEvent() {
        return precedingEvent;
    }

    public Set<Species> getRelatedSpecies() {
        return relatedSpecies;
    }

    public InstanceEdit getReviewed() {
        return reviewed;
    }

    public InstanceEdit getRevised() {
        return revised;
    }

    public Set<Species> getSpecies() {
        return species;
    }

    public Set<Summation> getSummation() {
        return summation;
    }
}
