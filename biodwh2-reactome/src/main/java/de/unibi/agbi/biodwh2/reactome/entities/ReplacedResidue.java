package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.PsiMod;
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

    @Relationship(type = "psiMod")
    public Set<PsiMod> psiMod = new HashSet<>();

    public ReplacedResidue() {

    }

    public int getCoordinate() {
        return coordinate;
    }

    public Set<PsiMod> getPsiMod() {
        return psiMod;
    }
}
