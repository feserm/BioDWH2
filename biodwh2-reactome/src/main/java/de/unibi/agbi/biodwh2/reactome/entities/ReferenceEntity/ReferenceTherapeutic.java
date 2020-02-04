package de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class ReferenceTherapeutic extends ReferenceEntity {
    public String abbrevation;
    public Set<String> approvalSource = new HashSet<>();
    public boolean approved;
    public String inn;
    public String type;

    public ReferenceTherapeutic() {

    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public Set<String> getApprovalSource() {
        return approvalSource;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getInn() {
        return inn;
    }

    public String getType() {
        return type;
    }
}
