package com.bullhornsdk.data.model.response.file.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.file.FileApiResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "fileId", "changeType" })
public class StandardFileApiResponse extends AbstractEntity implements FileApiResponse {

	private Integer fileId;

	private String changeType;

	@Override
	@JsonProperty("fileId")
	public Integer getFileId() {
		return fileId;
	}

	@JsonProperty("fileId")
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}

	@Override
	@JsonProperty("changeType")
	public String getChangeType() {
		return changeType;
	}

	@JsonProperty("changeType")
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" {\nfileId=");
		builder.append(fileId);
		builder.append(", \nchangeType=");
		builder.append(changeType);
		builder.append(", \ngetAdditionalProperties()=");
		builder.append(getAdditionalProperties());
		builder.append("}");
		return builder.toString();
	}

}
