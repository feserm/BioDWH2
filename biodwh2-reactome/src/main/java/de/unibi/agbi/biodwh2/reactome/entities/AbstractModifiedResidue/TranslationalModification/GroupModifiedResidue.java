package de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification;

import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public class GroupModifiedResidue extends TranslationalModification {
    @Relationship(type = "modification", direction = Relationship.INCOMING)
    public ModificationType modification;

    public GroupModifiedResidue() {

    }

    public ModificationType getModification() {
        return modification;
    }
}
