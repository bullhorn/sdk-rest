package com.bullhornsdk.data.model.enums;

/**
 * Created by john.sullivan on 18/2/2016.
 */
public enum EventType {
    ENTITY("ENTITY"),
    FIELDMAPCHANGE("FIELDMAPCHANGE"),
    JOBMATCHSEARCH("JOBMATCHSEARCH")
    ;

    private final String value;

    EventType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }

}
