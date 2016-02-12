package com.bullhornsdk.data.model.parameter;

import java.util.Map;

/**
 * Represents a type of parameter used for api calls.
 * 
 * @author magnus.palm
 * 
 */

public interface RequestParameters {

    /**
     * Returns a url String in the format &fieldName1={fieldName1}&fieldName2={fieldName2}. Fields that are null will not be
     * included in the url string.
     * 
     * @return
     */
    public String getUrlString();

    /**
     * Returns parameters needed for this particular api call.
     * 
     * Adds the parameters to a map in format key:value = fieldName:fieldValue and returns that map.
     * 
     * @return
     */
    public Map<String, String> getParameterMap();

}
