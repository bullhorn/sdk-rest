package com.bullhornsdk.data.model.enums;

/**
 * format parameters when parsing a resume text
 * 
 * @author magnus.palm
 * 
 */
public enum ResumeParseTextFormat {

    HTML("html"),
    TEXT("text");

    private final String name;

    private ResumeParseTextFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
