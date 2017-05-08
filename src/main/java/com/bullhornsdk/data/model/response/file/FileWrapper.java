package com.bullhornsdk.data.model.response.file;

import org.joda.time.DateTime;

import java.io.File;

/**
 * Contains both the file content as well as FileMeta data about the file.
 * 
 * @author magnus.palm
 * 
 */
public interface FileWrapper {

    /**
     * Returns the file content converted to a byte array
     * 
     * @return
     */
    public byte[] getFileContentAsByteArray();

    /**
     * Returns the file content as a base64-encoded String
     * 
     * @return
     */
    public String getBase64RawFileContent();

    /**
     * Creates a temp file, writes the file content to this file, and the returns the File.
     * 
     * Please note that the returned file should be manually deleted when no longer needed using the file.delete() method.
     * 
     * @return
     */
    public File getFile();

    /**
     * The id of the file in BH
     * @return
     */
    public Integer getId();

    public String getType();

    public String getName();

    public String getDescription();

    public String getContentType();

    public String getContentSubType();

    public String getFileType();

    public String getExternalID();

    public DateTime getDateAdded();

    public String getDistribution();
}
