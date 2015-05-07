package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

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
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;
import com.bullhornsdk.data.model.entity.core.standard.Sendout;
import com.bullhornsdk.data.model.entity.core.standard.Task;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.response.crud.CreateResponse;
import com.bullhornsdk.data.model.response.crud.DeleteResponse;

public class TestStandardBullhornApiRestCreate<C extends CreateEntity, D extends DeleteEntity> extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRestCreate.class);

	private Integer entityId;

	private Class<D> deleteType;

	public TestStandardBullhornApiRestCreate() {
		super();
	}

	/**
	 * TODO: UNCOMMENT THE testCreatePlacement() method once the API issue around deleting placements is resolved
	 */

	@After
	public void removeTheEntityAfterCreation() {
		if (entityId != null && deleteType != null) {
			DeleteResponse response = bullhornApiRest.deleteEntity(deleteType, entityId);
			assertNotNull("Error deleting entity", response);
			assertFalse("Error deleting entity", response.isError());
		}
	}

	@Test
	public void testCreateAppointment() {

		Appointment entity = bullhornApiRest.findEntity(Appointment.class, testEntities.getAppointmentId());

		Integer oldId = entity.getId();

		entity.setId(null);
		entity.setType("Meeting");

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Appointment newEntity = bullhornApiRest.findEntity(Appointment.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Appointment.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateCandidate() {

		Candidate entity = Candidate.instantiateForInsert();
		entity.setName("New Candidate");
		entity.setFirstName("New");
		entity.setLastName("Candidate");
		entity.setCustomText5("test");
		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Candidate newEntity = bullhornApiRest.findEntity(Candidate.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Candidate.class;
		entity.setId(-1);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateCandidateEducation() {

		CandidateEducation entity = bullhornApiRest.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		CandidateEducation newEntity = bullhornApiRest.findEntity(CandidateEducation.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) CandidateEducation.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateCandidateReference() {

		CandidateReference entity = bullhornApiRest.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		CandidateReference newEntity = bullhornApiRest.findEntity(CandidateReference.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) CandidateReference.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateCandidateWorkHistory() {

		CandidateWorkHistory entity = bullhornApiRest.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		CandidateWorkHistory newEntity = bullhornApiRest.findEntity(CandidateWorkHistory.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) CandidateWorkHistory.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	public void testCreateCertification() {

		Certification entity = bullhornApiRest.findEntity(Certification.class, testEntities.getCertificationId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Certification newEntity = bullhornApiRest.findEntity(Certification.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Certification.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateClientContact() {

		ClientContact entity = bullhornApiRest.findEntity(ClientContact.class, testEntities.getClientContactId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		ClientContact newEntity = bullhornApiRest.findEntity(ClientContact.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) ClientContact.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	// @Test
	public void testCreateClientCorporation() {

		ClientCorporation entity = bullhornApiRest.findEntity(ClientCorporation.class, testEntities.getClientCorporationId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		ClientCorporation newEntity = bullhornApiRest.findEntity(ClientCorporation.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();

		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateJobOrder() {

		JobOrder entity = bullhornApiRest.findEntity(JobOrder.class, testEntities.getJobOrderId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		JobOrder newEntity = bullhornApiRest.findEntity(JobOrder.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) JobOrder.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateJobSubmission() {

		JobSubmission entity = bullhornApiRest.findEntity(JobSubmission.class, testEntities.getJobSubmissionId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		JobSubmission newEntity = bullhornApiRest.findEntity(JobSubmission.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) JobSubmission.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateNote() {

		Note entity = bullhornApiRest.findEntity(Note.class, testEntities.getNoteId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Note newEntity = bullhornApiRest.findEntity(Note.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Note.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateNoteEntity() {

		NoteEntity entity = bullhornApiRest.findEntity(NoteEntity.class, testEntities.getNoteEntityId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		NoteEntity newEntity = bullhornApiRest.findEntity(NoteEntity.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) NoteEntity.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	// @Test
	public void testCreatePlacement() {

		Placement entity = bullhornApiRest.findEntity(Placement.class, testEntities.getPlacementId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Placement newEntity = bullhornApiRest.findEntity(Placement.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Placement.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreatePlacementCommission() {
		PlacementCommission entity = bullhornApiRest.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		PlacementCommission newEntity = bullhornApiRest.findEntity(PlacementCommission.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) PlacementCommission.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateSendout() {

		Sendout entity = bullhornApiRest.findEntity(Sendout.class, testEntities.getSendoutId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Sendout newEntity = bullhornApiRest.findEntity(Sendout.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Sendout.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	@Test
	public void testCreateTask() {

		Task entity = bullhornApiRest.findEntity(Task.class, testEntities.getTaskId());

		Integer oldId = entity.getId();

		entity.setId(null);

		CreateResponse response = bullhornApiRest.insertEntity(entity);

		Task newEntity = bullhornApiRest.findEntity(Task.class, response.getChangedEntityId());

		this.entityId = response.getChangedEntityId();
		this.deleteType = (Class<D>) Task.class;
		entity.setId(oldId);
		this.runAssertions(response, entity, newEntity);

	}

	private <E extends CreateEntity> void runAssertions(CreateResponse response, E oldEntity, E newEntity) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertNotNull("no entityId in response", response.getChangedEntityId());
		assertFalse("response is error", response.isError());
		assertNotNull("new entity null", newEntity);
		assertNotNull("new entity id null", newEntity.getId());
		assertFalse("new and old entity ids are the same", oldEntity.getId().intValue() == newEntity.getId().intValue());
	}

	

}
