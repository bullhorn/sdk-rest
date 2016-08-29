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
    private final AssociationField<Lead, Category> category = instantiateAssociationField("category", Category.class);
    private final AssociationField<Lead, DistributionList> distributionLists = instantiateAssociationField("distributionLists", DistributionList.class);
    private final AssociationField<Lead, Note> notes = instantiateAssociationField("notes", Note.class);
    private final AssociationField<Lead, ClientCorporation> clientCorporation = instantiateAssociationField("clientCorporation", ClientCorporation.class);
    private final AssociationField<Lead, CorporateUser> owner = instantiateAssociationField("owner", CorporateUser.class);
    private final AssociationField<Lead, BusinessSector> businessSectors = instantiateAssociationField("businessSectors", BusinessSector.class);
    private final AssociationField<Lead, Person> referredByPerson = instantiateAssociationField("referredByPerson", Person.class);
    private final AssociationField<Lead, ClientCorporation> ownerCorporation = instantiateAssociationField("ownerCorporation", ClientCorporation.class);
    private final AssociationField<Lead, Person> reportToPerson = instantiateAssociationField("reportToPerson", Person.class);


    private List<AssociationField<Lead, ? extends BullhornEntity>> allAssociations;

    private static final LeadAssociations INSTANCE = new LeadAssociations();

    private LeadAssociations() {
        super();
    }

    public static LeadAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Lead, CorporateUser> assignedTo() {
        return assignedTo;
    }

    public AssociationField<Lead, BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Lead, Candidate> candidates() {
        return candidates;
    }

    public AssociationField<Lead, Category> categories() {
        return categories;
    }

    public AssociationField<Lead, Category> category() {
        return category;
    }

    public AssociationField<Lead, ClientContact> clientContacts() {
        return clientContacts;
    }

    public AssociationField<Lead, ClientCorporation> clientCorporation() {
        return clientCorporation;
    }

    public AssociationField<Lead, DistributionList> distributionLists() {
        return distributionLists;
    }

    public AssociationField<Lead, CorporateUser> owner() {
        return owner;
    }

    public AssociationField<Lead, ClientCorporation> ownerCorporation() {
        return ownerCorporation;
    }

    public AssociationField<Lead, Note> notes() {
        return notes;
    }

    public AssociationField<Lead, Skill> primarySkills() {
        return primarySkills;
    }

    public AssociationField<Lead, Person> referredByPerson() {
        return referredByPerson;
    }

    public AssociationField<Lead, Person> reportToPerson() {
        return reportToPerson;
    }

    public AssociationField<Lead, Skill> secondarySkills() {
        return secondarySkills;
    }

    public AssociationField<Lead, Specialty> specialties() {
        return specialties;
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
            allAssociations.add(assignedTo());
            allAssociations.add(businessSectors());
            allAssociations.add(candidates());
            allAssociations.add(categories());
            allAssociations.add(category());
            allAssociations.add(clientContacts());
            allAssociations.add(clientCorporation());
            allAssociations.add(distributionLists());
            allAssociations.add(notes());
            allAssociations.add(owner());
            allAssociations.add(ownerCorporation());
            allAssociations.add(primarySkills());
            allAssociations.add(referredByPerson());
            allAssociations.add(reportToPerson());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
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
