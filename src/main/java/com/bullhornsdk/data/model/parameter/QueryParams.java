package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "query" api call.
 * 
 * @author magnus.palm
 */
public interface QueryParams extends RequestParameters {

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
	 * Comma-separated list of field names on which to base the order of returned entities. Precede field name with a
	 * minus sign (-) or plus sign (+) to sort results in descending or ascending order based on that field; default is
	 * ascending order.
	 */
	public String getOrderBy();

	/**
	 * Comma-separated list of field names on which to base the order of returned entities. Precede field name with a
	 * minus sign (-) or plus sign (+) to sort results in descending or ascending order based on that field; default is
	 * ascending order.
	 * 
	 * @param orderBy
	 */
	public void setOrderBy(String orderBy);

	/**
	 * Default value is true. Whether to show the total number of items that match the query.
	 * 
	 * @param showTotalMatched
	 */
	public void setShowTotalMatched(boolean showTotalMatched);

	/**
	 * Whether to use the default part of the query.
	 */
	public Boolean getUseDefaultQueryFilter();

	/**
	 * Default value is true. Whether to use the default part of the query.
	 *
	 * @param useDefaultQueryFilter
	 */
	public void setUseDefaultQueryFilter(boolean useDefaultQueryFilter);

}
