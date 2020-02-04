package de.unibi.agbi.biodwh2.reactome.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 11.12.19.
 */
public class ReferenceDatabase extends DatabaseObject {
    public String accessURL;
    public Set<String> name = new HashSet<>();
    public String url;

    public ReferenceDatabase() {

    }

    public String getAccessURL() {
        return accessURL;
    }

    public Set<String> getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
