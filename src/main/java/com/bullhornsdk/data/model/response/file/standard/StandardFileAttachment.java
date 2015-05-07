package com.bullhornsdk.data.model.response.file.standard;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.response.file.FileAttachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "candidate", "contentSubType", "contentType", "dateAdded", "description", "directory", "externalID",
		"fileExtension", "fileSize", "isCopied", "isDeleted", "isOpen", "isSendOut", "name", "type", "uuid" })
public class StandardFileAttachment extends AbstractEntity implements FileAttachment {

	private Integer id;
	private Candidate candidate;
	private String contentSubType;
	private String contentType;
	private DateTime dateAdded;
	private String description;
	private String directory;
	private String externalID;
	private String fileExtension;
	private String fileSize;
	private String isCopied;
	private String isDeleted;
	private String isOpen;
	private String isSendOut;
	private String name;
	private String type;
	private String uuid;

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
	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
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
	@JsonProperty("contentType")
	public String getContentType() {
		return contentType;
	}

	@JsonProperty("contentType")
	public void setContentType(String contentType) {
		this.contentType = contentType;
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
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	@JsonProperty("directory")
	public String getDirectory() {
		return directory;
	}

	@JsonProperty("directory")
	public void setDirectory(String directory) {
		this.directory = directory;
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
	@JsonProperty("fileExtension")
	public String getFileExtension() {
		return fileExtension;
	}

	@JsonProperty("fileExtension")
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
	@JsonProperty("fileSize")
	public String getFileSize() {
		return fileSize;
	}

	@JsonProperty("fileSize")
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	@Override
	@JsonProperty("isCopied")
	public String getIsCopied() {
		return isCopied;
	}

	
	@JsonProperty("isCopied")
	public void setIsCopied(String isCopied) {
		this.isCopied = isCopied;
	}

	@Override
	@JsonProperty("isDeleted")
	public String getIsDeleted() {
		return isDeleted;
	}

	
	@JsonProperty("isDeleted")
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	@JsonProperty("isOpen")
	public String getIsOpen() {
		return isOpen;
	}


	@JsonProperty("isOpen")
	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	@Override
	@JsonProperty("isSendOut")
	public String getIsSendOut() {
		return isSendOut;
	}

	
	@JsonProperty("isSendOut")
	public void setIsSendOut(String isSendOut) {
		this.isSendOut = isSendOut;
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
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@Override
	@JsonProperty("uuid")
	public String getUuid() {
		return uuid;
	}

	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\tcandidate: ");
		builder.append(candidate);
		builder.append("\n\tcontentSubType: ");
		builder.append(contentSubType);
		builder.append("\n\tcontentType: ");
		builder.append(contentType);
		builder.append("\n\tdateAdded: ");
		builder.append(dateAdded);
		builder.append("\n\tdescription: ");
		builder.append(description);
		builder.append("\n\tdirectory: ");
		builder.append(directory);
		builder.append("\n\texternalID: ");
		builder.append(externalID);
		builder.append("\n\tfileExtension: ");
		builder.append(fileExtension);
		builder.append("\n\tfileSize: ");
		builder.append(fileSize);
		builder.append("\n\tisCopied: ");
		builder.append(isCopied);
		builder.append("\n\tisDeleted: ");
		builder.append(isDeleted);
		builder.append("\n\tisOpen: ");
		builder.append(isOpen);
		builder.append("\n\tisSendout: ");
		builder.append(isSendOut);
		builder.append("\n\tname: ");
		builder.append(name);
		builder.append("\n\ttype: ");
		builder.append(type);
		builder.append("\n\tuuid: ");
		builder.append(uuid);
		builder.append("\n}");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((contentSubType == null) ? 0 : contentSubType.hashCode());
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fileExtension == null) ? 0 : fileExtension.hashCode());
		result = prime * result + ((fileSize == null) ? 0 : fileSize.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isCopied == null) ? 0 : isCopied.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isOpen == null) ? 0 : isOpen.hashCode());
		result = prime * result + ((isSendOut == null) ? 0 : isSendOut.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
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
		StandardFileAttachment other = (StandardFileAttachment) obj;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
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
		if (directory == null) {
			if (other.directory != null)
				return false;
		} else if (!directory.equals(other.directory))
			return false;
		if (externalID == null) {
			if (other.externalID != null)
				return false;
		} else if (!externalID.equals(other.externalID))
			return false;
		if (fileExtension == null) {
			if (other.fileExtension != null)
				return false;
		} else if (!fileExtension.equals(other.fileExtension))
			return false;
		if (fileSize == null) {
			if (other.fileSize != null)
				return false;
		} else if (!fileSize.equals(other.fileSize))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isCopied == null) {
			if (other.isCopied != null)
				return false;
		} else if (!isCopied.equals(other.isCopied))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (isOpen == null) {
			if (other.isOpen != null)
				return false;
		} else if (!isOpen.equals(other.isOpen))
			return false;
		if (isSendOut == null) {
			if (other.isSendOut != null)
				return false;
		} else if (!isSendOut.equals(other.isSendOut))
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
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

}
