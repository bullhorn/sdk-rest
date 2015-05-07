package com.bullhornsdk.data.model.entity.association;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Represents an association for a AssociationEntity.
 * 
 * Example: candidate.categories
 * 
 * 
 * @author magnus.palm
 * 
 * @param <T>
 *            the entity type. Example: Candidate
 */
public interface AssociationField<T extends AssociationEntity, E extends BullhornEntity> {

    /**
     * Returns the association name for the T AssociationEntity.
     * 
     * Example Candidate.categories would return "categories"
     * 
     * @return
     */
    public String getAssociationFieldName();

    /**
     * Returns the type of the association.
     * 
     * @return
     */
    public Class<E> getAssociationType();

}
