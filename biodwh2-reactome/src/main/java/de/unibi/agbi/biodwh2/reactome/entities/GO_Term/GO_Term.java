package de.unibi.agbi.biodwh2.reactome.entities.GO_Term;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceDatabase;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class GO_Term extends DatabaseObject {
    public String accession;
    public String databaseName;
    public String definition;
    public String name;
    public String url;

    @Relationship(type = "referenceDatabase", direction = Relationship.INCOMING)
    public ReferenceDatabase referenceDatabase;

    public GO_Term() {

    }

    public String getAccession() {
        return accession;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getDefinition() {
        return definition;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public ReferenceDatabase getReferenceDatabase() {
        return referenceDatabase;
    }
}
