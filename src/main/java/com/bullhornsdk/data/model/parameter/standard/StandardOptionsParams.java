package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.OptionsParams;

public class StandardOptionsParams implements OptionsParams {

    private String filter;

    private Integer count;

    private Integer start;

    private StandardOptionsParams() {
        super();
        this.filter = "";
        this.count = 20;
        this.start = null;
    }

    public static StandardOptionsParams getInstance() {
        return new StandardOptionsParams();
    }


    @Override
    public void getFilter() {

    }

    @Override
    public void setFilter(String filter) {

    }

    @Override
    public Integer getCount() {
        return null;
    }

    @Override
    public void setCount(Integer count) {

    }

    @Override
    public Integer getStart() {
        return null;
    }

    @Override
    public void setStart(Integer start) {

    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (filter != null) {
            url.append("&filter={filter}");
        }
        if (count != null) {
            url.append("&count={count}");
        }
        if (start != null) {
            url.append("&start={start}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (filter != null) {
            uriVariables.put("filter", "" + filter);
        }
        if (count != null) {
            uriVariables.put("count", "" + count);
        }
        if (start != null) {
            uriVariables.put("start", "" + start);
        }

        return uriVariables;
    }
}
