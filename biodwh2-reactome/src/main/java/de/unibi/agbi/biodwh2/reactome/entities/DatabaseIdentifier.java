package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class DatabaseIdentifier extends DatabaseObject {
    public String databaseName;
    public String identifier;
    public String url;

    @Relationship(type = "crossReference", direction = Relationship.INCOMING)
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "referenceDatabase", direction = Relationship.INCOMING)
    public ReferenceDatabase referenceDatabase;
    @Relationship(type = "crossReference", direction = Relationship.OUTGOING)
    public Set<PhysicalEntity> crossReference2 = new HashSet<>();

    public DatabaseIdentifier() {
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getUrl() {
        return url;
    }

    public Set<DatabaseIdentifier> getCrossReference() {
        return crossReference;
    }

    public ReferenceDatabase getReferenceDatabase() {
        return referenceDatabase;
    }

    public Set<PhysicalEntity> getCrossReference2() {
        return crossReference2;
    }
}
