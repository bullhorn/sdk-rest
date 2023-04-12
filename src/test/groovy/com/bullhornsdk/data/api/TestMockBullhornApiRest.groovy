package com.bullhornsdk.data.api

import com.bullhornsdk.data.api.mock.MockBullhornData
import com.bullhornsdk.data.model.response.resume.ParsedResumeAsEntity;


import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils
import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.core.io.ClassPathResource
import org.springframework.mock.web.MockMultipartFile
import org.springframework.util.FileCopyUtils
import org.springframework.web.client.HttpStatusCodeException
import org.springframework.web.multipart.MultipartFile
import com.bullhornsdk.data.BaseTest
import com.bullhornsdk.data.exception.RestApiException
import com.bullhornsdk.data.model.entity.association.AssociationFactory
import com.bullhornsdk.data.model.entity.core.standard.Candidate
import com.bullhornsdk.data.model.entity.core.standard.JobOrder
import com.bullhornsdk.data.model.entity.core.standard.Note
import com.bullhornsdk.data.model.entity.core.standard.Person
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.standard.Placement
import com.bullhornsdk.data.model.entity.embedded.OneToMany
import com.bullhornsdk.data.model.entity.meta.MetaData
import com.bullhornsdk.data.model.enums.MetaParameter
import com.bullhornsdk.data.model.parameter.CorpNotesParams
import com.bullhornsdk.data.model.parameter.FileParams
import com.bullhornsdk.data.model.parameter.QueryParams
import com.bullhornsdk.data.model.parameter.SearchParams
import com.bullhornsdk.data.model.parameter.standard.ParamFactory
import com.bullhornsdk.data.model.response.crud.CrudResponse
import com.bullhornsdk.data.model.response.crud.UpdateResponse
import com.bullhornsdk.data.model.response.file.FileContent
import com.bullhornsdk.data.model.response.file.FileWrapper
import com.bullhornsdk.data.model.response.list.ListWrapper
import com.bullhornsdk.data.model.response.resume.ParsedResume

public class TestMockBullhornApiRest extends BaseTest {


    private final static Integer JOB_ORDER_ID = 1;
    private final static Integer CANDIDATE_ID = 1;
    private final static Integer NON_EXISTING_JOB = 12345;

    private MockBullhornData mockBullhornApiRest;

    private final static String FILE_NAME = "Amy L";

    private final static String FILE_ENDING = "txt";

    private final static String FULL_FILE_NAME = FILE_NAME + "." + FILE_ENDING;

    ParsedResume parsedResume;

    @BeforeEach
    public void instantiateMockBullhornApiRest(){
        this.mockBullhornApiRest = new MockBullhornData();
    }

    @Test
    public void testMockBullhornApiRest() {
        assert mockBullhornApiRest != null;
    }

    @Test
    public void testRefreshTestData() {
        mockBullhornApiRest.refreshTestData();
    }

    @Test
    public void testFindEntityClassOfTInteger() {
        JobOrder job = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id" ] as Set);
        assert job.getId() == JOB_ORDER_ID;
    }

    @Test
    public void testFindEntityFail() {
        Assertions.assertThrows(RestApiException, { ->
            JobOrder job = mockBullhornApiRest.findEntity(JobOrder.class, NON_EXISTING_JOB, [ "id" ] as Set);
        },"REST API Exception thrown" );

    }

    @Test
    public void testFindEntityFailWithFields() {
        Assertions.assertThrows(RestApiException, { ->
            JobOrder job = mockBullhornApiRest.findEntity(JobOrder.class, NON_EXISTING_JOB,null);
        },"REST API Exception thrown" );
    }

