package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Species;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class ReferenceSequence extends ReferenceEntity {
    public String checksum;
    public Set<String> comment = new HashSet<>();
    public Set<String> description = new HashSet<>();
    public Set<String> geneName = new HashSet<>();
    public boolean isSequenceChanged;
    public Set<String> keyword = new HashSet<>();
    public Set<String> secondaryIdentifier = new HashSet<>();
    public int sequenceLength;

    @Relationship(type = "Species")
    public Species species;

    public ReferenceSequence() {

    }

    public String getChecksum() {
        return checksum;
    }

    public Set<String> getComment() {
        return comment;
    }

    public Set<String> getDescription() {
        return description;
    }

    public Set<String> getGeneName() {
        return geneName;
    }

    public boolean isSequenceChanged() {
        return isSequenceChanged;
    }

    public Set<String> getKeyword() {
        return keyword;
    }

    public Set<String> getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    public int getSequenceLength() {
        return sequenceLength;
    }

    public Species getSpecies() {
        return species;
    }
}
