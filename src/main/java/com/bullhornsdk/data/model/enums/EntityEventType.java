package com.bullhornsdk.data.model.enums;

/**
 * Created by john.sullivan on 18/2/2016.
 */
public enum EntityEventType {
    INSERTED("INSERTED"),
    UPDATED("UPDATED"),
    DELETED("DELETED")
    ;

    private final String value;

    EntityEventType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
