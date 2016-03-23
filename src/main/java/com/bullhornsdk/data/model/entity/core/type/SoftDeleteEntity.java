package com.bullhornsdk.data.model.entity.core.type;

/**
 * Represents a sub type of a BullhornEntity that can be soft deleted.
 * 
 * @author magnus.palm
 * 
 */
public interface SoftDeleteEntity extends DeleteEntity {

    public Boolean getIsDeleted();

}
