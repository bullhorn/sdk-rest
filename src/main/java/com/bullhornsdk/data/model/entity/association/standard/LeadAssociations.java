package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for Lead Associations.
 *
 * @author Ryan McDole
 *
 */
public final class LeadAssociations implements EntityAssociations<Lead> {

    private final AssociationField<Lead, ClientContact> clientContacts = instantiateAssociationField("clientContacts", ClientContact.class);
    private final AssociationField<Lead, Candidate> candidates = instantiateAssociationField("candidates", Candidate.class);
    private final AssociationField<Lead, CorporateUser> assignedTo = instantiateAssociationField("assignedTo", CorporateUser.class);
    private final AssociationField<Lead, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Lead, Skill> primarySkills = instantiateAssociationField("primarySkills", Skill.class);
    private final AssociationField<Lead, Skill> secondarySkills = instantiateAssociationField("secondarySkills", Skill.class);
    private final AssociationField<Lead, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private final AssociationField<Lead, Tearsheet> tearsheets = instantiateAssociationField("tearsheets", Tearsheet.class);
    private List<AssociationField<Lead, ? extends BullhornEntity>> allAssociations;

    private static final LeadAssociations INSTANCE = new LeadAssociations();

    private LeadAssociations() {
        super();
    }

    public static LeadAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Lead, ClientContact> clientContacts() {
        return clientContacts;
    }

    public AssociationField<Lead, Candidate> candidates() {
        return candidates;
    }

    public AssociationField<Lead, Category> categories() {
        return categories;
    }

    public AssociationField<Lead, Skill> primarySkills() {
        return primarySkills;
    }

    public AssociationField<Lead, Skill> secondarySkills() {
        return secondarySkills;
    }

    public AssociationField<Lead, Specialty> specialties() {
        return specialties;
    }

    public AssociationField<Lead, CorporateUser> assignedTo() {
        return assignedTo;
    }

    public AssociationField<Lead, Tearsheet> tearsheets() {
        return tearsheets;
    }

    private <E extends BullhornEntity> AssociationField<Lead, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<Lead, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Lead, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Lead, ? extends BullhornEntity>>();
            allAssociations.add(clientContacts());
            allAssociations.add(candidates());
            allAssociations.add(assignedTo());
            allAssociations.add(primarySkills());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
            allAssociations.add(categories());
            allAssociations.add(tearsheets());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<Lead, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Lead, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Lead called: " + associationName);
    }

}
