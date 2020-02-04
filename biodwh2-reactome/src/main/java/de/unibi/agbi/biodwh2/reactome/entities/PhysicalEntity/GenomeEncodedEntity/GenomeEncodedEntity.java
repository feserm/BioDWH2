package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.GenomeEncodedEntity;

import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Taxon;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public class GenomeEncodedEntity extends PhysicalEntity {
    @Relationship(type = "species", direction = Relationship.INCOMING)
    public Taxon species;

    public GenomeEncodedEntity() {

    }

    public Taxon getSpecies() {
        return species;
    }
}
