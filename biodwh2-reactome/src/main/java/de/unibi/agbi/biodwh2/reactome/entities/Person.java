package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class Person extends DatabaseObject {
    public String firstName;
    public String initial;
    public String orcidId;
    public String project;
    public String surname;

    @Relationship(type = "Affiliation")
    public Set<Affiliation> affiliation = new HashSet<>();
    @Relationship(type = "DatabaseIdentifier")
    public Set<DatabaseIdentifier> crossReference = new HashSet<>();
    @Relationship(type = "Publication")
    public Set<Publication> publications = new HashSet<>();


    public Person() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getInitial() {
        return initial;
    }

    public String getOrcidId() {
        return orcidId;
    }

    public String getProject() {
        return project;
    }

    public String getSurname() {
        return surname;
    }

    public Set<Affiliation> getAffiliation() {
        return affiliation;
    }

    public Set<DatabaseIdentifier> getCrossReference() {
        return crossReference;
    }

    public Set<Publication> getPublications() {
        return publications;
    }
}
