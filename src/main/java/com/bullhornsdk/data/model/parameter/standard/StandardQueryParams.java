package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.QueryParams;

public class StandardQueryParams implements QueryParams {

	private boolean showEditable;

	private Integer count;

	private Integer start;

	private String orderBy;

	private boolean showTotalMatched;

	private StandardQueryParams() {
		super();

		this.showEditable = false;
		this.count = 20;
		this.start = null;
		this.orderBy = null;
		this.showTotalMatched = true;
	}

	public static StandardQueryParams getInstance() {
		StandardQueryParams params = new StandardQueryParams();

		return params;
	}

	public void setShowEditable(boolean showEditable) {
		this.showEditable = showEditable;

	}

	@Override
	public Integer getCount() {
		return count;
	}

	/**
	 * Limit on the number of entities to return. Default is 20.
	 * 
	 * @param count
	 */

	@Override
	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public Integer getStart() {
		return start;
	}

	@Override
	public void setStart(Integer start) {
		this.start = start;
	}

	@Override
	public String getOrderBy() {
		return orderBy;
	}

	@Override
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public void setShowTotalMatched(boolean showTotalMatched) {
		this.showTotalMatched = showTotalMatched;
	}

	@Override
	public String getUrlString() {
		StringBuilder url = new StringBuilder();

		if (showEditable != false) {
			url.append("&showEditable={showEditable}");
		}
		if (count != null) {
			url.append("&count={count}");
		}
		if (start != null) {
			url.append("&start={start}");
		}
		if (orderBy != null) {
			url.append("&orderBy={orderBy}");
		}
		if (showTotalMatched != false) {
			url.append("&showTotalMatched={showTotalMatched}");
		}

		return url.toString();
	}

	@Override
	public Map<String, String> getParameterMap() {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();

		if (showEditable != false) {
			uriVariables.put("showEditable", "" + showEditable);
		}
		if (count != null) {
			uriVariables.put("count", "" + count);

		}
		if (start != null) {
			uriVariables.put("start", "" + start);
		}
		if (orderBy != null) {
			uriVariables.put("orderBy", orderBy);
		}

		if (showTotalMatched != false) {
			uriVariables.put("showTotalMatched", "" + showTotalMatched);
		}

		return uriVariables;
	}

}
