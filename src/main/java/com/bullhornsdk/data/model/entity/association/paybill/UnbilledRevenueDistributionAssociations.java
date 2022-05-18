package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.distribution.UnbilledRevenueDistribution;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class UnbilledRevenueDistributionAssociations implements EntityAssociations<UnbilledRevenueDistribution> {

    private final AssociationField<UnbilledRevenueDistribution, BillMasterTransaction> billMasterTransactions = instantiateAssociationField("billMasterTransactions", BillMasterTransaction.class);
    private List<AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity>> allAssociations;

    private static final UnbilledRevenueDistributionAssociations INSTANCE = new UnbilledRevenueDistributionAssociations();

    private UnbilledRevenueDistributionAssociations() {
        super();
    }

    public static UnbilledRevenueDistributionAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<UnbilledRevenueDistribution, BillMasterTransaction> billMasterTransactions() {
        return billMasterTransactions;
    }

    private <E extends BullhornEntity> AssociationField<UnbilledRevenueDistribution, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<UnbilledRevenueDistribution, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity>>();
            allAssociations.add(billMasterTransactions());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<UnbilledRevenueDistribution, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity UnbilledRevenueDistribution called: " + associationName);
    }
}


