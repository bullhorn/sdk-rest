package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.enums.PopulateDescriptionParameter;
import com.bullhornsdk.data.model.parameter.ResumeFileParseParams;

public class StandardResumeFileParseParams implements ResumeFileParseParams {

    private PopulateDescriptionParameter populateDescriptionParameter;

    public static StandardResumeFileParseParams getInstance() {
        StandardResumeFileParseParams params = new StandardResumeFileParseParams();

        return params;
    }

    private StandardResumeFileParseParams() {
        super();
        this.populateDescriptionParameter = PopulateDescriptionParameter.TEXT;

    }

    @Override
    public void setPopulateDescription(PopulateDescriptionParameter populateDescriptionParameter) {
        this.populateDescriptionParameter = populateDescriptionParameter;

    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (populateDescriptionParameter != null) {
            url.append("&populateDescription={populateDescription}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (populateDescriptionParameter != null) {
            uriVariables.put("populateDescription", "" + populateDescriptionParameter.getName());
        }

        return uriVariables;
    }

}
