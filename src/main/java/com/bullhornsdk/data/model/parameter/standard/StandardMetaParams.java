package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.enums.MetaParameter;
import com.bullhornsdk.data.model.parameter.MetaParams;

public class StandardMetaParams implements MetaParams {

    private MetaParameter metaParameter;

    public static StandardMetaParams getInstance() {
        StandardMetaParams params = new StandardMetaParams();

        return params;
    }

    private StandardMetaParams() {
        super();
        this.metaParameter = MetaParameter.BASIC;
    }

    @Override
    public void setMeta(MetaParameter metaParameter) {
        this.metaParameter = metaParameter;

    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (metaParameter != null) {
            url.append("&meta={meta}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (metaParameter != null) {
            uriVariables.put("meta", "" + metaParameter.getName());
        }

        return uriVariables;
    }

}
