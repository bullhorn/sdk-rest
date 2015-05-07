package com.bullhornsdk.data.model.parameter;

public interface CorpNotesParams extends RequestParameters {

	/**
	 * Lucene query string to limit data returned.
	 * 
	 * @param count
	 */
	public void setQuery(String query);

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
    public void setSort(String sort);

    /**
     * From the set of matched results, returns item numbers start through (start + count)
     * 
     * @param start
     */
    public void setStart(Integer start);

}
