package com.bullhornsdk.data.model.entity.association.paybill;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.association.standard.StandardAssociationField;
import com.bullhornsdk.data.model.entity.core.paybill.charge.BillableCharge;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.file.BillableChargeFileAttachment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fayranne.lipton 4/10/2020
 */
public class BillableChargeAssociations implements EntityAssociations<BillableCharge> {

    private List<AssociationField<BillableCharge, ? extends BullhornEntity>> allAssociations;
    private final AssociationField<BillableCharge, BillableChargeFileAttachment> fileAttachments = instantiateAssociationField("fileAttachments", BillableChargeFileAttachment.class);

    private static final BillableChargeAssociations INSTANCE = new BillableChargeAssociations();

    private BillableChargeAssociations() {
        super();
    }

    public static BillableChargeAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<BillableCharge, BillableChargeFileAttachment> fileAttachments() {
        return fileAttachments;
    }

    private <E extends BullhornEntity> AssociationField<BillableCharge, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<BillableCharge, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<BillableCharge, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<BillableCharge, ? extends BullhornEntity>>();
            allAssociations.add(fileAttachments());

        }
        return allAssociations;
    }

    @Override
    public AssociationField<BillableCharge, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<BillableCharge, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity BillableCharge called: " + associationName);
    }
}


