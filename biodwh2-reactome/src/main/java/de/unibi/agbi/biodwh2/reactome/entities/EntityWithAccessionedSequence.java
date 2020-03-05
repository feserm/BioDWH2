package de.unibi.agbi.biodwh2.reactome.entities;

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

    @Relationship(type = "AbstractModifiedResidue")
    public Set<AbstractModifiedResidue> hasModifiedResidue = new HashSet<>();
    @Relationship(type = "ReferenceSequence")
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
