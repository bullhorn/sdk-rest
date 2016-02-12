package com.bullhornsdk.data.model.response.file.standard;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.file.FileMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "type", "name", "description", "contentType", "contentSubType", "fileType", "externalID","dateAdded","fileUrl" })
public class StandardFileMeta extends AbstractEntity implements FileMeta {

	private Integer id;

	private String type;

	private String name;

	private String description;

	private String contentType;

	private String contentSubType;

	private String fileType;

	private String externalID;

	private DateTime dateAdded;

	private String fileUrl;

	@Override
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@JsonProperty("contentType")
	public String getContentType() {
		return contentType;
	}

	@JsonProperty("contentType")
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	@JsonProperty("contentSubType")
	public String getContentSubType() {
		return contentSubType;
	}

	@JsonProperty("contentSubType")
	public void setContentSubType(String contentSubType) {
		this.contentSubType = contentSubType;
	}

	@Override
	@JsonProperty("fileType")
	public String getFileType() {
		return fileType;
	}

	@JsonProperty("fileType")
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@Override
	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalID")
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@Override
	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	@JsonProperty("fileUrl")
	public String getFileUrl() {
		return fileUrl;
	}

	@JsonProperty("fileUrl")
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\ttype: ");
		builder.append(type);
		builder.append("\n\tname: ");
		builder.append(name);
		builder.append("\n\tdescription: ");
		builder.append(description);
		builder.append("\n\tcontentType: ");
		builder.append(contentType);
		builder.append("\n\tcontentSubType: ");
		builder.append(contentSubType);
		builder.append("\n\tfileType: ");
		builder.append(fileType);
		builder.append("\n\texternalID: ");
		builder.append(externalID);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tfileUrl: ");
		builder.append(fileUrl);
		builder.append("\n}");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contentSubType == null) ? 0 : contentSubType.hashCode());
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
		result = prime * result + ((fileUrl == null) ? 0 : fileUrl.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StandardFileMeta other = (StandardFileMeta) obj;
		if (contentSubType == null) {
			if (other.contentSubType != null)
				return false;
		} else if (!contentSubType.equals(other.contentSubType))
			return false;
		if (contentType == null) {
			if (other.contentType != null)
				return false;
		} else if (!contentType.equals(other.contentType))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.equals(other.dateAdded))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (externalID == null) {
			if (other.externalID != null)
				return false;
		} else if (!externalID.equals(other.externalID))
			return false;
		if (fileType == null) {
			if (other.fileType != null)
				return false;
		} else if (!fileType.equals(other.fileType))
			return false;
		if (fileUrl == null) {
			if (other.fileUrl != null)
				return false;
		} else if (!fileUrl.equals(other.fileUrl))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
