package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class Polymer extends PhysicalEntity implements ModificationType {
    public int maxUnitCount;
    public int minUnitCount;

    @Relationship
    public Set<PhysicalEntity> repeatedUnit = new HashSet<>();
    @Relationship
    public Set<Species> species = new HashSet<>();

    public Polymer() {

    }

    public int getMaxUnitCount() {
        return maxUnitCount;
    }

    public int getMinUnitCount() {
        return minUnitCount;
    }

    public Set<PhysicalEntity> getRepeatedUnit() {
        return repeatedUnit;
    }

    public Set<Species> getSpecies() {
        return species;
    }
}
