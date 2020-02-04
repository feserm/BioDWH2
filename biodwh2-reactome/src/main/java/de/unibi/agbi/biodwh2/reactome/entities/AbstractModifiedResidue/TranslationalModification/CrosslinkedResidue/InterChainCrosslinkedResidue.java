package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.CrosslinkedResidue;

import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceSequence;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class InterChainCrosslinkedResidue extends CrosslinkedResidue {
    @Relationship(type = "equivalentTo", direction = Relationship.INCOMING)
    public Set<InterChainCrosslinkedResidue> equivalentTo = new HashSet<>();
    @Relationship(type = "secondReferenceSequence", direction = Relationship.INCOMING)
    public Set<ReferenceSequence> secondReferenceSequence = new HashSet<>();

    public InterChainCrosslinkedResidue() {

    }

    public Set<InterChainCrosslinkedResidue> getEquivalentTo() {
        return equivalentTo;
    }

    public Set<ReferenceSequence> getSecondReferenceSequence() {
        return secondReferenceSequence;
    }
}
