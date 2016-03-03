package com.bullhornsdk.data.model.enums;

/**
 * Created by john.sullivan on 18/2/2016.
 */
public enum EventMetadata {
    PERSON_ID("PERSON_ID"),
    TRANSACTION_ID("TRANSACTION_ID")
    ;

    private final String value;

    EventMetadata(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
