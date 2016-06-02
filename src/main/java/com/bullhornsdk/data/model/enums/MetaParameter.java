package com.bullhornsdk.data.model.enums;

import java.util.Arrays;

/**
 * meta request parameter possible values.
 * 
 * @author magnus.palm
 * 
 */
public enum MetaParameter {
    BASIC("basic"),
    FULL("full");

    private final String name;

    MetaParameter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
