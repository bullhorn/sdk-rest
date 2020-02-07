package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "get option" api call.
 * 
 * @author andre.vegas
 * 
 */
public interface OptionParams extends RequestParameters {

    /**
     * Limit on the number of entities to return. Default is 15.
     * 
     * @param count
     */
    public void setCount(Integer count);

    /**
     * From the set of matched results, return item numbers start through (start + count)
     * 
     * @param start
     */
    public void setStart(Integer start);

}
