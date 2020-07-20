package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "meta" api call.
 *
 * @author magnus.palm
 *
 */
public interface OptionsParams extends RequestParameters {

    /**
     * Filter string to limit data returned.
     *
     * @param filter
     */
    public String getFilter();

    /**
     * Filter string to limit data returned.
     *
     * @param filter
     */
    public void setFilter(String filter);

    /**
     * Limit on the number of entities to return. Default is 20.
     */
    public Integer getCount();

    /**
     * Limit on the number of entities to return. Default is 20.
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
}
