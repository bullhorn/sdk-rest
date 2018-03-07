package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "query" api call.
 *
 * @author magnus.palm
 */
public interface OptionParams extends RequestParameters {

    /**
     * Limit on the number of entities to return. Default is 15.
     */
    public Integer getCount();

    /**
     * Limit on the number of entities to return. Default is 15.
     *
     * @param count
     */
    public void setCount(Integer count);

    /**
     * From the set of matched results, return item numbers start through (start + count)
     */
    public Integer getStart();

    /**
     * From the set of matched results, return item numbers start through (start + count)
     *
     * @param start
     */
    public void setStart(Integer start);

    /**
     * Filter on the label, prefix with an asterisk (*) to find word begins.
     */
    public String getFilter();

    /**
     * Filter on the label, prefix with an asterisk (*) to find word begins.
     *
     * @param filter
     */
    public void setFilter(String filter);

}
