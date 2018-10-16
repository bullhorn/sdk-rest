package com.bullhornsdk.data.model.entity.core.customobject;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;

public abstract class CustomObjectBase {

    protected String name;

    protected String tabName;

    protected String displayType;

    protected Boolean enabled;

    protected String description;

    protected Timestamp dateAdded;

    protected Integer reportID;

    protected Integer corporationID;

    protected Integer objectNumber;

    protected Boolean useClientDefinedName;

    protected Boolean isHidden;

    protected String icon;

    protected String staticTemplateName;

    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    public String getTabName() {
        return tabName;
    }

    @JsonIgnore
    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public String getDisplayType() {
        return displayType;
    }

    @JsonIgnore
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    @JsonIgnore
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Integer getReportID() {
        return reportID;
    }

    @JsonIgnore
    public void setReportID(Integer reportID) {
        this.reportID = reportID;
    }

    public Integer getCorporationID() {
        return corporationID;
    }

    @JsonIgnore
    public void setCorporationID(Integer corporationID) {
        this.corporationID = corporationID;
    }

    public Integer getObjectNumber() { return objectNumber; }

    @JsonIgnore
    public void setObjectNumber(Integer objectNumber) {
        this.objectNumber = objectNumber;
    }

    public Boolean getUseClientDefinedName() {
        return useClientDefinedName;
    }

    @JsonIgnore
    public void setUseClientDefinedName(Boolean useClientDefinedName) { this.useClientDefinedName = useClientDefinedName; }

    public Boolean getIsHidden() {
        return isHidden;
    }

    @JsonIgnore
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public String getIcon() {
        return icon;
    }

    @JsonIgnore
    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStaticTemplateName() {
        return staticTemplateName;
    }

    @JsonIgnore
    public void setStaticTemplateName(String staticTemplateName) {
        this.staticTemplateName = staticTemplateName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomObjectBase{");

        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomObjectBase that = (CustomObjectBase) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (tabName != null ? !tabName.equals(that.tabName) : that.tabName != null) return false;
        if (displayType != null ? !displayType.equals(that.displayType) : that.displayType != null) return false;
        if (enabled != null ? !enabled.equals(that.enabled) : that.enabled != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (reportID != null ? !reportID.equals(that.reportID) : that.reportID != null) return false;
        if (corporationID != null ? !corporationID.equals(that.corporationID) : that.corporationID != null)
            return false;
        if (objectNumber != null ? !objectNumber.equals(that.objectNumber) : that.objectNumber != null) return false;
        if (useClientDefinedName != null ? !useClientDefinedName.equals(that.useClientDefinedName) : that.useClientDefinedName != null)
            return false;
        if (isHidden != null ? !isHidden.equals(that.isHidden) : that.isHidden != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        return staticTemplateName != null ? staticTemplateName.equals(that.staticTemplateName) : that.staticTemplateName == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tabName != null ? tabName.hashCode() : 0);
        result = 31 * result + (displayType != null ? displayType.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (reportID != null ? reportID.hashCode() : 0);
        result = 31 * result + (corporationID != null ? corporationID.hashCode() : 0);
        result = 31 * result + (objectNumber != null ? objectNumber.hashCode() : 0);
        result = 31 * result + (useClientDefinedName != null ? useClientDefinedName.hashCode() : 0);
        result = 31 * result + (isHidden != null ? isHidden.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (staticTemplateName != null ? staticTemplateName.hashCode() : 0);
        return result;
    }
}
