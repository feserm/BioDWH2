package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue;

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

}
