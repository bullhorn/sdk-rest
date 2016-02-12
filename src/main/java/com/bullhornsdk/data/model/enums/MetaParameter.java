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

    private MetaParameter(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String[] types = new String[] { "JobOrder", "Placement", "ClientCorporation", "Person" };
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.stream(types).forEach( type -> {
            Arrays.stream(nums).forEach( num -> {
                System.out.println(type+"CustomObjectInstance"+num);
            });
        });
    }

    public String getName() {
        return name;
    }

}
