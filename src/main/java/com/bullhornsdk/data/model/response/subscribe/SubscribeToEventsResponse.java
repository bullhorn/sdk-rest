package com.bullhornsdk.data.model.response.subscribe;

import org.joda.time.DateTime;

/**
 * Subscribe to events response
 *
 * @author Maarten Oortwijn
 */
public interface SubscribeToEventsResponse {

    String getJmsSelector();

    DateTime getCreatedOn();

    String getSubscriptionId();

    Integer getLastRequestId();
}
