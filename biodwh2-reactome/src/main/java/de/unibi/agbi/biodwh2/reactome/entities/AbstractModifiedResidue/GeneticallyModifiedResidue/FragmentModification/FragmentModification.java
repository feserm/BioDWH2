package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.AbstractModifiedResidue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class FragmentModification extends AbstractModifiedResidue {
    public int startPositionInReferenceSequence;
    public int endPositionInReferenceSequence;

    public FragmentModification() {

    }

    public int getStartPositionInReferenceSequence() {
        return startPositionInReferenceSequence;
    }

    public int getEndPositionInReferenceSequence() {
        return endPositionInReferenceSequence;
    }

    @Override
    public String[] getFieldNames() {
        return new String[]{
                "id", "dbId", "displayName", "schemaClass", "stId", "startPositionInReferenceSequence",
                "endPositionInReferenceSequence"
        };
    }

    @Override
    public Map<String, Object> getFieldValues() {
        Map<String, Object> res = new HashMap<>();
        res.put("id", getId());
        res.put("dbId", getDbId());
        res.put("displayName", getDisplayName());
        res.put("schemaClass", getSchemaClass());
        res.put("stId", getStId());
        res.put("startPositionInReferenceSequence", getStartPositionInReferenceSequence());
        res.put("endPositionInReferenceSequence", getEndPositionInReferenceSequence());
        return res;
    }
}
