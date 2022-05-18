package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.*;
import com.bullhornsdk.data.model.entity.core.paybill.optionslookup.SpecializedOptionsLookup;
import com.bullhornsdk.data.model.entity.core.paybill.transaction.BillMasterTransaction;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.file.InvoiceStatementExport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceStatementAssociations implements EntityAssociations<InvoiceStatement> {

    private final AssociationField<InvoiceStatement, Person> bccRecipients = instantiateAssociationField("bccRecipients", Person.class);
    private final AssociationField<InvoiceStatement, BillableCharge> billableCharges = instantiateAssociationField("billableCharges", BillableCharge.class);
    private final AssociationField<InvoiceStatement, Candidate> candidates = instantiateAssociationField("candidates", Candidate.class);
    private final AssociationField<InvoiceStatement, Person> ccRecipients = instantiateAssociationField("ccRecipients", Person.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementDiscount> discounts = instantiateAssociationField("discounts", InvoiceStatementDiscount.class);
    private final AssociationField<InvoiceStatement, SpecializedOptionsLookup> fileTypesForInvoicing = instantiateAssociationField("fileTypesForInvoicing", SpecializedOptionsLookup.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementExport> invoiceStatementExports = instantiateAssociationField("invoiceStatementExports", InvoiceStatementExport.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementExportBatch> invoiceStatementExportsBatches = instantiateAssociationField("invoiceStatementExportsBatches", InvoiceStatementExportBatch.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementLineDistribution> invoiceStatementLineDistributions = instantiateAssociationField("invoiceStatementLineDistributions", InvoiceStatementLineDistribution.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementLineItem> lineItems = instantiateAssociationField("lineItems", InvoiceStatementLineItem.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementSplitBy> splitBys = instantiateAssociationField("splitBys", InvoiceStatementSplitBy.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementSurcharge> surcharges = instantiateAssociationField("surcharges", InvoiceStatementSurcharge.class);
    private final AssociationField<InvoiceStatement, InvoiceStatementTax> taxes = instantiateAssociationField("taxes", InvoiceStatementTax.class);
    private List<AssociationField<InvoiceStatement, ? extends BullhornEntity>> allAssociations;

    private static final InvoiceStatementAssociations INSTANCE = new InvoiceStatementAssociations();

    private InvoiceStatementAssociations() {
        super();
    }

    public static InvoiceStatementAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceStatement, Person> bccRecipients() {
        return bccRecipients;
    }

    public AssociationField<InvoiceStatement, BillableCharge> billableCharges() {
        return billableCharges;
    }

    public AssociationField<InvoiceStatement, Candidate> candidates() {
        return candidates;
    }

    public AssociationField<InvoiceStatement, Person> ccRecipients() {
        return ccRecipients;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementDiscount> discounts() {
        return discounts;
    }

    public AssociationField<InvoiceStatement, SpecializedOptionsLookup> fileTypesForInvoicing() {
        return fileTypesForInvoicing;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementExport> invoiceStatementExports() {
        return invoiceStatementExports;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementExportBatch> invoiceStatementExportsBatches() {
        return invoiceStatementExportsBatches;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementLineDistribution> invoiceStatementLineDistributions() {
        return invoiceStatementLineDistributions;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementLineItem> lineItems() {
        return lineItems;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementSplitBy> splitBys() {
        return splitBys;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementSurcharge> surcharges() {
        return surcharges;
    }

    public AssociationField<InvoiceStatement, InvoiceStatementTax> taxes() {
        return taxes;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceStatement, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceStatement, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceStatement, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceStatement, ? extends BullhornEntity>>();
            allAssociations.add(bccRecipients());
            allAssociations.add(billableCharges());
            allAssociations.add(candidates());
            allAssociations.add(ccRecipients());
            allAssociations.add(discounts());
            allAssociations.add(fileTypesForInvoicing());
            allAssociations.add(invoiceStatementExports());
            allAssociations.add(invoiceStatementExportsBatches());
            allAssociations.add(invoiceStatementLineDistributions());
            allAssociations.add(lineItems());
            allAssociations.add(splitBys());
            allAssociations.add(surcharges());
            allAssociations.add(taxes());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceStatement, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceStatement, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceStatement called: " + associationName);
    }
}


