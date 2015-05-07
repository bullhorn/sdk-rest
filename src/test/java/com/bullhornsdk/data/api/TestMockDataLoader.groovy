package com.bullhornsdk.data.api;

import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.junit.Test

import com.bullhornsdk.data.api.mock.MockDataLoader
import com.bullhornsdk.data.api.mock.MockSearchField
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.meta.MetaData



public class TestMockDataLoader {

	private final static Log log = LogFactory.getLog(TestMockDataHandler.class);
	private MockDataLoader mockDataLoader = new MockDataLoader();


	@Test
	public void testLoadEntityData(){

		Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> entityData = mockDataLoader.getEntityTestData();

		entityData.each { key,value ->
			assert value.size() >= 20;
		}
		
		
		Map<String,String> fileNames = mockDataLoader.getEntityFileNames();

		fileNames.each{key,value ->
			assert entityData.get(key) != null;
			assert value.size() > 0;
			
		}
	
	}
	
	
	@Test
	public void testLoadMetaTestData(){

		Map<Class<? extends BullhornEntity>, MetaData<?>> metaData = mockDataLoader.getMetaTestData();

		metaData.each { key,value ->
			assert value.getEntity().equals(key.getSimpleName());
		}
		
		Map<String,String> fileNames = mockDataLoader.getMetaDataFileNames();

		fileNames.each{key,value ->
			assert metaData.get(key) != null;
			assert value.size() > 0;
			
		}
	
	}
	
	
	@Test
	public void testLoadSearchFieldData(){

		Map<Class<? extends SearchEntity>, List<MockSearchField>> searchFields = mockDataLoader.getSearchFields();

		searchFields.each { key,value ->
			assert value.size() > 0;
		}
		
		Map<String,String> fileNames = mockDataLoader.getSearchFieldFileNames()

		fileNames.each{key,value ->
			assert searchFields.get(key) != null;
			assert value.size() > 0;
			
		}
	
	}
	
	
}
