package com.bullhornsdk.data.model.parameter;

import com.bullhornsdk.data.model.enums.PopulateDescriptionParameter;
import com.bullhornsdk.data.model.enums.ResumeParseTextFormat;

/**
 * Optional parameters for the "parseResumeText" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface ResumeTextParseParams extends RequestParameters {
    /**
     * html, or text. Populates the description field in the candidate response with an html or text representation of the parsed
     * resume.
     * 
     * @param populateDescriptionParameter
     */
    public void setPopulateDescription(PopulateDescriptionParameter populateDescriptionParameter);

    /**
     * Specifies the format of the resume text.
     * 
     * @param resumeParseTextFormat
     */
    public void setResumeParseTextFormat(ResumeParseTextFormat resumeParseTextFormat);

}
