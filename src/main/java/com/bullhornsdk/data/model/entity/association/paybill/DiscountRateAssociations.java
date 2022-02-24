package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRate;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRateVersion;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kin.to 11/14/2020
 */
public class DiscountRateAssociations implements EntityAssociations<DiscountRate> {

    private List<AssociationField<DiscountRate, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<DiscountRate, DiscountRateVersion> versions = instantiateAssociationField("versions", DiscountRateVersion.class);

    private static final DiscountRateAssociations INSTANCE = new DiscountRateAssociations();

    private DiscountRateAssociations() {
        super();
    }

    public static DiscountRateAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<DiscountRate, DiscountRateVersion> versions() {
        return versions;
    }

    private <E extends BullhornEntity> AssociationField<DiscountRate, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<DiscountRate, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<DiscountRate, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<DiscountRate, ? extends BullhornEntity>>();
            allAssociations.add(versions());

        }
        return allAssociations;
    }

    @Override
    public AssociationField<DiscountRate, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<DiscountRate, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity DiscountRate called: " + associationName);
    }
}


