package com.bullhornsdk.data.model.parameter.standard;

import java.util.LinkedHashMap;
import java.util.Map;

import com.bullhornsdk.data.model.enums.PopulateDescriptionParameter;
import com.bullhornsdk.data.model.enums.ResumeParseTextFormat;
import com.bullhornsdk.data.model.parameter.ResumeTextParseParams;

public class StandardResumeTextParseParams implements ResumeTextParseParams {

    private PopulateDescriptionParameter populateDescriptionParameter;

    private ResumeParseTextFormat resumeParseTextFormat;

    public static StandardResumeTextParseParams getInstance() {
        StandardResumeTextParseParams params = new StandardResumeTextParseParams();

        return params;
    }

    private StandardResumeTextParseParams() {
        super();
        this.populateDescriptionParameter = PopulateDescriptionParameter.TEXT;
        this.resumeParseTextFormat = ResumeParseTextFormat.TEXT;
    }

    @Override
    public void setPopulateDescription(PopulateDescriptionParameter populateDescriptionParameter) {
        this.populateDescriptionParameter = populateDescriptionParameter;

    }

    @Override
    public void setResumeParseTextFormat(ResumeParseTextFormat resumeParseTextFormat) {
        this.resumeParseTextFormat = resumeParseTextFormat;
    }

    @Override
    public String getUrlString() {
        StringBuilder url = new StringBuilder();

        if (populateDescriptionParameter != null) {
            url.append("&populateDescription={populateDescription}");
        }
        if (resumeParseTextFormat != null) {
            url.append("&format={format}");
        }

        return url.toString();
    }

    @Override
    public Map<String, String> getParameterMap() {
        Map<String, String> uriVariables = new LinkedHashMap<String, String>();

        if (populateDescriptionParameter != null) {
            uriVariables.put("populateDescription", "" + populateDescriptionParameter.getName());
        }
        if (resumeParseTextFormat != null) {
            uriVariables.put("format", "" + resumeParseTextFormat.getName());
        }

        return uriVariables;
    }

}
