package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
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
    private final AssociationField<Candidate, CandidateFileAttachment> fileAttachments = instantiateAssociationField("fileAttachments", CandidateFileAttachment.class);
    private final AssociationField<Candidate, Note> notes = instantiateAssociationField("notes", Note.class);
    private final AssociationField<Candidate, CandidateCertification> certificationList = instantiateAssociationField("certificationList", CandidateCertification.class);
    private final AssociationField<Candidate, JobSubmission> webResponses = instantiateAssociationField("webResponses", JobSubmission.class);
    private final AssociationField<Candidate, ClientCorporation> clientCorporationBlackList = instantiateAssociationField("clientCorporationBlackList", ClientCorporation.class);
    private final AssociationField<Candidate, Sendout> sendouts = instantiateAssociationField("sendouts", Sendout.class);
    private final AssociationField<Candidate, CandidateReference> references = instantiateAssociationField("references", CandidateReference.class);
    private final AssociationField<Candidate, ClientCorporation> clientCorporationWhiteList = instantiateAssociationField("clientCorporationWhiteList", ClientCorporation.class);
    private final AssociationField<Candidate, Appointment> interviews = instantiateAssociationField("interviews", Appointment.class);

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

    public AssociationField<Candidate, CandidateFileAttachment> fileAttachments() {
        return fileAttachments;
    }

    public AssociationField<Candidate, Note> notes() {
        return notes;
    }

    public AssociationField<Candidate, CandidateCertification> certificationList() {
        return certificationList;
    }

    public AssociationField<Candidate, JobSubmission> webResponses() {
        return webResponses;
    }

    public AssociationField<Candidate, ClientCorporation> clientCorporationBlackList() {
        return clientCorporationBlackList;
    }

    public AssociationField<Candidate, Sendout> sendouts() {
        return sendouts;
    }

    public AssociationField<Candidate, CandidateReference> references() {
        return references;
    }

    public AssociationField<Candidate, ClientCorporation> clientCorporationWhiteList() {
        return clientCorporationWhiteList;
    }

    public AssociationField<Candidate, Appointment> interviews() {
        return interviews;
    }

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
            allAssociations.add(notes());
            allAssociations.add(fileAttachments());
            allAssociations.add(certificationList());
            allAssociations.add((webResponses()));
            allAssociations.add(clientCorporationBlackList());
            allAssociations.add(clientCorporationWhiteList());
            allAssociations.add(sendouts());
            allAssociations.add(references());
            allAssociations.add(interviews());
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
    public AssociationField<Candidate, ? extends BullhornEntity> getAssociation(String associationName) {
        for (AssociationField<Candidate, ? extends BullhornEntity> associationField : allAssociations()) {
            if (associationName.equalsIgnoreCase(associationField.getAssociationFieldName())) {
                return associationField;
            }
        }

        throw new IllegalArgumentException("There is no association on entity Candidate called: " + associationName);
    }

}
