package de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.GenomeEncodedEntity;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceSequence;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class EntityWithAccessionedSequence extends GenomeEncodedEntity {
    public int endCoordinate;
    public String referenceType;
    public int startCoordinate;

    @Relationship(type = "hasModifiedResidue", direction = Relationship.INCOMING)
    public Set<AbstractModifiedResidue> hasModifiedResidue = new HashSet<>();
    @Relationship(type = "referenceEntity", direction = Relationship.INCOMING)
    public ReferenceSequence referenceEntity;

    public EntityWithAccessionedSequence() {

    }

    public int getEndCoordinate() {
        return endCoordinate;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public int getStartCoordinate() {
        return startCoordinate;
    }

    public Set<AbstractModifiedResidue> getHasModifiedResidue() {
        return hasModifiedResidue;
    }

    public ReferenceSequence getReferenceEntity() {
        return referenceEntity;
    }
}
