package com.bullhornsdk.data.model.entity.core.standard;


import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id" })
public class PrivateLabel extends AbstractEntity implements QueryEntity {

    private Integer id;

    @JsonIgnore
    private String attributeList;

    private OneToMany<BusinessSector> businessSectors;

    private OneToMany<Certification> certifications;

    private OneToMany<PrivateLabel> childPrivateLabels;

    @JsonIgnore
    private String coBrandedTitle;

    @JsonIgnore
    private String coBrandedURL;

    private OneToMany<CorporateUser> corporateUsers;

    private OneToMany<ClientCorporation> corporations;

    private DateTime dateAdded;

    private CorporateUser defaultWebLeadRecruiter;

    @JsonIgnore
    private String description;

    private Boolean enabled;

    @JsonIgnore
    private String footerHTML;

    @JsonIgnore
    private String headerHTML;

    @JsonIgnore
    private String keyWords;

    @JsonIgnore
    private String name;

    private Integer noLookAndFeel;

    @JsonIgnore
    private String onLoadScript;

    private PrivateLabel parentPrivateLabel;

    private OneToMany<PrivateLabelAttribute> privateLabelAttributes;

    @JsonIgnore
    private String splashPage;

    @JsonIgnore
    private String styleHTML;

    @JsonIgnore
    private String title;

    @JsonIgnore
    private String type;

    private UserType userType;

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

    @JsonProperty("attributeList")
    public String getAttributeList() {
        return attributeList;
    }

    @JsonIgnore
    public void setAttributeList(String attributeList) {
        this.attributeList = attributeList;
    }

    @JsonProperty("businessSectors")
    public void setBusinessSectors(OneToMany<BusinessSector> businessSectors) {
        this.businessSectors = businessSectors;
    }

    @JsonIgnore
    public OneToMany<BusinessSector> getBusinessSectors() {
        return businessSectors;
    }

    @JsonProperty("certifications")
    public void setCertifications(OneToMany<Certification> certifications) {
        this.certifications = certifications;
    }

    @JsonIgnore
    public OneToMany<Certification> getCertifications() {
        return certifications;
    }

    @JsonProperty("childPrivateLabels")
    public void setChildPrivateLabels(OneToMany<PrivateLabel> childPrivateLabels) {
        this.childPrivateLabels = childPrivateLabels;
    }

    @JsonIgnore
    public OneToMany<PrivateLabel> getChildPrivateLabels() {
        return childPrivateLabels;
    }

    @JsonProperty("coBrandedTitle")
    public String getCoBrandedTitle() {
        return coBrandedTitle;
    }

    @JsonIgnore
    public void setCoBrandedTitle(String coBrandedTitle) {
        this.coBrandedTitle = coBrandedTitle;
    }

    @JsonProperty("coBrandedURL")
    public String getCoBrandedURL() {
        return coBrandedURL;
    }

    @JsonIgnore
    public void setCoBrandedURL(String coBrandedURL) {
        this.coBrandedURL = coBrandedURL;
    }

    @JsonIgnore
    public OneToMany<CorporateUser> getCorporateUsers() {
        return corporateUsers;
    }

    @JsonProperty("corporateUsers")
    public void setCorporateUsers(OneToMany<CorporateUser> corporateUsers) {
        this.corporateUsers = corporateUsers;
    }

    @JsonIgnore
    public OneToMany<ClientCorporation> getClientCorporations() {
        return corporations;
    }

    @JsonProperty("corporations")
    public void setClientCorporations(OneToMany<ClientCorporation> corporations) {
        this.corporations = corporations;
    }

    @JsonProperty("dateAdded")
    public DateTime getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("dateAdded")
    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("defaultWebLeadRecruiter")
    public CorporateUser getDefaultWebLeadRecruiter() {
        return defaultWebLeadRecruiter;
    }

