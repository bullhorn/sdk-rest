package com.bullhornsdk.data.model.response.event;

import java.util.List;

/**
 * Created by john.sullivan on 17/2/2016.
 */
public interface GetEventsResponse<T extends Event> {

    Integer getRequestId();

    List<T> getEvents();

}
