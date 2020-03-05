package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;
import de.unibi.agbi.biodwh2.reactome.entities.TranslationalModification;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public class GroupModifiedResidue extends TranslationalModification {
    @Relationship(type = "modification")
    public ModificationType modification;

    public GroupModifiedResidue() {

    }

    public ModificationType getModification() {
        return modification;
    }
}
