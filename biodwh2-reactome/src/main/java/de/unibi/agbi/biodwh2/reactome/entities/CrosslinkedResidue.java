package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.TranslationalModification;
import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class CrosslinkedResidue extends TranslationalModification {
    public int secondCoordinate;

    @Relationship(type = "modification")
    public ModificationType modification;

    public CrosslinkedResidue() {

    }

    public int getSecondCoordinate() {
        return secondCoordinate;
    }

    public ModificationType getModification() {
        return modification;
    }
}
