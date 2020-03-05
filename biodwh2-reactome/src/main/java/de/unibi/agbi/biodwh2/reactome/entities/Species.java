package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.Taxon;

/**
 * Created by manuel on 11.12.19.
 */
public class Species extends Taxon {
    public String abbreviation;

    public Species() {

    }

    public String getAbbrevation() {
        return abbreviation;
    }
}
