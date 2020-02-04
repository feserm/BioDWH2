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

    @Relationship(type = "created", direction = "INCOMING")
    public InstanceEdit created;
    @Relationship(type = "modified", direction = "INCOMING")
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

    public String[] getFieldNames() {
        return new String[]{"id", "dbId", "displayName", "schemaClass", "stId"};
    }

    public Map<String, Object> getFieldValues() {
        Map<String, Object> res = new HashMap<>();
        res.put("id", getId());
        res.put("dbId", getDbId());
        res.put("displayName", getDisplayName());
        res.put("schemaClass", getSchemaClass());
        res.put("stId", getStId());
        return res;
    }

    public String[] getEdgeNames() {
        return new String[]{"created", "modified"};
    }

    public Map<String, Object> getEdgeValues() {
        Map<String, Object> res = new HashMap<>();
        res.put("created", getCreated());
        res.put("modified", getModified());
        return res;
    }

    public Map<String, Class> getEdgeTypes() {
        Map<String, Class> res = new HashMap<>();
        res.put("created", InstanceEdit.class);
        res.put("modified", InstanceEdit.class);
        return res;
    }

}
