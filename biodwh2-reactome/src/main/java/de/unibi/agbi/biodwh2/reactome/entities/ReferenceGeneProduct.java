package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ReferenceDNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceRNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceSequence;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class ReferenceGeneProduct extends ReferenceSequence {
    public Set<String> chain = new HashSet<>();

    @Relationship(type = "referenceGene")
    public Set<ReferenceDNASequence> referenceGene = new HashSet<>();
    @Relationship(type = "referenceTranscript")
    public Set<ReferenceRNASequence> referenceTranscript = new HashSet<>();

    public ReferenceGeneProduct() {

    }

    public Set<String> getChain() {
        return chain;
    }

    public Set<ReferenceDNASequence> getReferenceGene() {
        return referenceGene;
    }

    public Set<ReferenceRNASequence> getReferenceTranscript() {
        return referenceTranscript;
    }
}
