package de.unibi.agbi.biodwh2.reactome.entities.Event;

import de.unibi.agbi.biodwh2.reactome.entities.*;
import de.unibi.agbi.biodwh2.reactome.entities.Event.Pathway.Pathway;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.Disease;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_BiologicalProcess;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.Compartment;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Species;
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

    @Relationship(type = "authored", direction = Relationship.INCOMING)
    public Set<InstanceEdit> authored = new HashSet<>();
    @Relationship(type = "compartment", direction = Relationship.INCOMING)
    public Set<Compartment> compartment = new HashSet<>();
    @Relationship(type = "crossReference", direction = Relationship.INCOMING)
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "disease", direction = Relationship.INCOMING)
    public Set<Disease> disease = new HashSet<>();
    @Relationship(type = "edited", direction = Relationship.INCOMING)
    public Set<InstanceEdit> edited = new HashSet<>();
    @Relationship(type = "eventOf", direction = Relationship.INCOMING)
    public Set<Pathway> eventOf = new HashSet<>();
    @Relationship(type = "evidenceType", direction = Relationship.INCOMING)
    public EvidenceType evidenceType;
    @Relationship(type = "figure", direction = Relationship.INCOMING)
    public Set<Figure> figure = new HashSet<>();
    @Relationship(type = "followingEvent", direction = Relationship.INCOMING)
    public Set<Event> followingEvent = new HashSet<>();
    @Relationship(type = "goBiologicalProcess", direction = Relationship.INCOMING)
    public GO_BiologicalProcess goBiologicalProcess;
    @Relationship(type = "inferredFrom", direction = Relationship.INCOMING)
    public Set<Event> inferredFrom = new HashSet<>();
    @Relationship(type = "literatureReference", direction = Relationship.INCOMING)
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "orthologousEvent", direction = Relationship.INCOMING)
    public Set<Event> orthologousEvent = new HashSet<>();
    @Relationship(type = "precedingEvent", direction = Relationship.INCOMING)
    public Set<Event> precedingEvent = new HashSet<>();
    @Relationship(type = "relatedSpecies", direction = Relationship.INCOMING)
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "reviewed", direction = Relationship.INCOMING)
    public InstanceEdit reviewed;
    @Relationship(type = "revised", direction = Relationship.INCOMING)
    public InstanceEdit revised;
    @Relationship(type = "species", direction = Relationship.INCOMING)
    public Set<Species> species = new HashSet<>();
    @Relationship(type = "summation", direction = Relationship.INCOMING)
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
