package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Category Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class CategoryAssociations implements EntityAssociations<Category> {

    private final AssociationField<Category, Skill> skills = instantiateAssociationField("skills", Skill.class);
    private final AssociationField<Category, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private List<AssociationField<Category, ? extends BullhornEntity>> allAssociations;
    private final static CategoryAssociations INSTANCE = new CategoryAssociations();

    public CategoryAssociations() {
        super();
    }

    public static CategoryAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Category, Skill> skills() {

        return skills;
    }

    public AssociationField<Category, Specialty> specialties() {

        return specialties;
    }

    private <E extends BullhornEntity> AssociationField<Category, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Category, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Category, ? extends BullhornEntity>> allAssociations() {

        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Category, ? extends BullhornEntity>>();

            allAssociations.add(skills());
            allAssociations.add(specialties());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<Category, ? extends BullhornEntity> getAssociation(String associationName) {

        for (AssociationField<Category, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Category called: " + associationName);
    }

}
