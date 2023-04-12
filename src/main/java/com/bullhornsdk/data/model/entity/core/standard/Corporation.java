package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

@JsonRootName("data")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Corporation extends AbstractEntity implements QueryEntity {
    private Integer id;
    private Address address;
    private String companyURL;
    private DateTime dateAdded;
    private DateTime dateBillingBegin;
    private DateTime dateBillingEnd;
    private Boolean enabled;
    private String externalID;
    private String fax;
    private BigDecimal flatMonthlyFee;
    private Integer flatStorageLimitMB;
    private String inboundListenerEmail;
    private BigDecimal minimumMonthlyFee;
    private String name;
    private String newLeadEmail;
    private Integer perUserStorageLimitMB;
    private String phone;
    private PrivateLabel privateLabel;
    private OneToMany<PrivateLabel> privateLabels;
    private BigDecimal storageFee;

    public Corporation() {
    }

    public Integer getId() {
        return this.id;
    }

    public Address getAddress() {
        return this.address;
    }

    public String getCompanyURL() {
        return this.companyURL;
    }

    public DateTime getDateAdded() {
        return this.dateAdded;
    }

    public DateTime getDateBillingBegin() {
        return this.dateBillingBegin;
    }

    public DateTime getDateBillingEnd() {
        return this.dateBillingEnd;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public String getExternalID() {
        return this.externalID;
    }

    public String getFax() {
        return this.fax;
    }

    public BigDecimal getFlatMonthlyFee() {
        return this.flatMonthlyFee;
    }

    public Integer getFlatStorageLimitMB() {
        return this.flatStorageLimitMB;
    }

    public String getInboundListenerEmail() {
        return this.inboundListenerEmail;
    }

    public BigDecimal getMinimumMonthlyFee() {
        return this.minimumMonthlyFee;
    }

    public String getName() {
        return this.name;
    }

    public String getNewLeadEmail() {
        return this.newLeadEmail;
    }

    public Integer getPerUserStorageLimitMB() {
        return this.perUserStorageLimitMB;
    }

    public String getPhone() {
        return this.phone;
    }

    public PrivateLabel getPrivateLabel() {
        return this.privateLabel;
    }

    public OneToMany<PrivateLabel> getPrivateLabels() {
        return this.privateLabels;
    }

    public BigDecimal getStorageFee() {
        return this.storageFee;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public void setDateAdded(DateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateBillingBegin(DateTime dateBillingBegin) {
        this.dateBillingBegin = dateBillingBegin;
    }

    public void setDateBillingEnd(DateTime dateBillingEnd) {
        this.dateBillingEnd = dateBillingEnd;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setFlatMonthlyFee(BigDecimal flatMonthlyFee) {
        this.flatMonthlyFee = flatMonthlyFee;
    }

    public void setFlatStorageLimitMB(Integer flatStorageLimitMB) {
        this.flatStorageLimitMB = flatStorageLimitMB;
    }

    public void setInboundListenerEmail(String inboundListenerEmail) {
        this.inboundListenerEmail = inboundListenerEmail;
    }

    public void setMinimumMonthlyFee(BigDecimal minimumMonthlyFee) {
        this.minimumMonthlyFee = minimumMonthlyFee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewLeadEmail(String newLeadEmail) {
        this.newLeadEmail = newLeadEmail;
    }

    public void setPerUserStorageLimitMB(Integer perUserStorageLimitMB) {
        this.perUserStorageLimitMB = perUserStorageLimitMB;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPrivateLabel(PrivateLabel privateLabel) {
        this.privateLabel = privateLabel;
    }

    public void setPrivateLabels(OneToMany<PrivateLabel> privateLabels) {
        this.privateLabels = privateLabels;
    }

    public void setStorageFee(BigDecimal storageFee) {
        this.storageFee = storageFee;
    }

    public String toString() {
        return "Corporation(id=" + this.getId() + ", address=" + this.getAddress() + ", companyURL=" + this.getCompanyURL() + ", dateAdded=" + this.getDateAdded() + ", dateBillingBegin=" + this.getDateBillingBegin() + ", dateBillingEnd=" + this.getDateBillingEnd() + ", enabled=" + this.getEnabled() + ", externalID=" + this.getExternalID() + ", fax=" + this.getFax() + ", flatMonthlyFee=" + this.getFlatMonthlyFee() + ", flatStorageLimitMB=" + this.getFlatStorageLimitMB() + ", inboundListenerEmail=" + this.getInboundListenerEmail() + ", minimumMonthlyFee=" + this.getMinimumMonthlyFee() + ", name=" + this.getName() + ", newLeadEmail=" + this.getNewLeadEmail() + ", perUserStorageLimitMB=" + this.getPerUserStorageLimitMB() + ", phone=" + this.getPhone() + ", privateLabel=" + this.getPrivateLabel() + ", privateLabels=" + this.getPrivateLabels() + ", storageFee=" + this.getStorageFee() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Corporation that = (Corporation) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(address, that.address)) return false;
        if (!Objects.equals(companyURL, that.companyURL)) return false;
        if (!Objects.equals(dateAdded, that.dateAdded)) return false;
        if (!Objects.equals(dateBillingBegin, that.dateBillingBegin))
            return false;
        if (!Objects.equals(dateBillingEnd, that.dateBillingEnd))
            return false;
        if (!Objects.equals(enabled, that.enabled)) return false;
        if (!Objects.equals(externalID, that.externalID)) return false;
        if (!Objects.equals(fax, that.fax)) return false;
        if (!Objects.equals(flatMonthlyFee, that.flatMonthlyFee))
            return false;
        if (!Objects.equals(flatStorageLimitMB, that.flatStorageLimitMB))
            return false;
        if (!Objects.equals(inboundListenerEmail, that.inboundListenerEmail))
            return false;
        if (!Objects.equals(minimumMonthlyFee, that.minimumMonthlyFee))
            return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(newLeadEmail, that.newLeadEmail)) return false;
        if (!Objects.equals(perUserStorageLimitMB, that.perUserStorageLimitMB))
            return false;
        if (!Objects.equals(phone, that.phone)) return false;
        if (!Objects.equals(privateLabel, that.privateLabel)) return false;
        if (!Objects.equals(privateLabels, that.privateLabels))
            return false;
        return Objects.equals(storageFee, that.storageFee);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (companyURL != null ? companyURL.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateBillingBegin != null ? dateBillingBegin.hashCode() : 0);
        result = 31 * result + (dateBillingEnd != null ? dateBillingEnd.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (flatMonthlyFee != null ? flatMonthlyFee.hashCode() : 0);
        result = 31 * result + (flatStorageLimitMB != null ? flatStorageLimitMB.hashCode() : 0);
        result = 31 * result + (inboundListenerEmail != null ? inboundListenerEmail.hashCode() : 0);
        result = 31 * result + (minimumMonthlyFee != null ? minimumMonthlyFee.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (newLeadEmail != null ? newLeadEmail.hashCode() : 0);
        result = 31 * result + (perUserStorageLimitMB != null ? perUserStorageLimitMB.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (privateLabel != null ? privateLabel.hashCode() : 0);
        result = 31 * result + (privateLabels != null ? privateLabels.hashCode() : 0);
        result = 31 * result + (storageFee != null ? storageFee.hashCode() : 0);
        return result;
    }
}
