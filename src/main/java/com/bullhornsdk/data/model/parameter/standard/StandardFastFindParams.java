package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.FastFindParams;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author vzeltser
 */
class StandardFastFindParams implements FastFindParams {
    
	private boolean showEditable;

	private Integer countPerEntity;

	private StandardFastFindParams(int countPerEntity) {
		super();
		this.showEditable = false;
		this.countPerEntity = countPerEntity;
	}

	public static StandardFastFindParams getInstance(int countPerEntity) {
		return new StandardFastFindParams(countPerEntity);
	}

	public static StandardFastFindParams getInstance() {
		return getInstance(20);
	}

	public void setShowEditable(boolean showEditable) {
		this.showEditable = showEditable;

	}

	@Override
	public Integer getCountPerEntity() {
		return countPerEntity;
	}

	@Override
	public void setCountPerEntity(Integer countPerEntity) {
		this.countPerEntity = countPerEntity;
	}

	@Override
	public String getUrlString() {
		StringBuilder url = new StringBuilder();

		if (showEditable) {
			url.append("&showEditable={showEditable}");
		}
		if (countPerEntity != null) {
			url.append("&countPerEntity={countPerEntity}");
		}

		return url.toString();
	}

	@Override
	public Map<String, String> getParameterMap() {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();

		if (showEditable) {
			uriVariables.put("showEditable", "true");
		}
		if (countPerEntity != null) {
			uriVariables.put("countPerEntity", "" + countPerEntity);

		}

		return uriVariables;
	}

}
