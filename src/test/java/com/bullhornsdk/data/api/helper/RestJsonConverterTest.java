package com.bullhornsdk.data.api.helper;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.google.common.collect.Sets;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RestJsonConverterTest extends BaseTest {
    private Candidate candidate;

    @Before
    public void setUp() throws Exception {
        candidate = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), Sets.newHashSet("id", "firstName"));
    }

    @Test
    public void testConvertEntityToJsonString() {
        RestJsonConverter jsonConverter = new RestJsonConverter();
        JSONObject expected = new JSONObject("{\"id\": 1,\"firstName\": \"Want\"}");
        JSONObject result = new JSONObject(jsonConverter.convertEntityToJsonString(candidate));
        assertTrue("JSON conversion includes unexpected fields, or does not include expected fields", expected.similar(result));
    }

    @Test
    public void testConvertEntityToJsonStringWithNullBypass() {
        RestJsonConverter jsonConverter = new RestJsonConverter();
        JSONObject expected = new JSONObject("{\"id\": 1,\"firstName\": \"Want\", \"lastName\": null}");
        JSONObject result = new JSONObject(jsonConverter.convertEntityToJsonString(candidate, Sets.newHashSet("lastName")));
        assertTrue("JSON conversion includes unexpected fields, or does not include expected fields", expected.similar(result));
    }
}
