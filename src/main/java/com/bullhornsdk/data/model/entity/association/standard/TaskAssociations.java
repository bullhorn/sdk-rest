package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for Task Associations.
 *
 * @author Generated
 *
 */
public final class TaskAssociations implements EntityAssociations<Task> {

    private final AssociationField<Task, CorporateUser> assignees = instantiateAssociationField("assignees", CorporateUser.class);
    private final AssociationField<Task, CorporateUser> childTaskOwners = instantiateAssociationField("childTaskOwners", CorporateUser.class);
    private final AssociationField<Task, ClientContact> clientContactReferences = instantiateAssociationField("clientContactReferences", ClientContact.class);
    private final AssociationField<Task, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners", CorporateUser.class);
    private List<AssociationField<Task, ? extends BullhornEntity>> allAssociations;
    private final static TaskAssociations INSTANCE = new TaskAssociations();

    public TaskAssociations() {
        super();
    }

    public static TaskAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Task, CorporateUser> assignees() {
        return assignees;
    }

    public AssociationField<Task, CorporateUser> childTaskOwners() {
        return childTaskOwners;
    }

    public AssociationField<Task, ClientContact> clientContactReferences() {
        return clientContactReferences;
    }

    public AssociationField<Task, CorporateUser> secondaryOwners() {
        return secondaryOwners;
    }

    private <E extends BullhornEntity> AssociationField<Task, E> instantiateAssociationField(String associationName,
                                                                                             Class<E> associationType) {
        return new StandardAssociationField<Task, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Task, ? extends BullhornEntity>> allAssociations() {

        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Task, ? extends BullhornEntity>>();

            allAssociations.add(assignees());
            allAssociations.add(childTaskOwners());
            allAssociations.add(clientContactReferences());
            allAssociations.add(secondaryOwners());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<Task, ? extends BullhornEntity> getAssociation(String associationName) {

        for (AssociationField<Task, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Task called: " + associationName);
    }

}

