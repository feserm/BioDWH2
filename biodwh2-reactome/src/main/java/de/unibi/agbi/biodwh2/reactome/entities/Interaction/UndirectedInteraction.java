package de.unibi.agbi.biodwh2.reactome.entities.Interaction;

import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class UndirectedInteraction extends Interaction {
    @Relationship(type = "interactor", direction = Relationship.INCOMING)
    public Set<ReferenceEntity> interactor = new HashSet<>();

    public UndirectedInteraction() {

    }

    public Set<ReferenceEntity> getInteractor() {
        return interactor;
    }
}
