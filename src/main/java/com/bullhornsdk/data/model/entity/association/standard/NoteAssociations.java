package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Note Associations.
 * 
 * @author Magnus
 * 
 */
public final class NoteAssociations implements EntityAssociations<Note> {

    private final AssociationField<Note,ClientContact> clientContacts = instantiateAssociationField("clientContacts",ClientContact.class);
    private final AssociationField<Note,CorporateUser> corporateUsers = instantiateAssociationField("corporateUsers",CorporateUser.class);
    private final AssociationField<Note,JobOrder> jobOrders = instantiateAssociationField("jobOrders",JobOrder.class);
    private final AssociationField<Note,Placement> placements = instantiateAssociationField("placements",Placement.class);
    private final AssociationField<Note,NoteEntity> entities = instantiateAssociationField("entities", NoteEntity.class);
    private List<AssociationField<Note,? extends BullhornEntity>> allAssociations;

    private static final NoteAssociations INSTANCE = new NoteAssociations();

    private NoteAssociations() {
        super();
    }

    public static NoteAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Note,ClientContact> clientContacts() {
        return clientContacts;
    }

    public AssociationField<Note,CorporateUser> corporateUsers() {
        return corporateUsers;
    }

    public AssociationField<Note,JobOrder> jobOrders() {
        return jobOrders;
    }

    public AssociationField<Note,Placement> placements() {
        return placements;
    }

    public AssociationField<Note, NoteEntity> entities() {
        return entities;
    }

    private <E extends BullhornEntity> AssociationField<Note, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Note, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Note,? extends BullhornEntity>> allAssociations() {

        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Note,? extends BullhornEntity>>();
            allAssociations.add(clientContacts());
            allAssociations.add(corporateUsers());
            allAssociations.add(jobOrders());
            allAssociations.add(placements());
            allAssociations.add(entities());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<Note,? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Note,? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Note called: " + associationName);
    }

}
