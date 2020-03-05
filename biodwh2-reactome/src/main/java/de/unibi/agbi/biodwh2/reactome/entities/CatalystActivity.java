package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class CatalystActivity extends DatabaseObject {
    @Relationship(type = "PhysicalEntity")
    public Set<PhysicalEntity> activeUnit = new HashSet<>();
    @Relationship(type = "GO_MolecularFunction")
    public GO_MolecularFunction activity;
    @Relationship(type = "ReactionLikeEvent")
    public Set<ReactionLikeEvent> catalyzedEvent = new HashSet<>();
    @Relationship(type = "Publication")
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "PhysicalEntity")
    public PhysicalEntity physicalEntity;

    public CatalystActivity() {

    }

    public Set<PhysicalEntity> getActiveUnit() {
        return activeUnit;
    }

    public GO_MolecularFunction getActivity() {
        return activity;
    }

    public Set<ReactionLikeEvent> getCatalyzedEvent() {
        return catalyzedEvent;
    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }

    public PhysicalEntity getPhysicalEntity() {
        return physicalEntity;
    }
}
