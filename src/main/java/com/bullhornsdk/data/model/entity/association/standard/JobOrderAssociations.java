package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for JobOrder Associations.
 *
 * @author Magnus Fiore Palm
 *
 */
public final class JobOrderAssociations implements EntityAssociations<JobOrder> {

    private final AssociationField<JobOrder, CorporateUser> assignedUsers = instantiateAssociationField("assignedUsers", CorporateUser.class);
    private final AssociationField<JobOrder, BusinessSector> businessSectors = instantiateAssociationField("businessSectors", BusinessSector.class);
    private final AssociationField<JobOrder, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<JobOrder, Certification> certifications = instantiateAssociationField("certifications", Certification.class);
    private final AssociationField<JobOrder, Skill> skills = instantiateAssociationField("skills", Skill.class);
    private final AssociationField<JobOrder, Tearsheet> tearsheets = instantiateAssociationField("tearsheets", Tearsheet.class);
    private List<AssociationField<JobOrder, ? extends BullhornEntity>> allAssociations;


    private final AssociationField<JobOrder, JobOrderCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", JobOrderCustomObjectInstance1.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", JobOrderCustomObjectInstance2.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", JobOrderCustomObjectInstance3.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", JobOrderCustomObjectInstance4.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", JobOrderCustomObjectInstance5.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", JobOrderCustomObjectInstance6.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", JobOrderCustomObjectInstance7.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", JobOrderCustomObjectInstance8.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", JobOrderCustomObjectInstance9.class);
    private final AssociationField<JobOrder, JobOrderCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", JobOrderCustomObjectInstance10.class);


    private static final JobOrderAssociations INSTANCE = new JobOrderAssociations();

    private JobOrderAssociations() {
        super();
    }

    public static JobOrderAssociations getInstance() {
        return INSTANCE;
    }

    public AssociationField<JobOrder, CorporateUser> assignedUsers() {
        return assignedUsers;
    }

    public AssociationField<JobOrder, BusinessSector> businessSectors() {
        return businessSectors;
    }

    public AssociationField<JobOrder, Category> categories() {
        return categories;
    }

    public AssociationField<JobOrder, Certification> certifications() {
        return certifications;
    }

    public AssociationField<JobOrder, Skill> skills() {
        return skills;
    }

    public AssociationField<JobOrder, Tearsheet> tearsheets() {
        return tearsheets;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<JobOrder, JobOrderCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }

    private <E extends BullhornEntity> AssociationField<JobOrder, E> instantiateAssociationField(String associationName, Class<E> associationType) {
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
    public AssociationField<JobOrder, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<JobOrder, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity JobOrder called: " + associationName);
    }

}
