package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class Complex extends PhysicalEntity {
    public boolean isChimeric;
    public boolean stoichiometriyKnown;

    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> entityOnOtherCell = new HashSet<>();
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> hasComponent = new HashSet<>();
    @Relationship(type = "Compartment")
    public Set<Compartment> includedLocation = new HashSet<>();
    @Relationship(type = "Species")
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "Species")
    public Set<Species> species = new HashSet<>();

    public Complex() {

    }

    public boolean isChimeric() {
        return isChimeric;
    }

    public boolean isStoichiometriyKnown() {
        return stoichiometriyKnown;
    }

    public Set<PhysicalEntity> getEntityOnOtherCell() {
        return entityOnOtherCell;
    }

    public Set<PhysicalEntity> getHasComponent() {
        return hasComponent;
    }

    public Set<Compartment> getIncludedLocation() {
        return includedLocation;
    }

    public Set<Species> getRelatedSpecies() {
        return relatedSpecies;
    }

    public Set<Species> getSpecies() {
        return species;
    }
}
