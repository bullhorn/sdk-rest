package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;

import java.util.Map;

import org.junit.Test;

import com.bullhornsdk.data.api.mock.MockDataLoader;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;


public class TestMockDataLoader {

	MockDataLoader dataLoader = new MockDataLoader();

	@Test
	public void testLoadData() {
		Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> testData = dataLoader.getEntityTestData();

		assertFalse(testData.isEmpty());
	}
	
}
