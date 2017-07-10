package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Branch;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Created by hiqbal on 6/2/2016.
 */
public class BranchAssociations implements EntityAssociations<Branch> {

    private final AssociationField<Branch, Branch> ancestors = instantiateAssociationField("ancestors", Branch.class);

    private final AssociationField<Branch, Branch> descendants = instantiateAssociationField("descendants", Branch.class);

    private final AssociationField<Branch, CorporateUser> corporateUsers = instantiateAssociationField("corporateUsers", CorporateUser.class);

    private List<AssociationField<Branch, ? extends BullhornEntity>> allAssociations;

    private static final BranchAssociations INSTANCE = new BranchAssociations();

    private BranchAssociations() {
        super();
    }

    public static BranchAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Branch, Branch> ancestors() {
        return ancestors;
    }

    public AssociationField<Branch, Branch> descendants() {
        return descendants;
    }

    public AssociationField<Branch, CorporateUser> corporateUsers() {
        return corporateUsers;
    }

    @Override
    public List<AssociationField<Branch, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Branch, ? extends BullhornEntity>>();
            allAssociations.add(ancestors());
            allAssociations.add(descendants());
            allAssociations.add(corporateUsers());
        }

        return allAssociations;
    }

    @Override
    public AssociationField<Branch, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Branch, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Appointment called: " + associationName);
    }

    private <E extends BullhornEntity> AssociationField<Branch, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<Branch, E>(associationName, associationType);
    }

}
