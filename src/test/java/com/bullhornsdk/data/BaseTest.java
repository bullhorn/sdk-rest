package com.bullhornsdk.data;

import org.junit.Before;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;


public class BaseTest {

	
	public TestEntities testEntities;

	public BullhornData bullhornApiRest;

	@Before
	public void scaffoldTests() {
		this.bullhornApiRest = new MockBullhornData();
		this.testEntities = new TestEntities();
	}

}
