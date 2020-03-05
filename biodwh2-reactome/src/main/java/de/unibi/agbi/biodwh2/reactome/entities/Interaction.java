package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceDatabase;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class Interaction extends DatabaseObject {
    public Set<String> accession = new HashSet<>();
    public String databaseName;
    public Set<String> pubmed = new HashSet<>();
    public double score;
    public String url;

    @Relationship(type = "ReferenceDatabase")
    public ReferenceDatabase referenceDatabase;


    public Interaction() {

    }

    public Set<String> getAccession() {
        return accession;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Set<String> getPubmed() {
        return pubmed;
    }

    public double getScore() {
        return score;
    }

    public String getUrl() {
        return url;
    }

    public ReferenceDatabase getReferenceDatabase() {
        return referenceDatabase;
    }
}
