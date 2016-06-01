package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
import com.bullhornsdk.data.model.entity.core.standard.File;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
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

public class TestStandardBullhornApiRestQueryForAll extends BaseTest {
	
	private String where = "id>0 AND id<21";

	private QueryParams queryParams;

	public TestStandardBullhornApiRestQueryForAll() {
		super();
		this.queryParams = ParamFactory.queryParams();

	}

	@Test
	public void testQueryAppointment() {

		ListWrapper<Appointment> wrapper = bullhornData.queryForAllRecords(Appointment.class, where, null, queryParams);

		runAssertions("ListWrapper<Appointment>", wrapper);
	}

	@Test
	public void testQueryAppointmentAttendee() {

		ListWrapper<AppointmentAttendee> wrapper = bullhornData.queryForAllRecords(AppointmentAttendee.class, where, null, queryParams);

		runAssertions("ListWrapper<AppointmentAttendee>", wrapper);

	}

	@Test
	public void testQueryBusinessSector() {

		ListWrapper<BusinessSector> wrapper = bullhornData.queryForAllRecords(BusinessSector.class, where, null, queryParams);

		runAssertions("ListWrapper<BusinessSector>", wrapper);
	}

	@Test
	public void testQueryCandidateEducation() {

		ListWrapper<CandidateEducation> wrapper = bullhornData.queryForAllRecords(CandidateEducation.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateEducation>", wrapper);

	}

	@Test
	public void testQueryCandidateReference() {

		ListWrapper<CandidateReference> wrapper = bullhornData.queryForAllRecords(CandidateReference.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateEducation>", wrapper);

	}

	@Test
	public void testQueryCandidateWorkHistory() {

		ListWrapper<CandidateWorkHistory> wrapper = bullhornData
				.queryForAllRecords(CandidateWorkHistory.class, where, null, queryParams);

		runAssertions("ListWrapper<CandidateWorkHistory>", wrapper);
	}

	@Test
	public void testQueryCategory() {

		ListWrapper<Category> wrapper = bullhornData.queryForAllRecords(Category.class, where, null, queryParams);

		runAssertions("ListWrapper<Category>", wrapper);

	}

	@Test
	public void testQueryCertification() {

		ListWrapper<Certification> wrapper = bullhornData.queryForAllRecords(Certification.class, where, null, queryParams);

		runAssertions("ListWrapper<Certification>", wrapper);

	}

	@Test
	public void testQueryClientContact() {

		ListWrapper<ClientContact> wrapper = bullhornData.queryForAllRecords(ClientContact.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientContact>", wrapper);

	}

	@Test
	public void testQueryClientCorporation() {

		ListWrapper<ClientCorporation> wrapper = bullhornData.queryForAllRecords(ClientCorporation.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientCorporation>", wrapper);

	}

	@Test
	public void testQueryCorporateUser() {

		String where = "isDeleted=true";
		ListWrapper<CorporateUser> wrapper = bullhornData.queryForAllRecords(CorporateUser.class, where, null, queryParams);
		assertTrue(wrapper.getCount() == 1);
		runAssertions("ListWrapper<CorporateUser>", wrapper);

	}

	@Test
	public void testQueryCorporationDepartment() {

		ListWrapper<CorporationDepartment> wrapper = bullhornData.queryForAllRecords(CorporationDepartment.class, where, null,
				queryParams);

		runAssertions("ListWrapper<CorporationDepartment>", wrapper);

	}

	@Test
	public void testQueryCountry() {

		ListWrapper<Country> wrapper = bullhornData.queryForAllRecords(Country.class, where, null, queryParams);

		runAssertions("ListWrapper<Country>", wrapper);

	}

    @Test
    public void testQueryFile() {

        ListWrapper<File> wrapper = bullhornData.queryForAllRecords(File.class, where, null, queryParams);

        runAssertions("ListWrapper<File>", wrapper);

    }

	@Test
	public void testQueryJobOrderGreaterThan() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id > 10", null, queryParams);

		assertTrue(wrapper.getCount() == 10);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderGreaterThanEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id >= 10", null, queryParams);

		assertTrue(wrapper.getCount() == 11);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderLessThan() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id < 5", null, queryParams);

		assertTrue(wrapper.getCount() == 4);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderLessThanEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id <= 5", null, queryParams);

		assertTrue(wrapper.getCount() == 5);
		runAssertions("ListWrapper<JobOrder>", wrapper);

		ListWrapper<JobOrder> wrapper2 = bullhornData.queryForAllRecords(JobOrder.class, "status = 'Submitted'", null, queryParams);

		assertTrue(wrapper2.getCount() == 2);

	}

	@Test
	public void testQueryJobOrderEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id = 5", null, queryParams);

		assertTrue(wrapper.getCount() == 1);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobOrderNotEqualTo() {

		ListWrapper<JobOrder> wrapper = bullhornData.queryForAllRecords(JobOrder.class, "id <> 5", null, queryParams);

		assertTrue(wrapper.getCount() == 19);
		runAssertions("ListWrapper<JobOrder>", wrapper);

	}

	@Test
	public void testQueryJobSubmission() {

		ListWrapper<JobSubmission> wrapper = bullhornData.queryForAllRecords(JobSubmission.class, where, null, queryParams);
		runAssertions("ListWrapper<JobSubmission>", wrapper);

	}

    @Test
    public void testQueryLead() {

        ListWrapper<Lead> wrapper = bullhornData.queryForAllRecords(Lead.class, where, null, queryParams);

        runAssertions("ListWrapper<Lead>", wrapper);
    }

	@Test
	public void testQueryNoteEntity() {

		ListWrapper<NoteEntity> wrapper = bullhornData.queryForAllRecords(NoteEntity.class, where, null, queryParams);

		runAssertions("ListWrapper<Note>", wrapper);
	}

    @Test
    public void testQueryOpportunity() {

        ListWrapper<Opportunity> wrapper = bullhornData.queryForAllRecords(Opportunity.class, where, null, queryParams);

        runAssertions("ListWrapper<Opportunity>", wrapper);
    }

	@Test
	public void testQueryPlacement() {

		ListWrapper<Placement> wrapper = bullhornData.queryForAllRecords(Placement.class, where, null, queryParams);

		runAssertions("ListWrapper<ClientContact>", wrapper);

	}

	@Test
	public void testQueryPlacementChangeRequest() {

		ListWrapper<PlacementChangeRequest> wrapper = bullhornData.queryForAllRecords(PlacementChangeRequest.class, where, null,
				queryParams);

		runAssertions("ListWrapper<PlacementChangeRequest>", wrapper);

	}

	@Test
	public void testQueryPlacementCommission() {

		ListWrapper<PlacementCommission> wrapper = bullhornData.queryForAllRecords(PlacementCommission.class, where, null, queryParams);

		runAssertions("ListWrapper<PlacementCommission>", wrapper);

	}

	@Test
	public void testQuerySendout() {

		ListWrapper<Sendout> wrapper = bullhornData.queryForAllRecords(Sendout.class, where, null, queryParams);

		runAssertions("ListWrapper<Sendout>", wrapper);

	}

	@Test
	public void testQuerySkill() {

		ListWrapper<Skill> wrapper = bullhornData.queryForAllRecords(Skill.class, where, null, queryParams);

		runAssertions("ListWrapper<Skill>", wrapper);

	}

	@Test
	public void testQuerySpecialty() {

		ListWrapper<Specialty> wrapper = bullhornData.queryForAllRecords(Specialty.class, where, null, queryParams);

		runAssertions("ListWrapper<Specialty>", wrapper);

	}

	@Test
	public void testQueryState() {

		ListWrapper<State> wrapper = bullhornData.queryForAllRecords(State.class, where, null, queryParams);

		runAssertions("ListWrapper<State>", wrapper);

	}

	@Test
	public void testQueryTask() {

		ListWrapper<Task> wrapper = bullhornData.queryForAllRecords(Task.class, where, null, queryParams);

		runAssertions("ListWrapper<Task>", wrapper);

	}

	@Test
	public void testQueryTimeUnit() {

		ListWrapper<TimeUnit> wrapper = bullhornData.queryForAllRecords(TimeUnit.class, where, null, queryParams);

		runAssertions("ListWrapper<TimeUnit>", wrapper);

	}

	private <T extends BullhornEntity> void runAssertions(String wrapperName, ListWrapper<T> wrapper) {
		assertNotNull(wrapperName + " is null", wrapper);
		assertNotNull(wrapperName + ".data is null", wrapper.getData());
		assertTrue(wrapperName + ".data is empty", wrapper.getData() != null && wrapper.getData().size() > 0);
		assertTrue(wrapperName + ".data.size() is not equal to count", wrapper.getData().size() == wrapper.getCount());
	}

}
