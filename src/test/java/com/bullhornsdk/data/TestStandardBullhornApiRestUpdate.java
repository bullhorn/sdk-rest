package com.bullhornsdk.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.google.common.collect.Sets;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.file.CandidateFileAttachment;
import com.bullhornsdk.data.model.entity.file.CertificationFileAttachment;
import com.bullhornsdk.data.model.entity.file.ClientContactFileAttachment;
import com.bullhornsdk.data.model.entity.file.ClientCorporationFileAttachment;
import com.bullhornsdk.data.model.entity.file.JobOrderFileAttachment;
import com.bullhornsdk.data.model.entity.file.OpportunityFileAttachment;
import com.bullhornsdk.data.model.entity.file.PlacementFileAttachment;
import com.bullhornsdk.data.model.response.crud.UpdateResponse;
import com.google.common.collect.Sets;

public class TestStandardBullhornApiRestUpdate<T extends UpdateEntity> extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRestUpdate.class);


	private T entity;

	private String previousValue;

	private String newValue;

	public TestStandardBullhornApiRestUpdate() {
		super();
	}

	@After
	public void restoreEntityToInitialValue() {
		if (entity != null) {
			UpdateResponse response = bullhornData.updateEntity(entity);
			assertFalse("Error restoring entity. Validation errors", response.hasValidationErrors());
			assertFalse("Error restoring entity. Error.", response.isError());
		}
	}

	@Test
	public void testGenericUpdate() {
		String newStatus = "STABLE";
		JobOrder preUpdateEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "status"));

		JobOrder update = new JobOrder(testEntities.getJobOrderId());

		update.setStatus(newStatus);
		UpdateResponse response = bullhornData.updateEntity(update);
		JobOrder updatedEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "status"));

		this.runAssertions(response, newStatus, updatedEntity.getStatus());

		updatedEntity.setStatus(preUpdateEntity.getStatus());

		assertEquals(updatedEntity, preUpdateEntity);

	}

	@Test
	public void testUpdateAppointment() {

		Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), Sets.newHashSet("id", "subject"));

		this.entity = (T) entity;

		previousValue = entity.getSubject();

		newValue = previousValue + "toad";

		entity.setSubject(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Appointment updatedEntity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), Sets.newHashSet("id", "subject"));
		entity.setSubject(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getSubject());

	}

    @Test
    public void testUpdateBranch() {

        Branch entity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id", "name"));

        this.entity = (T) entity;

        previousValue = entity.getName();

        newValue = previousValue + "toad";

        entity.setName(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Branch updatedEntity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id", "name"));
        entity.setName(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getName());

    }

	@Test
	public void testUpdateCandidate() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "customText1", "customText5", "isDeleted"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setCustomText5("test");
		entity.setIsDeleted(Boolean.FALSE);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Candidate updatedEntity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "customText1", "customText5", "isDeleted"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

    @Test
    public void testUpdateCandidateCertification() {

        CandidateCertification entity = bullhornData.findEntity(CandidateCertification.class, testEntities.getCandidateCertificationId(), Sets.newHashSet("id", "status"));

        this.entity = (T) entity;

        previousValue = entity.getStatus();

        newValue = previousValue + "toad";

        entity.setStatus(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        CandidateCertification updatedEntity = bullhornData.findEntity(CandidateCertification.class, testEntities.getCandidateCertificationId(), Sets.newHashSet("id", "status"));
        entity.setStatus(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getStatus());

    }

	@Test
	public void testUpdateCandidateEducation() {

		CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(), Sets.newHashSet("id", "customText4"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText4();

		newValue = previousValue + "toad";

		entity.setCustomText4(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateEducation updatedEntity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(), Sets.newHashSet("id", "customText4"));
		entity.setCustomText4(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText4());

	}

	@Test
	public void testUpdateCandidateReference() {

		CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(), Sets.newHashSet("id", "customText1"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateReference updatedEntity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(), Sets.newHashSet("id", "customText1"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateCandidateWorkHistory() {

		CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(), Sets.newHashSet("id", "customText1"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateWorkHistory updatedEntity = bullhornData.findEntity(CandidateWorkHistory.class,
				testEntities.getCandidateWorkHistoryId(), Sets.newHashSet("id", "customText1"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	public void testUpdateCertification() {

		Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), Sets.newHashSet("id", "name"));

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Certification updatedEntity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), Sets.newHashSet("id", "name"));
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientContact() {

		ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id", "name"));

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		ClientContact updatedEntity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id", "name"));
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientCorporation() {

		ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), Sets.newHashSet("id", "name"));

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		ClientCorporation updatedEntity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), Sets.newHashSet("id", "name"));
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

    @Test
    public void testUpdateDepartment() {

        Department entity = bullhornData.findEntity(Department.class, testEntities.getDepartmentId(), Sets.newHashSet("id", "name"));

        this.entity = (T) entity;

        previousValue = entity.getName();

        newValue = previousValue + "toad";

        entity.setName(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Department updatedEntity = bullhornData.findEntity(Department.class, testEntities.getDepartmentId(), Sets.newHashSet("id", "name"));
        entity.setName(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getName());

    }

    @Test
    public void testUpdateGoalTarget() {

        GoalTarget entity = bullhornData.findEntity(GoalTarget.class, testEntities.getGoalTargetId(), Sets.newHashSet("id", "periodname"));

        this.entity = (T) entity;

        previousValue = entity.getPeriodName();

        newValue = previousValue + "toad";

        entity.setPeriodName(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        GoalTarget updatedEntity = bullhornData.findEntity(GoalTarget.class, testEntities.getGoalTargetId(), Sets.newHashSet("id", "periodname"));
        entity.setPeriodName(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getPeriodName());

    }

	@Test
	public void testUpdateHousingComplex() {

		HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), Sets.newHashSet("id", "customText1", "isDeleted"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornData.updateEntity(entity);

		HousingComplex updatedEntity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId(), Sets.newHashSet("id", "customText1", "isDeleted"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobOrder() {

		JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "customText1", "isDeleted"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornData.updateEntity(entity);

		JobOrder updatedEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "customText1", "isDeleted"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobSubmission() {

        String previousCustomTextValue;
        String newCustomTextValue;

		JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), Sets.newHashSet("id", "customText1", "source"));

		this.entity = (T) entity;

		previousValue = entity.getSource();
		newValue = previousValue + "toad";
		entity.setSource(newValue);

        previousCustomTextValue = entity.getCustomText1();
        newCustomTextValue = previousCustomTextValue + "ribbit";
        entity.setCustomText1(newCustomTextValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		JobSubmission updatedEntity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), Sets.newHashSet("id", "customText1", "source"));
		entity.setSource(previousValue);
        entity.setCustomText1(previousCustomTextValue);
        this.runAssertions(response, newValue, updatedEntity.getSource());
        this.runAssertions(response, newCustomTextValue, updatedEntity.getCustomText1());

    }

    @Test
    public void testUpdateLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), Sets.newHashSet("id", "customText1"));

        this.entity = (T) entity;

        previousValue = entity.getCustomText1();

        newValue = previousValue + "toad";

        entity.setCustomText1(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Lead updatedEntity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), Sets.newHashSet("id", "customText1"));
        entity.setCustomText1(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getCustomText1());

    }

	@Test
	public void testUpdateNote() {

        String previousExternalIDValue;
        String newExternalIDValue;

		Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id", "comments", "externalID"));

		this.entity = (T) entity;

		previousValue = entity.getComments();
		newValue = previousValue + "toad";
		entity.setComments(newValue);

        previousExternalIDValue = entity.getExternalID();
        newExternalIDValue = previousExternalIDValue + "ribbit";
        entity.setExternalID(newExternalIDValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Note updatedEntity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id", "comments", "externalID"));
		entity.setComments(previousValue);
        entity.setExternalID(previousExternalIDValue);

		this.runAssertions(response, newValue, updatedEntity.getComments());
        this.runAssertions(response, newExternalIDValue, updatedEntity.getExternalID());
    }

	@Test
	public void testUpdateNoteEntity() {

		NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), Sets.newHashSet("id", "targetEntityName"));

		this.entity = (T) entity;

		previousValue = entity.getTargetEntityName();

		newValue = previousValue + "toad";

		entity.setTargetEntityName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		NoteEntity updatedEntity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), Sets.newHashSet("id", "targetEntityName"));
		entity.setTargetEntityName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getTargetEntityName());

	}

    @Test
    public void testUpdateOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), Sets.newHashSet("id", "customText1"));

        this.entity = (T) entity;

        previousValue = entity.getCustomText1();

        newValue = previousValue + "toad";

        entity.setCustomText1(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Opportunity updatedEntity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), Sets.newHashSet("id", "customText1"));
        entity.setCustomText1(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getCustomText1());

    }

	@Test
	public void testUpdatePlacement() {

		Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), Sets.newHashSet("id", "customText1"));

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Placement updatedEntity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), Sets.newHashSet("id", "customText1"));
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

    @Test
    public void testUpdatePlacementCertification() {

        PlacementCertification entity = bullhornData.findEntity(PlacementCertification.class, testEntities.getPlacementCertificationId(), Sets.newHashSet("id", "dateLastModified"));

        this.entity = (T) entity;

        DateTime newValueDateTime = new DateTime();

        entity.setDateLastModified(newValueDateTime);

        UpdateResponse response = bullhornData.updateEntity(entity);

        PlacementCertification updatedEntity = bullhornData.findEntity(PlacementCertification.class, testEntities.getPlacementCertificationId(), Sets.newHashSet("id", "dateLastModified"));

        // assertions
        assertNotNull("response is null", response);
        assertFalse("Validation failed", response.hasValidationErrors());
        assertTrue("value not updated correctly", newValueDateTime.equals(updatedEntity.getDateLastModified()));
    }

	@Test
	public void testUpdatePlacementCommission() {
		PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(), Sets.newHashSet("id", "comments"));

		this.entity = (T) entity;

		previousValue = entity.getComments();

		newValue = previousValue + "toad";

		entity.setComments(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		PlacementCommission updatedEntity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(), Sets.newHashSet("id", "comments"));
		entity.setComments(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getComments());

	}

	@Test
	public void testUpdateSendout() {

		Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), Sets.newHashSet("id", "email"));

		this.entity = (T) entity;

		previousValue = entity.getEmail();

		if (previousValue == null) {
			newValue = "toad@toad.com";
		} else {
			newValue = previousValue + "toad";
		}

		entity.setEmail(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Sendout updatedEntity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), Sets.newHashSet("id", "email"));
		entity.setEmail(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getEmail());

	}

	@Test
	public void testUpdateTask() {

		Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id", "description"));

		this.entity = (T) entity;

		previousValue = entity.getDescription();

		newValue = previousValue + "toad";

		entity.setDescription(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Task updatedEntity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id", "description"));
		entity.setDescription(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getDescription());

	}

    @Test
    public void testUpdateCandidateFileAttachment() {

        CandidateFileAttachment entity = bullhornData.findEntity(CandidateFileAttachment.class, testEntities.getCandidateFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        CandidateFileAttachment updatedEntity = bullhornData.findEntity(CandidateFileAttachment.class, testEntities.getCandidateFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

    @Test
    public void testUpdateCertificationFileAttachment() {

        CertificationFileAttachment entity = bullhornData.findEntity(CertificationFileAttachment.class, testEntities.getCertificationFileAttachmentId(), Sets.newHashSet("id", "name"));

        this.entity = (T) entity;

        previousValue = entity.getName();

        newValue = previousValue + "toad";

        entity.setName(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        CertificationFileAttachment updatedEntity = bullhornData.findEntity(CertificationFileAttachment.class, testEntities.getCertificationFileAttachmentId(), Sets.newHashSet("id", "name"));
        entity.setName(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getName());

    }

    @Test
    public void testUpdateClientContactFileAttachment() {

        ClientContactFileAttachment entity = bullhornData.findEntity(ClientContactFileAttachment.class, testEntities.getClientContactFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        ClientContactFileAttachment updatedEntity = bullhornData.findEntity(ClientContactFileAttachment.class, testEntities.getClientContactFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

    @Test
    public void testUpdateClientCorporationFileAttachment() {

        ClientCorporationFileAttachment entity = bullhornData.findEntity(ClientCorporationFileAttachment.class, testEntities.getClientCorporationFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        ClientCorporationFileAttachment updatedEntity = bullhornData.findEntity(ClientCorporationFileAttachment.class, testEntities.getClientCorporationFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

    @Test
    public void testUpdateJobOrderFileAttachment() {

        JobOrderFileAttachment entity = bullhornData.findEntity(JobOrderFileAttachment.class, testEntities.getJobOrderFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        JobOrderFileAttachment updatedEntity = bullhornData.findEntity(JobOrderFileAttachment.class, testEntities.getJobOrderFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

    @Test
    public void testUpdateOpportunityFileAttachment() {

        OpportunityFileAttachment entity = bullhornData.findEntity(OpportunityFileAttachment.class, testEntities.getOpportunityFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        OpportunityFileAttachment updatedEntity = bullhornData.findEntity(OpportunityFileAttachment.class, testEntities.getOpportunityFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

    @Test
    public void testUpdatePlacementFileAttachment() {

        PlacementFileAttachment entity = bullhornData.findEntity(PlacementFileAttachment.class, testEntities.getPlacementFileAttachmentId(), Sets.newHashSet("id", "description"));

        this.entity = (T) entity;

        previousValue = entity.getDescription();

        newValue = previousValue + "toad";

        entity.setDescription(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        PlacementFileAttachment updatedEntity = bullhornData.findEntity(PlacementFileAttachment.class, testEntities.getPlacementFileAttachmentId(), Sets.newHashSet("id", "description"));
        entity.setDescription(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getDescription());

    }

	private void runAssertions(UpdateResponse response, String valueShouldBe, String valueIs) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertTrue("value not updated correctly", valueShouldBe.equals(valueIs));
	}

	

}
