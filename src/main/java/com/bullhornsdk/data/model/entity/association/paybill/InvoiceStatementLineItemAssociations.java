package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.*;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceStatementLineItemAssociations implements EntityAssociations<InvoiceStatementLineItem> {

    private final AssociationField<InvoiceStatementLineItem, BillMasterTransaction> billMasterTransactions = instantiateAssociationField("billMasterTransactions", BillMasterTransaction.class);
    private final AssociationField<InvoiceStatementLineItem, InvoiceStatementLineItemGroupBy> groupBys = instantiateAssociationField("groupBys", InvoiceStatementLineItemGroupBy.class);
    private final AssociationField<InvoiceStatementLineItem, InvoiceStatementLineDistribution> invoiceStatementLineDistributions = instantiateAssociationField("invoiceStatementLineDistributions", InvoiceStatementLineDistribution.class);
    private final AssociationField<InvoiceStatementLineItem, InvoiceStatementLineItemSummarizeBy> summarizeBys = instantiateAssociationField("summarizeBys", InvoiceStatementLineItemSummarizeBy.class);
    private List<AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity>> allAssociations;

    private static final InvoiceStatementLineItemAssociations INSTANCE = new InvoiceStatementLineItemAssociations();

    private InvoiceStatementLineItemAssociations() {
        super();
    }

    public static InvoiceStatementLineItemAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceStatementLineItem, BillMasterTransaction> billMasterTransactions() {
        return billMasterTransactions;
    }

    public AssociationField<InvoiceStatementLineItem, InvoiceStatementLineItemGroupBy> groupBys() {
        return groupBys;
    }

    public AssociationField<InvoiceStatementLineItem, InvoiceStatementLineDistribution> invoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }

    public AssociationField<InvoiceStatementLineItem, InvoiceStatementLineItemSummarizeBy> summarizeBys() {
        return summarizeBys;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceStatementLineItem, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceStatementLineItem, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity>>();
            allAssociations.add(billMasterTransactions());
            allAssociations.add(groupBys());
            allAssociations.add(invoiceStatementLineDistributions());
            allAssociations.add(summarizeBys());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceStatementLineItem, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceStatementLineItem called: " + associationName);
    }
}


