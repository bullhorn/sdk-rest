package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.standard.Note;
import com.bullhornsdk.data.model.entity.core.standard.Person;
import com.bullhornsdk.data.model.entity.core.standard.Placement;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.response.crud.CrudResponse;

public class TestStandardBullhornApiRestNoteAdd extends BaseTest {
	
	public TestStandardBullhornApiRestNoteAdd() {
		super();
	}

	@Test
	public void testAddNoteAndAssociateToEntity() {

		Note note = getNote();

		CrudResponse response = bullhornData.addNoteAndAssociateWithEntity(note);

		runAssertions(response);
	}

	private void runAssertions(CrudResponse response) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertFalse("Insert failed", response.isError());
		assertTrue("Note note added properly", response.getChangedEntityId() != null);

		Note addedNote = bullhornData.findEntity(Note.class, response.getChangedEntityId());
		assertTrue(addedNote.getJobOrder().getId().equals(testEntities.getJobOrderId()));
		assertTrue(addedNote.getPersonReference().getId().equals(testEntities.getCandidateId()));
	}

	private Note getNote() {
		Note note = new Note();
		note.setComments("Adding from unit test on " + DateTime.now().toString(ISODateTimeFormat.basicOrdinalDateTimeNoMillis()));
		note.setAction("Inteview Scheduled");
		note.setIsDeleted(false);
		// the note has to have a commentingPerson
		Person commentingPerson = new Person(testEntities.getCorporateUserId());
		note.setCommentingPerson(commentingPerson);
		// set job to associate with job
		JobOrder job = new JobOrder(testEntities.getJobOrderId());
		note.setJobOrder(job);
		// set placements to associate with placements
		Placement placement = new Placement(testEntities.getPlacementId());
		OneToMany<Placement> placements = new OneToMany<Placement>(placement);
		note.setPlacements(placements);

		// set personReference to associate with Person
		Person personReference = new Person(testEntities.getCandidateId());
		note.setPersonReference(personReference);

		return note;
	}

}
