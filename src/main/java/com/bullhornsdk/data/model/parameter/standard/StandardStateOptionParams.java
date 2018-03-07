package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.StateOptionParams;

public class StandardStateOptionParams implements StateOptionParams {

    private Integer count;

    private Integer start;

    private String filter;

    private String country;

    private StandardStateOptionParams() {
        super();

        this.count = 20;
        this.start = null;
        this.filter = null;
        this.country = null;
    }

    public static StandardStateOptionParams getInstance() {
        StandardStateOptionParams params = new StandardStateOptionParams();

        return params;
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
    public String getFilter() {
        return filter;
    }

    @Override
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (count != null) {
            url.append("&count={count}");
        }
        if (start != null) {
            url.append("&start={start}");
        }
        if (filter != null) {
            url.append("&filter={filter}");
        }
        if (country != null) {
            url.append("&country={country}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (count != null) {
            uriVariables.put("count", "" + count);
        }
        if (start != null) {
            uriVariables.put("start", "" + start);
        }
        if (filter != null) {
            uriVariables.put("filter", filter);
        }
        if (country != null) {
            uriVariables.put("country", country);
        }

        return uriVariables;
    }

}
