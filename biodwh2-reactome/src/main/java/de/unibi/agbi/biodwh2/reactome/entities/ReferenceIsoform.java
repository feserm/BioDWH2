package de.unibi.agbi.biodwh2.reactome.entities;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by manuel on 12.12.19.
 */
public class ReferenceIsoform extends ReferenceGeneProduct {
    public String variantIdentifier;
    public Set<ReferenceGeneProduct> isoformParent = new HashSet<>();

    public ReferenceIsoform() {

    }

    public String getVariantIdentifier() {
        return variantIdentifier;
    }

    public Set<ReferenceGeneProduct> getIsoformParent() {
        return isoformParent;
    }
}
