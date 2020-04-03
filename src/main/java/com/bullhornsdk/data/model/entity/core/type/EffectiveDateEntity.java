package com.bullhornsdk.data.model.entity.core.type;

import com.bullhornsdk.data.api.BullhornData;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Represents a sub type of a BullhornEntity that can be soft deleted.
 * 
 * @author magnus.palm
 * 
 */
public interface EffectiveDateEntity extends BullhornEntity {

    public Date getEffectiveDate();

    public Date getEffectiveEndDate();

}
