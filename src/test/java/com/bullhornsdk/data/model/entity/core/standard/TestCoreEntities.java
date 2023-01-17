package com.bullhornsdk.data.model.entity.core.standard;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Sets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
                one.put(bullhornEntityInfo.getType(), bullhornData.findEntity(bullhornEntityInfo.getType(), id, Sets.newHashSet("id")));
            }

        }

        for (BullhornEntityInfo bullhornEntityInfo : BullhornEntityInfo.values()) {
            if(bullhornEntityInfo.getType() != null){
                two.put(bullhornEntityInfo.getType(), bullhornData.findEntity(bullhornEntityInfo.getType(), id, Sets.newHashSet("id")));
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
        Assertions.assertTrue(entityOne.getId().equals(entityTwo.getId()), "Error with id for "+entityOne.getClass().getSimpleName());
        Assertions.assertTrue(entityOne.getId().equals(id), "Error with id for "+entityOne.getClass().getSimpleName());
    }

    private void checkHashCode(BullhornEntity entityOne, BullhornEntity entityTwo) {
        Assertions.assertTrue(entityOne.hashCode() == entityTwo.hashCode(), "Error with hashCode for "+entityOne.getClass().getSimpleName());
    }

    private void checkToString(BullhornEntity entityOne, BullhornEntity entityTwo) {
        Assertions.assertTrue(entityOne.toString().equals(entityTwo.toString()), "Error with toString for "+entityOne.getClass().getSimpleName());
    }

    private void checkEquals(BullhornEntity entityOne, BullhornEntity entityTwo) {
        Assertions.assertTrue(entityOne.equals(entityTwo), "Error with equals for "+entityOne.getClass().getSimpleName());
    }

}
