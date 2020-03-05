package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class ExternalOntology extends DatabaseObject {
    public String databaseName;
    public String definition;
    public String identifier;
    public Set<String> name = new HashSet<>();
    public Set<String> synonym = new HashSet<>();
    public String url;

    @Relationship(type = "ExternalOntology")
    public Set<ExternalOntology> instanceOf = new HashSet<>();
    @Relationship(type = "ReferenceDatabase")
    public ReferenceDatabase referenceDatabase;

    public ExternalOntology() {

    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDefinition() {
        return definition;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Set<String> getName() {
        return name;
    }

    public Set<String> getSynonym() {
        return synonym;
    }

    public String getUrl() {
        return url;
    }

    public Set<ExternalOntology> getInstanceOf() {
        return instanceOf;
    }

    public ReferenceDatabase getReferenceDatabase() {
        return referenceDatabase;
    }
}
