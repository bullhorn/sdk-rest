package com.bullhornsdk.data.model.parameter;

/**
 *
 * @author vzeltser
 */
public interface FastFindParams extends RequestParameters {
    
	/**
	 * Returns the number of entities to return. Defaults to 20.
	 * 
	 * @return
	 */
	Integer getCountPerEntity();

	/**
	 * Limit on the number of entities to return. Defaults to 20.
	 * 
	 * @param count
	 */
	void setCountPerEntity(Integer count);

}
