package com.bullhornsdk.data;

import com.bullhornsdk.data.model.entity.core.standard.*;
import com.google.common.collect.Sets;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        Assertions.assertNotNull(response, "response is null");
        Assertions.assertFalse(response.hasValidationErrors(), "Validation failed");
        Assertions.assertFalse(response.isError(), "Insert failed");
        Assertions.assertTrue(response.getChangedEntityId() != null, "Note note added properly");

        Note addedNote = bullhornData.findEntity(Note.class, response.getChangedEntityId(), Sets.newHashSet("jobOrder(id)", "personReference(id)", "id"));
        Assertions.assertTrue(addedNote.getJobOrder().getId().equals(testEntities.getJobOrderId()));
        Assertions.assertTrue(addedNote.getPersonReference().getId().equals(testEntities.getCandidateId()));
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
        // set jobShifts to associate with jobShifts
        JobShift jobShift = new JobShift(testEntities.getJobShiftId());
        OneToMany<JobShift> jobShifts = new OneToMany<>(jobShift);
        note.setJobShifts(jobShifts);

        // set personReference to associate with Person
        Person personReference = new Person(testEntities.getCandidateId());
        note.setPersonReference(personReference);

        return note;
    }

}
