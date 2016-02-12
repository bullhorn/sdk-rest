package com.bullhornsdk.data.model.response.file;

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

	public DateTime getDateAdded();

	public String getFileUrl();
	
}
