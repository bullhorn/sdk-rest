package com.bullhornsdk.data.model.parameter;

/**
 * Optional parameters for the "search" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface SearchParams extends RequestParameters {

	/**
	 * Returns the number of entities to return. Defaults to 20.
	 * 
	 * @return
	 */
	public Integer getCount();

	/**
	 * Limit on the number of entities to return. Defaults to 20.
	 * 
	 * @param count
	 */
	public void setCount(Integer count);

	/**
	 * Field to sort result on. Default sort order is ascending. Precede with minus sign to perform descending sort
	 * 
	 * @param sort
	 */
	public String getSort();

	/**
	 * Field to sort result on. Default sort order is ascending. Precede with minus sign to perform descending sort
	 * 
	 * @param sort
	 */
	public void setSort(String sort);

	/**
	 * From the set of matched results, returns item numbers start through (start + count)
	 * 
	 * @param start
	 */
	public Integer getStart();

	/**
	 * From the set of matched results, returns item numbers start through (start + count)
	 * 
	 * @param start
	 */
	public void setStart(Integer start);

}
