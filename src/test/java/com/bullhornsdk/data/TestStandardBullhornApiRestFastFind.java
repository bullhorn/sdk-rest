package com.bullhornsdk.data;

import com.bullhornsdk.data.model.entity.core.standard.FastFindResult;
import com.bullhornsdk.data.model.parameter.FastFindParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Tests the "fast find" request
 * 
 * @author vzeltser
 * 
 */

public class TestStandardBullhornApiRestFastFind extends BaseTest {
	private final Logger log = LogManager.getLogger(TestStandardBullhornApiRestSearch.class);


	private FastFindParams fastFindParams;

	public TestStandardBullhornApiRestFastFind() {
		super();
		this.fastFindParams = ParamFactory.fastFindParams();
		fastFindParams.setCountPerEntity(20);
	}

	@Test
	public void testFastFindCandidate() {

		List<FastFindResult> result = bullhornData.fastFindForList("test", fastFindParams);

		assertNotNull(result);

	}

}
