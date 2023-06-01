package com.bullhornsdk.data;

import com.bullhornsdk.data.model.entity.core.standard.JobShift;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.google.common.collect.Sets;

public class TestNestedEntities extends BaseTest {
	private final Logger log = LogManager.getLogger(TestNestedEntities.class);

    public TestNestedEntities() {
        super();
    }

    @Test
    public void testFindCandidate() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id"));

        Assertions.assertNotNull(entity, "Candidate is null");

    }

    @Test
    public void testFindCandidate_educations() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "educations"));

        Assertions.assertNotNull(entity.getEducations().getTotal());
        Assertions.assertNotNull(entity.getEducations().getData());

    }

    @Test
    public void testFindCandidate_notes() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "notes"));

        Assertions.assertNotNull(entity.getNotes().getTotal());
        Assertions.assertNotNull(entity.getNotes().getData());

    }

    @Test
    public void testFindCandidate_clientCorporationWhiteList() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "clientCorporationWhiteList(id,name)"));

        Assertions.assertNotNull(entity.getClientCorporationWhiteList().getTotal());
        Assertions.assertNotNull(entity.getClientCorporationWhiteList().getData());

    }

    @Test
    public void testFindCandidate_clientCorporationBlackList() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "clientCorporationBlackList(id,name)"));

        Assertions.assertNotNull(entity.getClientCorporationBlackList().getTotal());
        Assertions.assertNotNull(entity.getClientCorporationBlackList().getData());

    }

    @Test
    public void testFindCandidate_fileAttachments() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "fileAttachments(id,name)"));

        Assertions.assertNotNull(entity.getFileAttachments().getTotal());
        Assertions.assertNotNull(entity.getFileAttachments().getData());

    }

    @Test
    public void testFindCandidate_interviews() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "interviews(id,dateAdded,type)"));

        Assertions.assertNotNull(entity.getInterviews().getTotal());
        Assertions.assertNotNull(entity.getInterviews().getData());

    }

    @Test
    public void testFindCandidate_placements() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "placements(id,customText2)"));

        Assertions.assertNotNull(entity.getPlacements().getTotal());
        Assertions.assertNotNull(entity.getPlacements().getData());

    }

    @Test
    public void testFindCandidate_sendouts() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "sendouts(id,dateAdded)"));

        Assertions.assertNotNull(entity.getSendouts().getTotal());
        Assertions.assertNotNull(entity.getSendouts().getData());

    }

    @Test
    public void testFindCandidate_jobSubmissions() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "submissions(id,status)"));

        Assertions.assertNotNull(entity.getSubmissions().getTotal());
        Assertions.assertNotNull(entity.getSubmissions().getData());

    }

    @Test
    public void testFindCandidate_webResponses() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "webResponses(id,status)"));

        Assertions.assertNotNull(entity.getWebResponses().getTotal());
        Assertions.assertNotNull(entity.getWebResponses().getData());

    }

    @Test
    public void testFindCandidate_workHistories() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "workHistories(id,dateAdded)"));

        Assertions.assertNotNull(entity.getWorkHistories().getTotal());
        Assertions.assertNotNull(entity.getWorkHistories().getData());

    }

    @Test
    public void testFindCandidate_references() {

        Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
            Sets.newHashSet("id", "references(id,companyName)"));

        Assertions.assertNotNull(entity.getReferences().getTotal());
        Assertions.assertNotNull(entity.getReferences().getData());

    }

    @Test
    public void testPlacementChangeRequest_placement() {

        PlacementChangeRequest entity = bullhornData.findEntity(PlacementChangeRequest.class,
            testEntities.getPlacementChangeRequestId(), Sets.newHashSet("id", "placement(id,customText2)"));

        Assertions.assertNotNull(entity.getPlacement().getId());
        Assertions.assertNotNull(entity.getPlacement().getCustomText2());
        Assertions.assertNull(entity.getPlacement().getCustomText3());
    }

    @Test
    public void testJobShift_notes() {

        JobShift entity = bullhornData.findEntity(JobShift.class,
            testEntities.getJobShiftId(), Sets.newHashSet("id", "notes(id,action)"));

        Assertions.assertNotNull(entity.getNotes().getData());
        Assertions.assertNotNull(entity.getNotes().getTotal());
    }

}
