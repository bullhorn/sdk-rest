package com.bullhornsdk.data.model.entity.core.paybill.optionslookup;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by mkesmetzis 22-Apr-20
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label", "isDeleted", "description", "isSystem", "isHidden", "shouldShowInPicker",
    "dateAdded", "dateLastModified", "modifiedByUser"})
public class SpecializedOptionsLookup extends SimplifiedOptionsLookup {

    private String description;
    private Boolean isSystem;
    private Boolean isHidden;
    private Boolean shouldShowInPicker;
    private DateTime dateAdded;
    private DateTime dateLastModified;
    private CorporateUser modifiedByUser;

    public SpecializedOptionsLookup() {
        super();
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isSystem")
    public Boolean getSystem() {
        return isSystem;
    }

    @JsonProperty("isSystem")
    public void setSystem(Boolean system) {
        isSystem = system;
    }

    @JsonProperty("isHidden")
    public Boolean getHidden() {
        return isHidden;
    }

    @JsonProperty("isHidden")
    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    @JsonProperty("shouldShowInPicker")
    public Boolean getShouldShowInPicker() {
        return shouldShowInPicker;
    }

    @JsonProperty("shouldShowInPicker")
    public void setShouldShowInPicker(Boolean shouldShowInPicker) {
        this.shouldShowInPicker = shouldShowInPicker;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("modifiedByUser")
    public CorporateUser getModifiedByUser() {
        return modifiedByUser;
    }

    @JsonProperty("modifiedByUser")
    public void setModifiedByUser(CorporateUser modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    @Override
    public String toString() {
        return "SpecializedOptionsLookup{" +
            "description='" + description + '\'' +
            ", isSystem=" + isSystem +
            ", isHidden=" + isHidden +
            ", shouldShowInPicker=" + shouldShowInPicker +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", modifiedByUser=" + modifiedByUser +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecializedOptionsLookup that = (SpecializedOptionsLookup) o;
        return Objects.equals(description, that.description) &&
            Objects.equals(isSystem, that.isSystem) &&
            Objects.equals(isHidden, that.isHidden) &&
            Objects.equals(shouldShowInPicker, that.shouldShowInPicker) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(modifiedByUser, that.modifiedByUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), description, isSystem, isHidden, shouldShowInPicker, dateAdded, dateLastModified, modifiedByUser);
    }
}
