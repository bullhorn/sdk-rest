package com.bullhornsdk.data;

import com.bullhornsdk.data.model.entity.core.standard.FastFindResult;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * Tests the "fast find" request
 *
 * @author vzeltser
 *
 */

public class TestStandardBullhornApiRestFastFind extends BaseTest {
    private final Logger log = Logger.getLogger(TestStandardBullhornApiRestSearch.class);


    private FastFindParams fastFindParams;

    public TestStandardBullhornApiRestFastFind() {
        super();
        this.fastFindParams = ParamFactory.fastFindParams();
        fastFindParams.setCountPerEntity(20);
    }

    @Test
    public void testFastFindCandidate() {

        List<FastFindResult> result = bullhornData.fastFindForList("test", fastFindParams);

        Assertions.assertNotNull(result);

    }

}
