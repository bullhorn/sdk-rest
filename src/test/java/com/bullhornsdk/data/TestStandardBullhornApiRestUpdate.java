package com.bullhornsdk.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateReference;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Certification;
import com.bullhornsdk.data.model.entity.core.standard.ClientContact;
import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;
import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Task;
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
			UpdateResponse response = bullhornApiRest.updateEntity(entity);
			assertFalse("Error restoring entity. Validation errors", response.hasValidationErrors());
			assertFalse("Error restoring entity. Error.", response.isError());
		}
	}

	@Test
	public void testGenericUpdate() {
		String newStatus = "STABLE";
		JobOrder preUpdateEntity = bullhornApiRest.findEntity(JobOrder.class, testEntities.getJobOrderId());

		JobOrder update = new JobOrder(testEntities.getJobOrderId());

		update.setStatus(newStatus);
		UpdateResponse response = bullhornApiRest.updateEntity(update);
		JobOrder updatedEntity = bullhornApiRest.findEntity(JobOrder.class, testEntities.getJobOrderId());

		this.runAssertions(response, newStatus, updatedEntity.getStatus());

		updatedEntity.setStatus(preUpdateEntity.getStatus());

		assertEquals(updatedEntity, preUpdateEntity);

	}

	@Test
	public void testUpdateAppointment() {

		Appointment entity = bullhornApiRest.findEntity(Appointment.class, testEntities.getAppointmentId());

		this.entity = (T) entity;

		previousValue = entity.getSubject();

		newValue = previousValue + "toad";

		entity.setSubject(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Appointment updatedEntity = bullhornApiRest.findEntity(Appointment.class, testEntities.getAppointmentId());
		entity.setSubject(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getSubject());

	}

	@Test
	public void testUpdateCandidate() {

		Candidate entity = bullhornApiRest.findEntity(Candidate.class, testEntities.getCandidateId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setCustomText5("test");
		entity.setIsDeleted(Boolean.FALSE);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Candidate updatedEntity = bullhornApiRest.findEntity(Candidate.class, testEntities.getCandidateId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateCandidateEducation() {

		CandidateEducation entity = bullhornApiRest.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText4();

		newValue = previousValue + "toad";

		entity.setCustomText4(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		CandidateEducation updatedEntity = bullhornApiRest.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());
		entity.setCustomText4(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText4());

	}

	@Test
	public void testUpdateCandidateReference() {

		CandidateReference entity = bullhornApiRest.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		CandidateReference updatedEntity = bullhornApiRest.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateCandidateWorkHistory() {

		CandidateWorkHistory entity = bullhornApiRest.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		CandidateWorkHistory updatedEntity = bullhornApiRest.findEntity(CandidateWorkHistory.class,
				testEntities.getCandidateWorkHistoryId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	public void testUpdateCertification() {

		Certification entity = bullhornApiRest.findEntity(Certification.class, testEntities.getCertificationId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Certification updatedEntity = bullhornApiRest.findEntity(Certification.class, testEntities.getCertificationId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientContact() {

		ClientContact entity = bullhornApiRest.findEntity(ClientContact.class, testEntities.getClientContactId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		ClientContact updatedEntity = bullhornApiRest.findEntity(ClientContact.class, testEntities.getClientContactId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateClientCorporation() {

		ClientCorporation entity = bullhornApiRest.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());

		this.entity = (T) entity;

		previousValue = entity.getName();

		newValue = previousValue + "toad";

		entity.setName(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		ClientCorporation updatedEntity = bullhornApiRest.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());
		entity.setName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getName());

	}

	@Test
	public void testUpdateHousingComplex() {

		HousingComplex entity = bullhornApiRest.findEntity(HousingComplex.class, testEntities.getHousingComplexId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		HousingComplex updatedEntity = bullhornApiRest.findEntity(HousingComplex.class, testEntities.getHousingComplexId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobOrder() {

		JobOrder entity = bullhornApiRest.findEntity(JobOrder.class, testEntities.getJobOrderId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);
		entity.setIsDeleted(false);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		JobOrder updatedEntity = bullhornApiRest.findEntity(JobOrder.class, testEntities.getJobOrderId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdateJobSubmission() {

		JobSubmission entity = bullhornApiRest.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());

		this.entity = (T) entity;

		previousValue = entity.getSource();

		newValue = previousValue + "toad";

		entity.setSource(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		JobSubmission updatedEntity = bullhornApiRest.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());
		entity.setSource(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getSource());

	}

	@Test
	public void testUpdateNote() {

		Note entity = bullhornApiRest.findEntity(Note.class, testEntities.getNoteId());

		this.entity = (T) entity;

		previousValue = entity.getComments();

		newValue = previousValue + "toad";

		entity.setComments(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Note updatedEntity = bullhornApiRest.findEntity(Note.class, testEntities.getNoteId());
		entity.setComments(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getComments());

	}

	@Test
	public void testUpdateNoteEntity() {

		NoteEntity entity = bullhornApiRest.findEntity(NoteEntity.class, testEntities.getNoteEntityId());

		this.entity = (T) entity;

		previousValue = entity.getTargetEntityName();

		newValue = previousValue + "toad";

		entity.setTargetEntityName(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		NoteEntity updatedEntity = bullhornApiRest.findEntity(NoteEntity.class, testEntities.getNoteEntityId());
		entity.setTargetEntityName(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getTargetEntityName());

	}

	@Test
	public void testUpdatePlacement() {

		Placement entity = bullhornApiRest.findEntity(Placement.class, testEntities.getPlacementId());

		this.entity = (T) entity;

		previousValue = entity.getCustomText1();

		newValue = previousValue + "toad";

		entity.setCustomText1(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Placement updatedEntity = bullhornApiRest.findEntity(Placement.class, testEntities.getPlacementId());
		entity.setCustomText1(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getCustomText1());

	}

	@Test
	public void testUpdatePlacementCommission() {
		PlacementCommission entity = bullhornApiRest.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());

		this.entity = (T) entity;

		previousValue = entity.getComments();

		newValue = previousValue + "toad";

		entity.setComments(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		PlacementCommission updatedEntity = bullhornApiRest.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());
		entity.setComments(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getComments());

	}

	@Test
	public void testUpdateSendout() {

		Sendout entity = bullhornApiRest.findEntity(Sendout.class, testEntities.getSendoutId());

		this.entity = (T) entity;

		previousValue = entity.getEmail();

		if (previousValue == null) {
			newValue = "toad@toad.com";
		} else {
			newValue = previousValue + "toad";
		}

		entity.setEmail(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Sendout updatedEntity = bullhornApiRest.findEntity(Sendout.class, testEntities.getSendoutId());
		entity.setEmail(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getEmail());

	}

	@Test
	public void testUpdateTask() {

		Task entity = bullhornApiRest.findEntity(Task.class, testEntities.getTaskId());

		this.entity = (T) entity;

		previousValue = entity.getDescription();

		newValue = previousValue + "toad";

		entity.setDescription(newValue);

		UpdateResponse response = bullhornApiRest.updateEntity(entity);

		Task updatedEntity = bullhornApiRest.findEntity(Task.class, testEntities.getTaskId());
		entity.setDescription(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getDescription());

	}

	private void runAssertions(UpdateResponse response, String valueShouldBe, String valueIs) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertTrue("value not updated correctly", valueShouldBe.equals(valueIs));
	}

	

}
