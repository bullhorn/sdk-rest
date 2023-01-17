package com.bullhornsdk.data.api

import com.bullhornsdk.data.api.mock.MockDataHandler
import com.bullhornsdk.data.exception.RestApiException
import com.bullhornsdk.data.model.entity.core.standard.*
import org.apache.log4j.Logger
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


public class TestMockDataHandler {

    private final static Logger log = Logger.getLogger(TestMockDataHandler.class);
    private static MockDataHandler mockDataHandler;


    @BeforeAll
    public static void loadMockDataHandler(){
        this.mockDataHandler = new MockDataHandler();
    }

    @Test
    public void testSplit(){

        String path = "jobOrder(id,title,clientContact(id,name,clientCorporation(id,name)))";

        Set<String> test = new LinkedHashSet<String>();
        mockDataHandler.handleNestedPath(path,test);
        assert test == [
            'jobOrder.id',
            'jobOrder.title',
            'jobOrder.clientContact.id',
            'jobOrder.clientContact.name',
            'jobOrder.clientContact.clientCorporation.id',
            'jobOrder.clientContact.clientCorporation.name'] as Set;
    }

    @Test
    public void testSplitQueryStringOnAND_OR(){

        String query = "id:12 AND name:hello OR status:Approved and firstName:toad";
        Set<String> splitString = mockDataHandler.splitStringOnAND_OR(query);

        assert splitString.size() ==4;
    }

    @Test
    public void testRemoveParentheses(){

        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (test:test))";
        String noParentheses = mockDataHandler.removeParentheses(query);

        assert noParentheses == "id:12 AND name:hello OR status:Approved and firstName:toad and test:test";
    }

    @Test
    public void testRemoveParenthesesAndSplitQueryStringOnAND_OR(){

        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (test:test))";
        String noParentheses = mockDataHandler.removeParentheses(query);

        assert noParentheses == "id:12 AND name:hello OR status:Approved and firstName:toad and test:test";

        Set<String> splitString = mockDataHandler.splitStringOnAND_OR(noParentheses);

        assert splitString.size() ==5;
    }

    @Test
    public void testSplitStringOnColon(){

        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        String noParentheses = mockDataHandler.removeParentheses(query);

        assert noParentheses == "id:12 AND name:hello OR status:Approved and firstName:toad and owner.id:test";

        Set<String> splitString = mockDataHandler.splitStringOnAND_OR(noParentheses);

        Set<String> splitStringOnColon = mockDataHandler.splitEachStringOnColon(splitString);

        def correctValues = [
            'id',
            'name',
            'status',
            'firstName',
            'owner.id'] as LinkedHashSet<String>;

        assert splitStringOnColon == correctValues;
    }


    @Test
    public void testVerifySearchFieldsCandidateFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(idBooga:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, Candidate.class);
    }

    @Test
    public void testVerifySearchFieldsCandidatePass(){
        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, Candidate.class);
    }

    @Test
    public void testVerifySearchFieldsPlacementFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(idBooga:12 AND name:hello) OR ((status:Approved and candidate.firstName:test) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, Placement.class);
    }

    @Test
    public void testVerifySearchFieldsPlacementFail2(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(id:12 AND name:hello) OR ((status:Approved and candidate.firstName:test) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, Placement.class);
    }

    @Test
    public void testVerifySearchFieldsPlacementPass(){
        String query = "(id:12 AND jobOrder.title:hello) OR ((status:Approved and candidate.name:toad) and (candidate.id:1))";
        mockDataHandler.verifySearchFields(query, Placement.class);
    }


    @Test
    public void testVerifySearchFieldsClientContactFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(idBooga:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, ClientContact.class);
    }

    @Test
    public void testVerifySearchFieldsClientContactPass(){
        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, ClientContact.class);
    }

    @Test
    public void testVerifySearchFieldsClientCorporationFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(idBooga:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, ClientCorporation.class);
    }

    @Test
    public void testVerifySearchFieldsClientCorporationPass(){
        String query = "(id:12 AND name:hello) OR ((status:Approved and clientContacts.name:toad) and (customText1:test))";
        mockDataHandler.verifySearchFields(query, ClientCorporation.class);
    }

    @Test
    public void testVerifySearchFieldsJobOrderFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, JobOrder.class);
    }

    @Test
    public void testVerifySearchFieldsJobOrderPass(){
        String query = "(id:12 AND title:hello) OR ((status:Approved and clientContact.name:toad) and (customText1:test))";
        mockDataHandler.verifySearchFields(query, JobOrder.class);
    }


    @Test
    public void testVerifySearchFieldsJobSubmissionFail(){
        Assertions.assertThrows(IllegalArgumentException, { -> },"Illegal Argument Exception thrown" );
        String query = "(id:12 AND name:hello) OR ((status:Approved and firstName:toad) and (owner.id:test))";
        mockDataHandler.verifySearchFields(query, JobSubmission.class);
    }

    @Test
    public void testVerifySearchFieldsJobSubmissionPass(){
        String query = "(id:12 AND customText1:hello) OR ((status:Approved and candidate.name:toad) and (jobOrder.id:1))";
        mockDataHandler.verifySearchFields(query, JobSubmission.class);
    }
}
