package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.FragmentModification;

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
}
