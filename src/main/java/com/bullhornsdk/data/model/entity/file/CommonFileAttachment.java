package com.bullhornsdk.data.model.entity.file;

import java.util.Objects;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author jwesselmann
 * @since 07/17/2020
 */
public abstract class CommonFileAttachment extends AbstractEntity implements QueryEntity, UpdateEntity {

    private Integer id;

    @Size(max = 64)
    private String contentSubType;

    @Size(max = 64)
    private String contentType;

    private DateTime dateAdded;

    @Size(max = 150)
    private String directory;

    @Size(max = 10)
    private String fileExtension;

    private Integer fileSize;

    private CorporateUser fileOwner;

    private Boolean isEncrypted;

    private Boolean isExternal;

    private String name;

    @Size(max = 50)
    private String type;

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

    @JsonProperty("directory")
    public String getDirectory() {
        return directory;
    }

    @JsonProperty("directory")
    public void setDirectory(String directory) {
        this.directory = directory;
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

    @JsonProperty("isEncrypted")
    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    @JsonProperty("isEncrypted")
    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    @JsonProperty("isExternal")
    public Boolean getIsExternal() {
        return isExternal;
    }

    @JsonProperty("isExternal")
    public void setIsExternal(Boolean isExternal) {
        this.isExternal = isExternal;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonFileAttachment that = (CommonFileAttachment) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(contentSubType, that.contentSubType) &&
            Objects.equals(contentType, that.contentType) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(directory, that.directory) &&
            Objects.equals(fileExtension, that.fileExtension) &&
            Objects.equals(fileSize, that.fileSize) &&
            Objects.equals(fileOwner, that.fileOwner) &&
            Objects.equals(isEncrypted, that.isEncrypted) &&
            Objects.equals(isExternal, that.isExternal) &&
            Objects.equals(name, that.name) &&
            Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contentSubType, contentType, dateAdded, directory, fileExtension, fileSize, fileOwner, isEncrypted, isExternal, name, type);
    }

    @Override
    public String toString() {
        return "CommonFileAttachment{" +
            "id=" + id +
            ", contentSubType='" + contentSubType + '\'' +
            ", contentType='" + contentType + '\'' +
            ", dateAdded=" + dateAdded +
            ", directory='" + directory + '\'' +
            ", fileExtension='" + fileExtension + '\'' +
            ", fileSize=" + fileSize +
            ", fileOwner=" + fileOwner +
            ", isEncrypted=" + isEncrypted +
            ", isExternal=" + isExternal +
            ", name='" + name + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
}
