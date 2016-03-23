package com.bullhornsdk.data.model.entity.core.type;

import org.joda.time.DateTime;

/**
 * Represents a sub type of a BullhornEntity that has dateLastModified.
 * 
 * @author ryan.mcdole
 *
 */
public interface DateLastModifiedEntity extends BullhornEntity {

    public DateTime getDateLastModified();

}
