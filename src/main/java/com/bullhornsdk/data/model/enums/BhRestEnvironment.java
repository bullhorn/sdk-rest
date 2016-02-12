package com.bullhornsdk.data.model.enums;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Name of Bullhorn rest environments.
 * 
 * @author Magnus Fiore Palm
 *
 */
public enum BhRestEnvironment {

	BH_NEXT("BH-Next"),
	BH_PRODUCTION("BH-Production");

	private static Logger log = Logger.getLogger(BhRestEnvironment.class);
	private final String name;

	private BhRestEnvironment(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static BhRestEnvironment getTypeFromName(String name) {

		for (BhRestEnvironment type : BhRestEnvironment.values()) {
			if (type.getName().equalsIgnoreCase(name)) {
				return type;
			}
		}
		throw new IllegalArgumentException("No BhRestEnvironment exists with the name: " + name);

	}

	public static String getPickerValues() {

		JSONArray dropdownValues = new JSONArray();
		try {

			for (BhRestEnvironment ent : BhRestEnvironment.values()) {
				JSONObject oneEntitlement = new JSONObject();
				oneEntitlement.put("id", ent);
				oneEntitlement.put("text", ent);
				dropdownValues.put(oneEntitlement);
			}
		} catch (JSONException e) {
			log.error("Error adding value to jsonObject", e);
		}
		return dropdownValues.toString();
	}
}
