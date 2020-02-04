package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity;

import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.Compartment;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Species;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class Complex extends PhysicalEntity {
    public boolean isChimeric;
    public boolean stoichiometriyKnown;

    @Relationship(type = "entityOnOtherCell", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> entityOnOtherCell = new HashSet<>();
    @Relationship(type = "hasComponent", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> hasComponent = new HashSet<>();
    @Relationship(type = "includedLocation", direction = Relationship.INCOMING)
    public Set<Compartment> includedLocation = new HashSet<>();
    @Relationship(type = "relatedSpecies", direction = Relationship.INCOMING)
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "species", direction = Relationship.INCOMING)
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
