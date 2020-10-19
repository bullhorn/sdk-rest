package com.bullhornsdk.data.model.entity.core.paybill.invoice;

import com.bullhornsdk.data.model.entity.core.standard.CorporateUser;
import com.bullhornsdk.data.model.entity.core.type.*;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.*;

import org.joda.time.DateTime;

import java.util.Objects;

/**
 * Created by kin.to 9/26/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "label",
    "dateAdded", "dateLastModified", "description", "isDeleted",
    "isHidden", "isSystem", "modifiedByUser", "shouldShowInPicker"})
public class InvoiceTermFileTypesForInvoicing extends AbstractEntity implements QueryEntity, DateLastModifiedEntity   {

    private Integer id;

    private String label;

    private DateTime dateAdded;

    private DateTime dateLastModified;

    @JsonIgnore
    private String description;

    private Boolean isDeleted;

    private Boolean isHidden;

    private Boolean isSystem;

    private CorporateUser modifiedByUser;

    private Boolean shouldShowInPicker;



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

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @ReadOnly
    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @ReadOnly
    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isHidden")
    public Boolean getIsHidden() {
        return isHidden;
    }

    @JsonProperty("isHidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    @JsonProperty("isSystem")
    public Boolean getIsSystem() {
        return isSystem;
    }

    @JsonProperty("isSystem")
    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
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
    public String toString() {
        return "InvoiceTermFileTypesForInvoicing{" +
            "id=" + id +
            ", label='" + label + '\'' +
            ", description='" + description + '\'' +
            ", isSystem=" + isSystem +
            ", isHidden=" + isHidden +
            ", isDeleted=" + isDeleted +
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
        InvoiceTermFileTypesForInvoicing that = (InvoiceTermFileTypesForInvoicing) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(label, that.label) &&
            Objects.equals(description, that.description) &&
            Objects.equals(isSystem, that.isSystem) &&
            Objects.equals(isHidden, that.isHidden) &&
            Objects.equals(isDeleted, that.isDeleted) &&
            Objects.equals(shouldShowInPicker, that.shouldShowInPicker) &&
            Objects.equals(dateAdded, that.dateAdded) &&
            Objects.equals(dateLastModified, that.dateLastModified) &&
            Objects.equals(modifiedByUser, that.modifiedByUser);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, label, description, isSystem, isHidden, isDeleted, shouldShowInPicker, dateAdded, dateLastModified, modifiedByUser);
    }


}
