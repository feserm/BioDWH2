package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceTherapeutic;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
public abstract class Drug extends PhysicalEntity {
    @Relationship(type = "referenceEntity")
    public ReferenceTherapeutic referenceEntity;

    public Drug() {

    }

    public ReferenceTherapeutic getReferenceEntity() {
        return referenceEntity;
    }
}
