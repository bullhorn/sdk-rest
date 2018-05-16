package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporationCertification;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

public final class ClientCorporationCertificationAssociations implements EntityAssociations<ClientCorporationCertification> {

    private final AssociationField<ClientCorporationCertification, Certification> alternateCertifications = instantiateAssociationField("alternateCertifications", Certification.class);

    private List<AssociationField<ClientCorporationCertification, ? extends BullhornEntity>> allAssociations;
    private static final ClientCorporationCertificationAssociations INSTANCE = new ClientCorporationCertificationAssociations();

    private ClientCorporationCertificationAssociations() {
        super();
    }

    public static ClientCorporationCertificationAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<ClientCorporationCertification, Certification> alternateCertifications() {
        return alternateCertifications;
    }

    private <E extends BullhornEntity> AssociationField<ClientCorporationCertification, E> instantiateAssociationField(String associationName,
                                                                                                      Class<E> associationType) {
        return new StandardAssociationField<ClientCorporationCertification, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<ClientCorporationCertification, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<ClientCorporationCertification, ? extends BullhornEntity>>();
            allAssociations.add(alternateCertifications());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<ClientCorporationCertification, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<ClientCorporationCertification, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity ClientCorporationCertification called: " + associationName);
    }

}
