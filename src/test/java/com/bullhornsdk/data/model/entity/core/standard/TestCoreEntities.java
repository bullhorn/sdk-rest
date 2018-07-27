package com.bullhornsdk.data.model.entity.core.standard;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.bullhornsdk.data.BaseTest;
import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.enums.BullhornEntityInfo;

public class TestCoreEntities extends BaseTest {

	Map<Class<? extends BullhornEntity>, BullhornEntity> one = new HashMap<Class<? extends BullhornEntity>, BullhornEntity>();
	Map<Class<? extends BullhornEntity>, BullhornEntity> two = new HashMap<Class<? extends BullhornEntity>, BullhornEntity>();

	private final int id = 1;
	
	public void load() {
		for (BullhornEntityInfo bullhornEntityInfo : BullhornEntityInfo.values()) {
			if(bullhornEntityInfo.getType() != null){
				one.put(bullhornEntityInfo.getType(), bullhornData.findEntity(bullhornEntityInfo.getType(), id));
			}
			
		}

		for (BullhornEntityInfo bullhornEntityInfo : BullhornEntityInfo.values()) {
			if(bullhornEntityInfo.getType() != null){
				two.put(bullhornEntityInfo.getType(), bullhornData.findEntity(bullhornEntityInfo.getType(), id));
			}
		}
	}

	@Test
	public void testEquals() {
		load();
		for(Entry<Class<? extends BullhornEntity>, BullhornEntity> m : one.entrySet()){
			checkEquals(m.getValue(),two.get(m.getKey()));
		}
	}
	
	@Test
	public void testToString() {
		load();
		for(Entry<Class<? extends BullhornEntity>, BullhornEntity> m : one.entrySet()){
			checkToString(m.getValue(),two.get(m.getKey()));
		}
	}
	
	@Test
	public void testHashCode() {
		load();
		for(Entry<Class<? extends BullhornEntity>, BullhornEntity> m : one.entrySet()){
			checkHashCode(m.getValue(),two.get(m.getKey()));
		}
	}
	
	@Test
	public void testId() {
		load();
		for(Entry<Class<? extends BullhornEntity>, BullhornEntity> m : one.entrySet()){
			checkId(m.getValue(),two.get(m.getKey()));
		}
	}

	private void checkId(BullhornEntity entityOne, BullhornEntity entityTwo) {
		assertTrue("Error with id for "+entityOne.getClass().getSimpleName(),entityOne.getId().equals(entityTwo.getId()));
		assertTrue("Error with id for "+entityOne.getClass().getSimpleName(),entityOne.getId().equals(id));
	}

	private void checkHashCode(BullhornEntity entityOne, BullhornEntity entityTwo) {
		assertTrue("Error with hashCode for "+entityOne.getClass().getSimpleName(),entityOne.hashCode() == entityTwo.hashCode());
	}
	
	private void checkToString(BullhornEntity entityOne, BullhornEntity entityTwo) {
		assertTrue("Error with toString for "+entityOne.getClass().getSimpleName(),entityOne.toString().equals(entityTwo.toString()));
	}

	private void checkEquals(BullhornEntity entityOne, BullhornEntity entityTwo) {
		assertTrue("Error with equals for "+entityOne.getClass().getSimpleName(),entityOne.equals(entityTwo));
	}

}
