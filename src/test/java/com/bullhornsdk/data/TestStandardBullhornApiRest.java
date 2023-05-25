package com.bullhornsdk.data;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.bullhornsdk.data.model.entity.core.onboarding365.forms.FederalTaxForm;
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.LocalTaxForm;
import com.bullhornsdk.data.model.entity.core.onboarding365.forms.StateTaxForm;
import com.bullhornsdk.data.model.entity.core.paybill.invoice.InvoiceStatementHistory;
import com.bullhornsdk.data.model.entity.core.standard.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.joborder.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.opportunity.OpportunityCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.person.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.google.common.collect.Sets;

public class TestStandardBullhornApiRest extends BaseTest {
    private final Logger log = LogManager.getLogger(TestStandardBullhornApiRest.class);

    public TestStandardBullhornApiRest() {
        super();
    }

    @Test
    public void testFindAppointment() {

        Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Appointment is null");

    }

    @Test
    public void testFindAppointmentAttendee() {

        AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, testEntities.getAppointmentAttendeeId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "AppointmentAttendee is null");

    }

    @Test
    public void testFindBranch() {

        Branch entity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Branch is null");

    }

    @Test
    public void testFindBusinessSector() {

        BusinessSector entity = bullhornData.findEntity(BusinessSector.class, testEntities.getBusinessSectorId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "BusinessSector is null");

    }

    @Test
    public void testFindCandidate() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Candidate is null");

    }

    @Test
    public void testFindCandidateEducation() {

        CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "CandidateEducation is null");

    }

    @Test
    public void testFindCandidateReference() {

        CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "CandidateReference is null");

    }

    @Test
    public void testFindCandidateWorkHistory() {

        CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "CandidateWorkHistory is null");

    }

    @Test
    public void testFindCategory() {

        Category entity = bullhornData.findEntity(Category.class, testEntities.getCategoryId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Category is null");

    }

    @Test
    public void testFindCertification() {

        Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Certification is null");

    }

    @Test
    public void testFindClientContact() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "ClientContact is null");

    }

    @Test
    public void testFindClientCorporation() {

        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "ClientCorporation is null");

    }

    @Test
    public void testFindCorporateUser() {

        CorporateUser entity = bullhornData.findEntity(CorporateUser.class, testEntities.getCorporateUserId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "CorporateUser is null");

    }

    @Test
    public void testFindCorporationDepartment() {

        CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, testEntities.getCorporationDepartmentId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "CorporationDepartment is null");

    }

    @Test
    public void testFindCountry() {

        Country entity = bullhornData.findEntity(Country.class, testEntities.getCountryId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Country is null");

    }

    @Test
    public void testFindFile() {

        File entity = bullhornData.findEntity(File.class, testEntities.getFileId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "File is null");

    }

    @Test
    public void testFindHousingComplex() {

        HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "HousingComplex is null");

    }

    @Test
    public void testFindJobOrder() {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "JobOrder is null");

    }

    @Test
    public void testFindJobBoardPost() {
        JobBoardPost entity = bullhornData.findEntity(JobBoardPost.class, testEntities.getJobOrderId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "JobBoardPost is null");
    }

    @Test
    public void testFindJobSubmission() {

        JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "JobSubmission is null");

    }

    @Test
    public void testFindJobSubmissionHistory() {

        JobSubmissionHistory entity = bullhornData.findEntity(JobSubmissionHistory.class, testEntities.getJobSubmissionHistoryId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "JobSubmission is null");

    }

    @Test
    public void testFindLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Lead is null");

    }

    @Test
    public void testFindNote() {

        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Appointment is null");

    }

    @Test
    public void testFindNoteEntity() {

        NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "NoteEntity is null");

    }

    @Test
    public void testFindOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Opportunity is null");

    }

    @Test
    public void testFindPlacement() {

        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Placement is null");

    }

    @Test
    public void testFindPlacementChangeRequest() {

        PlacementChangeRequest entity = bullhornData
            .findEntity(PlacementChangeRequest.class, testEntities.getPlacementChangeRequestId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "PlacementChangeRequest is null");

    }

    @Test
    public void testFindPlacementCommission() {

        PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "PlacementCommission is null");

    }

    @Test
    public void testFindSendout() {

        Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Sendout is null");

    }

    @Test
    public void testFindSkill() {

        Skill entity = bullhornData.findEntity(Skill.class, testEntities.getSkillId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Skill is null");

    }

    @Test
    public void testFindSpecialty() {

        Specialty entity = bullhornData.findEntity(Specialty.class, testEntities.getSpecialtyId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Specialty is null");

    }

    @Test
    public void testFindState() {

        State entity = bullhornData.findEntity(State.class, testEntities.getStateId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "STATE is null");

    }

    @Test
    public void testFindTask() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Task is null");

    }

    @Test
    public void testFindTask_placement() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id", "placement(id,customText10)"));
        Assertions.assertNotNull(entity.getPlacement().getCustomText10());
        Assertions.assertNotNull(entity, "Task is null");

    }

    @Test
    public void testFindTearsheet() {
        Tearsheet entity = bullhornData.findEntity(Tearsheet.class, testEntities.getTearsheetId(), Sets.newHashSet("id"));
        Assertions.assertNotNull(entity, "Tearsheet is null");
    }

    @Test
    public void testFindTimeUnit() {

        TimeUnit entity = bullhornData.findEntity(TimeUnit.class, testEntities.getTimeUnitId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "TimeUnit is null");

    }

    @Test
    public void testFindWorkersCompensation() {

        WorkersCompensation entity = bullhornData.findEntity(WorkersCompensation.class, testEntities.getWorkersCompensationId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "WorkersCompensation is null");

    }

    @Test
    public void testFindWorkersCompensationRate() {

        WorkersCompensationRate entity = bullhornData.findEntity(WorkersCompensationRate.class, testEntities.getWorkersCompensationRateId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "WorkersCompensationRate is null");

    }

    @Test
    public void testFindAppointmentFields() {

        Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Appointment is null");

    }

    @Test
    public void testFindAppointmentAttendeeFields() {

        AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, testEntities.getAppointmentAttendeeId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "AppointmentAttendee is null");

    }

    @Test
    public void testFindBusinessSectorFields() {

        BusinessSector entity = bullhornData.findEntity(BusinessSector.class, testEntities.getBusinessSectorId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "BusinessSector is null");

    }

    @Test
    public void testFindCandidateFields() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), this.getCandidateFieldSet());

        Assertions.assertNotNull(entity.getId(), "Candidate.id is null");
        Assertions.assertNotNull(entity.getBusinessSectors(), "Candidate.businessSectors is null");
        Assertions.assertNull(entity.getName(), "Candidate.name field is set even though that field is not part of the api call.");

    }

    private Set<String> getCandidateFieldSet() {
        Set<String> fieldSet = new LinkedHashSet<String>();
        fieldSet.add("id");
        fieldSet.add("businessSectors(id,name)");
        return fieldSet;
    }

    @Test
    public void testFindCandidateEducationFields() {

        CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "CandidateEducation is null");

    }

    @Test
    public void testFindCandidateReferenceFields() {

        CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "CandidateReference is null");

    }

    @Test
    public void testFindCandidateWorkHistoryFields() {

        CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "CandidateWorkHistory is null");

    }

    @Test
    public void testFindCategoryFields() {

        Category entity = bullhornData.findEntity(Category.class, testEntities.getCategoryId(), this.getCategoryFields());

        Assertions.assertNotNull(entity, "Category is null");

    }

    private Set<String> getCategoryFields() {
        Set<String> fields = new HashSet<String>();

        fields.add("id");
        fields.add("name");
        fields.add("occupation");
        fields.add("skills[15](id,name)");

        return fields;
    }

    @Test
    public void testFindCertificationFields() {

        Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Certification is null");

    }

    @Test
    public void testFindClientContactFields() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "ClientContact is null");

    }

    @Test
    public void testFindClientCorporationFields() {

        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "ClientCorporation is null");

    }

    @Test
    public void testFindCorporateUserFields() {

        CorporateUser entity = bullhornData.findEntity(CorporateUser.class, testEntities.getCorporateUserId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "CorporateUser is null");

    }

    @Test
    public void testFindCorporationDepartmentFields() {

        CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, testEntities.getCorporationDepartmentId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "CorporationDepartment is null");

    }

    @Test
    public void testFindCountryFields() {

        Country entity = bullhornData.findEntity(Country.class, testEntities.getCountryId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Country is null");

    }

    @Test
    public void testFindDepartmentFields() {

        Department entity = bullhornData.findEntity(Department.class, testEntities.getDepartmentId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Department is null");

    }

    @Test
    public void testFindHousingComplexFields() {

        HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "HousingComplex is null");

    }

    @Test
    public void testFindJobOrderFields() {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "dateAdded"));

        Assertions.assertNull(entity.getTitle(), "title should be null since it's not specified in the fields");
        Assertions.assertNotNull(entity.getDateAdded(), "dateAdded should NOT be null.");
        Assertions.assertNotNull(entity.getId(), "id should NOT be null.");

        Assertions.assertNotNull(entity, "JobOrder is null");

    }

    @Test
    public void testFindJobSubmissionFields() {

        JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "JobSubmission is null");

    }

    @Test
    public void testFindJobSubmissionHistoryFields() {

        JobSubmissionHistory entity = bullhornData.findEntity(JobSubmissionHistory.class, testEntities.getJobSubmissionHistoryId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "JobSubmission is null");

    }

    @Test
    public void testFindNoteFields() {

        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Note is null");

    }

    @Test
    public void testFindMultipleNotes() {

        ListWrapper<Note> entityList = bullhornData.findMultipleEntity(Note.class, testEntities.getNoteIdList(), this.getFieldSet());

        Assertions.assertNotNull(entityList, "NoteList is null");

    }

    @Test
    public void testFindNoteEntityFields() {

        NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "NoteEntity is null");

    }

    @Test
    public void testFindPlacementFields() {

        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Placement is null");

    }

    @Test
    public void testFindPlacementChangeRequestFields() {

        PlacementChangeRequest entity = bullhornData.findEntity(PlacementChangeRequest.class,
            testEntities.getPlacementChangeRequestId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "PlacementChangeRequest is null");

    }

    @Test
    public void testFindPlacementCommissionFields() {

        PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(),
            this.getFieldSet());

        Assertions.assertNotNull(entity, "PlacementCommission is null");

    }

    @Test
    public void testFindSendoutFields() {

        Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Sendout is null");

    }

    @Test
    public void testFindSkillFields() {

        Skill entity = bullhornData.findEntity(Skill.class, testEntities.getSkillId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Skill is null");

    }

    @Test
    public void testFindSpecialtyFields() {

        Specialty entity = bullhornData.findEntity(Specialty.class, testEntities.getSpecialtyId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Specialty is null");

    }

    @Test
    public void testFindStateFields() {

        State entity = bullhornData.findEntity(State.class, testEntities.getStateId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "STATE is null");

    }

    @Test
    public void testFindTaskFields() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Task is null");

    }

    @Test
    public void testFindTearsheetFields() {

        Tearsheet entity = bullhornData.findEntity(Tearsheet.class, testEntities.getTearsheetId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "Tearsheet is null");

    }

    @Test
    public void testFindTimeUnitFields() {

        TimeUnit entity = bullhornData.findEntity(TimeUnit.class, testEntities.getTimeUnitId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "TimeUnit is null");

    }

    @Test
    public void testFindPersonCustomObject() {
        PersonCustomObjectInstance1 entity = bullhornData.findEntity(PersonCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "PersonCustomObjectInstance1 is null");
    }

    @Test
    public void testFindJobCustomObject() {
        JobOrderCustomObjectInstance1 entity = bullhornData.findEntity(JobOrderCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "JobOrderCustomObjectInstance1 is null");
    }

    @Test
    public void testFindPlacementCustomObject() {
        PlacementCustomObjectInstance1 entity = bullhornData.findEntity(PlacementCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "PlacementCustomObjectInstance1 is null");
    }

    @Test
    public void testFindClientCorporationCustomObject() {
        ClientCorporationCustomObjectInstance1 entity = bullhornData.findEntity(ClientCorporationCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "ClientCorporationCustomObjectInstance1 is null");
    }

    @Test
    public void testFindOpporutnityCustomObject() {
        OpportunityCustomObjectInstance1 entity = bullhornData.findEntity(OpportunityCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "OpportunityCustomObjectInstance1 is null");
    }

    @Test
    public void testFindLocalTaxForm() {
        LocalTaxForm entity = bullhornData.findEntity(LocalTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "LocalTaxForm is null");
    }

    @Test
    public void testFindStateTaxForm() {
        StateTaxForm entity = bullhornData.findEntity(StateTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "StateTaxForm is null");
    }

    @Test
    public void testFindFederalTaxForm() {
        FederalTaxForm entity = bullhornData.findEntity(FederalTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        Assertions.assertNotNull(entity, "FederalTaxForm is null");
    }

    @Test
    public void testFindJobShift() {

        JobShift entity = bullhornData.findEntity(JobShift.class, testEntities.getCandidateId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "JobShift is null");

    }

    @Test
    public void testFindInvoiceStatementHistory() {

        InvoiceStatementHistory entity = bullhornData.findEntity(InvoiceStatementHistory.class, testEntities.getInvoiceStatementHistoryId(), getFieldSet());

        Assertions.assertNotNull(entity, "InvoiceStatementHistory is null");
    }

    private Set<String> getFieldSet() {
        Set<String> fieldSet = new LinkedHashSet<String>();
        fieldSet.add("id");
        return fieldSet;
    }

}
