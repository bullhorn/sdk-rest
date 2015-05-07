package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.CorpNotesParams;

public class StandardCorpNotesParams implements CorpNotesParams {

	private String query;

	private Integer count;

	private String sort;

	private Integer start;

	private StandardCorpNotesParams() {
		super();

		this.query = null;
		this.count = null;
		this.sort = null;
		this.start = null;
	}

	public static StandardCorpNotesParams getInstance() {
		StandardCorpNotesParams params = new StandardCorpNotesParams();

		return params;
	}

	@Override
	public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (query != null) {
            url.append("&query={query}");
        }
        if (count != null) {
            url.append("&count={count}");
        }
        if (sort != null) {
            url.append("&sort={sort}");
        }
        if (start != null) {
            url.append("&start={start}");
        }

        return url.toString();
	}

	@Override
	public Map<String, String> getParameterMap() {
		Map<String, String> uriVariables = new LinkedHashMap<String, String>();

		if (query != null) {
			uriVariables.put("query", "" + query);
		}
		if (count != null) {
			uriVariables.put("count", "" + count);
		}
		if (sort != null) {
			uriVariables.put("sort", "" + sort);
		}
		if (start != null) {
			uriVariables.put("start", "" + start);
		}

		return uriVariables;
	}

	@Override
	public void setQuery(String query) {
		this.query = query;
	}

	@Override
	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public void setStart(Integer start) {
		this.start = start;
	}

}
