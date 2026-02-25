package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class for Candidate Associations.
 *
 * @author Magnus
 *
 */
public final class CandidateAssociations implements EntityAssociations<Candidate> {

    private final AssociationField<Candidate, BusinessSector> businessSectors = instantiateAssociationField("businessSectors", BusinessSector.class);
    private final AssociationField<Candidate, Category> categories = instantiateAssociationField("categories", Category.class);
    private final AssociationField<Candidate, Lead> leads = instantiateAssociationField("leads", Lead.class);
    private final AssociationField<Candidate, Skill> primarySkills = instantiateAssociationField("primarySkills", Skill.class);
    private final AssociationField<Candidate, CorporateUser> secondaryOwners = instantiateAssociationField("secondaryOwners", CorporateUser.class);
    private final AssociationField<Candidate, Skill> secondarySkills = instantiateAssociationField("secondarySkills", Skill.class);
    private final AssociationField<Candidate, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private final AssociationField<Candidate, Tearsheet> tearsheets = instantiateAssociationField("tearsheets", Tearsheet.class);
    private final AssociationField<Candidate, CandidateCertification> certificationList = instantiateAssociationField("certificationList", CandidateCertification.class);

    private final AssociationField<Candidate, PersonCustomObjectInstance1> customObject1s = instantiateAssociationField("customObject1s", PersonCustomObjectInstance1.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance2> customObject2s = instantiateAssociationField("customObject2s", PersonCustomObjectInstance2.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance3> customObject3s = instantiateAssociationField("customObject3s", PersonCustomObjectInstance3.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance4> customObject4s = instantiateAssociationField("customObject4s", PersonCustomObjectInstance4.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance5> customObject5s = instantiateAssociationField("customObject5s", PersonCustomObjectInstance5.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance6> customObject6s = instantiateAssociationField("customObject6s", PersonCustomObjectInstance6.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance7> customObject7s = instantiateAssociationField("customObject7s", PersonCustomObjectInstance7.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance8> customObject8s = instantiateAssociationField("customObject8s", PersonCustomObjectInstance8.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance9> customObject9s = instantiateAssociationField("customObject9s", PersonCustomObjectInstance9.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance10> customObject10s = instantiateAssociationField("customObject10s", PersonCustomObjectInstance10.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance11> customObject11s = instantiateAssociationField("customObject11s", PersonCustomObjectInstance11.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance12> customObject12s = instantiateAssociationField("customObject12s", PersonCustomObjectInstance12.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance13> customObject13s = instantiateAssociationField("customObject13s", PersonCustomObjectInstance13.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance14> customObject14s = instantiateAssociationField("customObject14s", PersonCustomObjectInstance14.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance15> customObject15s = instantiateAssociationField("customObject15s", PersonCustomObjectInstance15.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance16> customObject16s = instantiateAssociationField("customObject16s", PersonCustomObjectInstance16.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance17> customObject17s = instantiateAssociationField("customObject17s", PersonCustomObjectInstance17.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance18> customObject18s = instantiateAssociationField("customObject18s", PersonCustomObjectInstance18.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance19> customObject19s = instantiateAssociationField("customObject19s", PersonCustomObjectInstance19.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance20> customObject20s = instantiateAssociationField("customObject20s", PersonCustomObjectInstance20.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance21> customObject21s = instantiateAssociationField("customObject21s", PersonCustomObjectInstance21.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance22> customObject22s = instantiateAssociationField("customObject22s", PersonCustomObjectInstance22.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance23> customObject23s = instantiateAssociationField("customObject23s", PersonCustomObjectInstance23.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance24> customObject24s = instantiateAssociationField("customObject24s", PersonCustomObjectInstance24.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance25> customObject25s = instantiateAssociationField("customObject25s", PersonCustomObjectInstance25.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance26> customObject26s = instantiateAssociationField("customObject26s", PersonCustomObjectInstance26.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance27> customObject27s = instantiateAssociationField("customObject27s", PersonCustomObjectInstance27.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance28> customObject28s = instantiateAssociationField("customObject28s", PersonCustomObjectInstance28.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance29> customObject29s = instantiateAssociationField("customObject29s", PersonCustomObjectInstance29.class);
    private final AssociationField<Candidate, PersonCustomObjectInstance30> customObject30s = instantiateAssociationField("customObject30s", PersonCustomObjectInstance30.class);


    private List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations;
    private static final CandidateAssociations INSTANCE = new CandidateAssociations();

    public CandidateAssociations() {
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

    public AssociationField<Candidate, Lead> leads() {
        return leads;
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

    public AssociationField<Candidate, Tearsheet> tearsheets() {
        return tearsheets;
    }

    public AssociationField<Candidate, CandidateCertification> certificationList() { return certificationList; }

    public AssociationField<Candidate, PersonCustomObjectInstance1> customObject1s() {
        return customObject1s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance2> customObject2s() {
        return customObject2s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance3> customObject3s() {
        return customObject3s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance4> customObject4s() {
        return customObject4s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance5> customObject5s() {
        return customObject5s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance6> customObject6s() {
        return customObject6s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance7> customObject7s() {
        return customObject7s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance8> customObject8s() {
        return customObject8s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance9> customObject9s() {
        return customObject9s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance10> customObject10s() {
        return customObject10s;
    }


    public AssociationField<Candidate, PersonCustomObjectInstance11> customObject11s() {
        return customObject11s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance12> customObject12s() {
        return customObject12s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance13> customObject13s() {
        return customObject13s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance14> customObject14s() {
        return customObject14s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance15> customObject15s() {
        return customObject15s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance16> customObject16s() {
        return customObject16s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance17> customObject17s() {
        return customObject17s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance18> customObject18s() {
        return customObject18s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance19> customObject19s() {
        return customObject19s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance20> customObject20s() {
        return customObject20s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance21> customObject21s() {
        return customObject21s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance22> customObject22s() {
        return customObject22s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance23> customObject23s() {
        return customObject23s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance24> customObject24s() {
        return customObject24s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance25> customObject25s() {
        return customObject25s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance26> customObject26s() {
        return customObject26s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance27> customObject27s() {
        return customObject27s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance28> customObject28s() {
        return customObject28s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance29> customObject29s() {
        return customObject29s;
    }

    public AssociationField<Candidate, PersonCustomObjectInstance30> customObject30s() {
        return customObject30s;
    }

    private <E extends BullhornEntity> AssociationField<Candidate, E> instantiateAssociationField(String associationName, Class<E> associationType) {
        return new StandardAssociationField<Candidate, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<Candidate, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<Candidate, ? extends BullhornEntity>>();
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(leads());
            allAssociations.add(primarySkills());
            allAssociations.add(secondaryOwners());
            allAssociations.add(secondarySkills());
            allAssociations.add(specialties());
            allAssociations.add(tearsheets());
            allAssociations.add(certificationList());
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
            allAssociations.add(customObject11s());
            allAssociations.add(customObject12s());
            allAssociations.add(customObject13s());
            allAssociations.add(customObject14s());
            allAssociations.add(customObject15s());
            allAssociations.add(customObject16s());
            allAssociations.add(customObject17s());
            allAssociations.add(customObject18s());
            allAssociations.add(customObject19s());
            allAssociations.add(customObject20s());
            allAssociations.add(customObject21s());
            allAssociations.add(customObject22s());
            allAssociations.add(customObject23s());
            allAssociations.add(customObject24s());
            allAssociations.add(customObject25s());
            allAssociations.add(customObject26s());
            allAssociations.add(customObject27s());
            allAssociations.add(customObject28s());
            allAssociations.add(customObject29s());
            allAssociations.add(customObject30s());

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
