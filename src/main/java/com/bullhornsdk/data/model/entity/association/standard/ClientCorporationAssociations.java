package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for ClientCorporation Associations.
 *
 * @author Magnus
 *
 */
public final class ClientCorporationAssociations implements EntityAssociations<ClientCorporation> {

    private final AssociationField<ClientCorporation,ClientCorporation> childClientCorporations = instantiateAssociationField("childClientCorporations", ClientCorporation.class);
    private final AssociationField<ClientCorporation,Lead> leads = instantiateAssociationField("leads", Lead.class);
    private final AssociationField<ClientCorporation, CorporateUser> owners = instantiateAssociationField("owners", CorporateUser.class);
    private final AssociationField<ClientCorporation, ClientContact> clientContacts = instantiateAssociationField("clientContacts", ClientContact.class);

    private List<AssociationField<ClientCorporation, ? extends BullhornEntity>> allAssociations;

    private static final ClientCorporationAssociations INSTANCE = new ClientCorporationAssociations();

    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", ClientCorporationCustomObjectInstance1.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", ClientCorporationCustomObjectInstance2.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", ClientCorporationCustomObjectInstance3.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", ClientCorporationCustomObjectInstance4.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", ClientCorporationCustomObjectInstance5.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", ClientCorporationCustomObjectInstance6.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", ClientCorporationCustomObjectInstance7.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", ClientCorporationCustomObjectInstance8.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", ClientCorporationCustomObjectInstance9.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", ClientCorporationCustomObjectInstance10.class);

    private ClientCorporationAssociations() {
        super();
    }

    public static ClientCorporationAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<ClientCorporation,ClientCorporation> childClientCorporations() {
        return childClientCorporations;
    }

    public AssociationField<ClientCorporation, ClientContact> clientContacts() {
        return clientContacts;
    }

    public AssociationField<ClientCorporation,Lead> leads() {
        return leads;
    }

    public AssociationField<ClientCorporation, CorporateUser> owners() {
        return owners;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance10> customObject10s() {
        return customObject10s;
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
            allAssociations.add(clientContacts());
            allAssociations.add(leads());
            allAssociations.add(owners());
            allAssociations.add(customObject1s());
            allAssociations.add(customObject2s());
            allAssociations.add(customObject3s());
            allAssociations.add(customObject4s());
            allAssociations.add(customObject5s());
            allAssociations.add(customObject6s());
            allAssociations.add(customObject7s());
            allAssociations.add(customObject8s());
            allAssociations.add(customObject9s());
            allAssociations.add(customObject10s());
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
