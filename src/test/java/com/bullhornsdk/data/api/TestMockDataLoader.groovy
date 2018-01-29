package com.bullhornsdk.data.api

import com.bullhornsdk.data.api.mock.MockDataLoader
import com.bullhornsdk.data.api.mock.MockSearchField
import com.bullhornsdk.data.model.entity.core.edithistory.EditHistory
import com.bullhornsdk.data.model.entity.core.edithistory.FieldChange
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity
import com.bullhornsdk.data.model.entity.core.type.SearchEntity
import com.bullhornsdk.data.model.entity.meta.MetaData
import org.apache.log4j.Logger
import org.junit.Test

import static org.junit.Assert.assertFalse

public class TestMockDataLoader {

	private final static Logger log = Logger.getLogger(TestMockDataHandler.class);
	private MockDataLoader mockDataLoader = new MockDataLoader();


    @Test
    public void testLoadData() {
        Map<Class<? extends BullhornEntity>, Map<Integer, ? extends BullhornEntity>> testData = mockDataLoader.getEntityTestData();

        assertFalse(testData.isEmpty());
    }

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

	@Test
	public void testGetEditHistory(){

		List<EditHistory> result = mockDataLoader.getEditHistoryList();
		assertFalse(result.isEmpty());

	}

	@Test
	public void testGetEditHistoryFieldChange(){

		List<FieldChange> result = mockDataLoader.getEditHistoryFieldChangeList();
		assertFalse(result.isEmpty());

	}
}
