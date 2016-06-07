package com.bullhornsdk.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.bullhornsdk.data.model.entity.core.standard.Settings;
import com.bullhornsdk.data.model.enums.SettingsFields;
import com.google.common.collect.Sets;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;

public class TestStandardBullhornApiRestSettings extends BaseTest {
	
	public TestStandardBullhornApiRestSettings() {
		super();
	}

	private <T extends BullhornEntity> void runAssertions(Map<String,Object> settings) {
		assertNotNull("settings is null", settings);
		assertEquals(2, settings.size());
		assertTrue(settings.get("corporationId")!=null);
        assertTrue(settings.get("corporationName")!=null);
	}

	private <T extends BullhornEntity> void runObjectAssertions(Settings settings) {
		assertNotNull("settings is null", settings);
		assertTrue(settings.getCorporationId()!=null);
		assertTrue(settings.getCorporationName()!=null);
	}

	@Test
	public void testSettings() {
	    Map<String,Object> settings = bullhornData.getSettings(this.getFieldSet());
	    System.out.println("settings: " + settings);
		runAssertions(settings);

	}

	@Test
	public void testSettingsObject() {
		Settings settings = bullhornData.getSettingsObject(this.getFieldSetObject());
		System.out.println("settings: " + settings);
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
