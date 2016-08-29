package com.bullhornsdk.data.model.entity.association.standard;


import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for ClientContact Associations.
 *
 * @author Magnus
 *
 */
public final class ClientContactAssociations implements EntityAssociations<ClientContact> {

    private final AssociationField<ClientContact, BusinessSector> businessSectors = instantiateAssociationField("businessSectors", BusinessSector.class);
    private final AssociationField<ClientContact, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<ClientContact, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners", CorporateUser.class);
    private final AssociationField<ClientContact, Lead> leads = instantiateAssociationField("leads", Lead.class);
    private final AssociationField<ClientContact, Skill> skills = instantiateAssociationField("skills", Skill.class);
    private final AssociationField<ClientContact, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private final AssociationField<ClientContact, Tearsheet> tearsheets = instantiateAssociationField("tearsheets", Tearsheet.class);
    private final AssociationField<ClientContact, Opportunity> opportunities = instantiateAssociationField("opportunities", Opportunity.class);
    private final AssociationField<ClientContact, Person> reportToPerson = instantiateAssociationField("reportToPerson", Person.class);
    private final AssociationField<ClientContact, Person> linkedPerson = instantiateAssociationField("linkedPerson", Person.class);
    private final AssociationField<ClientContact, Category> category = instantiateAssociationField("category", Category.class);
    private final AssociationField<ClientContact, ClientCorporation> clientCorporation = instantiateAssociationField("clientCorporation", ClientCorporation.class);
    private final AssociationField<ClientContact, Person> referredByPerson = instantiateAssociationField("referredByPerson", Person.class);
    private final AssociationField<ClientContact, CorporateUser> owner = instantiateAssociationField("owner", CorporateUser.class);

    private final AssociationField<ClientContact, PersonCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", PersonCustomObjectInstance1.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", PersonCustomObjectInstance2.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", PersonCustomObjectInstance3.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", PersonCustomObjectInstance4.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", PersonCustomObjectInstance5.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", PersonCustomObjectInstance6.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", PersonCustomObjectInstance7.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", PersonCustomObjectInstance8.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", PersonCustomObjectInstance9.class);
    private final AssociationField<ClientContact, PersonCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", PersonCustomObjectInstance10.class);

    private List<AssociationField<ClientContact, ? extends BullhornEntity>> allAssociations;

    private static final ClientContactAssociations INSTANCE = new ClientContactAssociations();

    private ClientContactAssociations() {
        super();
    }

    public static ClientContactAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<ClientContact, BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<ClientContact, Category> categories() {
        return categories;
    }

    public AssociationField<ClientContact, Category> category() {
        return category;
    }

    public AssociationField<ClientContact, ClientCorporation> clientCorporation() {
        return clientCorporation;
    }

    public AssociationField<ClientContact, Lead> leads() {
        return leads;
    }

    public AssociationField<ClientContact, Person> linkedPerson() {
        return linkedPerson;
    }

    public AssociationField<ClientContact, Opportunity> opportunities() {
        return opportunities;
    }

    public AssociationField<ClientContact, CorporateUser> owner() {
        return owner;
    }

    public AssociationField<ClientContact, Person> referredByPerson() {
        return referredByPerson;
    }

    public AssociationField<ClientContact, Person> reportToPerson() {
        return reportToPerson;
    }

    public AssociationField<ClientContact, CorporateUser> secondaryOwners() {
        return secondaryOwners;
    }

    public AssociationField<ClientContact, Skill> skills() {
        return skills;
    }

    public AssociationField<ClientContact, Specialty> specialties() {
        return specialties;
    }

    public AssociationField<ClientContact, Tearsheet> tearsheets() {
        return tearsheets;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<ClientContact, PersonCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }

    private <E extends BullhornEntity> AssociationField<ClientContact, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<ClientContact, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<ClientContact, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<ClientContact, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(category());
            allAssociations.add(clientCorporation());
            allAssociations.add(leads());
            allAssociations.add(linkedPerson());
            allAssociations.add(opportunities());
            allAssociations.add(owner());
            allAssociations.add(referredByPerson());
            allAssociations.add(reportToPerson());
            allAssociations.add(secondaryOwners());
            allAssociations.add(skills());
            allAssociations.add(specialties());
            allAssociations.add(tearsheets());
            allAssociations.add(customObject1s());
            allAssociations.add(customObject2s());
            allAssociations.add(customObject3s());
            allAssociations.add(customObject4s());
            allAssociations.add(customObject5s());
            allAssociations.add(customObject6s());
            allAssociations.add(customObject7s());
            allAssociations.add(customObject8s());
            allAssociations.add(customObject9s());
            allAssociations.add(customObject10s());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<ClientContact, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<ClientContact, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity ClientContact called: " + associationName);
    }

}
