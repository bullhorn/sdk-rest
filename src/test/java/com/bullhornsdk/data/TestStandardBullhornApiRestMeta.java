package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;
import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;
import com.bullhornsdk.data.model.entity.core.standard.BusinessSector;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateCertification;
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
import com.bullhornsdk.data.model.entity.core.standard.DistributionList;
import com.bullhornsdk.data.model.entity.core.standard.JobBoardPost;
import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.entity.core.standard.Lead;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;
import com.bullhornsdk.data.model.entity.core.standard.Opportunity;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.core.standard.PlacementCertification;
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

		MetaData<Appointment> meta = bullhornData.getMetaData(Appointment.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Appointment.class);
	}

	private <T extends BullhornEntity> void runAssertions(MetaData<T> metaData, Class<T> type) {
		assertNotNull("metaData is null", metaData);
		assertNotNull("metaData.fields is null", metaData.getFields());
		assertTrue("problem with getting meta data for" + type.getSimpleName(), type.getSimpleName().equals(metaData.getEntity()));
	}

	@Test
	public void testMetaAppointmentAttendee() {

		MetaData<AppointmentAttendee> meta = bullhornData.getMetaData(AppointmentAttendee.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, AppointmentAttendee.class);

	}

	@Test
	public void testMetaBusinessSector() {

		MetaData<BusinessSector> meta = bullhornData.getMetaData(BusinessSector.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, BusinessSector.class);

	}

	@Test
	public void testMetaCandidate() {

		MetaData<Candidate> meta = bullhornData.getMetaData(Candidate.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Candidate.class);

	}

    @Test
    public void testMetaCandidateCertification() {

        MetaData<CandidateCertification> meta = bullhornData.getMetaData(CandidateCertification.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, CandidateCertification.class);

    }

	@Test
	public void testMetaCandidateEducation() {

		MetaData<CandidateEducation> meta = bullhornData.getMetaData(CandidateEducation.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CandidateEducation.class);

	}

	@Test
	public void testMetaCandidateReference() {

		MetaData<CandidateReference> meta = bullhornData.getMetaData(CandidateReference.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CandidateReference.class);

	}

	@Test
	public void testMetaCandidateWorkHistory() {

		MetaData<CandidateWorkHistory> meta = bullhornData.getMetaData(CandidateWorkHistory.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, CandidateWorkHistory.class);

	}

	@Test
	public void testMetaCategory() {

		MetaData<Category> meta = bullhornData.getMetaData(Category.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Category.class);

	}

	@Test
	public void testMetaCertification() {

		MetaData<Certification> meta = bullhornData.getMetaData(Certification.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Certification.class);

	}

	@Test
	public void testMetaClientContact() {

		MetaData<ClientContact> meta = bullhornData.getMetaData(ClientContact.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, ClientContact.class);

	}

	@Test
	public void testMetaClientCorporation() {

		MetaData<ClientCorporation> meta = bullhornData.getMetaData(ClientCorporation.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, ClientCorporation.class);

	}

	@Test
	public void testMetaCorporateUser() {

		MetaData<CorporateUser> meta = bullhornData.getMetaData(CorporateUser.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, CorporateUser.class);

	}

	@Test
	public void testMetaCorporationDepartment() {

		MetaData<CorporationDepartment> meta = bullhornData.getMetaData(CorporationDepartment.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, CorporationDepartment.class);

	}

	@Test
	public void testMetaCountry() {

		MetaData<Country> meta = bullhornData.getMetaData(Country.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Country.class);

	}

    @Test
    public void testMetaDistributionList() {

        MetaData<DistributionList> meta = bullhornData.getMetaData(DistributionList.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, DistributionList.class);

    }

	@Test
	public void testMetaJobOrder() {

		MetaData<JobOrder> meta = bullhornData.getMetaData(JobOrder.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, JobOrder.class);

	}

    @Test
    public void testMetaJobBoardPost() {

        MetaData<JobBoardPost> meta = bullhornData.getMetaData(JobBoardPost.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, JobBoardPost.class);

    }

	@Test
	public void testMetaJobSubmission() {

		MetaData<JobSubmission> meta = bullhornData.getMetaData(JobSubmission.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, JobSubmission.class);

	}

    @Test
    public void testMetaLead() {

        MetaData<Lead> meta = bullhornData.getMetaData(Lead.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, Lead.class);

    }

	@Test
	public void testMetaNote() {

		MetaData<Note> meta = bullhornData.getMetaData(Note.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Note.class);

	}

	@Test
	public void testMetaNoteEntity() {

		MetaData<NoteEntity> meta = bullhornData.getMetaData(NoteEntity.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, NoteEntity.class);

	}

    @Test
    public void testMetaOpportunity() {

        MetaData<Opportunity> meta = bullhornData.getMetaData(Opportunity.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, Opportunity.class);

    }

	@Test
	public void testMetaPlacement() {

		MetaData<Placement> meta = bullhornData.getMetaData(Placement.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Placement.class);

	}

    @Test
    public void testMetaPlacementCertification() {

        MetaData<PlacementCertification> meta = bullhornData.getMetaData(PlacementCertification.class, MetaParameter.FULL, this.getFieldSet());
        runAssertions(meta, PlacementCertification.class);

    }

	@Test
	public void testMetaPlacementChangeRequest() {

		MetaData<PlacementChangeRequest> meta = bullhornData.getMetaData(PlacementChangeRequest.class, MetaParameter.FULL,
				this.getFieldSet());
		runAssertions(meta, PlacementChangeRequest.class);

	}

	@Test
	public void testMetaPlacementCommission() {

		MetaData<PlacementCommission> meta = bullhornData.getMetaData(PlacementCommission.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, PlacementCommission.class);

	}

	@Test
	public void testMetaSendout() {

		MetaData<Sendout> meta = bullhornData.getMetaData(Sendout.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Sendout.class);

	}

	@Test
	public void testMetaSkill() {

		MetaData<Skill> meta = bullhornData.getMetaData(Skill.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Skill.class);

	}

	@Test
	public void testMetaSpecialty() {

		MetaData<Specialty> meta = bullhornData.getMetaData(Specialty.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Specialty.class);

	}

	@Test
	public void testMetaState() {

		MetaData<State> meta = bullhornData.getMetaData(State.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, State.class);

	}

	@Test
	public void testMetaTask() {

		MetaData<Task> meta = bullhornData.getMetaData(Task.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, Task.class);

	}

	@Test
	public void testMetaTimeUnit() {

		MetaData<TimeUnit> meta = bullhornData.getMetaData(TimeUnit.class, MetaParameter.FULL, this.getFieldSet());
		runAssertions(meta, TimeUnit.class);

	}

	private Set<String> getFieldSet() {
		return null;
		// Set<String> fieldSet = new LinkedHashSet<String>();
		// fieldSet.add("id");
		// return fieldSet;
	}

}
