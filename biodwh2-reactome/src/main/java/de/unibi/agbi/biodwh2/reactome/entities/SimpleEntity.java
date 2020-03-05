package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class SimpleEntity extends PhysicalEntity {
    public String referenceType;

    @Relationship(type = "Species")
    public Set<Species> species = new HashSet<>();
    @Relationship(type = "ReferenceMolecule")
    public ReferenceMolecule referenceEntity;

    public SimpleEntity() {

    }

    public String getReferenceType() {
        return referenceType;
    }

    public Set<Species> getSpecies() {
        return species;
    }

    public ReferenceMolecule getReferenceEntity() {
        return referenceEntity;
    }
}
