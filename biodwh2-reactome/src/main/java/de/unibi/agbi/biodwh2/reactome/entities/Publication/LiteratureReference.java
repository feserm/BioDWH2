package de.unibi.agbi.biodwh2.reactome.entities.Publication;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by manuel on 12.12.19.
 */
@NodeEntity(label = "Publication")
public class LiteratureReference extends Publication {
    public String journal;
    public String pages;
    public int pubMedIdentifier;
    public String url;
    public int volume;
    public int year;

    public LiteratureReference() {

    }

    public String getJournal() {
        return journal;
    }

    public String getPages() {
        return pages;
    }

    public int getPubMedIdentifier() {
        return pubMedIdentifier;
    }

    public String getUrl() {
        return url;
    }

    public int getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }
}
