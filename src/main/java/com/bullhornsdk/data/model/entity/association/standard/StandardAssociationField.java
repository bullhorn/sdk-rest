package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Standard implementation of the AssociationField interface. The name of the association field will be passed in to the
 * constructor.
 * 
 * @See CandidateAssociations, ClientContactAssociations, ClientCorporationAssocations,JobOrderAssociations, NoteAssociations,
 *      PlacementAssociations for factory classes.
 * @author magnus.palm
 * 
 * @param <T>
 */
public final class StandardAssociationField<T extends AssociationEntity, E extends BullhornEntity> implements AssociationField<T, E> {

    private final String associationFieldName;
    private final Class<E> associationType;


    public StandardAssociationField(String associationFieldName, Class<E> associationType) {
        super();
        this.associationFieldName = associationFieldName;
        this.associationType = associationType;
    }

    @Override
    public String getAssociationFieldName() {
        return associationFieldName;
    }
    
    @Override
    public Class<E> getAssociationType() {
        return associationType;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" {\n\"associationFieldName\":\"");
        builder.append(associationFieldName);
        builder.append("\n}");
        return builder.toString();
    }

}
