package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Lead Associations.
 * 
 * @author Magnus
 * 
 */
public final class LeadAssociations implements EntityAssociations<Lead> {

    private final AssociationField<Lead, BusinessSector> businessSectors = instantiateAssociationField(
            "businessSectors", BusinessSector.class);
    private final AssociationField<Lead, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Lead, Skill> primarySkills = instantiateAssociationField("primarySkills", Skill.class);
    private final AssociationField<Lead, Skill> secondarySkills = instantiateAssociationField("secondarySkills", Skill.class);
    private final AssociationField<Lead, Specialty> specialties = instantiateAssociationField("specialties",
            Specialty.class);
    private List<AssociationField<Lead, ? extends BullhornEntity>> allAssociations;

    private static final LeadAssociations INSTANCE = new LeadAssociations();

    private LeadAssociations() {
        super();
    }

    public static LeadAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Lead,BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Lead,Category> categories() {
        return categories;
    }

    public AssociationField<Lead,Skill> primarySkills() {
        return primarySkills;
    }

    public AssociationField<Lead,Skill> secondarySkills() {
        return secondarySkills;
    }

    public AssociationField<Lead,Specialty> specialties() {
        return specialties;
    }

    private <E extends BullhornEntity> AssociationField<Lead, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Lead, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Lead, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Lead, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(primarySkills());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
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
