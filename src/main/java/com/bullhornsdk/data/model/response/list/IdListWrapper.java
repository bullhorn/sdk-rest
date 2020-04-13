package com.bullhornsdk.data.model.response.list;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "count", "start" })
public class IdListWrapper<Integer> implements ListWrapper<Integer> {

	@JsonProperty("data")
	private List<Integer> data = new ArrayList<Integer>();

	@JsonProperty("count")
	private java.lang.Integer count;

	@JsonProperty("start")
	private java.lang.Integer start;

	@JsonProperty("total")
	private java.lang.Integer total;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public IdListWrapper() {
		super();
	}

	public IdListWrapper(List<Integer> data) {
		super();
		this.data = data;
		this.count = data.size();
	}

	@Override
	@JsonProperty("data")
	public List<Integer> getData() {
		return data;
	}

	@Override
	@JsonProperty("data")
	public void setData(List<Integer> data) {
		this.data = data;
	}

    @Override
	@JsonProperty("count")
	public java.lang.Integer getCount() {
		return count;
	}

	@Override
	@JsonProperty("count")
	public void setCount(java.lang.Integer count) {
		this.count = count;
	}

	@Override
	@JsonProperty("start")
	public java.lang.Integer getStart() {
		return start;
	}

	@Override
	@JsonProperty("start")
	public void setStart(java.lang.Integer start) {
		this.start = start;
	}

	@Override
	@JsonProperty("total")
	public java.lang.Integer getTotal() {
		return total;
	}

	@Override
	@JsonProperty("total")
	public void setTotal(java.lang.Integer total) {
		this.total = total;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StandardListWrapper {\ndata=");
		builder.append(data);
		builder.append(", \ncount=");
		builder.append(count);
		builder.append(", \nstart=");
		builder.append(start);
		builder.append(", \ntotal=");
		builder.append(total);
		builder.append(", \nadditionalProperties=");
		builder.append(additionalProperties);
		builder.append("\n}");
		return builder.toString();
	}

}