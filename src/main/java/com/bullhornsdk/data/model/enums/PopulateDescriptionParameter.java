package com.bullhornsdk.data.model.enums;

/**
 * populateDescription request parameter possible values.
 * 
 * @author magnus.palm
 * 
 */
public enum PopulateDescriptionParameter {

    HTML("html"),
    TEXT("text");

    private final String name;

    private PopulateDescriptionParameter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
