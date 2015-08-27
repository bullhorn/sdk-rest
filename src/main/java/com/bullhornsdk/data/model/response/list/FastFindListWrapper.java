package com.bullhornsdk.data.model.response.list;

import com.bullhornsdk.data.model.entity.core.standard.FastFindResult;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data"})
public class FastFindListWrapper {

	public FastFindListWrapper() {
		super();
	}

	public FastFindListWrapper(List<FastFindResult> data) {
		super();
		this.data = data;
	}

	@JsonProperty("data")
	private List<FastFindResult> data = new ArrayList<FastFindResult>();

	@JsonProperty("data")
	public List<FastFindResult> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<FastFindResult> data) {
		this.data = data;
	}
}
