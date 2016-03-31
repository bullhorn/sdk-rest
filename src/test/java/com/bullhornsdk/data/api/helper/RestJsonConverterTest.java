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
        InputStream candidateInputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("candidate_with_confidential_fields.json");
        StringWriter strWriter = new StringWriter();
        IOUtils.copy(candidateInputStream, strWriter, "UTF-8");
        String jsonCandidate = strWriter.toString();
//        System.out.println("before: " + jsonCandidate);
//        jsonCandidate = jsonCandidate.replaceAll("\\*\\*CONFIDENTIAL\\*\\*", "");
//        System.out.println("**********************************************");
//        System.out.println("after: " + jsonCandidate);
        Candidate entity = jsonConverter.jsonToEntityUnwrapRoot(jsonCandidate, Candidate.class);
        assertNotNull(entity);
        
    }
}
