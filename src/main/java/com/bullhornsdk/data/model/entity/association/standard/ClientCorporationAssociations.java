package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for ClientCorporation Associations.
 * 
 * @author Magnus
 * 
 */
public final class ClientCorporationAssociations implements EntityAssociations<ClientCorporation> {

    private final AssociationField<ClientCorporation,ClientCorporation> childClientCorporations = instantiateAssociationField("childClientCorporations",ClientCorporation.class);
    private List<AssociationField<ClientCorporation, ? extends BullhornEntity>> allAssociations;

    private static final ClientCorporationAssociations INSTANCE = new ClientCorporationAssociations();

    private ClientCorporationAssociations() {
        super();
    }

    public static ClientCorporationAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<ClientCorporation,ClientCorporation> childClientCorporations() {
        return childClientCorporations;
    }

    private <E extends BullhornEntity> AssociationField<ClientCorporation, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<ClientCorporation, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<ClientCorporation, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<ClientCorporation, ? extends BullhornEntity>>();
            allAssociations.add(childClientCorporations());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<ClientCorporation, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<ClientCorporation, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity ClientCorporation called: " + associationName);
    }

}
