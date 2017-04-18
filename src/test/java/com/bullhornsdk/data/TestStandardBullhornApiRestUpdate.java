package com.bullhornsdk.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.bullhornsdk.data.model.entity.core.standard.*;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.response.crud.UpdateResponse;

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
		JobOrder preUpdateEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId());

		JobOrder update = new JobOrder(testEntities.getJobOrderId());

		update.setStatus(newStatus);
		UpdateResponse response = bullhornData.updateEntity(update);
		JobOrder updatedEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId());

		this.runAssertions(response, newStatus, updatedEntity.getStatus());

		updatedEntity.setStatus(preUpdateEntity.getStatus());

		assertEquals(updatedEntity, preUpdateEntity);

	}

	@Test
	public void testUpdateAppointment() {

		Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId());

		this.entity = (T) entity;

		previousValue = entity.getSubject();

		newValue = previousValue + "toad";

		entity.setSubject(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Appointment updatedEntity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId());
		entity.setSubject(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getSubject());

	}

	@Test
	public void testUpdateCandidate() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setCustomText5("test");
		entity.setIsDeleted(Boolean.FALSE);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Candidate updatedEntity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

    @Test
    public void testUpdateCandidateCertification() {

        CandidateCertification entity = bullhornData.findEntity(CandidateCertification.class, testEntities.getCandidateCertificationId());

        this.entity = (T) entity;

        previousValue = entity.getStatus();

        newValue = previousValue + "toad";

        entity.setStatus(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        CandidateCertification updatedEntity = bullhornData.findEntity(CandidateCertification.class, testEntities.getCandidateCertificationId());
        entity.setStatus(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getStatus());

    }

	@Test
	public void testUpdateCandidateEducation() {

		CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText4();

		newValue = previousValue + "toad";

		entity.setCustomText4(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateEducation updatedEntity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());
		entity.setCustomText4(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText4());

	}

	@Test
	public void testUpdateCandidateReference() {

		CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateReference updatedEntity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateCandidateWorkHistory() {

		CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		CandidateWorkHistory updatedEntity = bullhornData.findEntity(CandidateWorkHistory.class,
				testEntities.getCandidateWorkHistoryId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	public void testUpdateCertification() {

		Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Certification updatedEntity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientContact() {

		ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		ClientContact updatedEntity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientCorporation() {

		ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		ClientCorporation updatedEntity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateHousingComplex() {

		HousingComplex entity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornData.updateEntity(entity);

		HousingComplex updatedEntity = bullhornData.findEntity(HousingComplex.class, testEntities.getHousingComplexId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobOrder() {

		JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornData.updateEntity(entity);

		JobOrder updatedEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobSubmission() {

        String previousCustomTextValue;
        String newCustomTextValue;

		JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());

		this.entity = (T) entity;

		previousValue = entity.getSource();
		newValue = previousValue + "toad";
		entity.setSource(newValue);

        previousCustomTextValue = entity.getCustomText1();
        newCustomTextValue = previousCustomTextValue + "ribbit";
        entity.setCustomText1(newCustomTextValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		JobSubmission updatedEntity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());
		entity.setSource(previousValue);
        entity.setCustomText1(previousCustomTextValue);
        this.runAssertions(response, newValue, updatedEntity.getSource());
        this.runAssertions(response, newCustomTextValue, updatedEntity.getCustomText1());

    }

    @Test
    public void testUpdateLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId());

        this.entity = (T) entity;

        previousValue = entity.getCustomText1();

        newValue = previousValue + "toad";

        entity.setCustomText1(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Lead updatedEntity = bullhornData.findEntity(Lead.class, testEntities.getLeadId());
        entity.setCustomText1(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getCustomText1());

    }

	@Test
	public void testUpdateNote() {

        String previousExternalIDValue;
        String newExternalIDValue;

		Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId());

		this.entity = (T) entity;

		previousValue = entity.getComments();
		newValue = previousValue + "toad";
		entity.setComments(newValue);

        previousExternalIDValue = entity.getExternalID();
        newExternalIDValue = previousExternalIDValue + "ribbit";
        entity.setExternalID(newExternalIDValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Note updatedEntity = bullhornData.findEntity(Note.class, testEntities.getNoteId());
		entity.setComments(previousValue);
        entity.setExternalID(previousExternalIDValue);

		this.runAssertions(response, newValue, updatedEntity.getComments());
        this.runAssertions(response, newExternalIDValue, updatedEntity.getExternalID());
    }

	@Test
	public void testUpdateNoteEntity() {

		NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId());

		this.entity = (T) entity;

		previousValue = entity.getTargetEntityName();

		newValue = previousValue + "toad";

		entity.setTargetEntityName(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		NoteEntity updatedEntity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId());
		entity.setTargetEntityName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getTargetEntityName());

	}

    @Test
    public void testUpdateOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId());

        this.entity = (T) entity;

        previousValue = entity.getCustomText1();

        newValue = previousValue + "toad";

        entity.setCustomText1(newValue);

        UpdateResponse response = bullhornData.updateEntity(entity);

        Opportunity updatedEntity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId());
        entity.setCustomText1(previousValue);
        this.runAssertions(response, newValue, updatedEntity.getCustomText1());

    }

	@Test
	public void testUpdatePlacement() {

		Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Placement updatedEntity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

    @Test
    public void testUpdatePlacementCertification() {

        PlacementCertification entity = bullhornData.findEntity(PlacementCertification.class, testEntities.getPlacementCertificationId());

        this.entity = (T) entity;

        DateTime newValueDateTime = new DateTime();

        entity.setDateLastModified(newValueDateTime);

        UpdateResponse response = bullhornData.updateEntity(entity);

        PlacementCertification updatedEntity = bullhornData.findEntity(PlacementCertification.class, testEntities.getPlacementCertificationId());

        // assertions
        assertNotNull("response is null", response);
        assertFalse("Validation failed", response.hasValidationErrors());
        assertTrue("value not updated correctly", newValueDateTime.equals(updatedEntity.getDateLastModified()));
    }

	@Test
	public void testUpdatePlacementCommission() {
		PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());

		this.entity = (T) entity;

		previousValue = entity.getComments();

		newValue = previousValue + "toad";

		entity.setComments(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		PlacementCommission updatedEntity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());
		entity.setComments(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getComments());

	}

	@Test
	public void testUpdateSendout() {

		Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId());

		this.entity = (T) entity;

		previousValue = entity.getEmail();

		if (previousValue == null) {
			newValue = "toad@toad.com";
		} else {
			newValue = previousValue + "toad";
		}

		entity.setEmail(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Sendout updatedEntity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId());
		entity.setEmail(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getEmail());

	}

	@Test
	public void testUpdateTask() {

		Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId());

		this.entity = (T) entity;

		previousValue = entity.getDescription();

		newValue = previousValue + "toad";

		entity.setDescription(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		Task updatedEntity = bullhornData.findEntity(Task.class, testEntities.getTaskId());
		entity.setDescription(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getDescription());

	}

	private void runAssertions(UpdateResponse response, String valueShouldBe, String valueIs) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertTrue("value not updated correctly", valueShouldBe.equals(valueIs));
	}

	

}
