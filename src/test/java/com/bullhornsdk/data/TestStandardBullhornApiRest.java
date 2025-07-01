package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
import org.junit.Test;

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

        assertNotNull("Appointment is null", entity);

    }

    @Test
    public void testFindAppointmentAttendee() {

        AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, testEntities.getAppointmentAttendeeId(), Sets.newHashSet("id"));

        assertNotNull("AppointmentAttendee is null", entity);

    }

    @Test
    public void testFindBranch() {

        Branch entity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id"));

        assertNotNull("Branch is null", entity);

    }

    @Test
    public void testFindBusinessSector() {

        BusinessSector entity = bullhornData.findEntity(BusinessSector.class, testEntities.getBusinessSectorId(), Sets.newHashSet("id"));

        assertNotNull("BusinessSector is null", entity);

    }

    @Test
    public void testFindCandidate() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id"));

        assertNotNull("Candidate is null", entity);

    }

    @Test
    public void testFindCandidateEducation() {

        CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(), Sets.newHashSet("id"));

        assertNotNull("CandidateEducation is null", entity);

    }

    @Test
    public void testFindCandidateReference() {

        CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(), Sets.newHashSet("id"));

        assertNotNull("CandidateReference is null", entity);

    }

    @Test
    public void testFindCandidateWorkHistory() {

        CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(), Sets.newHashSet("id"));

        assertNotNull("CandidateWorkHistory is null", entity);

    }

    @Test
    public void testFindCandidateHistory() {

        CandidateHistory entity = bullhornData.findEntity(CandidateHistory.class, testEntities.getCandidateHistoryId(), Sets.newHashSet("id"));

        assertNotNull("CandidateHistory is null", entity);

    }

    @Test
    public void testFindCategory() {

        Category entity = bullhornData.findEntity(Category.class, testEntities.getCategoryId(), Sets.newHashSet("id"));

        assertNotNull("Category is null", entity);

    }

    @Test
    public void testFindCertification() {

        Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), Sets.newHashSet("id"));

        assertNotNull("Certification is null", entity);

    }

    @Test
    public void testFindClientContact() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id"));

        assertNotNull("ClientContact is null", entity);

    }

    @Test
    public void testFindClientCorporation() {

        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), Sets.newHashSet("id"));

        assertNotNull("ClientCorporation is null", entity);

    }

    @Test
    public void testFindCorporateUser() {

        CorporateUser entity = bullhornData.findEntity(CorporateUser.class, testEntities.getCorporateUserId(), Sets.newHashSet("id"));

        assertNotNull("CorporateUser is null", entity);

    }

    @Test
    public void testFindCorporationDepartment() {

        CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, testEntities.getCorporationDepartmentId(), Sets.newHashSet("id"));

        assertNotNull("CorporationDepartment is null", entity);

    }

    @Test
    public void testFindCountry() {

        Country entity = bullhornData.findEntity(Country.class, testEntities.getCountryId(), Sets.newHashSet("id"));

        assertNotNull("Country is null", entity);

    }

    @Test
    public void testFindFile() {

        File entity = bullhornData.findEntity(File.class, testEntities.getFileId(), Sets.newHashSet("id"));

        assertNotNull("File is null", entity);

    }

    @Test
    public void testFindHousingComplex() {

        HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), Sets.newHashSet("id"));

        assertNotNull("HousingComplex is null", entity);

    }

    @Test
    public void testFindJobOrder() {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id"));

        assertNotNull("JobOrder is null", entity);

    }

    @Test
    public void testFindJobBoardPost() {
        JobBoardPost entity = bullhornData.findEntity(JobBoardPost.class, testEntities.getJobOrderId(), Sets.newHashSet("id"));

        assertNotNull("JobBoardPost is null", entity);
    }

    @Test
    public void testFindJobSubmission() {

        JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), Sets.newHashSet("id"));

        assertNotNull("JobSubmission is null", entity);

    }

    @Test
    public void testFindJobSubmissionHistory() {

        JobSubmissionHistory entity = bullhornData.findEntity(JobSubmissionHistory.class, testEntities.getJobSubmissionHistoryId(), Sets.newHashSet("id"));

        assertNotNull("JobSubmission is null", entity);

    }

    @Test
    public void testFindLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), Sets.newHashSet("id"));

        assertNotNull("Lead is null", entity);

    }

    @Test
    public void testFindNote() {

        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id"));

        assertNotNull("Appointment is null", entity);

    }

    @Test
    public void testFindNoteEntity() {

        NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), Sets.newHashSet("id"));

        assertNotNull("NoteEntity is null", entity);

    }

    @Test
    public void testFindOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), Sets.newHashSet("id"));

        assertNotNull("Opportunity is null", entity);

    }

    @Test
    public void testFindPlacement() {

        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), Sets.newHashSet("id"));

        assertNotNull("Placement is null", entity);

    }

    @Test
    public void testFindPlacementChangeRequest() {

        PlacementChangeRequest entity = bullhornData
            .findEntity(PlacementChangeRequest.class, testEntities.getPlacementChangeRequestId(), Sets.newHashSet("id"));

        assertNotNull("PlacementChangeRequest is null", entity);

    }

    @Test
    public void testFindPlacementCommission() {

        PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(), Sets.newHashSet("id"));

        assertNotNull("PlacementCommission is null", entity);

    }

    @Test
    public void testFindSendout() {

        Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), Sets.newHashSet("id"));

        assertNotNull("Sendout is null", entity);

    }

    @Test
    public void testFindSkill() {

        Skill entity = bullhornData.findEntity(Skill.class, testEntities.getSkillId(), Sets.newHashSet("id"));

        assertNotNull("Skill is null", entity);

    }

    @Test
    public void testFindSpecialty() {

        Specialty entity = bullhornData.findEntity(Specialty.class, testEntities.getSpecialtyId(), Sets.newHashSet("id"));

        assertNotNull("Specialty is null", entity);

    }

    @Test
    public void testFindState() {

        State entity = bullhornData.findEntity(State.class, testEntities.getStateId(), Sets.newHashSet("id"));

        assertNotNull("STATE is null", entity);

    }

    @Test
    public void testFindTask() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id"));

        assertNotNull("Task is null", entity);

    }

    @Test
    public void testFindTask_placement() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id", "placement(id,customText10)"));
        assertNotNull(entity.getPlacement().getCustomText10());
        assertNotNull("Task is null", entity);

    }

    @Test
    public void testFindTearsheet() {
        Tearsheet entity = bullhornData.findEntity(Tearsheet.class, testEntities.getTearsheetId(), Sets.newHashSet("id"));
        assertNotNull("Tearsheet is null", entity);
    }

    @Test
    public void testFindTimeUnit() {

        TimeUnit entity = bullhornData.findEntity(TimeUnit.class, testEntities.getTimeUnitId(), Sets.newHashSet("id"));

        assertNotNull("TimeUnit is null", entity);

    }

    @Test
    public void testFindWorkersCompensation() {

        WorkersCompensation entity = bullhornData.findEntity(WorkersCompensation.class, testEntities.getWorkersCompensationId(), Sets.newHashSet("id"));

        assertNotNull("WorkersCompensation is null", entity);

    }

    @Test
    public void testFindWorkersCompensationRate() {

        WorkersCompensationRate entity = bullhornData.findEntity(WorkersCompensationRate.class, testEntities.getWorkersCompensationRateId(), Sets.newHashSet("id"));

        assertNotNull("WorkersCompensationRate is null", entity);

    }

    @Test
    public void testFindAppointmentFields() {

        Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), this.getFieldSet());

        assertNotNull("Appointment is null", entity);

    }

    @Test
    public void testFindAppointmentAttendeeFields() {

        AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, testEntities.getAppointmentAttendeeId(),
            this.getFieldSet());

        assertNotNull("AppointmentAttendee is null", entity);

    }

    @Test
    public void testFindBusinessSectorFields() {

        BusinessSector entity = bullhornData.findEntity(BusinessSector.class, testEntities.getBusinessSectorId(), this.getFieldSet());

        assertNotNull("BusinessSector is null", entity);

    }

    @Test
    public void testFindCandidateFields() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), this.getCandidateFieldSet());

        assertNotNull("Candidate.id is null", entity.getId());
        assertNotNull("Candidate.businessSectors is null", entity.getBusinessSectors());
        assertNull("Candidate.name field is set even though that field is not part of the api call.", entity.getName());

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

        assertNotNull("CandidateEducation is null", entity);

    }

    @Test
    public void testFindCandidateReferenceFields() {

        CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(),
            this.getFieldSet());

        assertNotNull("CandidateReference is null", entity);

    }

    @Test
    public void testFindCandidateWorkHistoryFields() {

        CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(),
            this.getFieldSet());

        assertNotNull("CandidateWorkHistory is null", entity);

    }

    @Test
    public void testFindCategoryFields() {

        Category entity = bullhornData.findEntity(Category.class, testEntities.getCategoryId(), this.getCategoryFields());

        assertNotNull("Category is null", entity);

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

        assertNotNull("Certification is null", entity);

    }

    @Test
    public void testFindClientContactFields() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), this.getFieldSet());

        assertNotNull("ClientContact is null", entity);

    }

    @Test
    public void testFindClientCorporationFields() {

        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(),
            this.getFieldSet());

        assertNotNull("ClientCorporation is null", entity);

    }

    @Test
    public void testFindCorporateUserFields() {

        CorporateUser entity = bullhornData.findEntity(CorporateUser.class, testEntities.getCorporateUserId(), this.getFieldSet());

        assertNotNull("CorporateUser is null", entity);

    }

    @Test
    public void testFindCorporationDepartmentFields() {

        CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, testEntities.getCorporationDepartmentId(),
            this.getFieldSet());

        assertNotNull("CorporationDepartment is null", entity);

    }

    @Test
    public void testFindCountryFields() {

        Country entity = bullhornData.findEntity(Country.class, testEntities.getCountryId(), this.getFieldSet());

        assertNotNull("Country is null", entity);

    }

    @Test
    public void testFindDepartmentFields() {

        Department entity = bullhornData.findEntity(Department.class, testEntities.getDepartmentId(), this.getFieldSet());

        assertNotNull("Department is null", entity);

    }

    @Test
    public void testFindHousingComplexFields() {

        HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), this.getFieldSet());

        assertNotNull("HousingComplex is null", entity);

    }

    @Test
    public void testFindJobOrderFields() {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "dateAdded"));

        assertNull("title should be null since it's not specified in the fields", entity.getTitle());
        assertNotNull("dateAdded should NOT be null.", entity.getDateAdded());
        assertNotNull("id should NOT be null.", entity.getId());

        assertNotNull("JobOrder is null", entity);

    }

    @Test
    public void testFindJobSubmissionFields() {

        JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), this.getFieldSet());

        assertNotNull("JobSubmission is null", entity);

    }

    @Test
    public void testFindJobSubmissionHistoryFields() {

        JobSubmissionHistory entity = bullhornData.findEntity(JobSubmissionHistory.class, testEntities.getJobSubmissionHistoryId(),
            this.getFieldSet());

        assertNotNull("JobSubmission is null", entity);

    }

    @Test
    public void testFindNoteFields() {

        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), this.getFieldSet());

        assertNotNull("Note is null", entity);

    }

    @Test
    public void testFindMultipleNotes() {

        ListWrapper<Note> entityList = bullhornData.findMultipleEntity(Note.class, testEntities.getNoteIdList(), this.getFieldSet());

        assertNotNull("NoteList is null", entityList);

    }

    @Test
    public void testFindNoteEntityFields() {

        NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), this.getFieldSet());

        assertNotNull("NoteEntity is null", entity);

    }

    @Test
    public void testFindPlacementFields() {

        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), this.getFieldSet());

        assertNotNull("Placement is null", entity);

    }

    @Test
    public void testFindPlacementChangeRequestFields() {

        PlacementChangeRequest entity = bullhornData.findEntity(PlacementChangeRequest.class,
            testEntities.getPlacementChangeRequestId(), this.getFieldSet());

        assertNotNull("PlacementChangeRequest is null", entity);

    }

    @Test
    public void testFindPlacementCommissionFields() {

        PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(),
            this.getFieldSet());

        assertNotNull("PlacementCommission is null", entity);

    }

    @Test
    public void testFindSendoutFields() {

        Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), this.getFieldSet());

        assertNotNull("Sendout is null", entity);

    }

    @Test
    public void testFindSkillFields() {

        Skill entity = bullhornData.findEntity(Skill.class, testEntities.getSkillId(), this.getFieldSet());

        assertNotNull("Skill is null", entity);

    }

    @Test
    public void testFindSpecialtyFields() {

        Specialty entity = bullhornData.findEntity(Specialty.class, testEntities.getSpecialtyId(), this.getFieldSet());

        assertNotNull("Specialty is null", entity);

    }

    @Test
    public void testFindStateFields() {

        State entity = bullhornData.findEntity(State.class, testEntities.getStateId(), this.getFieldSet());

        assertNotNull("STATE is null", entity);

    }

    @Test
    public void testFindTaskFields() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), this.getFieldSet());

        assertNotNull("Task is null", entity);

    }

    @Test
    public void testFindTearsheetFields() {

        Tearsheet entity = bullhornData.findEntity(Tearsheet.class, testEntities.getTearsheetId(), this.getFieldSet());

        assertNotNull("Tearsheet is null", entity);

    }

    @Test
    public void testFindTimeUnitFields() {

        TimeUnit entity = bullhornData.findEntity(TimeUnit.class, testEntities.getTimeUnitId(), this.getFieldSet());

        assertNotNull("TimeUnit is null", entity);

    }

    @Test
    public void testFindPersonCustomObject() {
        PersonCustomObjectInstance1 entity = bullhornData.findEntity(PersonCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("PersonCustomObjectInstance1 is null", entity);
    }

    @Test
    public void testFindJobCustomObject() {
        JobOrderCustomObjectInstance1 entity = bullhornData.findEntity(JobOrderCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("JobOrderCustomObjectInstance1 is null", entity);
    }

    @Test
    public void testFindPlacementCustomObject() {
        PlacementCustomObjectInstance1 entity = bullhornData.findEntity(PlacementCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("PlacementCustomObjectInstance1 is null", entity);
    }

    @Test
    public void testFindClientCorporationCustomObject() {
        ClientCorporationCustomObjectInstance1 entity = bullhornData.findEntity(ClientCorporationCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("ClientCorporationCustomObjectInstance1 is null", entity);
    }

    @Test
    public void testFindOpporutnityCustomObject() {
        OpportunityCustomObjectInstance1 entity = bullhornData.findEntity(OpportunityCustomObjectInstance1.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("OpportunityCustomObjectInstance1 is null", entity);
    }

    @Test
    public void testFindLocalTaxForm() {
        LocalTaxForm entity = bullhornData.findEntity(LocalTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("LocalTaxForm is null", entity);
    }

    @Test
    public void testFindStateTaxForm() {
        StateTaxForm entity = bullhornData.findEntity(StateTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("StateTaxForm is null", entity);
    }

    @Test
    public void testFindFederalTaxForm() {
        FederalTaxForm entity = bullhornData.findEntity(FederalTaxForm.class, testEntities.getAllCustomObjectsId(), this.getFieldSet());

        assertNotNull("FederalTaxForm is null", entity);
    }

    @Test
    public void testFindJobShift() {

        JobShift entity = bullhornData.findEntity(JobShift.class, testEntities.getCandidateId(), Sets.newHashSet("id"));

        assertNotNull("JobShift is null", entity);

    }

    @Test
    public void testFindInvoiceStatementHistory() {

        InvoiceStatementHistory entity = bullhornData.findEntity(InvoiceStatementHistory.class, testEntities.getInvoiceStatementHistoryId(), getFieldSet());

        assertNotNull("InvoiceStatementHistory is null", entity);
    }

    private Set<String> getFieldSet() {
        Set<String> fieldSet = new LinkedHashSet<String>();
        fieldSet.add("id");
        return fieldSet;
    }

}
