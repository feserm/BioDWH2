package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manuel on 11.12.19.
 */
public class FragmentReplacedModification extends FragmentModification {
    public String alteredAminoAcidFragment;

    public FragmentReplacedModification() {

    }

    public String getAlteredAminoAcidFragment() {
        return alteredAminoAcidFragment;
    }

    @Override
    public String[] getFieldNames() {
        return new String[]{
                "id", "dbId", "displayName", "schemaClass", "stId", "startPositionInReferenceSequence",
                "endPositionInReferenceSequence", "alteredAminoAcidFragment"
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
        res.put("alteredAminoAcidFragment", getAlteredAminoAcidFragment());
        return res;
    }
}
