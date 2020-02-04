package de.unibi.agbi.biodwh2.reactome.entities.ControlReference;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class ControlReference extends DatabaseObject {
    @Relationship(type = "literatureReference", direction = Relationship.INCOMING)
    public Set<Publication> literatureReference = new HashSet<>();

    public ControlReference() {

    }

    public Set<Publication> getLiteratureReference() {
        return literatureReference;
    }
}
