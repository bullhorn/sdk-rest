package com.bullhornsdk.data.model.parameter.standard;

import com.bullhornsdk.data.model.parameter.SettingsParams;

import java.util.LinkedHashMap;
import java.util.Map;

public class StandardSettingsParams implements SettingsParams {

    private Integer privateLabelId;

    public static StandardSettingsParams getInstance() {
        return new StandardSettingsParams();
    }

    private StandardSettingsParams() {
        super();
    }

    @Override
    public Integer getPrivateLabelId() {
        return privateLabelId;
    }

    @Override
    public void setPrivateLabelId(Integer privateLabelId) {
        this.privateLabelId = privateLabelId;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (privateLabelId != null) {
            url.append("&privateLabelId={privateLabelId}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (privateLabelId != null) {
            uriVariables.put("privateLabelId", privateLabelId.toString());
        }

        return uriVariables;
    }

}
