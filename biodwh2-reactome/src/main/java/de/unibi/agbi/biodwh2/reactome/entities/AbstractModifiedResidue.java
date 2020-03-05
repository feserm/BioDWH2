package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.EntityWithAccessionedSequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceSequence;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class AbstractModifiedResidue extends DatabaseObject {
    @Relationship(type = "referenceSequence")
    public ReferenceSequence referenceSequence;

    public AbstractModifiedResidue() {

    }

    public ReferenceSequence getReferenceSequence() {
        return referenceSequence;
    }

}
