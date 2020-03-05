package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.EntitySet;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class CandidateSet extends EntitySet {
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> hasCandidate = new HashSet<>();

    public CandidateSet() {

    }

    public Set<PhysicalEntity> getHasCandidate() {
        return hasCandidate;
    }
}
