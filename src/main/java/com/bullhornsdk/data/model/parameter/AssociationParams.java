package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "get association" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface AssociationParams extends RequestParameters {

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

    /**
     * Comma-separated list of field names on which to base the order of returned entities. Precede field name with a minus sign
     * (-) or plus sign (+) to sort results in descending or ascending order based on that field; default is ascending order.
     * 
     * @param orderBy
     */
    public void setOrderBy(String orderBy);

}
