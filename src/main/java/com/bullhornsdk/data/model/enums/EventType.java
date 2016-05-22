package com.bullhornsdk.data.model.enums;

/**
 * Created by john.sullivan on 18/2/2016.
 */
public enum EventType {
    ENTITY("ENTITY", "entity"),
    FIELDMAPCHANGE("FIELDMAPCHANGE", "fieldMapChange"),
    JOBMATCHSEARCH("JOBMATCHSEARCH", "jobMatchSearch")
    ;

    private final String value;
    private final String typeValue;

    EventType(String value, String typeValue) {

        this.value = value;
        this.typeValue = typeValue;
    }

    public String value() {
        return this.value;
    }

    public String typeValue() {
        return typeValue;
    }
}
