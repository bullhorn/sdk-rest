package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.exception.RestMappingException;
import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;
import com.bullhornsdk.data.model.enums.BullhornEntityInfo;
import com.bullhornsdk.data.model.response.file.standard.StandardFileContent;
import com.bullhornsdk.data.model.response.list.ListWrapper;
import com.bullhornsdk.data.model.response.single.StandardFileContentWrapper;
import com.bullhornsdk.data.model.response.single.StandardWrapper;
import com.bullhornsdk.data.model.response.single.Wrapper;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RestJsonConverterTest {
    RestJsonConverter restJsonConverter = new RestJsonConverter();

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

    @Test
    public void jsonToEntityTest() {
        Wrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.singleEntityJson, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(jobSubmissionWrapper.getData().getId(), new Integer(1));
        assertEquals(jobSubmissionWrapper.getData().getStatus(), "Approved");
    }

    @Test(expected = RestMappingException.class)
    public void jsonToEntityMultipleException() {
        this.restJsonConverter.jsonToEntity(this.singleEntityJson, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class));
    }

    @Test
    public void testJsonToEntityWithExtraParentProperty() {
        StandardWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.singleEntityJsonExtraProp, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(new Integer(1), jobSubmissionWrapper.getData().getId());
        assertEquals("Approved", jobSubmissionWrapper.getData().getStatus());
        assertEquals(1, jobSubmissionWrapper.getAdditionalProperties().get("total"));
    }

    @Test
    public void testJsonListToEntitiesWithExtraParentProperty() {
        ListWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.multipleEntityJsonExtraProp, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        assertEquals(new Integer(2), jobSubmissionWrapper.getTotal());
        assertEquals(2, jobSubmissionWrapper.getData().size());
    }

    @Test
    public void testJsonToMultipleEntity() {
        ListWrapper<JobSubmission> jobSubmissionWrapper = this.restJsonConverter.jsonToEntity(this.multipleEntityJson, BullhornEntityInfo.getTypesListWrapperType(JobSubmission.class));
        assertNotNull(jobSubmissionWrapper);
        assertNotNull(jobSubmissionWrapper.getData());
        List<JobSubmission> jobSubmissionList = jobSubmissionWrapper.getData();
        assertEquals(new Integer(1), jobSubmissionList.get(0).getId());
        assertEquals("Approved", jobSubmissionList.get(0).getStatus());
        assertEquals(new Integer(2), jobSubmissionList.get(1).getId());
        assertEquals("Not Submitted", jobSubmissionList.get(1).getStatus());
    }

    @Test(expected = RestMappingException.class)
    public void testJsonToMultipleEntityWithSingleDataWrapper() {
        this.restJsonConverter.jsonToEntity(this.multipleEntityJson, BullhornEntityInfo.getTypesWrapperType(JobSubmission.class));
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
}
