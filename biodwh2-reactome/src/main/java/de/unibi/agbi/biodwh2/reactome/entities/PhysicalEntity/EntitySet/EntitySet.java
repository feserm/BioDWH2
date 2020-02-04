package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.EntitySet;

import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Species;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class EntitySet extends PhysicalEntity implements ModificationType {
    public boolean isOrdered;

    @Relationship(type = "hasMember", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> hasMember = new HashSet<>();
    @Relationship(type = "relatedSpecies", direction = Relationship.INCOMING)
    public Set<Species> relatedSpecies = new HashSet<>();
    @Relationship(type = "species", direction = Relationship.INCOMING)
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
