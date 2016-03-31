package com.bullhornsdk.data.api.helper;

import static org.junit.Assert.assertNotNull;

import java.io.InputStream;
import java.io.StringWriter;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;

public class RestJsonConverterTest {

    private RestJsonConverter jsonConverter = new RestJsonConverter();
    
    @Test
    public void testBasicParse() throws Exception { 
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("candidate_example.json");
        StringWriter writer = new StringWriter();
        IOUtils.copy(is, writer, "UTF-8");
        String jsonCandidate = writer.toString();
//        System.out.println("before: " + jsonCandidate);
//        jsonCandidate = jsonCandidate.replaceAll("\\*\\*CONFIDENTIAL\\*\\*", "");
//        System.out.println("**********************************************");
//        System.out.println("after: " + jsonCandidate);
        Candidate entity = jsonConverter.jsonToEntityUnwrapRoot(jsonCandidate, Candidate.class);
        assertNotNull(entity);
        
    }
}
