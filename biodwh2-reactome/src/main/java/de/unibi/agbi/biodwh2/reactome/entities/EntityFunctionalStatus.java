package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class EntityFunctionalStatus extends DatabaseObject {
    @Relationship(type = "PhysicalEntity")
    public PhysicalEntity diseaseEntity;
    @Relationship(type = "PhysicalEntity")
    public PhysicalEntity normalEntity;
    @Relationship(type = "FunctionalStatus")
    public Set<FunctionalStatus> functionalStatus = new HashSet<>();

    public EntityFunctionalStatus() {

    }

    public PhysicalEntity getDiseaseEntity() {
        return diseaseEntity;
    }

    public PhysicalEntity getNormalEntity() {
        return normalEntity;
    }

    public Set<FunctionalStatus> getFunctionalStatus() {
        return functionalStatus;
    }
}
