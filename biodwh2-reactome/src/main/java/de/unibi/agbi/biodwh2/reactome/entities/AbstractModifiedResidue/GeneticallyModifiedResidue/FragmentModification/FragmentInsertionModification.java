package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manuel on 11.12.19.
 */
public class FragmentInsertionModification extends FragmentModification {
    public int coordinate;

    public FragmentInsertionModification() {

    }

    public int getCoordinate() {
        return coordinate;
    }

    @Override
    public String[] getFieldNames() {
        return new String[]{
                "id", "dbId", "displayName", "schemaClass", "stId", "startPositionInReferenceSequence",
                "endPositionInReferenceSequence", "coordinate"
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
        res.put("coordinate", getCoordinate());
        return res;
    }
}