    @JsonProperty("defaultWebLeadRecruiter")
    public void setDefaultWebLeadRecruiter(CorporateUser defaultWebLeadRecruiter) {
        this.defaultWebLeadRecruiter = defaultWebLeadRecruiter;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonIgnore
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("footerHTML")
    public String getFooterHTML() {
        return footerHTML;
    }

    @JsonIgnore
    public void setFooterHTML(String footerHTML) {
        this.footerHTML = footerHTML;
    }

    @JsonProperty("headerHTML")
    public String getHeaderHTML() {
        return headerHTML;
    }

    @JsonIgnore
    public void setHeaderHTML(String headerHTML) {
        this.headerHTML = headerHTML;
    }

    @JsonProperty("keyWords")
    public String getKeyWords() {
        return keyWords;
    }

    @JsonIgnore
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("noLookAndFeel")
    public Integer getNoLookAndFeel() {
        return noLookAndFeel;
    }

    @JsonProperty("noLookAndFeel")
    public void setNoLookAndFeel(Integer noLookAndFeel) {
        this.noLookAndFeel = noLookAndFeel;
    }

    @JsonProperty("onLoadScript")
    public String getOnLoadScript() {
        return onLoadScript;
    }

    @JsonIgnore
    public void setOnLoadScript(String onLoadScript) {
        this.onLoadScript = onLoadScript;
    }

    @JsonProperty("parentPrivateLabel")
    public void setPrivateLabel(PrivateLabel parentPrivateLabel) {
        this.parentPrivateLabel = parentPrivateLabel;
    }

    @JsonProperty("parentPrivateLabel")
    public PrivateLabel getPrivateLabel() {
        return parentPrivateLabel;
    }

    @JsonIgnore
    public OneToMany<PrivateLabelAttribute> getPrivateLabelAttributes() {
        return privateLabelAttributes;
    }

    @JsonProperty("privateLabelAttributes")
    public void setPrivateLabelAttributes(OneToMany<PrivateLabelAttribute> privateLabelAttributes) {
        this.privateLabelAttributes = privateLabelAttributes;
    }

    @JsonProperty("splashPage")
    public String getSplashPage() {
        return splashPage;
    }

    @JsonIgnore
    public void setSplashPage(String splashPage) {
        this.splashPage = splashPage;
    }

    @JsonProperty("styleHTML")
    public String getStyleHTML() {
        return styleHTML;
    }

    @JsonIgnore
    public void setStyleHTML(String styleHTML) {
        this.styleHTML = styleHTML;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonIgnore
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonIgnore
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("userType")
    public UserType getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (attributeList != null ? attributeList.hashCode() : 0);
        result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
        result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
        result = 31 * result + (childPrivateLabels != null ? childPrivateLabels.hashCode() : 0);
        result = 31 * result + (coBrandedTitle != null ? coBrandedTitle.hashCode() : 0);
        result = 31 * result + (coBrandedURL != null ? coBrandedURL.hashCode() : 0);
        result = 31 * result + (corporateUsers != null ? corporateUsers.hashCode() : 0);
        result = 31 * result + (corporations != null ? corporations.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (defaultWebLeadRecruiter != null ? defaultWebLeadRecruiter.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (footerHTML != null ? footerHTML.hashCode() : 0);
        result = 31 * result + (headerHTML != null ? headerHTML.hashCode() : 0);
        result = 31 * result + (keyWords != null ? keyWords.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (noLookAndFeel != null ? noLookAndFeel.hashCode() : 0);
        result = 31 * result + (onLoadScript != null ? onLoadScript.hashCode() : 0);
        result = 31 * result + (parentPrivateLabel != null ? parentPrivateLabel.hashCode() : 0);
        result = 31 * result + (privateLabelAttributes != null ? privateLabelAttributes.hashCode() : 0);
        result = 31 * result + (splashPage != null ? splashPage.hashCode() : 0);
        result = 31 * result + (styleHTML != null ? styleHTML.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
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
        PrivateLabel other = (PrivateLabel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (attributeList == null) {
            if (other.attributeList != null)
                return false;
        } else if (!attributeList.equals(other.attributeList))
            return false;
        if (businessSectors == null) {
            if (other.businessSectors != null)
                return false;
        } else if (!businessSectors.equals(other.businessSectors))
            return false;
        if (certifications == null) {
            if (other.certifications != null)
                return false;
        } else if (!certifications.equals(other.certifications))
            return false;
        if (childPrivateLabels == null) {
            if (other.childPrivateLabels != null)
                return false;
        } else if (!childPrivateLabels.equals(other.childPrivateLabels))
            return false;
        if (coBrandedTitle == null) {
            if (other.coBrandedTitle != null)
                return false;
        } else if (!coBrandedTitle.equals(other.coBrandedTitle))
            return false;
        if (coBrandedURL == null) {
            if (other.coBrandedURL != null)
                return false;
        } else if (!coBrandedURL.equals(other.coBrandedURL))
            return false;
        if (corporateUsers == null) {
            if (other.corporateUsers != null)
                return false;
        } else if (!corporateUsers.equals(other.corporateUsers))
            return false;
        if (corporations == null) {
            if (other.corporations != null)
                return false;
        } else if (!corporations.equals(other.corporations))
            return false;
        if (dateAdded == null) {
            if (other.dateAdded != null)
                return false;
        } else if (!dateAdded.equals(other.dateAdded))
            return false;
        if (defaultWebLeadRecruiter == null) {
            if (other.defaultWebLeadRecruiter != null)
                return false;
        } else if (!defaultWebLeadRecruiter.equals(other.defaultWebLeadRecruiter))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (enabled == null) {
            if (other.enabled != null)
                return false;
        } else if (!enabled.equals(other.enabled))
            return false;
        if (footerHTML == null) {
            if (other.footerHTML != null)
                return false;
        } else if (!footerHTML.equals(other.footerHTML))
            return false;
        if (headerHTML == null) {
            if (other.headerHTML != null)
                return false;
        } else if (!headerHTML.equals(other.headerHTML))
            return false;
        if (keyWords == null) {
            if (other.keyWords != null)
                return false;
        } else if (!keyWords.equals(other.keyWords))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (noLookAndFeel == null) {
            if (other.noLookAndFeel != null)
                return false;
        } else if (!noLookAndFeel.equals(other.noLookAndFeel))
            return false;
        if (onLoadScript == null) {
            if (other.onLoadScript != null)
                return false;
        } else if (!onLoadScript.equals(other.onLoadScript))
            return false;
        if (parentPrivateLabel == null) {
            if (other.parentPrivateLabel != null)
                return false;
        } else if (!parentPrivateLabel.equals(other.parentPrivateLabel))
            return false;
        if (privateLabelAttributes == null) {
            if (other.privateLabelAttributes != null)
                return false;
        } else if (!privateLabelAttributes.equals(other.privateLabelAttributes))
            return false;
        if (splashPage == null) {
            if (other.splashPage != null)
                return false;
        } else if (!splashPage.equals(other.splashPage))
            return false;
        if (styleHTML == null) {
            if (other.styleHTML != null)
                return false;
        } else if (!styleHTML.equals(other.styleHTML))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        } else if (!type.equals(other.type))
            return false;
        if (userType == null) {
            if (other.userType != null)
                return false;
        } else if (!userType.equals(other.userType))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PrivateLabel{" +
                "id=" + id +
                ", attributeList=" + attributeList +
                ", businessSectors=" + businessSectors +
                ", certifications=" + certifications +
                ", childPrivateLabels=" + childPrivateLabels +
                ", coBrandedTitle=" + coBrandedTitle +
                ", coBrandedURL=" + coBrandedURL +
                ", corporateUsers=" + corporateUsers +
                ", corporations=" + corporations +
                ", dateAdded=" + dateAdded +
                ", defaultWebLeadRecruiter=" + defaultWebLeadRecruiter +
                ", description=" + description +
                ", enabled=" + enabled +
                ", footerHTML=" + footerHTML +
                ", headerHTML=" + headerHTML +
                ", keyWords=" + keyWords +
                ", name=" + name +
                ", noLookAndFeel=" + noLookAndFeel +
                ", onLoadScript=" + onLoadScript +
                ", parentPrivateLabel=" + parentPrivateLabel +
                ", privateLabelAttributes=" + privateLabelAttributes +
                ", splashPage=" + splashPage +
                ", styleHTML=" + styleHTML +
                ", title=" + title +
                ", type=" + type +
                ", userType=" + userType +
                '}';
    }

}