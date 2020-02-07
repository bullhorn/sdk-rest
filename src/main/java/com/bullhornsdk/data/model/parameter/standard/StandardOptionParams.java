package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.OptionParams;

import java.util.LinkedHashMap;
import java.util.Map;

public class StandardOptionParams implements OptionParams {

    private Integer count;

    private Integer start;

    private StandardOptionParams() {
        super();

        this.count = null;
        this.start = null;
    }

    public static StandardOptionParams getInstance() {
        StandardOptionParams params = new StandardOptionParams();

        return params;
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
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

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

        if (count != null) {
            uriVariables.put("count", "" + count);

        }
        if (start != null) {
            uriVariables.put("start", "" + start);
        }

        return uriVariables;
    }

}
