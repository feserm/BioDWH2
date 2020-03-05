package de.unibi.agbi.biodwh2.reactome.entities;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manuel on 11.12.19.
 */
public abstract class DatabaseObject {

    @Id
    @GeneratedValue
    public long id;
    public long dbId;
    public String displayName;
    public String schemaClass;
    public String stId;

    @Relationship(type = "created")
    public InstanceEdit created;
    @Relationship(type = "modified")
    public InstanceEdit modified;

    public DatabaseObject() {
    }

    public long getId() {
        return id;
    }

    public long getDbId() {
        return dbId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSchemaClass() {
        return schemaClass;
    }

    public String getStId() {
        return stId;
    }

    public InstanceEdit getCreated() {
        return created;
    }

    public InstanceEdit getModified() {
        return modified;
    }

}
