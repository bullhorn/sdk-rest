package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "clientContact", "contentSubType", "contentType", "dateAdded", "description", "directory", "distribution", "externalID",
		"fileExtension", "fileSize", "fileType", "isCopied", "isDeleted", "isOpen", "isPrivate", "isSendOut", "name", "type",
		"usersSharedWith", "uuid"})
public class ClientContactFileAttachment extends AbstractEntity implements QueryEntity, AssociationEntity {

	private Integer id;

	private ClientContact clientContact;

	private String contentSubType;

	private String contentType;

	private DateTime dateAdded;

	private String description;

	private String directory;

	private String distribution;

	private String externalID;

	private String fileExtension;

	private Integer fileSize;

	private String fileType;

	private Boolean isCopied;

	private Boolean isDeleted;

	private Boolean isOpen;

	private Boolean isPrivate;

	private Boolean isSendOut;

	private String name;

	private String type;

	private OneToMany<CorporateUser> usersSharedWith;

	private String uuid;

	public ClientContactFileAttachment() {
		super();
	}

	@Override
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@Override
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("clientContact")
	public ClientContact getClientContact() {
		return clientContact;
	}

	@JsonProperty("clientContact")
	public void setClientContact(ClientContact clientContact) {
		this.clientContact = clientContact;
	}

	@JsonProperty("contentSubType")
	public String getContentSubType() {
		return contentSubType;
	}

	@JsonProperty("contentSubType")
	public void setContentSubType(String contentSubType) {
		this.contentSubType = contentSubType;
	}

	@JsonProperty("contentType")
	public String getContentType() {
		return contentType;
	}

	@JsonProperty("contentType")
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("directory")
	public String getDirectory() {
		return directory;
	}

	@JsonProperty("directory")
	public void setDirectory(String directory) {
		this.directory = directory;
	}

	@JsonProperty("distribution")
	public String getDistribution() {
		return distribution;
	}

	@JsonProperty("distribution")
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonProperty("externalID")
	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@JsonProperty("fileExtension")
	public String getFileExtension() {
		return fileExtension;
	}

	@JsonProperty("fileExtension")
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@JsonProperty("fileSize")
	public Integer getFileSize() {
		return fileSize;
	}

	@JsonProperty("fileSize")
	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	@JsonProperty("fileType")
	public String getFileType() {
		return fileType;
	}

	@JsonProperty("fileType")
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	@JsonProperty("isCopied")
	public Boolean getIsCopied() {
		return isCopied;
	}

	@JsonProperty("isCopied")
	public void setIsCopied(Boolean isCopied) {
		this.isCopied = isCopied;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("isOpen")
	public Boolean getIsOpen() {
		return isOpen;
	}

	@JsonProperty("isOpen")
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	@JsonProperty("isPrivate")
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	@JsonProperty("isPrivate")
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	@JsonProperty("isSendOut")
	public Boolean getIsSendOut() {
		return isSendOut;
	}

	@JsonProperty("isSendOut")
	public void setIsSendOut(Boolean isSendOut) {
		this.isSendOut = isSendOut;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("usersSharedWith")
	public OneToMany<CorporateUser> getUsersSharedWith() {
		return usersSharedWith;
	}

	@JsonProperty("usersSharedWith")
	public void setUsersSharedWith(OneToMany<CorporateUser> usersSharedWith) {
		this.usersSharedWith = usersSharedWith;
	}

	@JsonProperty("uuid")
	public String getUuid() {
		return uuid;
	}

	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((clientContact == null) ? 0 : clientContact.hashCode());
		result = prime * result + ((contentSubType == null) ? 0 : contentSubType.hashCode());
		result = prime * result + ((contentType == null) ? 0 : contentType.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((directory == null) ? 0 : directory.hashCode());
		result = prime * result + ((distribution == null) ? 0 : distribution.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fileExtension == null) ? 0 : fileExtension.hashCode());
		result = prime * result + ((fileSize == null) ? 0 : fileSize.hashCode());
		result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
		result = prime * result + ((isCopied == null) ? 0 : isCopied.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isOpen == null) ? 0 : isOpen.hashCode());
		result = prime * result + ((isPrivate == null) ? 0 : isPrivate.hashCode());
		result = prime * result + ((isSendOut == null) ? 0 : isSendOut.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((usersSharedWith == null) ? 0 : usersSharedWith.hashCode());
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
		ClientContactFileAttachment other = (ClientContactFileAttachment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (clientContact == null) {
			if (other.clientContact != null)
				return false;
		} else if (!clientContact.equals(other.clientContact))
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
		if (distribution == null) {
			if (other.distribution != null)
				return false;
		} else if (!distribution.equals(other.distribution))
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
		if (fileType == null) {
			if (other.fileType != null)
				return false;
		} else if (!fileType.equals(other.fileType))
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
		if (isPrivate == null) {
			if (other.isPrivate != null)
				return false;
		} else if (!isPrivate.equals(other.isPrivate))
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
		if (usersSharedWith == null) {
			if (other.usersSharedWith != null)
				return false;
		} else if (!usersSharedWith.equals(other.usersSharedWith))
			return false;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientContactFileAttachment{\nid=");
		builder.append(id);
		builder.append(", \nclientContact=");
		builder.append(clientContact);
		builder.append(", \ncontentSubType=");
		builder.append(contentSubType);
		builder.append(", \ncontentType=");
		builder.append(contentType);
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \ndescription=");
		builder.append(description);
		builder.append(", \ndirectory=");
		builder.append(directory);
		builder.append(", \ndistribution=");
		builder.append(distribution);
		builder.append(", \nexternalID=");
		builder.append(externalID);
		builder.append(", \nfileExtension=");
		builder.append(fileExtension);
		builder.append(", \nfileSize=");
		builder.append(fileSize);
		builder.append(", \nfileType=");
		builder.append(fileType);
		builder.append(", \nisCopied=");
		builder.append(isCopied);
		builder.append(", \nisDeleted=");
		builder.append(isDeleted);
		builder.append(", \nisOpen=");
		builder.append(isOpen);
		builder.append(", \nisPrivate=");
		builder.append(isPrivate);
		builder.append(", \nisSendOut=");
		builder.append(isSendOut);
		builder.append(", \nname=");
		builder.append(name);
		builder.append(", \ntype=");
		builder.append(type);
		builder.append(", \nusersSharedWith=");
		builder.append(usersSharedWith);
		builder.append(", \nuuid=");
		builder.append(uuid);
		builder.append("\n}");
		return builder.toString();
	}
}
