package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.Affiliation;
import de.unibi.agbi.biodwh2.reactome.entities.Publication;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 12.12.19.
 */
@NodeEntity(label = "Book")
public class Book extends Publication {
    public String ISBN;
    public String chapterTitle;
    public String pages;
    public int year;

    @Relationship(type = "Affiliation")
    public Affiliation publisher;

    public Book() {

    }

    public String getISBN() {
        return ISBN;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public String getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    public Affiliation getPublisher() {
        return publisher;
    }
}
