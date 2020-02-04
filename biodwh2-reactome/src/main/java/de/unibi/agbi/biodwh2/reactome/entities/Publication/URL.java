package de.unibi.agbi.biodwh2.reactome.entities.Publication;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by manuel on 12.12.19.
 */
@NodeEntity(label = "Publication")
public class URL extends Publication {
    public String uniformResourceLoader;

    public URL() {

    }

    public String getUniformResourceLoader() {
        return uniformResourceLoader;
    }
}
