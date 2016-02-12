package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.SearchParams;

public class StandardSearchParams implements SearchParams {

	private boolean showEditable;

	private Integer count;

	private Integer start;

	private String sort;

	private StandardSearchParams() {
		super();
		this.showEditable = false;
		this.count = 20;
		this.start = null;
		this.sort = null;
	}

	public static StandardSearchParams getInstance() {
		StandardSearchParams params = new StandardSearchParams();
		return params;
	}

	public void setShowEditable(boolean showEditable) {
		this.showEditable = showEditable;

	}

	@Override
	public Integer getCount() {
		return count;
	}

	@Override
	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public void setStart(Integer start) {
		this.start = start;
	}

	@Override
	public Integer getStart() {
		return start;
	}

	@Override
	public String getSort() {
		return sort;
	}

	@Override
	public void setSort(String sort) {
		this.sort = sort;
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
		if (sort != null) {
			url.append("&sort={sort}");
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
		if (sort != null) {
			uriVariables.put("sort", sort);
		}

		return uriVariables;
	}

}