    @Test
    public void testFindEntityClassOfTIntegerSetOfString() {
        JobOrder job = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID,[
            "id",
            "title",
            "clientContact(id,firstName,name,email)"
        ] as Set);
        assert job.getId() ==JOB_ORDER_ID;
        assert job.getTitle() == 'Job1';
        assert job.getSalary() == null;
        assert job.getClientContact().getId() == 1;
        assert job.getClientContact().getFirstName() == 'Mr Toad';
        assert job.getClientContact().getName() == 'Mr Toad';
        assert job.getClientContact().getEmail() == 'testemail@test.com';
        assert job.getClientContact().getLastName() == null;
    }

    @Test
    public void testFindEntityWithNestedEntity_noFieldsSpecifiedOnNestedEntity_job() {
        JobOrder job = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID,[
            "id",
            "title",
            "clientContact"
        ] as Set);
        assert job.getId() ==JOB_ORDER_ID;
        assert job.getTitle() == 'Job1';
        assert job.getSalary() == null;
        assert job.getClientContact().getId() == 1;
        assert job.getClientContact().getFirstName() == 'Mr Toad';
        assert job.getClientContact().getLastName() == 'Manager';
        assert job.getClientContact().getEmail() == null;
    }

    @Test
    public void testFindEntityWithNestedEntity_noFieldsSpecifiedOnNestedEntity_candidate() {
        Candidate candidate = mockBullhornApiRest.findEntity(Candidate.class, CANDIDATE_ID,[
            "id",
            "name",
            "owner"
        ] as Set);
        assert candidate.getId() ==CANDIDATE_ID;
        assert candidate.getName() == 'Want Jobs';
        assert candidate.getFirstName() == null;
        assert candidate.getOwner() != null;
        assert candidate.getOwner().getId() == 1;
        assert candidate.getOwner().getFirstName() == 'ChrisC';
        assert candidate.getOwner().getLastName() == 'SandboxPS';
    }

    @Test
    public void testQueryForList1() {

        QueryParams params = ParamFactory.queryParams();
        List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id>10", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.size() == 10;
    }

    @Test
    public void testQueryForList2() {

        QueryParams params = ParamFactory.queryParams();
        params.setCount(5);
        List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id>10", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.size() == 5;
    }

    @Test
    public void testQueryForListWithIn() {

        QueryParams params = ParamFactory.queryParams();
        List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id>10 AND status IN ('Submitted','Placed')", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.size() == 5;
    }


    @Test
    public void testQuery1() {
        QueryParams params = ParamFactory.queryParams();
        ListWrapper<JobOrder> jobs = mockBullhornApiRest.query(JobOrder.class, "id>10", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.getData().each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.getData().size() == 10;
        assert jobs.getCount() == 10;
    }

    @Test
    public void testQuery2() {
        QueryParams params = ParamFactory.queryParams();
        params.setCount(5);
        ListWrapper<JobOrder> jobs = mockBullhornApiRest.query(JobOrder.class, "id>10", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.getData().each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.getData().size() == 5;
        assert jobs.getCount() == 5;
    }

    @Test
    public void testQueryForAllRecords1() {
        QueryParams params = ParamFactory.queryParams();
        params.setCount(2);
        ListWrapper<JobOrder> jobs = mockBullhornApiRest.queryForAllRecords(JobOrder.class, "id>0", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);

        jobs.getData().each {
            assert it.getId() != null;
            assert it.getTitle() != null;
            assert it.getSalary() == null;
            assert it.getClientContact().getId() != null;
            assert it.getClientContact().getFirstName() != null;
            assert it.getClientContact().getLastName() == null;
        }

        assert jobs.getData().size() == 20;
        assert jobs.getCount() == 20;
    }

    @Test
    public void testSearchForList1() {
        //mock search returns all values of type T
        List<JobOrder> jobs = mockBullhornApiRest.searchForList(JobOrder.class, "id:1*", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, null);


        assert jobs.size() == 20;
    }

    @Test
    public void testSearchForList2() {
        SearchParams params = ParamFactory.searchParams();
        params.setCount(10);
        //mock search returns all values of type T
        List<JobOrder> jobs = mockBullhornApiRest.searchForList(JobOrder.class, "id:1*", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, params);


        assert jobs.size() == 10;
    }


    @Test
    public void testSearch() {
        ListWrapper<JobOrder> jobs = mockBullhornApiRest.search(JobOrder.class, "id:1*", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, null);


        assert jobs.getData().size() == 20;
        assert jobs.getCount() == 20;
    }



    @Test
    public void testSearchForAllRecords() {
        SearchParams params = ParamFactory.searchParams();
        params.setCount(2);
        ListWrapper<JobOrder> jobs = mockBullhornApiRest.search(JobOrder.class, "id:1*", [
            "id",
            "title",
            "clientContact(id,firstName)"
        ] as Set, null);


        assert jobs.getData().size() == 20;
        assert jobs.getCount() == 20;
    }


    @Test
    public void testGenericUpdate() {
        String newStatus = "STABLE";
        JobOrder preUpdateEntity = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id", "status" ] as Set);

        JobOrder update = new JobOrder(JOB_ORDER_ID);

        update.setStatus(newStatus);
        UpdateResponse response = mockBullhornApiRest.updateEntity(update);
        JobOrder updatedEntity = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id", "status" ] as Set);

        updatedEntity.setStatus(preUpdateEntity.getStatus());

        Assertions.assertEquals(updatedEntity, preUpdateEntity);
    }

    @Test
    public void testGenericUpdateFail() {
        Assertions.assertThrows(RestApiException, { ->
            String newStatus = "STABLE";
            JobOrder preUpdateEntity = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id", "status" ] as Set);

            JobOrder update = new JobOrder(NON_EXISTING_JOB);

            update.setStatus(newStatus);
            UpdateResponse response = mockBullhornApiRest.updateEntity(update);
            JobOrder updatedEntity = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id", "status" ] as Set);

            updatedEntity.setStatus(preUpdateEntity.getStatus());

            Assertions.assertEquals(updatedEntity, preUpdateEntity);
        },"REST API Exception thrown" );
    }




    @Test
    public void testInsertEntity() {

        JobOrder entity = mockBullhornApiRest.findEntity(JobOrder.class, JOB_ORDER_ID, [ "id" ] as Set);

        entity.setId(null)

        CrudResponse response = mockBullhornApiRest.insertEntity(entity);

        JobOrder justInsertedEntity = mockBullhornApiRest.findEntity(JobOrder.class, response.getChangedEntityId(), [ "id" ] as Set);

        QueryParams params = ParamFactory.queryParams();
        params.setCount(50);
        List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id>=1",["*"] as Set, params);

        assert justInsertedEntity.getId() == jobs.size();

        justInsertedEntity.setId(JOB_ORDER_ID);
        entity.setId(JOB_ORDER_ID);
        assert justInsertedEntity.equals(entity);
    }

    @Test
    public void testDeleteEntity() {
        mockBullhornApiRest.deleteEntity(JobOrder.class, JOB_ORDER_ID);

        List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id="+JOB_ORDER_ID+" AND isDeleted=false",["*"] as Set, null);

        assert jobs.isEmpty();
    }


    @Test
    public void testDeleteEntityFail() {
        Assertions.assertThrows(RestApiException, { ->
            mockBullhornApiRest.deleteEntity(JobOrder.class, NON_EXISTING_JOB);

            List<JobOrder> jobs = mockBullhornApiRest.queryForList(JobOrder.class, "id="+JOB_ORDER_ID+" AND isDeleted=false",["*"] as Set, null);

            assert jobs.isEmpty();
        },"REST API Exception thrown" );
    }

    @Test
    public void testGetMetaData() {
        MetaData<JobOrder> meta = bullhornData.getMetaData(JobOrder.class, MetaParameter.FULL,null);
        runAssertionsOnMetaData(meta, JobOrder.class);
    }

    private <T extends BullhornEntity> void runAssertionsOnMetaData(MetaData<T> metaData, Class<T> type) {
        Assertions.assertNotNull(metaData, "metaData is null");
        Assertions.assertNotNull(metaData.getFields(), "metaData.fields is null");
        Assertions.assertTrue(type.getSimpleName().equals(metaData.getEntity()), "problem with getting meta data for" + type.getSimpleName());
    }

    @Test
    public void testGetBhRestToken() {
        String restToken = mockBullhornApiRest.getBhRestToken();
        assert restToken != null;
    }

    @Test
    public void testGetRestUrl() {
        String restUrl = mockBullhornApiRest.getRestUrl();
        assert restUrl != null;
    }

    @Test
    public void testParseResumeFile() {

        MultipartFile resume = getResume();
        ParsedResume parsedResume = mockBullhornApiRest.parseResumeFile(resume, ParamFactory.resumeFileParseParams());
        assertParsedResume(parsedResume);
    }

    @Test
    public void testParseResumeText() {
        MultipartFile resume = getResume();
        String resumeText = new String(resume.getBytes(), "UTF-8");

        ParsedResume parsedResume = mockBullhornApiRest.parseResumeText(resumeText, ParamFactory.resumeTextParseParams());
        assertParsedResume(parsedResume);
    }

    @Test
    public void testParseResumeAsNewCandidateFile() {
        MultipartFile resume = getResume();
        ParsedResumeAsEntity parsedResumeAsEntity = mockBullhornApiRest.parseResumeAsNewCandidate(resume, ParamFactory.resumeAsNewEntityParams());
        assertParsedResumeAsEntity(parsedResumeAsEntity);
    }

    @Test
    public void testSaveParsedResumeDataToBullhorn() {
        MultipartFile resume = getResume();
        ParsedResume parsedResume = mockBullhornApiRest.parseResumeFile(resume, ParamFactory.resumeFileParseParams());
        assertParsedResume(parsedResume);

        ParsedResume savedParsedResume = mockBullhornApiRest.saveParsedResumeDataToBullhorn(parsedResume);
        Assertions.assertNotNull(savedParsedResume.getCandidate().getId(), "ParsedResume.candidate.id is null");
        this.parsedResume = savedParsedResume;
    }

    @Test
    public void testParseResumeThenAddfile() {
        MultipartFile resume = getResume();

        ParsedResume parsedResume = mockBullhornApiRest.parseResumeThenAddfile(Candidate.class, testEntities.getCandidateId(), resume,
            "portfolio", ParamFactory.fileParams(), ParamFactory.resumeFileParseParams());
        assertParsedResume(parsedResume);
        assertFileWrapperIncludingFileName(parsedResume.getFileWrapper());
    }

    @Test
    public void testAddFile() {
        mockBullhornApiRest.addFile(JobOrder.class, JOB_ORDER_ID, getResume(), FILE_ENDING, null)
    }

    @Test
    public void testGetFileContent() {
        try {
            FileContent fileContent = mockBullhornApiRest.getFileContent(Candidate.class, testEntities.getCandidateId(), 1);
            Assertions.assertNotNull(fileContent, "FileContent is null");
            Assertions.assertNotNull(fileContent.getContentType(), "FileContent is null");
            Assertions.assertNotNull(fileContent.getName(), "FileContent is null");
            Assertions.assertNotNull(fileContent.getFileContent(), "FileContent is null");
        } catch (HttpStatusCodeException error) {
            Assertions.assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
        }
    }

    @Test
    public void testGetFileMetaData() {
        mockBullhornApiRest.getFileMetaData(JobOrder.class, JOB_ORDER_ID);
    }

    @Test
    public void testGetFile() {
        mockBullhornApiRest.getFile(JobOrder.class, JOB_ORDER_ID, 1);
    }

    @Test
    public void testGetAllFiles() {
        mockBullhornApiRest.getAllFiles(JobOrder.class, JOB_ORDER_ID);
    }

    @Test
    public void testAddFileClassOfQextendsFileEntityIntegerMultipartFileStringFileParams() {
        FileParams params = ParamFactory.fileParams();

        mockBullhornApiRest.addFile(JobOrder.class, JOB_ORDER_ID, getFile(), "Resume", params);
    }

    @Test
    public void testAddResumeFileAndPopulateCandidateDescription() {
        mockBullhornApiRest.addResumeFileAndPopulateCandidateDescription(CANDIDATE_ID, getFile(), "A description on the candidate record", "Resume", null);
    }

    @Test
    public void testDeleteFile() {
        mockBullhornApiRest.deleteFile(JobOrder.class, JOB_ORDER_ID, 1);
    }

    @Test
    public void testAssociateWithEntity() {
        mockBullhornApiRest.associateWithEntity(JobOrder.class, JOB_ORDER_ID, AssociationFactory.jobOrderAssociations.categories, [1, 2, 3, 4, 5] as Set);
    }

    @Test
    public void testDisassociateWithEntity() {
        mockBullhornApiRest.disassociateWithEntity(JobOrder.class, JOB_ORDER_ID, AssociationFactory.jobOrderAssociations.categories, [1, 2, 3, 4, 5] as Set);
    }

    @Test
    public void testGetAssociation() {
        mockBullhornApiRest.getAssociation(Category.class, [1, 2, 3, 4, 5] as Set, AssociationFactory.categoryAssociations.skills, null, null);
    }

    @Test
    public void testGetAllAssociations() {
        mockBullhornApiRest.getAllAssociations(Category.class, [1, 2, 3, 4, 5] as Set, AssociationFactory.categoryAssociations.skills, null, null);
    }

    @Test
    public void testGetAllCorpNotes() {
        CorpNotesParams params = ParamFactory.corpNotesParams();
        List<Note> notes = mockBullhornApiRest.getAllCorpNotes(1, ["id"] as Set, params);

        assert notes != null;
    }

    @Test
    public void testAddNoteAndAssociateWithEntity() {

        Note note = getNote();

        CrudResponse response = mockBullhornApiRest.addNoteAndAssociateWithEntity(note);

        runAssertionsAddNoteAsserstions(response);
    }

    private void runAssertionsAddNoteAsserstions(CrudResponse response) {
        Assertions.assertNotNull(response, "response is null");
        Assertions.assertFalse(response.hasValidationErrors(), "Validation failed");
        Assertions.assertFalse(response.isError(), "Insert failed");
        Assertions.assertTrue(response.getChangedEntityId() != null, "Note note added properly");

        Note addedNote = mockBullhornApiRest.findEntity(Note.class, response.getChangedEntityId(), [ "id", "jobOrder(id)", "personReference(id)" ] as Set);
        Assertions.assertTrue(addedNote.getJobOrder().getId().equals(testEntities.getJobOrderId()));
        Assertions.assertTrue(addedNote.getPersonReference().getId().equals(testEntities.getCandidateId()));
    }



    private Note getNote() {
        Note note = new Note();
        note.setComments("Adding from unit test on " + DateTime.now().toString(ISODateTimeFormat.basicOrdinalDateTimeNoMillis()));
        note.setAction("Inteview Scheduled");
        note.setIsDeleted(false);
        //the note has to have a commentingPerson
        Person commentingPerson = new Person(testEntities.getCorporateUserId());
        note.setCommentingPerson(commentingPerson);
        //set job to associate with job
        JobOrder job = new JobOrder(testEntities.getJobOrderId());
        note.setJobOrder(job);
        //set placements to associate with placements
        Placement placement = new Placement(testEntities.getPlacementId());
        OneToMany<Placement> placements = new OneToMany<Placement>(placement);
        note.setPlacements(placements);

        //set personReference to associate with Person
        Person personReference = new Person(testEntities.getCandidateId());
        note.setPersonReference(personReference);

        return note;
    }


    private MultipartFile getResume() {
        ClassPathResource cpr = new ClassPathResource("testdata/"+FILE_NAME + "." + FILE_ENDING);

        MultipartFile file = null;
        try {

            file = new MockMultipartFile(FILE_NAME + "." + FILE_ENDING, cpr.getFilename(), FILE_ENDING, cpr.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


        return file;
    }

    private void assertParsedResume(ParsedResume parsedResume) {
        Assertions.assertNotNull(parsedResume, "ParsedResume is null");
        Assertions.assertFalse(parsedResume.isError(), "Error parsing resume" + parsedResume.getErrorMessage());
        Assertions.assertNotNull(parsedResume.getCandidate(), "ParsedResume.candidate is null");
        Assertions.assertNotNull(parsedResume.getCandidateEducation(), "ParsedResume.candidateEducation is null");
        Assertions.assertNotNull(parsedResume.getCandidateWorkHistory(),"ParsedResume.candidateWorkHistory is null");
        Assertions.assertNotNull(parsedResume.getSkillList(), "ParsedResume.skillList is null");
    }

    private void assertParsedResumeAsEntity(ParsedResumeAsEntity parsedResumeAsEntity) {
        Assertions.assertNotNull(parsedResumeAsEntity, "ParsedResumeAsEntity is null");
        Assertions.assertEquals("Candidate", parsedResumeAsEntity.getEntityName(), "ParsedResumeAsEntity.entityName not equal to Candidate");
        Assertions.assertEquals(1, parsedResumeAsEntity.getEntityId(), "ParsedResumeAsEntity.entityId not equal to 1");
        Assertions.assertTrue(parsedResumeAsEntity.getIsSuccess(), "ParsedResumeAsEntity.isSuccess is not true");
        Assertions.assertFalse(parsedResumeAsEntity.getIsDuplicate(), "ParsedResumeAsEntity.isDuplicate is not false");
        Assertions.assertNull(parsedResumeAsEntity.getErrorMessage(), "ParsedResumeAsEntity.errorMessage is not null ");
        Assertions.assertNull(parsedResumeAsEntity.getDuplicateEntityIds(), "ParsedResumeAsEntity.duplicateEntityIds is not null");
    }

    private void assertFileWrapperIncludingFileName(FileWrapper fileWrapper) {
        Assertions.assertNotNull(fileWrapper, "fileWrapper is null");
        File file = fileWrapper.getFile();
        Assertions.assertNotNull(file, "file is null");
        byte[] fileContentAsByteArray = fileWrapper.getFileContentAsByteArray();
        Assertions.assertNotNull(fileContentAsByteArray, "fileContentAsByteArray is null");

        Assertions.assertTrue(FULL_FILE_NAME.equals(fileWrapper.getName()), "File name incorrectly saved in bullhorn");
    }



    private File getFile() throws IOException {
        MultipartFile multipartFile = getResume();
        String newFolderPath = FileUtils.getTempDirectoryPath() + "/" + System.currentTimeMillis();

        File newFolder = new File(newFolderPath);

        FileUtils.forceMkdir(newFolder);

        String originalFileName = multipartFile.getOriginalFilename();
        String filePath = newFolderPath + "/" + originalFileName;
        File file = new File(filePath);

        FileCopyUtils.copy(multipartFile.getBytes(), file);

        return file;
    }
}
