package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class GO_CellularComponent extends GO_Term {
    @Relationship(type = "GO_CellularComponent")
    public Set<GO_CellularComponent> componentOf = new HashSet<>();
    @Relationship(type = "GO_CellularComponent")
    public Set<GO_CellularComponent> hasPart = new HashSet<>();
    @Relationship(type = "GO_CellularComponent")
    public Set<GO_CellularComponent> instanceOf = new HashSet<>();
    @Relationship(type = "GO_CellularComponent")
    public Set<GO_CellularComponent> surroundedBy = new HashSet<>();

    public GO_CellularComponent() {

    }

    public Set<GO_CellularComponent> getComponentOf() {
        return componentOf;
    }

    public Set<GO_CellularComponent> getHasPart() {
        return hasPart;
    }

    public Set<GO_CellularComponent> getInstanceOf() {
        return instanceOf;
    }

    public Set<GO_CellularComponent> getSurroundedBy() {
        return surroundedBy;
    }
}
