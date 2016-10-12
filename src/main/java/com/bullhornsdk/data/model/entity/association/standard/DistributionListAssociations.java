package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.DistributionList;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for CorporateUser Associations.
 *
 * @author Anita Wu
 *
 */
public final class DistributionListAssociations implements EntityAssociations<DistributionList> {

    private final AssociationField<DistributionList, Person> members = instantiateAssociationField("members", Person.class);

    private List<AssociationField<DistributionList, ? extends BullhornEntity>> allAssociations;

    private static final DistributionListAssociations INSTANCE = new DistributionListAssociations();

    private DistributionListAssociations() {
        super();
    }

    public static DistributionListAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<DistributionList, Person> members() {
        return members;
    }

    private <E extends BullhornEntity> AssociationField<DistributionList, E> instantiateAssociationField(String associationName,
                                                                                                          Class<E> associationType) {
        return new StandardAssociationField<>(associationName, associationType);
    }

    @Override
    public List<AssociationField<DistributionList, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<>();
            allAssociations.add(members());
        }

        return allAssociations;

    }

    @Override
    public AssociationField<DistributionList, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<DistributionList, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Distribution List called: " + associationName);
    }

}
