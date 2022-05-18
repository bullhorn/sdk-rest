package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTerm;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTermFileTypesForInvoicing;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTermVersion;
import com.bullhornsdk.data.model.entity.core.paybill.rate.DiscountRate;
import com.bullhornsdk.data.model.entity.core.paybill.rate.SurchargeRate;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceTermAssociations implements EntityAssociations<InvoiceTerm> {

    private List<AssociationField<InvoiceTerm, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<InvoiceTerm, InvoiceTermVersion> versions = instantiateAssociationField("versions", InvoiceTermVersion.class);
    private final AssociationField<InvoiceTerm, DiscountRate> discountRates = instantiateAssociationField("discountRates", DiscountRate.class);
    private final AssociationField<InvoiceTerm, InvoiceTermFileTypesForInvoicing> fileTypesForInvoicing = instantiateAssociationField("fileTypesForInvoicing", InvoiceTermFileTypesForInvoicing.class);
    private final AssociationField<InvoiceTerm, SurchargeRate> surchargeRates = instantiateAssociationField("surchargeRates", SurchargeRate.class);

    private static final InvoiceTermAssociations INSTANCE = new InvoiceTermAssociations();

    private InvoiceTermAssociations() {
        super();
    }

    public static InvoiceTermAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceTerm, InvoiceTermVersion> versions() {
        return versions;
    }

    public AssociationField<InvoiceTerm, DiscountRate> discountRates() {
        return discountRates;
    }

    public AssociationField<InvoiceTerm, InvoiceTermFileTypesForInvoicing> fileTypesForInvoicing() {
        return fileTypesForInvoicing;
    }
    public AssociationField<InvoiceTerm, SurchargeRate> surchargeRates() {
        return surchargeRates;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceTerm, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceTerm, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceTerm, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceTerm, ? extends BullhornEntity>>();
            allAssociations.add(versions());
            allAssociations.add(discountRates());
            allAssociations.add(fileTypesForInvoicing());
            allAssociations.add(surchargeRates());

        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceTerm, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceTerm, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceTerm called: " + associationName);
    }
}


