package com.bullhornsdk.data.model.entity.file;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.standard.CorporationDepartment;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;

/**
 * @author Murray
 * @since 11/08/2017
 */
public abstract class EntityFileAttachment implements QueryEntity, UpdateEntity {

    private Integer id;

    @Size(max = 64)
    private String contentSubType;

    @Size(max = 64)
    private String contentType;

    private DateTime dateAdded;

    private OneToMany<CorporationDepartment> departmentsSharedWith;

    private String description;

    @Size(max = 150)
    private String directory;

    @Size(max = 8)
    private String distribution;

    @Size(max = 100)
    private String externalID;

    @Size(max = 10)
    private String fileExtension;

    private Integer fileSize;

    @Size(max = 15)
    private String fileType;

    private CorporateUser fileOwner;

    private Boolean isCopied;

    private Boolean isDeleted;

    private Boolean isExternal;

    private Boolean isOpen;

    private Boolean isPrivate;

    private Boolean isSendOut;

    private String name;

    @Size(max = 50)
    private String type;

    @JsonIgnore
    private OneToMany<CorporateUser> usersSharedWith;

    @JsonIgnore
    @Size(max = 36)
    private String uuid;

    @Override
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @ReadOnly
    @Override
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("departmentsSharedWith")
    public OneToMany<CorporationDepartment> getDepartmentsSharedWith() {
        return departmentsSharedWith;
    }

    @JsonProperty("departmentsSharedWith")
    public void setDepartmentsSharedWith(OneToMany<CorporationDepartment> departmentsSharedWith) {
        this.departmentsSharedWith = departmentsSharedWith;
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

    @JsonProperty("fileOwner")
    public CorporateUser getFileOwner() {
        return fileOwner;
    }

    @JsonProperty("fileOwner")
    public void setFileOwner(CorporateUser fileOwner) {
        this.fileOwner = fileOwner;
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
    public Boolean getCopied() {
        return isCopied;
    }

    @JsonProperty("isCopied")
    public void setCopied(Boolean isCopied) {
        this.isCopied = isCopied;
    }

    @JsonProperty("isDeleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isExternal")
    public Boolean getExternal() {
        return isExternal;
    }

    @JsonProperty("isExternal")
    public void setExternal(Boolean isExternal) {
        this.isExternal = isExternal;
    }

    @JsonProperty("isOpen")
    public Boolean getOpen() {
        return isOpen;
    }

    @JsonProperty("isOpen")
    public void setOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    @JsonProperty("isPrivate")
    public Boolean getPrivate() {
        return isPrivate;
    }

    @JsonProperty("isPrivate")
    public void setPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    @JsonProperty("isSendOut")
    public Boolean getSendOut() {
        return isSendOut;
    }

    @JsonProperty("isSendOut")
    public void setSendOut(Boolean isSendOut) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityFileAttachment that = (EntityFileAttachment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (contentSubType != null ? !contentSubType.equals(that.contentSubType) : that.contentSubType != null)
            return false;
        if (contentType != null ? !contentType.equals(that.contentType) : that.contentType != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (departmentsSharedWith != null ? !departmentsSharedWith.equals(that.departmentsSharedWith) : that.departmentsSharedWith != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (directory != null ? !directory.equals(that.directory) : that.directory != null) return false;
        if (distribution != null ? !distribution.equals(that.distribution) : that.distribution != null) return false;
        if (externalID != null ? !externalID.equals(that.externalID) : that.externalID != null) return false;
        if (fileExtension != null ? !fileExtension.equals(that.fileExtension) : that.fileExtension != null)
            return false;
        if (fileSize != null ? !fileSize.equals(that.fileSize) : that.fileSize != null) return false;
        if (fileType != null ? !fileType.equals(that.fileType) : that.fileType != null) return false;
        if (fileOwner != null ? !fileOwner.equals(that.fileOwner) : that.fileOwner != null) return false;
        if (isCopied != null ? !isCopied.equals(that.isCopied) : that.isCopied != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (isExternal != null ? !isExternal.equals(that.isExternal) : that.isExternal != null) return false;
        if (isOpen != null ? !isOpen.equals(that.isOpen) : that.isOpen != null) return false;
        if (isPrivate != null ? !isPrivate.equals(that.isPrivate) : that.isPrivate != null) return false;
        if (isSendOut != null ? !isSendOut.equals(that.isSendOut) : that.isSendOut != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (usersSharedWith != null ? !usersSharedWith.equals(that.usersSharedWith) : that.usersSharedWith != null)
            return false;
        return uuid != null ? uuid.equals(that.uuid) : that.uuid == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (contentSubType != null ? contentSubType.hashCode() : 0);
        result = 31 * result + (contentType != null ? contentType.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (departmentsSharedWith != null ? departmentsSharedWith.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (directory != null ? directory.hashCode() : 0);
        result = 31 * result + (distribution != null ? distribution.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (fileExtension != null ? fileExtension.hashCode() : 0);
        result = 31 * result + (fileSize != null ? fileSize.hashCode() : 0);
        result = 31 * result + (fileType != null ? fileType.hashCode() : 0);
        result = 31 * result + (fileOwner != null ? fileOwner.hashCode() : 0);
        result = 31 * result + (isCopied != null ? isCopied.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isExternal != null ? isExternal.hashCode() : 0);
        result = 31 * result + (isOpen != null ? isOpen.hashCode() : 0);
        result = 31 * result + (isPrivate != null ? isPrivate.hashCode() : 0);
        result = 31 * result + (isSendOut != null ? isSendOut.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (usersSharedWith != null ? usersSharedWith.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
