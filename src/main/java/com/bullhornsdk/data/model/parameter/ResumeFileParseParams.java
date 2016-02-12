package com.bullhornsdk.data.model.parameter;

import com.bullhornsdk.data.model.enums.PopulateDescriptionParameter;

/**
 * Optional parameters for the "parseResumeFile" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface ResumeFileParseParams extends RequestParameters {
    /**
     * html, or text. Populates the description field in the candidate response with an html or text representation of the parsed
     * resume.
     * 
     * @param populateDescriptionParameter
     */
    public void setPopulateDescription(PopulateDescriptionParameter populateDescriptionParameter);


}
