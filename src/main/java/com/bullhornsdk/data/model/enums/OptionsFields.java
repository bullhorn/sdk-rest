package com.bullhornsdk.data.model.enums;

/**
 * Created by andrevegas on 7/2/2020.
 */
public enum OptionsFields {

    VALUE("value"),
    LABEL("label");

    private final String value;

    OptionsFields(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
