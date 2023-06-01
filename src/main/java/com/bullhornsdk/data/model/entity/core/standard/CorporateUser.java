package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import com.bullhornsdk.data.model.entity.core.paybill.Location;
import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsA;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LoginRestrictions;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "address", "branches", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
    "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
    "customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20",
    "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "dateLastComment",
    "departments", "email", "email2", "email3", "emailNotify", "emailSignature", "enabled", "externalEmail", "fax", "fax2", "fax3",
    "firstName", "inboundEmailEnabled", "isDayLightSavings", "isDeleted", "isLockedOut", "isOutboundFaxEnabled", "jobAssignments",
    "lastName", "loginRestrictions", "massMailOptOut", "middleName", "mobile", "name", "namePrefix", "nameSuffix", "nickName",
    "occupation", "pager", "phone", "phone2", "phone3", "primaryDepartment", "privateLabel", "privateLabels", "reportToPerson",
    "smsOptIn", "taskAssignments", "timeZoneOffsetEST", "userDateAdded", "username", "corporation", "addressSourceLocation",
    "branch", "companyName", "dateLastModified", "delegations", "departmentIdList", "distributionLists", "favoriteSavedSearches"})
public class CorporateUser extends CustomFieldsA implements QueryEntity, AssociationEntity, EditHistoryEntity {

    private Integer id;

    private Address address;

    private DateTime dateLastComment;

    private OneToMany<CorporationDepartment> departments;

    private OneToMany<PrivateLabel> privateLabels;

    private OneToMany<Branch> branches;

    private Corporation corporation;

    @JsonIgnore
    @Email
    private String email;

    @JsonIgnore
    @Email
    private String email2;

    @JsonIgnore
    @Email
    private String email3;

    private Boolean emailNotify;

    @JsonIgnore
    private String emailSignature;

    private Boolean enabled;

    @JsonIgnore
    @Email
    private String externalEmail;

    @JsonIgnore
    private String fax;

    @JsonIgnore
    private String fax2;

    @JsonIgnore
    private String fax3;

    @JsonIgnore
    @Size(max = 50)
    private String firstName;

    private Boolean inboundEmailEnabled;

    private Boolean isDayLightSavings;

    private Boolean isDeleted;

    private Boolean isLockedOut;

    private Boolean isOutboundFaxEnabled;

    private OneToManyLinkedId jobAssignments;

    @JsonIgnore
    @Size(max = 50)
    private String lastName;

    private LoginRestrictions loginRestrictions;

    private Boolean massMailOptOut;

    @JsonIgnore
    @Size(max = 50)
    private String middleName;

    @JsonIgnore
    @Size(max = 20)
    private String mobile;

    @JsonIgnore
    @Size(max = 100)
    private String name;

    @JsonIgnore
    @Size(max = 5)
    private String namePrefix;

    @JsonIgnore
    @Size(max = 5)
    private String nameSuffix;

    @JsonIgnore
    @Size(max = 50)
    private String nickName;

    @JsonIgnore
    @Size(max = 50)
    private String occupation;

    @JsonIgnore
    @Size(max = 20)
    private String pager;

    @JsonIgnore
    @Size(max = 20)
    private String phone;

    @JsonIgnore
    @Size(max = 20)
    private String phone2;

    @JsonIgnore
    @Size(max = 20)
    private String phone3;

    private CorporationDepartment primaryDepartment;

    private PrivateLabel privateLabel;

    private Person reportToPerson;

    private Boolean smsOptIn;

    private OneToManyLinkedId taskAssignments;

    private Integer timeZoneOffsetEST;

    private DateTime userDateAdded;

    private Location addressSourceLocation;

    private Branch branch;

    private String companyName;

    private DateTime dateLastModified;

    private OneToMany<CorporateUser> delegations;

    private String departmentIdList;

    private OneToMany<DistributionList> distributionLists;

    private OneToMany<DistributionList> favoriteSavedSearches;

    @JsonIgnore
    @Size(max = 100)
    private String username;

    private UserType userType;

    public CorporateUser() {
        super();
    }

