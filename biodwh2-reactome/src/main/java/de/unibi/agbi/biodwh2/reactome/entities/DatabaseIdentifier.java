package de.unibi.agbi.biodwh2.reactome.entities;

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

    @Relationship(type = "DatabaseIdentifier")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "ReferenceDatabase")
    public ReferenceDatabase referenceDatabase;

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
}
