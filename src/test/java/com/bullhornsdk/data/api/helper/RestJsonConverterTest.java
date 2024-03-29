package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.exception.RestMappingException;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.placement.PlacementCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.standard.*;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.enums.BullhornEntityInfo;
import com.bullhornsdk.data.model.response.file.standard.StandardFileContent;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.single.StandardFileContentWrapper;
import com.bullhornsdk.data.model.response.single.StandardWrapper;
import com.bullhornsdk.data.model.response.single.Wrapper;
import com.google.common.collect.Sets;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RestJsonConverterTest extends BaseTest {
    private RestJsonConverter restJsonConverter = new RestJsonConverter();
    private Candidate candidate;
    private Note note;

    private final String singleEntityJson = "{ \"data\": { \"id\": 1, \"status\":\"Approved\" }}";

    private final String singleEntityJsonExtraProp = "{ " +
        "\"total\": 1, " +
        "\"data\": { \"id\": 1, \"status\":\"Approved\" }}";

    private final String multipleEntityJson = "{ " +
        "\"data\": [" +
        "{ \"id\": 1, \"status\":\"Approved\" }, " +
        "{ \"id\": 2, \"status\":\"Not Submitted\" }" +
        "]}";

    private final String multipleEntityJsonExtraProp = "{ " +
        "\"total\": 2, " +
        "\"data\": [" +
        "{ \"id\": 1, \"status\":\"Approved\" }, " +
        "{ \"id\": 2, \"status\":\"Not Submitted\" }" +
        "]}";

    private final String standardFileContentJson = "{ " +
        "\"File\": { \"fileContent\": \"SomeContent\", \"name\":\"FileName\" }}";

    private final String standardFileContentJsonExtraProp = "{ " +
        "\"total\": 1, " +
        "\"File\": { \"fileContent\": \"SomeContent\", \"name\":\"FileName\" }}";

    @BeforeEach
    public void setUp() {
        candidate = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "firstName"));
        note = bullhornData.findEntity(Note.class, testEntities.getNoteId(), Sets.newHashSet("id"));
    }

    @Test
    public void testConvertEntityToJsonString() {
        RestJsonConverter jsonConverter = new RestJsonConverter();
        JSONObject expected = new JSONObject("{\"id\": 1,\"firstName\": \"Want\"}");
        JSONObject result = new JSONObject(jsonConverter.convertEntityToJsonString(candidate));
        assertTrue(expected.similar(result), "JSON conversion includes unexpected fields, or does not include expected fields");
    }

    @Test
    public void testConvertEntityToJsonStringWithNullBypass() {
        RestJsonConverter jsonConverter = new RestJsonConverter();
        JSONObject expected = new JSONObject("{\"id\": 1,\"firstName\": \"Want\", \"lastName\": null}");
        JSONObject result = new JSONObject(jsonConverter.convertEntityToJsonString(candidate, Sets.newHashSet("lastName")));
        assertTrue(expected.similar(result), "JSON conversion includes unexpected fields, or does not include expected fields");
    }

    @Test
    public void jsonToEntityTest() {
        Wrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.singleEntityJson, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(1, jobSubmissionWrapper.getData().getId());
        assertEquals("Approved", jobSubmissionWrapper.getData().getStatus());
    }

    @Test
    public void jsonToEntityMultipleException() {
        assertThrows(RestMappingException.class, () ->
            this.restJsonConverter.jsonToEntity(this.singleEntityJson, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class))
        );

    }

    @Test
    public void testJsonToEntityWithExtraParentProperty() {
        StandardWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.singleEntityJsonExtraProp, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(1, jobSubmissionWrapper.getData().getId());
        assertEquals("Approved", jobSubmissionWrapper.getData().getStatus());
        assertEquals(1, jobSubmissionWrapper.getAdditionalProperties().get("total"));
    }

    @Test
    public void testJsonListToEntitiesWithExtraParentProperty() {
        ListWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.multipleEntityJsonExtraProp, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class));

        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(2, jobSubmissionWrapper.getTotal());
        assertEquals(2, jobSubmissionWrapper.getData().size());

        List<JobSubmission> jobSubmissionList = jobSubmissionWrapper.getData();
        assertEquals(1, jobSubmissionList.get(0).getId());
        assertEquals("Approved", jobSubmissionList.get(0).getStatus());
        assertEquals(2, jobSubmissionList.get(1).getId());
        assertEquals("Not Submitted", jobSubmissionList.get(1).getStatus());
    }

    @Test
    public void testJsonToMultipleEntity() {
        ListWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.multipleEntityJson, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        List<JobSubmission> jobSubmissionList = jobSubmissionWrapper.getData();
        assertEquals(1, jobSubmissionList.get(0).getId());
        assertEquals("Approved", jobSubmissionList.get(0).getStatus());
        assertEquals(2, jobSubmissionList.get(1).getId());
        assertEquals("Not Submitted", jobSubmissionList.get(1).getStatus());
    }

    @Test
    public void testJsonToMultipleEntityWithSingleDataWrapper() {
        assertThrows(RestMappingException.class, () ->
            this.restJsonConverter.jsonToEntity(this.multipleEntityJson, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class))
        );
    }

    @Test
    public void testStandardFileContent() {
        StandardFileContentWrapper wrapper = this.restJsonConverter.jsonToEntity(this.standardFileContentJson, StandardFileContentWrapper.class);
        assertNotNull(wrapper);
        assertNotNull(wrapper.getFile());
        StandardFileContent file = wrapper.getFile();
        assertEquals("SomeContent", file.getFileContent());
        assertEquals("FileName", file.getName());
    }

    @Test
    public void testStandardFileContentWithExtraProp() {
        StandardFileContentWrapper wrapper = this.restJsonConverter.jsonToEntity(this.standardFileContentJsonExtraProp, StandardFileContentWrapper.class);
        assertNotNull(wrapper);
        assertNotNull(wrapper.getFile());
        StandardFileContent file = wrapper.getFile();
        assertEquals("SomeContent", file.getFileContent());
        assertEquals("FileName", file.getName());
    }

    @Test
    public void testOneToManySerializesToReplaceAll() {
        note.setPlacements(new OneToMany<>(new Placement(1)));
        JSONObject actual = new JSONObject(this.restJsonConverter.convertEntityToJsonString(note));
        JSONObject expected = new JSONObject("{\"placements\": {\"replaceAll\": [1]}, \"id\": 1}");
        assertTrue(actual.similar(expected), "JSON conversion did not conform to replaceAll standard");
    }

    @Test
    public void testOneToManySerializesToReplaceAllOnEmptyArray() {
        note.setPlacements(new OneToMany<>());
        JSONObject actual = new JSONObject(this.restJsonConverter.convertEntityToJsonString(note));
        JSONObject expected = new JSONObject("{\"placements\": {\"replaceAll\": []}, \"id\": 1}");
        assertTrue(actual.similar(expected), "JSON conversion did not conform to replaceAll standard");
    }

    @Test
    public void testOneToManySerializesToReplaceAllOnMultipleArray() {
        note.setPlacements(new OneToMany<>(new Placement(1), new Placement(2), new Placement(3)));
        JSONObject actual = new JSONObject(this.restJsonConverter.convertEntityToJsonString(note));
        JSONObject expected = new JSONObject("{\"placements\": {\"replaceAll\": [1, 2, 3]}, \"id\": 1}");
        assertTrue(actual.similar(expected), "JSON conversion did not conform to replaceAll standard");
    }

    @Test
    public void testRestOneToManySerializerDoesNotCollideWithReplaceAll() {
        Placement placement = new Placement(1);
        PlacementCustomObjectInstance1 placementCustomObjectInstance1 = new PlacementCustomObjectInstance1();
        placementCustomObjectInstance1.setId(2);
        placementCustomObjectInstance1.setText1("Test");
        placement.setCustomObject1s(new OneToMany<>(placementCustomObjectInstance1));
        JSONObject actual = new JSONObject(this.restJsonConverter.convertEntityToJsonString(placement));
        JSONObject expected = new JSONObject("{\"id\": 1, \"customObject1s\": [{\"id\": 2, \"text1\": \"Test\"}]}");
        assertTrue(actual.similar(expected), "OneToMany replaceAll serializer collided with RestOneToManySerializer");
    }

    @Test
    public void testReadOnlyAnnotationIgnoresFieldOnSerialization() {
        JobOrder jobOrder = new JobOrder(1);
        Placement placement = new Placement(2);
        jobOrder.setPlacements(new OneToMany<>(placement));
        JSONObject actual = new JSONObject(this.restJsonConverter.convertEntityToJsonString(jobOrder));
        JSONObject expected = new JSONObject("{\"id\": 1}");
        assertTrue(actual.similar(expected), "ReadOnly annotated field was included in payload");
    }
}
