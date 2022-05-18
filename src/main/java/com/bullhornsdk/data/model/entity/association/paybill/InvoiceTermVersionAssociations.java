package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.BillingSyncBatchFileTypeLookup;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceTermVersion;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class InvoiceTermVersionAssociations implements EntityAssociations<InvoiceTermVersion> {

    private final AssociationField<InvoiceTermVersion, BillingSyncBatchFileTypeLookup> fileTypesForInvoicing = instantiateAssociationField("fileTypesForInvoicing", BillingSyncBatchFileTypeLookup.class);
    private List<AssociationField<InvoiceTermVersion, ? extends BullhornEntity>> allAssociations;

    private static final InvoiceTermVersionAssociations INSTANCE = new InvoiceTermVersionAssociations();

    private InvoiceTermVersionAssociations() {
        super();
    }

    public static InvoiceTermVersionAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<InvoiceTermVersion, BillingSyncBatchFileTypeLookup> fileTypesForInvoicing() {
        return fileTypesForInvoicing;
    }

    private <E extends BullhornEntity> AssociationField<InvoiceTermVersion, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<InvoiceTermVersion, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<InvoiceTermVersion, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<InvoiceTermVersion, ? extends BullhornEntity>>();
            allAssociations.add(fileTypesForInvoicing());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<InvoiceTermVersion, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<InvoiceTermVersion, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity InvoiceTermVersion called: " + associationName);
    }
}


