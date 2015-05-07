package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.parameter.EntityParams;

public class StandardEntityParams implements EntityParams {

    private boolean showEditable;

    private StandardEntityParams() {
        super();

        this.showEditable = false;
    }

    public static StandardEntityParams getInstance() {
        StandardEntityParams params = new StandardEntityParams();
        return params;
    }

    
    public void setShowEditable(boolean showEditable) {
        this.showEditable = showEditable;

    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (showEditable != false) {
            url.append("&showEditable={showEditable}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (showEditable != false) {
            uriVariables.put("showEditable", "" + showEditable);
        }

        return uriVariables;
    }

}