    public CorporateUser(Integer id) {
        super();
        this.id = id;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("dateLastComment")
    public DateTime getDateLastComment() {
        return dateLastComment;
    }

    @JsonProperty("dateLastComment")
    public void setDateLastComment(DateTime dateLastComment) {
        this.dateLastComment = dateLastComment;
    }

    @JsonProperty("departments")
    public OneToMany<CorporationDepartment> getDepartments() {
        return departments;
    }

    @JsonProperty("departments")
    public void setDepartments(OneToMany<CorporationDepartment> departments) {
        this.departments = departments;
    }

    @JsonProperty("privateLabels")
    public OneToMany<PrivateLabel> getPrivateLabels() {
        return privateLabels;
    }

    @JsonProperty("privateLabels")
    public void setPrivateLabels(OneToMany<PrivateLabel> privateLabels) {
        this.privateLabels = privateLabels;
    }

    @JsonProperty("branches")
    public OneToMany<Branch> getBranches() {
        return branches;
    }

    @JsonProperty("branches")
    public void setBranches(OneToMany<Branch> branches) {
        this.branches = branches;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonIgnore
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("email2")
    public String getEmail2() {
        return email2;
    }

    @JsonIgnore
    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    @JsonProperty("email3")
    public String getEmail3() {
        return email3;
    }

    @JsonIgnore
    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    @JsonProperty("emailNotify")
    public Boolean getEmailNotify() {
        return emailNotify;
    }

    @JsonProperty("emailNotify")
    public void setEmailNotify(Boolean emailNotify) {
        this.emailNotify = emailNotify;
    }

    @JsonProperty("emailSignature")
    public String getEmailSignature() {
        return emailSignature;
    }

    @JsonIgnore
    public void setEmailSignature(String emailSignature) {
        this.emailSignature = emailSignature;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("externalEmail")
    public String getExternalEmail() {
        return externalEmail;
    }

    @JsonIgnore
    public void setExternalEmail(String externalEmail) {
        this.externalEmail = externalEmail;
    }

    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    @JsonIgnore
    public void setFax(String fax) {
        this.fax = fax;
    }

    @JsonProperty("fax2")
    public String getFax2() {
        return fax2;
    }

    @JsonIgnore
    public void setFax2(String fax2) {
        this.fax2 = fax2;
    }

    @JsonProperty("fax3")
    public String getFax3() {
        return fax3;
    }

    @JsonIgnore
    public void setFax3(String fax3) {
        this.fax3 = fax3;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonIgnore
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("inboundEmailEnabled")
    public Boolean getInboundEmailEnabled() {
        return inboundEmailEnabled;
    }

    @JsonProperty("inboundEmailEnabled")
    public void setInboundEmailEnabled(Boolean inboundEmailEnabled) {
        this.inboundEmailEnabled = inboundEmailEnabled;
    }

    @JsonProperty("isDayLightSavings")
    public Boolean getIsDayLightSavings() {
        return isDayLightSavings;
    }

    @JsonProperty("isDayLightSavings")
    public void setIsDayLightSavings(Boolean isDayLightSavings) {
        this.isDayLightSavings = isDayLightSavings;
    }

    @JsonProperty("isDeleted")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("isDeleted")
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @JsonProperty("isLockedOut")
    public Boolean getIsLockedOut() {
        return isLockedOut;
    }

    @JsonProperty("isLockedOut")
    public void setIsLockedOut(Boolean isLockedOut) {
        this.isLockedOut = isLockedOut;
    }

    @JsonProperty("isOutboundFaxEnabled")
    public Boolean getIsOutboundFaxEnabled() {
        return isOutboundFaxEnabled;
    }

    @JsonProperty("isOutboundFaxEnabled")
    public void setIsOutboundFaxEnabled(Boolean isOutboundFaxEnabled) {
        this.isOutboundFaxEnabled = isOutboundFaxEnabled;
    }

    @JsonProperty("jobAssignments")
    public OneToManyLinkedId getJobAssignments() {
        return jobAssignments;
    }

    @JsonProperty("jobAssignments")
    public void setJobAssignments(OneToManyLinkedId jobAssignments) {
        this.jobAssignments = jobAssignments;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonIgnore
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("loginRestrictions")
    public LoginRestrictions getLoginRestrictions() {
        return loginRestrictions;
    }

    @JsonProperty("loginRestrictions")
    public void setLoginRestrictions(LoginRestrictions loginRestrictions) {
        this.loginRestrictions = loginRestrictions;
    }

    @JsonProperty("massMailOptOut")
    public Boolean getMassMailOptOut() {
        return massMailOptOut;
    }

    @JsonProperty("massMailOptOut")
    public void setMassMailOptOut(Boolean massMailOptOut) {
        this.massMailOptOut = massMailOptOut;
    }

    @JsonProperty("middleName")
    public String getMiddleName() {
        return middleName;
    }

    @JsonIgnore
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonIgnore
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonIgnore
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("namePrefix")
    public String getNamePrefix() {
        return namePrefix;
    }

    @JsonIgnore
    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    @JsonProperty("nameSuffix")
    public String getNameSuffix() {
        return nameSuffix;
    }

    @JsonIgnore
    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    @JsonIgnore
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("occupation")
    public String getOccupation() {
        return occupation;
    }

    @JsonIgnore
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @JsonProperty("pager")
    public String getPager() {
        return pager;
    }

    @JsonProperty("pager")
    public void setPager(String pager) {
        this.pager = pager;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonIgnore
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("phone2")
    public String getPhone2() {
        return phone2;
    }

    @JsonIgnore
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @JsonProperty("phone3")
    public String getPhone3() {
        return phone3;
    }

    @JsonIgnore
    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @JsonProperty("primaryDepartment")
    public CorporationDepartment getPrimaryDepartment() {
        return primaryDepartment;
    }

    @JsonProperty("primaryDepartment")
    public void setPrimaryDepartment(CorporationDepartment primaryDepartment) {
        this.primaryDepartment = primaryDepartment;
    }

    @JsonProperty("privateLabel")
    public PrivateLabel getPrivateLabel() {
        return privateLabel;
    }

    @JsonProperty("privateLabel")
    public void setPrivateLabel(PrivateLabel privateLabel) {
        this.privateLabel = privateLabel;
    }

    @JsonProperty("reportToPerson")
    public Person getReportToPerson() {
        return reportToPerson;
    }

    @JsonProperty("reportToPerson")
    public void setReportToPerson(Person reportToPerson) {
        this.reportToPerson = reportToPerson;
    }

    @JsonProperty("smsOptIn")
    public Boolean getSmsOptIn() {
        return smsOptIn;
    }

    @JsonProperty("smsOptIn")
    public void setSmsOptIn(Boolean smsOptIn) {
        this.smsOptIn = smsOptIn;
    }

    @JsonProperty("taskAssignments")
    public OneToManyLinkedId getTaskAssignments() {
        return taskAssignments;
    }

    @JsonProperty("taskAssignments")
    public void setTaskAssignments(OneToManyLinkedId taskAssignments) {
        this.taskAssignments = taskAssignments;
    }

    @JsonProperty("timeZoneOffsetEST")
    public Integer getTimeZoneOffsetEST() {
        return timeZoneOffsetEST;
    }

    @JsonProperty("timeZoneOffsetEST")
    public void setTimeZoneOffsetEST(Integer timeZoneOffsetEST) {
        this.timeZoneOffsetEST = timeZoneOffsetEST;
    }

    @JsonProperty("userDateAdded")
    public DateTime getUserDateAdded() {
        return userDateAdded;
    }

    @JsonProperty("userDateAdded")
    public void setUserDateAdded(DateTime userDateAdded) {
        this.userDateAdded = userDateAdded;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("userType")
    public UserType getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    @JsonProperty("corporation")
    public Corporation getCorporation() {
        return corporation;
    }

    @JsonProperty("corporation")
    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }

    @JsonProperty("addressSourceLocation")
    public Location getAddressSourceLocation() {
        return addressSourceLocation;
    }

    @JsonProperty("addressSourceLocation")
    public void setAddressSourceLocation(Location addressSourceLocation) {
        this.addressSourceLocation = addressSourceLocation;
    }

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("dateLastModified")
    public DateTime getDateLastModified() {
        return dateLastModified;
    }

    @JsonProperty("dateLastModified")
    public void setDateLastModified(DateTime dateLastModified) {
        this.dateLastModified = dateLastModified;
    }

    @JsonProperty("delegations")
    public OneToMany<CorporateUser> getDelegations() {
        return delegations;
    }

    @JsonProperty("delegations")
    public void setDelegations(OneToMany<CorporateUser> delegations) {
        this.delegations = delegations;
    }

    @JsonProperty("departmentIdList")
    public String getDepartmentIdList() {
        return departmentIdList;
    }

    @JsonProperty("departmentIdList")
    public void setDepartmentIdList(String departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    @JsonProperty("distributionLists")
    public OneToMany<DistributionList> getDistributionLists() {
        return distributionLists;
    }

    @JsonProperty("distributionLists")
    public void setDistributionLists(OneToMany<DistributionList> distributionLists) {
        this.distributionLists = distributionLists;
    }

    @JsonProperty("favoriteSavedSearches")
    public OneToMany<DistributionList> getFavoriteSavedSearches() {
        return favoriteSavedSearches;
    }

    @JsonProperty("favoriteSavedSearches")
    public void setFavoriteSavedSearches(OneToMany<DistributionList> favoriteSavedSearches) {
        this.favoriteSavedSearches = favoriteSavedSearches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CorporateUser that = (CorporateUser) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(address, that.address)) return false;
        if (!Objects.equals(dateLastComment, that.dateLastComment))
            return false;
        if (!Objects.equals(departments, that.departments)) return false;
        if (!Objects.equals(privateLabels, that.privateLabels))
            return false;
        if (!Objects.equals(branches, that.branches)) return false;
        if (!Objects.equals(corporation, that.corporation)) return false;
        if (!Objects.equals(email, that.email)) return false;
        if (!Objects.equals(email2, that.email2)) return false;
        if (!Objects.equals(email3, that.email3)) return false;
        if (!Objects.equals(emailNotify, that.emailNotify)) return false;
        if (!Objects.equals(emailSignature, that.emailSignature))
            return false;
        if (!Objects.equals(enabled, that.enabled)) return false;
        if (!Objects.equals(externalEmail, that.externalEmail))
            return false;
        if (!Objects.equals(fax, that.fax)) return false;
        if (!Objects.equals(fax2, that.fax2)) return false;
        if (!Objects.equals(fax3, that.fax3)) return false;
        if (!Objects.equals(firstName, that.firstName)) return false;
        if (!Objects.equals(inboundEmailEnabled, that.inboundEmailEnabled))
            return false;
        if (!Objects.equals(isDayLightSavings, that.isDayLightSavings))
            return false;
        if (!Objects.equals(isDeleted, that.isDeleted)) return false;
        if (!Objects.equals(isLockedOut, that.isLockedOut)) return false;
        if (!Objects.equals(isOutboundFaxEnabled, that.isOutboundFaxEnabled))
            return false;
        if (!Objects.equals(jobAssignments, that.jobAssignments))
            return false;
        if (!Objects.equals(lastName, that.lastName)) return false;
        if (!Objects.equals(loginRestrictions, that.loginRestrictions))
            return false;
        if (!Objects.equals(massMailOptOut, that.massMailOptOut))
            return false;
        if (!Objects.equals(middleName, that.middleName)) return false;
        if (!Objects.equals(mobile, that.mobile)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(namePrefix, that.namePrefix)) return false;
        if (!Objects.equals(nameSuffix, that.nameSuffix)) return false;
        if (!Objects.equals(nickName, that.nickName)) return false;
        if (!Objects.equals(occupation, that.occupation)) return false;
        if (!Objects.equals(pager, that.pager)) return false;
        if (!Objects.equals(phone, that.phone)) return false;
        if (!Objects.equals(phone2, that.phone2)) return false;
        if (!Objects.equals(phone3, that.phone3)) return false;
        if (!Objects.equals(primaryDepartment, that.primaryDepartment))
            return false;
        if (!Objects.equals(privateLabel, that.privateLabel)) return false;
        if (!Objects.equals(reportToPerson, that.reportToPerson))
            return false;
        if (!Objects.equals(smsOptIn, that.smsOptIn)) return false;
        if (!Objects.equals(taskAssignments, that.taskAssignments))
            return false;
        if (!Objects.equals(timeZoneOffsetEST, that.timeZoneOffsetEST))
            return false;
        if (!Objects.equals(userDateAdded, that.userDateAdded))
            return false;
        if (!Objects.equals(addressSourceLocation, that.addressSourceLocation))
            return false;
        if (!Objects.equals(branch, that.branch)) return false;
        if (!Objects.equals(companyName, that.companyName)) return false;
        if (!Objects.equals(dateLastModified, that.dateLastModified))
            return false;
        if (!Objects.equals(delegations, that.delegations)) return false;
        if (!Objects.equals(departmentIdList, that.departmentIdList))
            return false;
        if (!Objects.equals(distributionLists, that.distributionLists))
            return false;
        if (!Objects.equals(favoriteSavedSearches, that.favoriteSavedSearches))
            return false;
        if (!Objects.equals(username, that.username)) return false;
        return Objects.equals(userType, that.userType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (dateLastComment != null ? dateLastComment.hashCode() : 0);
        result = 31 * result + (departments != null ? departments.hashCode() : 0);
        result = 31 * result + (privateLabels != null ? privateLabels.hashCode() : 0);
        result = 31 * result + (branches != null ? branches.hashCode() : 0);
        result = 31 * result + (corporation != null ? corporation.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (email2 != null ? email2.hashCode() : 0);
        result = 31 * result + (email3 != null ? email3.hashCode() : 0);
        result = 31 * result + (emailNotify != null ? emailNotify.hashCode() : 0);
        result = 31 * result + (emailSignature != null ? emailSignature.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (externalEmail != null ? externalEmail.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (fax2 != null ? fax2.hashCode() : 0);
        result = 31 * result + (fax3 != null ? fax3.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (inboundEmailEnabled != null ? inboundEmailEnabled.hashCode() : 0);
        result = 31 * result + (isDayLightSavings != null ? isDayLightSavings.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isLockedOut != null ? isLockedOut.hashCode() : 0);
        result = 31 * result + (isOutboundFaxEnabled != null ? isOutboundFaxEnabled.hashCode() : 0);
        result = 31 * result + (jobAssignments != null ? jobAssignments.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (loginRestrictions != null ? loginRestrictions.hashCode() : 0);
        result = 31 * result + (massMailOptOut != null ? massMailOptOut.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (namePrefix != null ? namePrefix.hashCode() : 0);
        result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (pager != null ? pager.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (phone3 != null ? phone3.hashCode() : 0);
        result = 31 * result + (primaryDepartment != null ? primaryDepartment.hashCode() : 0);
        result = 31 * result + (privateLabel != null ? privateLabel.hashCode() : 0);
        result = 31 * result + (reportToPerson != null ? reportToPerson.hashCode() : 0);
        result = 31 * result + (smsOptIn != null ? smsOptIn.hashCode() : 0);
        result = 31 * result + (taskAssignments != null ? taskAssignments.hashCode() : 0);
        result = 31 * result + (timeZoneOffsetEST != null ? timeZoneOffsetEST.hashCode() : 0);
        result = 31 * result + (userDateAdded != null ? userDateAdded.hashCode() : 0);
        result = 31 * result + (addressSourceLocation != null ? addressSourceLocation.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (delegations != null ? delegations.hashCode() : 0);
        result = 31 * result + (departmentIdList != null ? departmentIdList.hashCode() : 0);
        result = 31 * result + (distributionLists != null ? distributionLists.hashCode() : 0);
        result = 31 * result + (favoriteSavedSearches != null ? favoriteSavedSearches.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CorporateUser{" +
            "id=" + id +
            ", address=" + address +
            ", dateLastComment=" + dateLastComment +
            ", departments=" + departments +
            ", privateLabels=" + privateLabels +
            ", branches=" + branches +
            ", corporation=" + corporation +
            ", email='" + email + '\'' +
            ", email2='" + email2 + '\'' +
            ", email3='" + email3 + '\'' +
            ", emailNotify=" + emailNotify +
            ", emailSignature='" + emailSignature + '\'' +
            ", enabled=" + enabled +
            ", externalEmail='" + externalEmail + '\'' +
            ", fax='" + fax + '\'' +
            ", fax2='" + fax2 + '\'' +
            ", fax3='" + fax3 + '\'' +
            ", firstName='" + firstName + '\'' +
            ", inboundEmailEnabled=" + inboundEmailEnabled +
            ", isDayLightSavings=" + isDayLightSavings +
            ", isDeleted=" + isDeleted +
            ", isLockedOut=" + isLockedOut +
            ", isOutboundFaxEnabled=" + isOutboundFaxEnabled +
            ", jobAssignments=" + jobAssignments +
            ", lastName='" + lastName + '\'' +
            ", loginRestrictions=" + loginRestrictions +
            ", massMailOptOut=" + massMailOptOut +
            ", middleName='" + middleName + '\'' +
            ", mobile='" + mobile + '\'' +
            ", name='" + name + '\'' +
            ", namePrefix='" + namePrefix + '\'' +
            ", nameSuffix='" + nameSuffix + '\'' +
            ", nickName='" + nickName + '\'' +
            ", occupation='" + occupation + '\'' +
            ", pager='" + pager + '\'' +
            ", phone='" + phone + '\'' +
            ", phone2='" + phone2 + '\'' +
            ", phone3='" + phone3 + '\'' +
            ", primaryDepartment=" + primaryDepartment +
            ", privateLabel=" + privateLabel +
            ", reportToPerson=" + reportToPerson +
            ", smsOptIn=" + smsOptIn +
            ", taskAssignments=" + taskAssignments +
            ", timeZoneOffsetEST=" + timeZoneOffsetEST +
            ", userDateAdded=" + userDateAdded +
            ", addressSourceLocation=" + addressSourceLocation +
            ", branch=" + branch +
            ", companyName='" + companyName + '\'' +
            ", dateLastModified=" + dateLastModified +
            ", delegations=" + delegations +
            ", departmentIdList='" + departmentIdList + '\'' +
            ", distributionLists=" + distributionLists +
            ", favoriteSavedSearches=" + favoriteSavedSearches +
            ", username='" + username + '\'' +
            ", userType=" + userType +
            '}';
    }
}
