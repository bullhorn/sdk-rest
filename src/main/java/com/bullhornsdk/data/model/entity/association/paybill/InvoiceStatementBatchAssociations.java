package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.*;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceStatementBatchAssociations implements EntityAssociations<InvoiceStatementBatch> {

    private final AssociationField<InvoiceStatementBatch, BillMasterTransaction> billMasterTransactions = instantiateAssociationField("billMasterTransactions", BillMasterTransaction.class);
    private final AssociationField<InvoiceStatementBatch, BillableCharge> billableCharges = instantiateAssociationField("billableCharges", BillableCharge.class);
    private List<AssociationField<InvoiceStatementBatch, ? extends BullhornEntity>> allAssociations;

    private static final InvoiceStatementBatchAssociations INSTANCE = new InvoiceStatementBatchAssociations();

    private InvoiceStatementBatchAssociations() {
        super();
    }

    public static InvoiceStatementBatchAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceStatementBatch, BillMasterTransaction> billMasterTransactions() {
        return billMasterTransactions;
    }
    
    public AssociationField<InvoiceStatementBatch, BillableCharge> billableCharges() {
        return billableCharges;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceStatementBatch, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceStatementBatch, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceStatementBatch, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceStatementBatch, ? extends BullhornEntity>>();
            allAssociations.add(billMasterTransactions());
            allAssociations.add(billableCharges());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceStatementBatch, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceStatementBatch, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceStatementBatch called: " + associationName);
    }
}


