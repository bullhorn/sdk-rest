package com.bullhornsdk.data;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.model.entity.core.standard.Settings;
import com.bullhornsdk.data.model.enums.SettingsFields;
import com.google.common.collect.Sets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public class TestStandardBullhornApiRestSettings extends BaseTest {

    public TestStandardBullhornApiRestSettings() {
        super();
    }

    private <T extends BullhornEntity> void runAssertions(Map<String,Object> settings) {
        Assertions.assertNotNull(settings, "settings is null");
        Assertions.assertEquals(2, settings.size());
        Assertions.assertTrue(settings.get("corporationId")!=null);
        Assertions.assertTrue(settings.get("corporationName")!=null);
    }

    private <T extends BullhornEntity> void runObjectAssertions(Settings settings) {
        Assertions.assertNotNull(settings, "settings is null");
        Assertions.assertTrue(settings.getCorporationId()!=null);
        Assertions.assertTrue(settings.getCorporationName()!=null);
    }

    @Test
    public void testSettings() {
        Map<String,Object> settings = bullhornData.getSettings(this.getFieldSet());

        runAssertions(settings);

    }

    @Test
    public void testSettingsObject() {
        Settings settings = bullhornData.getSettingsObject(this.getFieldSetObject());

        runObjectAssertions(settings);

    }

    private Set<String> getFieldSet() {
        Set<String> fieldSet = new LinkedHashSet<String>();
        fieldSet.add("corporationId");
        fieldSet.add("corporationName");
        return fieldSet;
    }
    private Set<SettingsFields> getFieldSetObject() {
        Set<SettingsFields> fieldSet = Sets.newHashSet();
        fieldSet.add(SettingsFields.CORPORATION_ID);
        fieldSet.add(SettingsFields.CORPORATION_NAME);
        return fieldSet;
    }


}
