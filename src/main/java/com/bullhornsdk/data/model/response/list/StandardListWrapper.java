package com.bullhornsdk.data.model.response.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.type.BullhornEntity;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data", "count", "start" })
public class StandardListWrapper<T extends BullhornEntity> implements ListWrapper<T> {

	@JsonProperty("data")
	private List<T> data = new ArrayList<T>();

	@JsonProperty("count")
	private Integer count;

	@JsonProperty("start")
	private Integer start;

	@JsonProperty("total")
	private Integer total;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public StandardListWrapper() {
		super();
	}

	public StandardListWrapper(List<T> data) {
		super();
		this.data = data;
		this.count = data.size();
	}

	@Override
	@JsonProperty("data")
	public List<T> getData() {
		return data;
	}

	@Override
	@JsonProperty("data")
	public void setData(List<T> data) {
		this.data = data;
	}

	
	@Override
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	@Override
	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	@JsonProperty("start")
	public Integer getStart() {
		return start;
	}

	@Override
	@JsonProperty("start")
	public void setStart(Integer start) {
		this.start = start;
	}

	@Override
	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@Override
	@JsonProperty("total")
	public void setTotal(Integer total) {
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