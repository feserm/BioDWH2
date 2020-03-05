package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class ReferenceEntity extends DatabaseObject {
    public String databaseName;
    public String identifier;
    public Set<String> name = new HashSet<>();
    public Set<String> otherIdentifier = new HashSet<>();
    public String url;

    @Relationship(type = "DatabaseIdentifier")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> physicalEntity = new HashSet<>();
    @Relationship(type = "ReferenceDatabase")
    public ReferenceDatabase referenceDatabase;

    public ReferenceEntity() {

    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Set<String> getName() {
        return name;
    }

    public Set<String> getOtherIdentifier() {
        return otherIdentifier;
    }

    public String getUrl() {
        return url;
    }

    public Set<DatabaseIdentifier> getCrossReference() {
        return crossReference;
    }

    public Set<PhysicalEntity> getPhysicalEntity() {
        return physicalEntity;
    }

    public ReferenceDatabase getReferenceDatabase() {
        return referenceDatabase;
    }
}
