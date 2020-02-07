package com.bullhornsdk.data;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.bullhornsdk.data.model.parameter.standard.StandardOptionParams;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class TestStandardBullhornApiRestOptions extends BaseTest {
	
	public TestStandardBullhornApiRestOptions() {
		super();
	}

	private <T extends BullhornEntity> void runAssertions(Map<String,Object> options) {
		assertNotNull("options is null", options);
		assertEquals(2, options.size());
		assertTrue(options.get("label")!=null);
        assertTrue(options.get("value")!=null);
	}

    @Test
    public void testOptions() {
        Map<String,Object> options = bullhornData.getOptions(this.getOptionType(), StandardOptionParams.getInstance());
        System.out.println("options: " + options);
        runAssertions(options);
    }

    private String getOptionType() {
         return "any_type";
    }
}
