package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.JobOrderCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.OpportunityCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Category;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.standard.Country;
import com.bullhornsdk.data.model.entity.core.standard.File;
import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import com.bullhornsdk.data.model.entity.core.standard.JobBoardPost;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmissionHistory;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.entity.core.standard.Specialty;
import com.bullhornsdk.data.model.entity.core.standard.State;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.standard.Tearsheet;
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensation;
import com.bullhornsdk.data.model.entity.core.standard.WorkersCompensationRate;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.google.common.collect.Sets;

public class TestStandardBullhornApiRest extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRest.class);

	public TestStandardBullhornApiRest() {
		super();
	}

	@Test
	public void testFindAppointment() {

		Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId());

		assertNotNull("Appointment is null", entity);

	}

	@Test
	public void testFindAppointmentAttendee() {

		AppointmentAttendee entity = bullhornData.findEntity(AppointmentAttendee.class, testEntities.getAppointmentAttendeeId());

		assertNotNull("AppointmentAttendee is null", entity);

	}

	@Test
	public void testFindBusinessSector() {

		BusinessSector entity = bullhornData.findEntity(BusinessSector.class, testEntities.getBusinessSectorId());

		assertNotNull("BusinessSector is null", entity);

	}

	@Test
	public void testFindCandidate() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId());

		assertNotNull("Candidate is null", entity);

	}

	@Test
	public void testFindCandidateEducation() {

		CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());

		assertNotNull("CandidateEducation is null", entity);

	}

	@Test
	public void testFindCandidateReference() {

		CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());

		assertNotNull("CandidateReference is null", entity);

	}

	@Test
	public void testFindCandidateWorkHistory() {

		CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId());

		assertNotNull("CandidateWorkHistory is null", entity);

	}

	@Test
	public void testFindCategory() {

		Category entity = bullhornData.findEntity(Category.class, testEntities.getCategoryId());

		assertNotNull("Category is null", entity);

	}

	@Test
	public void testFindCertification() {

		Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId());

		assertNotNull("Certification is null", entity);

	}

	@Test
	public void testFindClientContact() {

		ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId());

		assertNotNull("ClientContact is null", entity);

	}

	@Test
	public void testFindClientCorporation() {

		ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());

		assertNotNull("ClientCorporation is null", entity);

	}

	@Test
	public void testFindCorporateUser() {

		CorporateUser entity = bullhornData.findEntity(CorporateUser.class, testEntities.getCorporateUserId());

		assertNotNull("CorporateUser is null", entity);

	}

	@Test
	public void testFindCorporationDepartment() {

		CorporationDepartment entity = bullhornData.findEntity(CorporationDepartment.class, testEntities.getCorporationDepartmentId());

		assertNotNull("CorporationDepartment is null", entity);

	}

	@Test
	public void testFindCountry() {

		Country entity = bullhornData.findEntity(Country.class, testEntities.getCountryId());

		assertNotNull("Country is null", entity);

	}

    @Test
    public void testFindFile() {

        File entity = bullhornData.findEntity(File.class, testEntities.getFileId());

        assertNotNull("File is null", entity);

    }

	@Test
	public void testFindHousingComplex() {

		HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId());

		assertNotNull("HousingComplex is null", entity);

	}

	@Test
	public void testFindJobOrder() {

		JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId());

		assertNotNull("JobOrder is null", entity);

	}

    @Test
    public void testFindJobBoardPost() {
        JobBoardPost entity = bullhornData.findEntity(JobBoardPost.class, testEntities.getJobOrderId());

        assertNotNull("JobBoardPost is null", entity);
    }

	@Test
	public void testFindJobSubmission() {

		JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());

		assertNotNull("JobSubmission is null", entity);

	}

	@Test
	public void testFindJobSubmissionHistory() {

		JobSubmissionHistory entity = bullhornData.findEntity(JobSubmissionHistory.class, testEntities.getJobSubmissionHistoryId());

		assertNotNull("JobSubmission is null", entity);

	}

    @Test
    public void testFindLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId());

        assertNotNull("Lead is null", entity);

    }

	@Test
	public void testFindNote() {

		Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId());

		assertNotNull("Appointment is null", entity);

	}

	@Test
	public void testFindNoteEntity() {

		NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId());

		assertNotNull("NoteEntity is null", entity);

	}

    @Test
    public void testFindOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId());

        assertNotNull("Opportunity is null", entity);

    }

	@Test
	public void testFindPlacement() {

		Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId());

		assertNotNull("Placement is null", entity);

	}

	@Test
	public void testFindPlacementChangeRequest() {

		PlacementChangeRequest entity = bullhornData
				.findEntity(PlacementChangeRequest.class, testEntities.getPlacementChangeRequestId());

		assertNotNull("PlacementChangeRequest is null", entity);

	}

	@Test
	public void testFindPlacementCommission() {

		PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());

		assertNotNull("PlacementCommission is null", entity);

	}

	@Test
	public void testFindSendout() {

		Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId());

		assertNotNull("Sendout is null", entity);

	}

	@Test
	public void testFindSkill() {

		Skill entity = bullhornData.findEntity(Skill.class, testEntities.getSkillId());

		assertNotNull("Skill is null", entity);

	}

	@Test
	public void testFindSpecialty() {

		Specialty entity = bullhornData.findEntity(Specialty.class, testEntities.getSpecialtyId());

		assertNotNull("Specialty is null", entity);

	}

	@Test
	public void testFindState() {

		State entity = bullhornData.findEntity(State.class, testEntities.getStateId());

		assertNotNull("STATE is null", entity);

	}

	@Test
	public void testFindTask() {

		Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId());

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
		Tearsheet entity = bullhornData.findEntity(Tearsheet.class, testEntities.getTearsheetId());
		assertNotNull("Tearsheet is null", entity);
	}

	@Test
	public void testFindTimeUnit() {

		TimeUnit entity = bullhornData.findEntity(TimeUnit.class, testEntities.getTimeUnitId());

		assertNotNull("TimeUnit is null", entity);

	}

    @Test
    public void testFindWorkersCompensation() {

        WorkersCompensation entity = bullhornData.findEntity(WorkersCompensation.class, testEntities.getWorkersCompensationId());

        assertNotNull("WorkersCompensation is null", entity);

    }

    @Test
    public void testFindWorkersCompensationRate() {

        WorkersCompensationRate entity = bullhornData.findEntity(WorkersCompensationRate.class, testEntities.getWorkersCompensationRateId());

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
	public void testFindHousingComplexFields() {

		HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), this.getFieldSet());

		assertNotNull("HousingComplex is null", entity);

	}

	@Test
	public void testFindJobOrderFields() {

		JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id","dateAdded"));

		assertNull("title should be null since it's not specified in the fields",entity.getTitle());
		assertNotNull("dateAdded should NOT be null.",entity.getDateAdded());
		assertNotNull("id should NOT be null.",entity.getId());
		
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

	private Set<String> getFieldSet() {
		Set<String> fieldSet = new LinkedHashSet<String>();
		fieldSet.add("id");
		return fieldSet;
	}

}
