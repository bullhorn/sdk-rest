package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.google.common.collect.Sets;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;

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
            DeleteResponse response = bullhornData.deleteEntity(deleteType, entityId);
            assertNotNull("Error deleting entity", response);
            assertFalse("Error deleting entity", response.isError());
        }
    }

    @Test
    public void testCreateAppointment() {

        Appointment entity = bullhornData.findEntity(Appointment.class, testEntities.getAppointmentId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);
        entity.setType("Meeting");

        CreateResponse response = bullhornData.insertEntity(entity);

        Appointment newEntity = bullhornData.findEntity(Appointment.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Appointment.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateBranch() {

        Branch entity = bullhornData.findEntity(Branch.class, testEntities.getBranchId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);
        entity.setName("Unit Test Branch");

        CreateResponse response = bullhornData.insertEntity(entity);

        Branch newEntity = bullhornData.findEntity(Branch.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Branch.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateCandidate() {

        Candidate entity = new Candidate().instantiateForInsert();
        entity.setName("New Candidate");
        entity.setFirstName("New");
        entity.setLastName("Candidate");
        entity.setCustomText5("test");
        CreateResponse response = bullhornData.insertEntity(entity);

        Candidate newEntity = bullhornData.findEntity(Candidate.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Candidate.class;
        entity.setId(-1);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateCandidateCertification() {

        CandidateCertification entity = bullhornData.findEntity(CandidateCertification.class, testEntities.getCandidateCertificationId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        CandidateCertification newEntity = bullhornData.findEntity(CandidateCertification.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) CandidateCertification.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateCandidateEducation() {

        CandidateEducation entity = bullhornData.findEntity(CandidateEducation.class, testEntities.getCandidateEducationId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        CandidateEducation newEntity = bullhornData.findEntity(CandidateEducation.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) CandidateEducation.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateCandidateReference() {

        CandidateReference entity = bullhornData.findEntity(CandidateReference.class, testEntities.getCandidateReferenceId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        CandidateReference newEntity = bullhornData.findEntity(CandidateReference.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) CandidateReference.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateCandidateWorkHistory() {

        CandidateWorkHistory entity = bullhornData.findEntity(CandidateWorkHistory.class, testEntities.getCandidateWorkHistoryId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        CandidateWorkHistory newEntity = bullhornData.findEntity(CandidateWorkHistory.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) CandidateWorkHistory.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    public void testCreateCertification() {

        Certification entity = bullhornData.findEntity(Certification.class, testEntities.getCertificationId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Certification newEntity = bullhornData.findEntity(Certification.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Certification.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateClientContact() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        ClientContact newEntity = bullhornData.findEntity(ClientContact.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) ClientContact.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateClientContactWithExecuteFormTriggers() {

        ClientContact entity = bullhornData.findEntity(ClientContact.class, testEntities.getClientContactId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        bullhornData.setExecuteFormTriggers(true);
        CreateResponse response = bullhornData.insertEntity(entity);
        bullhornData.setExecuteFormTriggers(!bullhornData.getExecuteFormTriggers());

        ClientContact newEntity = bullhornData.findEntity(ClientContact.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) ClientContact.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    // @Test
    public void testCreateClientCorporation() {

        ClientCorporation entity = bullhornData.findEntity(ClientCorporation.class, testEntities.getClientCorporationId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        ClientCorporation newEntity = bullhornData.findEntity(ClientCorporation.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();

        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateDepartment() {
        Department entity = bullhornData.findEntity(Department.class, testEntities.getDepartmentId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Department newEntity = bullhornData.findEntity(Department.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();

        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);
    }

    @Test
    public void testCreateGoalTarget() {
        GoalTarget entity = bullhornData.findEntity(GoalTarget.class, testEntities.getGoalTargetId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        GoalTarget newEntity = bullhornData.findEntity(GoalTarget.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();

        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);
    }

    @Test
    public void testCreateJobOrder() {

        JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        JobOrder newEntity = bullhornData.findEntity(JobOrder.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) JobOrder.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateJobSubmission() {

        JobSubmission entity = bullhornData.findEntity(JobSubmission.class, testEntities.getJobSubmissionId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        JobSubmission newEntity = bullhornData.findEntity(JobSubmission.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) JobSubmission.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateLead() {

        Lead entity = bullhornData.findEntity(Lead.class, testEntities.getLeadId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Lead newEntity = bullhornData.findEntity(Lead.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Lead.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateNote() {

        Note entity = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Note newEntity = bullhornData.findEntity(Note.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Note.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateNoteEntity() {

        NoteEntity entity = bullhornData.findEntity(NoteEntity.class, testEntities.getNoteEntityId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        NoteEntity newEntity = bullhornData.findEntity(NoteEntity.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) NoteEntity.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateOpportunity() {

        Opportunity entity = bullhornData.findEntity(Opportunity.class, testEntities.getOpportunityId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Opportunity newEntity = bullhornData.findEntity(Opportunity.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Opportunity.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    // @Test
    public void testCreatePlacement() {

        Placement entity = bullhornData.findEntity(Placement.class, testEntities.getPlacementId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Placement newEntity = bullhornData.findEntity(Placement.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Placement.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreatePlacementCertification() {

        PlacementCertification entity = bullhornData.findEntity(PlacementCertification.class, testEntities.getPlacementCertificationId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        PlacementCertification newEntity = bullhornData.findEntity(PlacementCertification.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) PlacementCertification.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreatePlacementCommission() {
        PlacementCommission entity = bullhornData.findEntity(PlacementCommission.class, testEntities.getPlacementCommissionId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        PlacementCommission newEntity = bullhornData.findEntity(PlacementCommission.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) PlacementCommission.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateSendout() {

        Sendout entity = bullhornData.findEntity(Sendout.class, testEntities.getSendoutId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Sendout newEntity = bullhornData.findEntity(Sendout.class, response.getChangedEntityId(), Sets.newHashSet("id"));

        this.entityId = response.getChangedEntityId();
        this.deleteType = (Class<D>) Sendout.class;
        entity.setId(oldId);
        this.runAssertions(response, entity, newEntity);

    }

    @Test
    public void testCreateTask() {

        Task entity = bullhornData.findEntity(Task.class, testEntities.getTaskId(), Sets.newHashSet("id"));

        Integer oldId = entity.getId();

        entity.setId(null);

        CreateResponse response = bullhornData.insertEntity(entity);

        Task newEntity = bullhornData.findEntity(Task.class, response.getChangedEntityId(), Sets.newHashSet("id"));

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
