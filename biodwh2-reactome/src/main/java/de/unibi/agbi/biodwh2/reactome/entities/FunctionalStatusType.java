package de.unibi.agbi.biodwh2.reactome.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class FunctionalStatusType extends DatabaseObject {
    public String definition;
    public Set<String> name = new HashSet<>();

    public FunctionalStatusType() {

    }

    public String getDefinition() {
        return definition;
    }

    public Set<String> getName() {
        return name;
    }
}
