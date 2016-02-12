package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

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
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
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
import com.bullhornsdk.data.model.entity.core.standard.TimeUnit;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.entity.meta.MetaData;
import com.bullhornsdk.data.model.enums.MetaParameter;

public class TestStandardBullhornApiRestMeta extends BaseTest {
	
	public TestStandardBullhornApiRestMeta() {
		super();
	}

	@Test
	public void testMetaAppointment() {

		MetaData<Appointment> meta = bullhornApiRest.getMetaData(Appointment.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Appointment.class);
	}

	private <T extends BullhornEntity> void runAssertions(MetaData<T> metaData, Class<T> type) {
		assertNotNull("metaData is null", metaData);
		assertNotNull("metaData.fields is null", metaData.getFields());
		assertTrue("problem with getting meta data for" + type.getSimpleName(), type.getSimpleName().equals(metaData.getEntity()));
	}

	@Test
	public void testMetaAppointmentAttendee() {

		MetaData<AppointmentAttendee> meta = bullhornApiRest.getMetaData(AppointmentAttendee.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, AppointmentAttendee.class);

	}

	@Test
	public void testMetaBusinessSector() {

		MetaData<BusinessSector> meta = bullhornApiRest.getMetaData(BusinessSector.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, BusinessSector.class);

	}

	@Test
	public void testMetaCandidate() {

		MetaData<Candidate> meta = bullhornApiRest.getMetaData(Candidate.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Candidate.class);

	}

	@Test
	public void testMetaCandidateEducation() {

		MetaData<CandidateEducation> meta = bullhornApiRest.getMetaData(CandidateEducation.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CandidateEducation.class);

	}

	@Test
	public void testMetaCandidateReference() {

		MetaData<CandidateReference> meta = bullhornApiRest.getMetaData(CandidateReference.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CandidateReference.class);

	}

	@Test
	public void testMetaCandidateWorkHistory() {

		MetaData<CandidateWorkHistory> meta = bullhornApiRest.getMetaData(CandidateWorkHistory.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, CandidateWorkHistory.class);

	}

	@Test
	public void testMetaCategory() {

		MetaData<Category> meta = bullhornApiRest.getMetaData(Category.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Category.class);

	}

	@Test
	public void testMetaCertification() {

		MetaData<Certification> meta = bullhornApiRest.getMetaData(Certification.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Certification.class);

	}

	@Test
	public void testMetaClientContact() {

		MetaData<ClientContact> meta = bullhornApiRest.getMetaData(ClientContact.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, ClientContact.class);

	}

	@Test
	public void testMetaClientCorporation() {

		MetaData<ClientCorporation> meta = bullhornApiRest.getMetaData(ClientCorporation.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, ClientCorporation.class);

	}

	@Test
	public void testMetaCorporateUser() {

		MetaData<CorporateUser> meta = bullhornApiRest.getMetaData(CorporateUser.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CorporateUser.class);

	}

	@Test
	public void testMetaCorporationDepartment() {

		MetaData<CorporationDepartment> meta = bullhornApiRest.getMetaData(CorporationDepartment.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, CorporationDepartment.class);

	}

	@Test
	public void testMetaCountry() {

		MetaData<Country> meta = bullhornApiRest.getMetaData(Country.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Country.class);

	}

	@Test
	public void testMetaJobOrder() {

		MetaData<JobOrder> meta = bullhornApiRest.getMetaData(JobOrder.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, JobOrder.class);

	}

	@Test
	public void testMetaJobSubmission() {

		MetaData<JobSubmission> meta = bullhornApiRest.getMetaData(JobSubmission.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, JobSubmission.class);

	}

    @Test
    public void testMetaLead() {

        MetaData<Lead> meta = bullhornApiRest.getMetaData(Lead.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, Lead.class);

    }

	@Test
	public void testMetaNote() {

		MetaData<Note> meta = bullhornApiRest.getMetaData(Note.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Note.class);

	}

	@Test
	public void testMetaNoteEntity() {

		MetaData<NoteEntity> meta = bullhornApiRest.getMetaData(NoteEntity.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, NoteEntity.class);

	}

    @Test
    public void testMetaOpportunity() {

        MetaData<Opportunity> meta = bullhornApiRest.getMetaData(Opportunity.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, Opportunity.class);

    }

	@Test
	public void testMetaPlacement() {

		MetaData<Placement> meta = bullhornApiRest.getMetaData(Placement.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Placement.class);

	}

	@Test
	public void testMetaPlacementChangeRequest() {

		MetaData<PlacementChangeRequest> meta = bullhornApiRest.getMetaData(PlacementChangeRequest.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, PlacementChangeRequest.class);

	}

	@Test
	public void testMetaPlacementCommission() {

		MetaData<PlacementCommission> meta = bullhornApiRest.getMetaData(PlacementCommission.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, PlacementCommission.class);

	}

	@Test
	public void testMetaSendout() {

		MetaData<Sendout> meta = bullhornApiRest.getMetaData(Sendout.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Sendout.class);

	}

	@Test
	public void testMetaSkill() {

		MetaData<Skill> meta = bullhornApiRest.getMetaData(Skill.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Skill.class);

	}

	@Test
	public void testMetaSpecialty() {

		MetaData<Specialty> meta = bullhornApiRest.getMetaData(Specialty.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Specialty.class);

	}

	@Test
	public void testMetaState() {

		MetaData<State> meta = bullhornApiRest.getMetaData(State.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, State.class);

	}

	@Test
	public void testMetaTask() {

		MetaData<Task> meta = bullhornApiRest.getMetaData(Task.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Task.class);

	}

	@Test
	public void testMetaTimeUnit() {

		MetaData<TimeUnit> meta = bullhornApiRest.getMetaData(TimeUnit.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, TimeUnit.class);

	}

	private Set<String> getFieldSet() {
		return null;
		// Set<String> fieldSet = new LinkedHashSet<String>();
		// fieldSet.add("id");
		// return fieldSet;
	}

}
