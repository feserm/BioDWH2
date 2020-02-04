package de.unibi.agbi.biodwh2.reactome.entities.Taxon;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseIdentifier;
import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class Taxon extends DatabaseObject {
    public Set<String> name = new HashSet<>();
    public String taxId;

    @Relationship(type = "superTaxon", direction = Relationship.INCOMING)
    public Taxon superTaxon;
    @Relationship(type = "crossReference", direction = Relationship.INCOMING)
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();


    public Taxon() {

    }

    public Set<String> getName() {
        return name;
    }

    public String getTaxId() {
        return taxId;
    }

    public Taxon getSuperTaxon() {
        return superTaxon;
    }

    public Set<DatabaseIdentifier> getCrossReference() {
        return crossReference;
    }
}
