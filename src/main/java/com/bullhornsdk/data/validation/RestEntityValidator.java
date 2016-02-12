package com.bullhornsdk.data.validation;

import org.springframework.validation.Errors;

import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;

/**
 * Main validator interface for entity validations.
 * 
 * @author magnus.palm
 * 
 * @param <T>
 */
public interface RestEntityValidator {

	/**
	 * Validates a CreateEntity entity.
	 * 
	 * @param entity
	 *            CreateEntity
	 * @return the validation errors
	 */
	public <T extends CreateEntity> Errors validateEntityOnInsert(T entity);

	/**
	 * Validates a UpdateEntity entity.
	 * 
	 * @param entity
	 *            UpdateEntity
	 * @return the validation errors
	 */
	public <T extends UpdateEntity> Errors validateEntityOnUpdate(T entity);

}
