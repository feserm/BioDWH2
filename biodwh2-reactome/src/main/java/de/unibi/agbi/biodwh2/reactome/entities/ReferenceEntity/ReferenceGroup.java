package de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity;

import de.unibi.agbi.biodwh2.reactome.entities.ModificationType;

/**
 * Created by manuel on 12.12.19.
 */
public class ReferenceGroup extends ReferenceEntity implements ModificationType {
    public String formula;

    public ReferenceGroup() {

    }

    public String getFormula() {
        return formula;
    }
}
