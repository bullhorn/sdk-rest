package com.bullhornsdk.data.model.entity.association;

import java.util.List;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public interface EntityAssociations<T extends AssociationEntity> {

    /**
     * Returns a list of all the associations for the entity of type T.
     * 
     * @return
     */
    public List<AssociationField<T, ? extends BullhornEntity>> allAssociations();

    /**
     * Return the association field for type T.
     * 
     * @throws IllegalArgumentException
     *             if no association with that name exists.
     * @param associationName
     * @return
     */
    public AssociationField<T, ? extends BullhornEntity> getAssociation(String associationName);
}
