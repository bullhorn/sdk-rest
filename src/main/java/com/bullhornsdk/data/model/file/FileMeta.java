package com.bullhornsdk.data.model.file;

import java.util.Map;

import org.joda.time.DateTime;

public interface FileMeta {

	public Integer getId();

	public void setId(Integer id);

	public String getType();

	public void setType(String type);

	public String getName();

	public void setName(String name);

	public String getDescription();

	public void setDescription(String description);

	public String getContentType();

	public void setContentType(String contentType);

	public String getContentSubType();

	public void setContentSubType(String contentSubType);

	public String getFileType();

	public void setFileType(String fileType);

	public String getExternalID();

	public void setExternalID(String externalID);

	public String getDistribution();

	public void setDistribution(String distribution);

	public String getFileUrl();

	public void setFileUrl(String fileUrl);

	public String getFileContent();

	public void setFileContent(String fileContent);

	public DateTime getDateAdded();

	public void setDateAdded(DateTime dateAdded);

	public String getUrlString();

	public Map<String, String> getParameterMap();


	
}
