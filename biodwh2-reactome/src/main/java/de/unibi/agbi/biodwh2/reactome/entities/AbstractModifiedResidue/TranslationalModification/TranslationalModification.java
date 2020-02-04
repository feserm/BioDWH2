package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.PsiMod;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class TranslationalModification extends AbstractModifiedResidue {
    public int coordinate;
    public String label;

    @Relationship(type = "psiMod", direction = Relationship.INCOMING)
    public PsiMod psiMod;

    public TranslationalModification() {

    }

    public int getCoordinate() {
        return coordinate;
    }

    public String getLabel() {
        return label;
    }

    public PsiMod getPsiMod() {
        return psiMod;
    }
}
