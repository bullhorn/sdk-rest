package com.bullhornsdk.data.model.file;

import java.util.Map;

import org.joda.time.DateTime;

public interface FileMeta {

	public Integer getId();

	public String getType();

	public String getName();

	public String getDescription();

	public String getContentType();

	public String getContentSubType();

	public String getFileType();

	public String getExternalID();

	public void setExternalID(String externalID);

	public String getDistribution();

	public String getFileUrl();

	public String getFileContent();

	public void setFileContent(String fileContent);

	public DateTime getDateAdded();

	public String getUrlString();

	public Map<String, String> getParameterMap();


	
}
