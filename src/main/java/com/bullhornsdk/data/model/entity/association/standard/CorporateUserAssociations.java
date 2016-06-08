package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.PrivateLabel;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for CorporateUser Associations.
 *
 * @author Anita Wu
 *
 */
public final class CorporateUserAssociations implements EntityAssociations<CorporateUser> {

    private final AssociationField<CorporateUser, CorporationDepartment> corporationDepartments = instantiateAssociationField("departments",CorporationDepartment.class);
    private final AssociationField<CorporateUser, PrivateLabel> privateLabels = instantiateAssociationField("privateLabels",PrivateLabel.class);


    private List<AssociationField<CorporateUser, ? extends BullhornEntity>> allAssociations;
    private static final CorporateUserAssociations INSTANCE = new CorporateUserAssociations();

    private CorporateUserAssociations() {
        super();
    }

    public static CorporateUserAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<CorporateUser, CorporationDepartment> corporationDepartments() {
        return corporationDepartments;
    }

    public AssociationField<CorporateUser, PrivateLabel> privateLabels() {
        return privateLabels;
    }

    private <E extends BullhornEntity> AssociationField<CorporateUser, E> instantiateAssociationField(String associationName,
                                                                                                          Class<E> associationType) {
        return new StandardAssociationField<CorporateUser, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<CorporateUser, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<CorporateUser, ? extends BullhornEntity>>();
            allAssociations.add(corporationDepartments());
            allAssociations.add(privateLabels());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<CorporateUser, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<CorporateUser, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Corporate User called: " + associationName);
    }

}
