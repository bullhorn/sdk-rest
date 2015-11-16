package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Opportunity Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class OpportunityAssociations implements EntityAssociations<Opportunity> {

    private final AssociationField<Opportunity, CorporateUser> assignedUsers = instantiateAssociationField("assignedUsers",
            CorporateUser.class);
    private final AssociationField<Opportunity, BusinessSector> businessSectors = instantiateAssociationField("businessSectors",
            BusinessSector.class);
    private final AssociationField<Opportunity, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Opportunity, Certification> certifications = instantiateAssociationField("certifications",
            Certification.class);
    private final AssociationField<Opportunity, Skill> skills = instantiateAssociationField("skills", Skill.class);

    private List<AssociationField<Opportunity, ? extends BullhornEntity>> allAssociations;

    private static final OpportunityAssociations INSTANCE = new OpportunityAssociations();

    private OpportunityAssociations() {
        super();
    }

    public static OpportunityAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Opportunity,CorporateUser> assignedUsers() {
        return assignedUsers;
    }

    public AssociationField<Opportunity,BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Opportunity,Category> categories() {
        return categories;
    }

    public AssociationField<Opportunity,Certification> certifications() {
        return certifications;
    }

    public AssociationField<Opportunity,Skill> skills() {
        return skills;
    }

    private <E extends BullhornEntity> AssociationField<Opportunity, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Opportunity, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Opportunity, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Opportunity, ? extends BullhornEntity>>();
            allAssociations.add(assignedUsers());
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(certifications());
            allAssociations.add(skills());
            //allAssociations.add(tearsheets());
        }
        return allAssociations;
    }

    @Override
    public AssociationField<Opportunity, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Opportunity, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Opportunity called: " + associationName);
    }

}
