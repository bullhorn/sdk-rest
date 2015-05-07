package com.bullhornsdk.data.model.entity.association.standard;

import java.util.ArrayList;
import java.util.List;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

/**
 * Factory class for JobOrder Associations.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public final class JobOrderAssociations implements EntityAssociations<JobOrder> {

    private final AssociationField<JobOrder, CorporateUser> assignedUsers = instantiateAssociationField("assignedUsers",
            CorporateUser.class);
    private final AssociationField<JobOrder, BusinessSector> businessSectors = instantiateAssociationField("businessSectors",
            BusinessSector.class);
    private final AssociationField<JobOrder, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<JobOrder, Certification> certifications = instantiateAssociationField("certifications",
            Certification.class);
    private final AssociationField<JobOrder, Skill> skills = instantiateAssociationField("skills", Skill.class);
    //private final AssociationField<JobOrder,Tearsheet> tearsheets = instantiateAssociationField("tearsheets",Tearsheet.class);
    private List<AssociationField<JobOrder, ? extends BullhornEntity>> allAssociations;

    private static final JobOrderAssociations INSTANCE = new JobOrderAssociations();

    private JobOrderAssociations() {
        super();
    }

    public static JobOrderAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<JobOrder,CorporateUser> assignedUsers() {
        return assignedUsers;
    }

    public AssociationField<JobOrder,BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<JobOrder,Category> categories() {
        return categories;
    }

    public AssociationField<JobOrder,Certification> certifications() {
        return certifications;
    }

    public AssociationField<JobOrder,Skill> skills() {
        return skills;
    }
/*
    public AssociationField<JobOrder> tearsheets() {
        return tearsheets;
    }
*/
    private <E extends BullhornEntity> AssociationField<JobOrder, E> instantiateAssociationField(String associationName,
            Class<E> associationType) {
        return new StandardAssociationField<JobOrder, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<JobOrder, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<JobOrder, ? extends BullhornEntity>>();
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
    public AssociationField<JobOrder, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<JobOrder, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity JobOrder called: " + associationName);
    }

}
