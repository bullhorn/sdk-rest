package com.bullhornsdk.data.api.helper;

import java.util.concurrent.Callable;

import org.apache.log4j.Logger;

import com.bullhornsdk.data.api.BullhornData;
import com.bullhornsdk.data.exception.RestApiException;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.bullhornsdk.data.model.response.crud.UpdateResponse;

public class EntityUpdateWorker<C extends CrudResponse> implements Callable<C> {

	private final BullhornData bullhornApiRest;
	private final UpdateEntity entity;
	private final Logger log = Logger.getLogger(EntityUpdateWorker.class);

	public EntityUpdateWorker(BullhornData bullhornApiRest, UpdateEntity entity) {
		super();
		this.bullhornApiRest = bullhornApiRest;
		this.entity = entity;
	}

	@Override
	public C call() throws Exception {
		C response = (C) new UpdateResponse();
		try {
			response = bullhornApiRest.updateEntity(entity);
		} catch (RestApiException e) {
			log.error(
					"Error updating entity of type " + entity.getClass().getSimpleName() + " with id " + entity.getId(),
					e);
		}
		return response;
	}

}
