package com.bullhornsdk.data;

import org.junit.Before;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.api.mock.MockBullhornData;


public class BaseTest {

	
	public TestEntities testEntities;

	public BullhornData bullhornData;

	@Before
	public void scaffoldTests() {
		this.bullhornData = new MockBullhornData();
		this.testEntities = new TestEntities();
	}

}
