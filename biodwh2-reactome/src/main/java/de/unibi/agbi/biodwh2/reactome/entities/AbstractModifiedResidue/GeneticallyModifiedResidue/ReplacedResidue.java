package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.PsiMod;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class ReplacedResidue extends AbstractModifiedResidue {
    public int coordinate;

    @Relationship(type = "psiMod", direction = Relationship.INCOMING)
    public Set<PsiMod> psiMod = new HashSet<>();

    public ReplacedResidue() {

    }

    public int getCoordinate() {
        return coordinate;
    }

    public Set<PsiMod> getPsiMod() {
        return psiMod;
    }

    @Override
    public String[] getFieldNames() {
        return new String[]{
                "id", "dbId", "displayName", "schemaClass", "stId", "coordinate"
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
        res.put("coordinate", getCoordinate());
        return res;
    }

    @Override
    public String[] getEdgeNames() {
        return new String[]{"created", "modified", "referenceSequence", "hasModifiedResidue", "psiMod"};
    }

    @Override
    public Map<String, Object> getEdgeValues() {
        Map<String, Object> res = new HashMap<>();
        res.put("created", getCreated());
        res.put("modified", getModified());
        res.put("referenceSequence", getReferenceSequence());
        res.put("hasModifiedResidue", getHasModifiedResidue());
        res.put("psiMod", getPsiMod());
        return res;
    }
}
