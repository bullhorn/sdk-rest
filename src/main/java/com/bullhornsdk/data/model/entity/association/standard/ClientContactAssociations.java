package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for ClientContact Associations.
 * 
 * @author Magnus
 * 
 */
public final class ClientContactAssociations implements EntityAssociations<ClientContact> {

    private final AssociationField<ClientContact, BusinessSector> businessSectors = instantiateAssociationField(
            "businessSectors", BusinessSector.class);
    private final AssociationField<ClientContact, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<ClientContact, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners",
            CorporateUser.class);
    private final AssociationField<ClientContact, Skill> skills = instantiateAssociationField("skills", Skill.class);
    private final AssociationField<ClientContact, Specialty> specialties = instantiateAssociationField("specialties",
            Specialty.class);
    private List<AssociationField<ClientContact, ? extends BullhornEntity>> allAssociations;

    private static final ClientContactAssociations INSTANCE = new ClientContactAssociations();

    private ClientContactAssociations() {
        super();
    }

    public static ClientContactAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<ClientContact,BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<ClientContact,Category> categories() {
        return categories;
    }

    public AssociationField<ClientContact,CorporateUser> secondaryOwners() {
        return secondaryOwners;
    }

    public AssociationField<ClientContact,Skill> skills() {
        return skills;
    }

    public AssociationField<ClientContact,Specialty> specialties() {
        return specialties;
    }

    private <E extends BullhornEntity> AssociationField<ClientContact, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<ClientContact, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<ClientContact, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<ClientContact, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(secondaryOwners());
            allAssociations.add(skills());
            allAssociations.add(specialties());
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
