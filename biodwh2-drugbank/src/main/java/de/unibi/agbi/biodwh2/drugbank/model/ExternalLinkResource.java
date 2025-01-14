package de.unibi.agbi.biodwh2.drugbank.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ExternalLinkResource {
    RxList("RxList"),
    PDRhealth("PDRhealth"),
    Drugs_Com("Drug.com");

    private ExternalLinkResource(String value) {
        this.value = value;
    }

    public final String value;

    @JsonValue
    public String toValue() {
        return value;
    }
}
