package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.Drug;

import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceTherapeutic;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class Drug extends PhysicalEntity {
    @Relationship(type = "referenceEntity", direction = Relationship.INCOMING)
    public ReferenceTherapeutic referenceEntity;

    public Drug() {

    }

    public ReferenceTherapeutic getReferenceEntity() {
        return referenceEntity;
    }
}
