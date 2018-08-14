package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CertificationGroup;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
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

    private final AssociationField<ClientCorporation,ClientCorporation> childClientCorporations = instantiateAssociationField("childClientCorporations",ClientCorporation.class);
    private final AssociationField<ClientCorporation,Lead> leads = instantiateAssociationField("leads",Lead.class);
    private final AssociationField<ClientCorporation, Certification> requirements = instantiateAssociationField("requirements", Certification.class);
    private final AssociationField<ClientCorporation, CertificationGroup> certificationGroups = instantiateAssociationField("certificationGroups", CertificationGroup.class);

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
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance11> customObject11s = instantiateAssociationField("customObject11s", ClientCorporationCustomObjectInstance11.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance12> customObject12s = instantiateAssociationField("customObject12s", ClientCorporationCustomObjectInstance12.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance13> customObject13s = instantiateAssociationField("customObject13s", ClientCorporationCustomObjectInstance13.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance14> customObject14s = instantiateAssociationField("customObject14s", ClientCorporationCustomObjectInstance14.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance15> customObject15s = instantiateAssociationField("customObject15s", ClientCorporationCustomObjectInstance15.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance16> customObject16s = instantiateAssociationField("customObject16s", ClientCorporationCustomObjectInstance16.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance17> customObject17s = instantiateAssociationField("customObject17s", ClientCorporationCustomObjectInstance17.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance18> customObject18s = instantiateAssociationField("customObject18s", ClientCorporationCustomObjectInstance18.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance19> customObject19s = instantiateAssociationField("customObject19s", ClientCorporationCustomObjectInstance19.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance20> customObject20s = instantiateAssociationField("customObject20s", ClientCorporationCustomObjectInstance20.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance21> customObject21s = instantiateAssociationField("customObject21s", ClientCorporationCustomObjectInstance21.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance22> customObject22s = instantiateAssociationField("customObject22s", ClientCorporationCustomObjectInstance22.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance23> customObject23s = instantiateAssociationField("customObject23s", ClientCorporationCustomObjectInstance23.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance24> customObject24s = instantiateAssociationField("customObject24s", ClientCorporationCustomObjectInstance24.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance25> customObject25s = instantiateAssociationField("customObject25s", ClientCorporationCustomObjectInstance25.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance26> customObject26s = instantiateAssociationField("customObject26s", ClientCorporationCustomObjectInstance26.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance27> customObject27s = instantiateAssociationField("customObject27s", ClientCorporationCustomObjectInstance27.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance28> customObject28s = instantiateAssociationField("customObject28s", ClientCorporationCustomObjectInstance28.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance29> customObject29s = instantiateAssociationField("customObject29s", ClientCorporationCustomObjectInstance29.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance30> customObject30s = instantiateAssociationField("customObject30s", ClientCorporationCustomObjectInstance30.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance31> customObject31s = instantiateAssociationField("customObject31s", ClientCorporationCustomObjectInstance31.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance32> customObject32s = instantiateAssociationField("customObject32s", ClientCorporationCustomObjectInstance32.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance33> customObject33s = instantiateAssociationField("customObject33s", ClientCorporationCustomObjectInstance33.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance34> customObject34s = instantiateAssociationField("customObject34s", ClientCorporationCustomObjectInstance34.class);
    private final AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance35> customObject35s = instantiateAssociationField("customObject35s", ClientCorporationCustomObjectInstance35.class);

    private ClientCorporationAssociations() {
        super();
    }

    public static ClientCorporationAssociations getInstance() {
        return INSTANCE;
    }
    public AssociationField<ClientCorporation,ClientCorporation> childClientCorporations() {
        return childClientCorporations;
    }

    public AssociationField<ClientCorporation,Lead> leads() {
        return leads;
    }

    public AssociationField<ClientCorporation, Certification> requirements() {
        return requirements;
    }

    public AssociationField<ClientCorporation, CertificationGroup> certificationGroups() {
        return certificationGroups;
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

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance11> customObject11s() {
        return customObject11s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance12> customObject12s() {
        return customObject12s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance13> customObject13s() {
        return customObject13s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance14> customObject14s() {
        return customObject14s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance15> customObject15s() {
        return customObject15s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance16> customObject16s() {
        return customObject16s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance17> customObject17s() {
        return customObject17s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance18> customObject18s() {
        return customObject18s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance19> customObject19s() {
        return customObject19s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance20> customObject20s() {
        return customObject20s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance21> customObject21s() {
        return customObject21s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance22> customObject22s() {
        return customObject22s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance23> customObject23s() {
        return customObject23s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance24> customObject24s() {
        return customObject24s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance25> customObject25s() {
        return customObject25s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance26> customObject26s() {
        return customObject26s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance27> customObject27s() {
        return customObject27s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance28> customObject28s() {
        return customObject28s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance29> customObject29s() {
        return customObject29s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance30> customObject30s() {
        return customObject30s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance31> customObject31s() {
        return customObject31s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance32> customObject32s() {
        return customObject32s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance33> customObject33s() {
        return customObject33s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance34> customObject34s() {
        return customObject34s;
    }

    public AssociationField<ClientCorporation, ClientCorporationCustomObjectInstance35> customObject35s() {
        return customObject35s;
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
            allAssociations.add(leads());
            allAssociations.add(requirements());
            allAssociations.add(certificationGroups());
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
            allAssociations.add(customObject11s());
            allAssociations.add(customObject12s());
            allAssociations.add(customObject13s());
            allAssociations.add(customObject14s());
            allAssociations.add(customObject15s());
            allAssociations.add(customObject16s());
            allAssociations.add(customObject17s());
            allAssociations.add(customObject18s());
            allAssociations.add(customObject19s());
            allAssociations.add(customObject20s());
            allAssociations.add(customObject21s());
            allAssociations.add(customObject22s());
            allAssociations.add(customObject23s());
            allAssociations.add(customObject24s());
            allAssociations.add(customObject25s());
            allAssociations.add(customObject26s());
            allAssociations.add(customObject27s());
            allAssociations.add(customObject28s());
            allAssociations.add(customObject29s());
            allAssociations.add(customObject30s());
            allAssociations.add(customObject31s());
            allAssociations.add(customObject32s());
            allAssociations.add(customObject33s());
            allAssociations.add(customObject34s());
            allAssociations.add(customObject35s());
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
