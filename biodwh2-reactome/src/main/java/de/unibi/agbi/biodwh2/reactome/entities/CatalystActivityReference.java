package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.CatalystActivity;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference;
import de.unibi.agbi.biodwh2.reactome.entities.ReactionLikeEvent;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by manuel on 11.12.19.
 */
public class CatalystActivityReference extends ControlReference {
    @Relationship(type = "catalystActivity")
    public CatalystActivity catalystActivity;
    public CatalystActivityReference() {

    }

    public CatalystActivity getCatalystActivity() {
        return catalystActivity;
    }
}
