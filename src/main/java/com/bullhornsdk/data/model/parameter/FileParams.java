package com.bullhornsdk.data.model.parameter;

import com.bullhornsdk.data.model.enums.FileContentType;

/**
 * Optional parameters for the "parseResumeText" api call.
 * 
 * @author magnus.palm
 * 
 */
public interface FileParams extends RequestParameters {

    /**
     * The mime type of the file
     * 
     * @param fileContentType
     */
    public void setContentType(FileContentType fileContentType);

    /**
     * Comment that describes the file.
     * 
     * @param description
     */
    public void setDescription(String description);

    /**
     * Type of file that is attached, for example "Resume" or "Cover".
     * 
     * @param type
     */
    public void setType(String type);

}
