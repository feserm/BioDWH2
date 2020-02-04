package de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class ReferenceRNASequence extends ReferenceSequence {
    @Relationship(type = "referenceGene", direction = Relationship.INCOMING)
    public Set<ReferenceDNASequence> referenceGene = new HashSet<>();

    public ReferenceRNASequence() {

    }

    public Set<ReferenceDNASequence> getReferenceGene() {
        return referenceGene;
    }
}
