package com.bullhornsdk.data.model.entity.association.standard;

import com.bullhornsdk.data.model.entity.association.AssociationField;
import com.bullhornsdk.data.model.entity.association.EntityAssociations;
import com.bullhornsdk.data.model.entity.core.customobject.*;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
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
    private final AssociationField<JobOrder, Specialty> specialties = instantiateAssociationField("specialties", Specialty.class);
    private final AssociationField<JobOrder, Opportunity> opportunities = instantiateAssociationField("opportunities", Opportunity.class);
    private final AssociationField<JobOrder, ClientContact> reportToClientContact = instantiateAssociationField("reportToClientContact", ClientContact.class);
    private final AssociationField<JobOrder, Placement> placements = instantiateAssociationField("placements", Placement.class);
    private final AssociationField<JobOrder, Note> notes = instantiateAssociationField("notes", Note.class);
    private final AssociationField<JobOrder, Task> tasks = instantiateAssociationField("tasks", Task.class);
    private final AssociationField<JobOrder, ClientCorporation> clientCorporation = instantiateAssociationField("clientCorporation", ClientCorporation.class);
    private final AssociationField<JobOrder, ClientContact> clientContact = instantiateAssociationField("clientContact", ClientContact.class);
    private final AssociationField<JobOrder, Sendout> sendouts = instantiateAssociationField("sendouts", Sendout.class);
    private final AssociationField<JobOrder, JobSubmission> webReponses = instantiateAssociationField("webResponses", JobSubmission.class);
    private final AssociationField<JobOrder, TimeUnit> timeUnits = instantiateAssociationField("timeUnits", TimeUnit.class);
    private final AssociationField<JobOrder, Placement> approvedPlacements = instantiateAssociationField("approvedPlacements", Placement.class);
    private final AssociationField<JobOrder, Appointment> appointments = instantiateAssociationField("appointments", Appointment.class);
    private final AssociationField<JobOrder, CorporateUser> owner = instantiateAssociationField("owner", CorporateUser.class);
    private final AssociationField<JobOrder, CorporateUser> responseUser = instantiateAssociationField("responseUser", CorporateUser.class);
    private final AssociationField<JobOrder, Appointment> interviews = instantiateAssociationField("interviews", Appointment.class);
    private final AssociationField<JobOrder, JobSubmission> submissions = instantiateAssociationField("submissions", JobSubmission.class);

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

    public AssociationField<JobOrder, Placement> approvedPlacements() {
        return approvedPlacements;
    }

    public AssociationField<JobOrder, Appointment> appointments() {
        return appointments;
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

    public AssociationField<JobOrder, ClientContact> clientContact() {
        return clientContact;
    }

    public AssociationField<JobOrder, ClientCorporation> clientCorporation() {
        return clientCorporation;
    }

    public AssociationField<JobOrder, Appointment> interviews() {
        return interviews;
    }

    public AssociationField<JobOrder, JobSubmission> submissions() {
        return submissions;
    }

    public AssociationField<JobOrder, Note> notes() {
        return notes;
    }

    public AssociationField<JobOrder, Opportunity> opportunities() {
        return opportunities;
    }

    public AssociationField<JobOrder, CorporateUser> owner() {
        return owner;
    }

    public AssociationField<JobOrder, Placement> placements() {
        return placements;
    }

    public AssociationField<JobOrder, CorporateUser> responseUser() {
        return responseUser;
    }

    public AssociationField<JobOrder, ClientContact> reportToClientContact() {
        return reportToClientContact;
    }

    public AssociationField<JobOrder, Sendout> sendouts() {
        return sendouts;
    }

    public AssociationField<JobOrder, Skill> skills() {
        return skills;
    }

    public AssociationField<JobOrder, Task> tasks() {
        return tasks;
    }

    public AssociationField<JobOrder, Tearsheet> tearsheets() {
        return tearsheets;
    }

    public AssociationField<JobOrder, TimeUnit> timeUnits() {
        return timeUnits;
    }

    public AssociationField<JobOrder, Specialty> specialties() {
        return specialties;
    }

    public AssociationField<JobOrder, JobSubmission> webReponses() {
        return webReponses;
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

    private <E extends BullhornEntity> AssociationField<JobOrder, E> instantiateAssociationField(String associationName,
                                                                                                 Class<E> associationType) {

        return new StandardAssociationField<JobOrder, E>(associationName, associationType);
    }

    @Override
    public List<AssociationField<JobOrder, ? extends BullhornEntity>> allAssociations() {
        if (allAssociations == null) {
            allAssociations = new ArrayList<AssociationField<JobOrder, ? extends BullhornEntity>>();
            allAssociations.add(approvedPlacements());
            allAssociations.add(appointments());
            allAssociations.add(assignedUsers());
            allAssociations.add(businessSectors());
            allAssociations.add(categories());
            allAssociations.add(certifications());
            allAssociations.add(clientContact());
            allAssociations.add(clientCorporation());
            allAssociations.add(interviews());
            allAssociations.add(notes());
            allAssociations.add(opportunities());
            allAssociations.add(owner());
            allAssociations.add(placements());
            allAssociations.add(reportToClientContact());
            allAssociations.add(responseUser());
            allAssociations.add(sendouts());
            allAssociations.add(skills());
            allAssociations.add(submissions());
            allAssociations.add(tasks());
            allAssociations.add(tearsheets());
            allAssociations.add(timeUnits());
            allAssociations.add(specialties());
            allAssociations.add(webReponses());
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
