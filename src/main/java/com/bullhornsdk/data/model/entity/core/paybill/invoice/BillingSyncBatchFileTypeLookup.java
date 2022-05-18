package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;
import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by fayranne.lipton 4/7/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "dateAdded", "dateLastModified", "description", "isDeleted", "isHidden", "isSystem", "label", "modifiedByUser", "shouldShowInPicker"})
public class BillingSyncBatchFileTypeLookup extends CustomFieldsB implements QueryEntity,
    UpdateEntity, CreateEntity, DateLastModifiedEntity, SoftDeleteEntity {

    private Integer id;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private Boolean isDeleted;

    private Boolean isHidden;

    private Boolean isSystem;

    @JsonIgnore
    private String label;

    private CorporateUser modifiedByUser;

    private Boolean shouldShowInPicker;

    public BillingSyncBatchFileTypeLookup() {
    }

    public BillingSyncBatchFileTypeLookup(Integer id) {
        this.id = id;
    }

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

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @JsonProperty("isHidden")
    public Boolean getHidden() {
        return isHidden;
    }

    @JsonProperty("isHidden")
    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    @JsonProperty("isSystem")
    public Boolean getSystem() {
        return isSystem;
    }

    @JsonProperty("isSystem")
    public void setSystem(Boolean system) {
        isSystem = system;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("modifiedByUser")
    public CorporateUser getModifiedByUser() {
        return modifiedByUser;
    }

    @JsonProperty("modifiedByUser")
    public void setModifiedByUser(CorporateUser modifiedByUser) {
        this.modifiedByUser = modifiedByUser;
    }

    @JsonProperty("shouldShowInPicker")
    public Boolean getShouldShowInPicker() {
        return shouldShowInPicker;
    }

    @JsonProperty("shouldShowInPicker")
    public void setShouldShowInPicker(Boolean shouldShowInPicker) {
        this.shouldShowInPicker = shouldShowInPicker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BillingSyncBatchFileTypeLookup that = (BillingSyncBatchFileTypeLookup) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(description, that.description) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(isHidden, that.isHidden) &&
            Objects.equals(isSystem, that.isSystem) &&
            Objects.equals(label, that.label) &&
            Objects.equals(modifiedByUser, that.modifiedByUser) &&
            Objects.equals(shouldShowInPicker, that.shouldShowInPicker);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), id, dateAdded, dateLastModified, description, isDeleted, isHidden, isSystem, label, modifiedByUser, shouldShowInPicker);
    }

    @Override
    public String toString() {
        return "BillingSyncBatchFileTypeLookup{" +
            "id=" + id +
            ", dateAdded=" + dateAdded +
            ", dateLastModified=" + dateLastModified +
            ", description='" + description + '\'' +
            ", isDeleted=" + isDeleted +
            ", isHidden=" + isHidden +
            ", isSystem=" + isSystem +
            ", label='" + label + '\'' +
            ", modifiedByUser=" + modifiedByUser +
            ", shouldShowInPicker=" + shouldShowInPicker +
            '}';
    }
}
