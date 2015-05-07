package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for Candidate Associations.
 * 
 * @author Magnus
 * 
 */
public final class CandidateAssociations implements EntityAssociations<Candidate> {

    private final AssociationField<Candidate, BusinessSector> businessSectors = instantiateAssociationField("businessSectors",
            BusinessSector.class);
    private final AssociationField<Candidate, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Candidate, Skill> primarySkills = instantiateAssociationField("primarySkills", Skill.class);
    private final AssociationField<Candidate, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners",
            CorporateUser.class);
    private final AssociationField<Candidate, Skill> secondarySkills = instantiateAssociationField("secondarySkills", Skill.class);
    private final AssociationField<Candidate, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations;
    private static final CandidateAssociations INSTANCE = new CandidateAssociations();

    private CandidateAssociations() {
        super();
    }

    public static CandidateAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<Candidate, BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<Candidate, Category> categories() {
        return categories;
    }

    public AssociationField<Candidate, Skill> primarySkills() {
        return primarySkills;
    }

    public AssociationField<Candidate, CorporateUser> secondaryOwners() {
        return secondaryOwners;
    }

    public AssociationField<Candidate, Skill> secondarySkills() {
        return secondarySkills;
    }
    
    public AssociationField<Candidate, Specialty> specialties() {
        return specialties;
    }

    private <E extends BullhornEntity> AssociationField<Candidate, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<Candidate, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Candidate, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(primarySkills());
            allAssociations.add(secondaryOwners());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
        }
        return allAssociations;

    }

    @Override
    public AssociationField<Candidate, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Candidate, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Candidate called: " + associationName);
    }

}
