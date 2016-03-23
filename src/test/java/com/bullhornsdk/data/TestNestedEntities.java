package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.PlacementChangeRequest;
import com.google.common.collect.Sets;

public class TestNestedEntities extends BaseTest {
	private final Logger log = Logger.getLogger(TestNestedEntities.class);

	public TestNestedEntities() {
		super();
	}

	@Test
	public void testFindCandidate() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId());

		assertNotNull("Candidate is null", entity);

	}

	@Test
	public void testFindCandidate_educations() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "educations"));

		assertNotNull(entity.getEducations().getTotal());
		assertNotNull(entity.getEducations().getData());

	}

	@Test
	public void testFindCandidate_notes() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "notes"));

		assertNotNull(entity.getNotes().getTotal());
		assertNotNull(entity.getNotes().getData());

	}

	@Test
	public void testFindCandidate_clientCorporationWhiteList() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "clientCorporationWhiteList(id,name)"));

		assertNotNull(entity.getClientCorporationWhiteList().getTotal());
		assertNotNull(entity.getClientCorporationWhiteList().getData());

	}

	@Test
	public void testFindCandidate_clientCorporationBlackList() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "clientCorporationBlackList(id,name)"));

		assertNotNull(entity.getClientCorporationBlackList().getTotal());
		assertNotNull(entity.getClientCorporationBlackList().getData());

	}

	@Test
	public void testFindCandidate_fileAttachments() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "fileAttachments(*)"));

		assertNotNull(entity.getFileAttachments().getTotal());
		assertNotNull(entity.getFileAttachments().getData());

	}

	@Test
	public void testFindCandidate_interviews() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "interviews(id,dateAdded,type)"));

		assertNotNull(entity.getInterviews().getTotal());
		assertNotNull(entity.getInterviews().getData());

	}

	@Test
	public void testFindCandidate_placements() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "placements(id,customText2)"));

		assertNotNull(entity.getPlacements().getTotal());
		assertNotNull(entity.getPlacements().getData());

	}

	@Test
	public void testFindCandidate_sendouts() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "sendouts(id,dateAdded)"));

		assertNotNull(entity.getSendouts().getTotal());
		assertNotNull(entity.getSendouts().getData());

	}

	@Test
	public void testFindCandidate_jobSubmissions() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "submissions(id,status)"));

		assertNotNull(entity.getSubmissions().getTotal());
		assertNotNull(entity.getSubmissions().getData());

	}

	@Test
	public void testFindCandidate_webResponses() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "webResponses(id,status)"));

		assertNotNull(entity.getWebResponses().getTotal());
		assertNotNull(entity.getWebResponses().getData());

	}

	@Test
	public void testFindCandidate_workHistories() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "workHistories(id,dateAdded)"));

		assertNotNull(entity.getWorkHistories().getTotal());
		assertNotNull(entity.getWorkHistories().getData());

	}

	@Test
	public void testFindCandidate_references() {

		Candidate entity = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(),
				Sets.newHashSet("id", "references(id,companyName)"));

		assertNotNull(entity.getReferences().getTotal());
		assertNotNull(entity.getReferences().getData());

	}

	@Test
	public void testPlacementChangeRequest_placement() {

		PlacementChangeRequest entity = bullhornData.findEntity(PlacementChangeRequest.class,
				testEntities.getPlacementChangeRequestId(), Sets.newHashSet("id", "placement(id,customText2)"));

		assertNotNull(entity.getPlacement().getId());
		assertNotNull(entity.getPlacement().getCustomText2());
		assertNull(entity.getPlacement().getCustomText3());
	}

}
