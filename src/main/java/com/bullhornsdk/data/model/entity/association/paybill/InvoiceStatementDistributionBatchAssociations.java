package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatement;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementDistributionBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementDistributionBatch;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementLineDistribution;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceStatementDistributionBatchAssociations implements EntityAssociations<InvoiceStatementDistributionBatch> {

    private final AssociationField<InvoiceStatementDistributionBatch, InvoiceStatementLineDistribution> invoiceStatementLineDistributions = instantiateAssociationField("invoiceStatementLineDistributions", InvoiceStatementLineDistribution.class);
    private final AssociationField<InvoiceStatementDistributionBatch, InvoiceStatement> invoiceStatements = instantiateAssociationField("invoiceStatements", InvoiceStatement.class);
    private List<AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity>> allAssociations;

    private static final InvoiceStatementDistributionBatchAssociations INSTANCE = new InvoiceStatementDistributionBatchAssociations();

    private InvoiceStatementDistributionBatchAssociations() {
        super();
    }

    public static InvoiceStatementDistributionBatchAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceStatementDistributionBatch, InvoiceStatementLineDistribution> invoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }
    
    public AssociationField<InvoiceStatementDistributionBatch, InvoiceStatement> invoiceStatements() {
        return invoiceStatements;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceStatementDistributionBatch, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceStatementDistributionBatch, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity>>();
            allAssociations.add(invoiceStatementLineDistributions());
            allAssociations.add(invoiceStatements());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceStatementDistributionBatch, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceStatementDistributionBatch called: " + associationName);
    }
}


