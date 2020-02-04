package de.unibi.agbi.biodwh2.reactome.entities;

import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.SequenceOntology;

/**
 * Created by manuel on 11.12.19.
 */
public class FunctionalStatus extends DatabaseObject {
    public FunctionalStatusType functionalStatusType;
    public SequenceOntology structuralVariant;

    public FunctionalStatus() {

    }

    public FunctionalStatusType getFunctionalStatusType() {
        return functionalStatusType;
    }

    public SequenceOntology getStructuralVariant() {
        return structuralVariant;
    }
}
