package com.bullhornsdk.data.model.response.file;

/**
 * Represents a file returned by a /file api call.
 * 
 * @author magnus.palm
 * 
 */
public interface FileContent {

    public Integer getId();

    public void setId(Integer id);

    public String getContentType();

    public String getFileContent();

    public String getName();

}
