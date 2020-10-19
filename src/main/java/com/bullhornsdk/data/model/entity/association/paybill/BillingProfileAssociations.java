package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfile;
import com.bullhornsdk.data.model.entity.core.paybill.BillingProfileVersion;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class BillingProfileAssociations implements EntityAssociations<BillingProfile> {

    private List<AssociationField<BillingProfile, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<BillingProfile, BillingProfileVersion> versions = instantiateAssociationField("versions", BillingProfileVersion.class);

    private static final BillingProfileAssociations INSTANCE = new BillingProfileAssociations();

    private BillingProfileAssociations() {
        super();
    }

    public static BillingProfileAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<BillingProfile, BillingProfileVersion> versions() {
        return versions;
    }

    private <E extends BullhornEntity> AssociationField<BillingProfile, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<BillingProfile, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<BillingProfile, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<BillingProfile, ? extends BullhornEntity>>();
            allAssociations.add(versions());

        }
        return allAssociations;
    }

    @Override
    public AssociationField<BillingProfile, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<BillingProfile, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity BillingProfile called: " + associationName);
    }
}


