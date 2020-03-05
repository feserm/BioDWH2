package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Species;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class EntitySet extends PhysicalEntity implements ModificationType {
    public boolean isOrdered;

    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> hasMember = new HashSet<>();
    @Relationship(type = "Species")
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "Species")
    public Set<Species> species = new HashSet<>();

    public EntitySet() {

    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Set<PhysicalEntity> getHasMember() {
        return hasMember;
    }

    public Set<Species> getRelatedSpecies() {
        return relatedSpecies;
    }

    public Set<Species> getSpecies() {
        return species;
    }
}
