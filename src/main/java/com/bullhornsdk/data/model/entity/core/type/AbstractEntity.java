package com.bullhornsdk.data.model.entity.core.type;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.bullhornsdk.data.util.RestUtil;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

/**
 * Common logic for all entities that need it.
 * 
 * The additionalProperties will be populated with any value from a json
 * response that does not exists as a field on the entity. This will make sure
 * that api calls do not fail because of new fields added.
 * 
 * @author magnus.palm
 * 
 */
public class AbstractEntity {

	private final static Logger log = Logger.getLogger(AbstractEntity.class);

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	/**
	 * Unknown properties are handled here. One main purpose of this method is
	 * to handle String values that are sent as json arrays if configured as
	 * multi-values in bh.
	 * 
	 * @param name
	 * @param value
	 */
	@JsonAnySetter
	public void handleJsonArrayToJavaString(String name, Object value) {

		try {
			PropertyUtils.setProperty(this, name,
					this.convertListToString(value));
		} catch (IllegalAccessException e) {
			log.debug("Error setting field " + name + " with value " + value
					+ " on entity " + this.getClass().getSimpleName());
			this.additionalProperties.put(name, value);
		} catch (InvocationTargetException e) {
			log.debug("Error setting field " + name + " with value " + value
					+ " on entity " + this.getClass().getSimpleName());
			this.additionalProperties.put(name, value);
		} catch (NoSuchMethodException e) {
			log.debug("Error setting field " + name + " with value " + value
					+ " on entity " + this.getClass().getSimpleName());
			this.additionalProperties.put(name, value);
		}

	}

	/**
	 * Handles the fact that bh rest api sends Strings as json arrays if they
	 * are setup as multipickers in the fieldmaps.
	 * 
	 * @param listOrString
	 * @return
	 */
	public String convertListToString(Object listOrString) {

		if (listOrString == null) {
			return null;
		}

		if (listOrString instanceof Collection) {
			List<String> list = (List<String>) listOrString;

			return StringUtils.join(list, ",");

		}

		return listOrString.toString();

	}

	public BigDecimal handleBigDecimal(String bigDecimalString) {
		if (bigDecimalString == null || !RestUtil.isNumeric(bigDecimalString)) {
			return null;
		}

		return new BigDecimal(bigDecimalString);

	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" \nadditionalProperties=");
		builder.append(additionalProperties);

		return builder.toString();
	}

}
