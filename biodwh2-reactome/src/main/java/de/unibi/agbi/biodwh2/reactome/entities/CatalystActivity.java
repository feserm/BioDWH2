package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.CatalystActivityReference;
import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.ReactionLikeEvent;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_MolecularFunction;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.PhysicalEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class CatalystActivity extends DatabaseObject {
    @Relationship(type = "activeUnit", direction = Relationship.INCOMING)
    public Set<PhysicalEntity> activeUnit = new HashSet<>();
    @Relationship(type = "activity", direction = Relationship.INCOMING)
    public GO_MolecularFunction activity;
    @Relationship(type = "catalyzedEvent", direction = Relationship.INCOMING)
    public Set<ReactionLikeEvent> catalyzedEvent = new HashSet<>();
    @Relationship(type = "literatureReference", direction = Relationship.INCOMING)
    public Set<Publication> literatureReference = new HashSet<>();
    @Relationship(type = "physicalEntity", direction = Relationship.INCOMING)
    public PhysicalEntity physicalEntity;
    @Relationship(type = "catalystActivities", direction = Relationship.OUTGOING)
    public Set<PhysicalEntity> catalystActivities = new HashSet<>();
    @Relationship(type = "catalystActivity", direction = Relationship.OUTGOING)
    public CatalystActivityReference catalystActivity;

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

    public Set<PhysicalEntity> getCatalystActivities() {
        return catalystActivities;
    }

    public CatalystActivityReference getCatalystActivity() {
        return catalystActivity;
    }
}
