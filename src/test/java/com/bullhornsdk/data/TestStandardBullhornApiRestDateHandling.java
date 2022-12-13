package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.After;
import org.junit.Test;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.response.crud.UpdateResponse;

public class TestStandardBullhornApiRestDateHandling<T extends UpdateEntity> extends BaseTest {
	private final Logger log = LogManager.getLogger(TestStandardBullhornApiRestDateHandling.class);

	private T entity;

	private DateTime previousValue;

	private DateTime newValue;

	public TestStandardBullhornApiRestDateHandling() {
		super();
	}

	@After
	public void restoreEntityToInitialValue() {
		if (entity != null) {
			UpdateResponse response = bullhornData.updateEntity(entity);
			assertFalse("Error restoring entity", response.hasValidationErrors());
		}
	}

	@Test
	public void testDateHandlingJobOrder() {

		JobOrder entity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "startDate"));

		this.entity = (T) entity;

		previousValue = entity.getStartDate();

		// DateTime localNewValue = new DateTime("2013-03-03",DateTimeZone.forID("EST5EDT"));
		DateTime localNewValue = new DateTime("2013-03-03", DateTimeZone.UTC);
		newValue = localNewValue;

		entity.setStartDate(newValue);

		UpdateResponse response = bullhornData.updateEntity(entity);

		JobOrder updatedEntity = bullhornData.findEntity(JobOrder.class, testEntities.getJobOrderId(), Sets.newHashSet("id", "startDate"));
		entity.setStartDate(previousValue);
		this.runAssertions(response, newValue, updatedEntity.getStartDate());

	}

	private void runAssertions(UpdateResponse response, DateTime valueShouldBe, DateTime valueIs) {
		assertNotNull("response is null", response);
		assertFalse("Validation failed", response.hasValidationErrors());
		assertTrue("value not updated correctly", valueShouldBe.isEqual(valueIs));

	}

	

}
