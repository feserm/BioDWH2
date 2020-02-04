package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue;

import de.unibi.agbi.biodwh2.reactome.entities.DatabaseObject;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.GenomeEncodedEntity.EntityWithAccessionedSequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceSequence;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class AbstractModifiedResidue extends DatabaseObject {
    @Relationship(type = "referenceSequence", direction = "INCOMING")
    public ReferenceSequence referenceSequence;

    @Relationship(type = "hasModifiedResidue", direction = Relationship.OUTGOING)
    public Set<EntityWithAccessionedSequence> hasModifiedResidue = new HashSet<>();

    public AbstractModifiedResidue() {

    }

    public ReferenceSequence getReferenceSequence() {
        return referenceSequence;
    }

    public Set<EntityWithAccessionedSequence> getHasModifiedResidue() {
        return hasModifiedResidue;
    }

    @Override
    public String[] getEdgeNames() {
        return new String[]{"created", "modified", "referenceSequence", "hasModifiedResidue"};
    }

    @Override
    public Map<String, Object> getEdgeValues() {
        Map<String, Object> res = new HashMap<>();
        res.put("created", getCreated());
        res.put("modified", getModified());
        res.put("referenceSequence", getReferenceSequence());
        res.put("hasModifiedResidue", getHasModifiedResidue());
        return res;
    }
}
