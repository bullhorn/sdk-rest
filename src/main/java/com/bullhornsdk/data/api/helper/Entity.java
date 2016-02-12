package com.bullhornsdk.data.api.helper;

/**
 * An entity with an ID
 * 
 * @author magnus.palm
 * 
 * @param <ID>
 */
public interface Entity<ID> {

	/**
	 * Returns the unique identifier of the entity. Could be the primary key of
	 * a table row.
	 * 
	 * @return
	 */
	public ID getId();

}
