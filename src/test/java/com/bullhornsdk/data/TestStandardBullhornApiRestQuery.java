package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
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
import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmissionHistory;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
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
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.parameter.QueryParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.list.ListWrapper;

/**
 * Tests the "query" request
 * 
 * @author magnus.palm
 * 
 */

public class TestStandardBullhornApiRestQuery extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRestQuery.class);

	private String where = "id>0";

	private QueryParams queryParams;

	public TestStandardBullhornApiRestQuery() {
		super();
		this.queryParams = ParamFactory.queryParams();

	}

	@Test
	public void testQueryAppointment() {

		ListWrapper<Appointment> wrapper = bullhornApiRest.query(Appointment.class, where, null, queryParams);

		runAssertions("ListWrapper<Appointment>", wrapper);
	}

	@Test
	public void testQueryAppointmentAttendee() {

		ListWrapper<AppointmentAttendee> wrapper = bullhornApiRest.query(AppointmentAttendee.class, where, null, queryParams);

		runAssertions("ListWrapper<AppointmentAttendee>", wrapper);

	}

	@Test
	public void testQueryBusinessSector() {

		ListWrapper<BusinessSector> wrapper = bullhornApiRest.query(BusinessSector.class, where, null, queryParams);

		runAssertions("ListWrapper<BusinessSector>", wrapper);
	}

	@Test
	public void testQueryCandidateEducation() {

		ListWrapper<CandidateEducation> wrapper = bullhornApiRest.query(CandidateEducation.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateEducation>", wrapper);

	}

	@Test
	public void testQueryCandidateReference() {

		ListWrapper<CandidateReference> wrapper = bullhornApiRest.query(CandidateReference.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateEducation>", wrapper);

	}

	@Test
	public void testQueryCandidateWorkHistory() {

		ListWrapper<CandidateWorkHistory> wrapper = bullhornApiRest.query(CandidateWorkHistory.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateWorkHistory>", wrapper);
	}

	@Test
	public void testQueryCategory() {

		ListWrapper<Category> wrapper = bullhornApiRest.query(Category.class, where, null, queryParams);

		runAssertions("ListWrapper<Category>", wrapper);

	}

	@Test
	public void testQueryCertification() {

		ListWrapper<Certification> wrapper = bullhornApiRest.query(Certification.class, where, null, queryParams);

		runAssertions("ListWrapper<Certification>", wrapper);

	}

	@Test
	public void testQueryClientContact() {

		ListWrapper<ClientContact> wrapper = bullhornApiRest.query(ClientContact.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientContact>", wrapper);

	}

	@Test
	public void testQueryClientCorporation() {

		ListWrapper<ClientCorporation> wrapper = bullhornApiRest.query(ClientCorporation.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientCorporation>", wrapper);

	}

	@Test
	public void testQueryCorporateUser() {

		String where = "isDeleted=true";
		ListWrapper<CorporateUser> wrapper = bullhornApiRest.query(CorporateUser.class, where, null, queryParams);
		assertTrue(wrapper.getCount() == 1);
		runAssertions("ListWrapper<CorporateUser>", wrapper);

	}

	@Test
	public void testQueryCorporationDepartment() {

		ListWrapper<CorporationDepartment> wrapper = bullhornApiRest.query(CorporationDepartment.class, where, null, queryParams);

		runAssertions("ListWrapper<CorporationDepartment>", wrapper);

	}

	@Test
	public void testQueryCountry() {

		ListWrapper<Country> wrapper = bullhornApiRest.query(Country.class, where, null, queryParams);

		runAssertions("ListWrapper<Country>", wrapper);

	}

	@Test
	public void testQueryHousingComplexGreaterThan() {

		ListWrapper<HousingComplex> wrapper = bullhornApiRest.query(HousingComplex.class, "id > 10", null, queryParams);

		assertTrue(wrapper.getCount() == 10);
		runAssertions("ListWrapper<HousingComplex>", wrapper);

	}

	@Test
	public void testQueryJobOrderGreaterThan() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id > 10", null, queryParams);

		assertTrue(wrapper.getCount() == 10);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderGreaterThanEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id >= 10", null, queryParams);

		assertTrue(wrapper.getCount() == 11);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderLessThan() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id < 5", null, queryParams);

		assertTrue(wrapper.getCount() == 4);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderLessThanEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id <= 5", null, queryParams);

		assertTrue(wrapper.getCount() == 5);
		runAssertions("ListWrapper<JobOrder>", wrapper);

		ListWrapper<JobOrder> wrapper2 = bullhornApiRest.query(JobOrder.class, "status = 'Submitted'", null, queryParams);

		assertTrue(wrapper2.getCount() == 2);

	}

	@Test
	public void testQueryJobOrderEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id = 5", null, queryParams);

		assertTrue(wrapper.getCount() == 1);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderNotEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornApiRest.query(JobOrder.class, "id <> 5", null, queryParams);

		assertTrue(wrapper.getCount() == 19);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobSubmission() {

		ListWrapper<JobSubmission> wrapper = bullhornApiRest.query(JobSubmission.class, where, null, queryParams);
		runAssertions("ListWrapper<JobSubmission>", wrapper);

	}

	@Test
	public void testQueryJobSubmissionHistory() {

		ListWrapper<JobSubmissionHistory> wrapper = bullhornApiRest.query(JobSubmissionHistory.class, where, null, queryParams);
		runAssertions("ListWrapper<JobSubmissionHistory>", wrapper);

	}

    @Test
    public void testQueryLead() {

        ListWrapper<Lead> wrapper = bullhornApiRest.query(Lead.class, where, null, queryParams);

        runAssertions("ListWrapper<Lead>", wrapper);
    }

	@Test
	public void testQueryNoteEntity() {

		ListWrapper<NoteEntity> wrapper = bullhornApiRest.query(NoteEntity.class, where, null, queryParams);

		runAssertions("ListWrapper<Note>", wrapper);
	}

    @Test
    public void testQueryOpportunity() {

        ListWrapper<Opportunity> wrapper = bullhornApiRest.query(Opportunity.class, where, null, queryParams);

        runAssertions("ListWrapper<Opportunity>", wrapper);
    }

	@Test
	public void testQueryPlacement() {

		ListWrapper<Placement> wrapper = bullhornApiRest.query(Placement.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientContact>", wrapper);

	}

	@Test
	public void testQueryPlacementChangeRequest() {

		ListWrapper<PlacementChangeRequest> wrapper = bullhornApiRest.query(PlacementChangeRequest.class, where, null, queryParams);

		runAssertions("ListWrapper<PlacementChangeRequest>", wrapper);

	}

	@Test
	public void testQueryPlacementCommission() {

		ListWrapper<PlacementCommission> wrapper = bullhornApiRest.query(PlacementCommission.class, where, null, queryParams);

		runAssertions("ListWrapper<PlacementCommission>", wrapper);

	}

	@Test
	public void testQueryPlacementCommission_2() {

		String query = "placement.id=" + testEntities.getPlacementId() + " AND user.id IS NOT NULL";
		ListWrapper<PlacementCommission> wrapper = bullhornApiRest.query(PlacementCommission.class, query, null, queryParams);

		runAssertions("ListWrapper<PlacementCommission>", wrapper);

	}

	@Test
	public void testQuerySendout() {

		ListWrapper<Sendout> wrapper = bullhornApiRest.query(Sendout.class, where, null, queryParams);

		runAssertions("ListWrapper<Sendout>", wrapper);

	}

	@Test
	public void testQuerySkill() {

		ListWrapper<Skill> wrapper = bullhornApiRest.query(Skill.class, where, null, queryParams);

		runAssertions("ListWrapper<Skill>", wrapper);

	}

	@Test
	public void testQuerySpecialty() {

		ListWrapper<Specialty> wrapper = bullhornApiRest.query(Specialty.class, where, null, queryParams);

		runAssertions("ListWrapper<Specialty>", wrapper);

	}

	@Test
	public void testQueryState() {

		ListWrapper<State> wrapper = bullhornApiRest.query(State.class, where, null, queryParams);

		runAssertions("ListWrapper<State>", wrapper);

	}

	@Test
	public void testQueryTask() {

		ListWrapper<Task> wrapper = bullhornApiRest.query(Task.class, where, null, queryParams);

		runAssertions("ListWrapper<Task>", wrapper);

	}

	@Test
	public void testQueryTimeUnit() {

		ListWrapper<TimeUnit> wrapper = bullhornApiRest.query(TimeUnit.class, where, null, queryParams);

		runAssertions("ListWrapper<TimeUnit>", wrapper);

	}

	private <T extends BullhornEntity> void runAssertions(String wrapperName, ListWrapper<T> wrapper) {
		assertNotNull(wrapperName + " is null", wrapper);
		assertNotNull(wrapperName + ".data is null", wrapper.getData());
		assertTrue(wrapperName + ".data is empty", wrapper.getData() != null && wrapper.getData().size() > 0);
		assertTrue(wrapperName + ".data.size() is not equal to count", wrapper.getData().size() == wrapper.getCount());
	}

}
