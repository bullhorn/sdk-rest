package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
		"customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20",
		"customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "dateLastComment",
		"departments", "email", "email2", "email3", "emailNotify", "emailSignature", "enabled", "externalEmail", "fax", "fax2", "fax3",
		"firstName", "inboundEmailEnabled", "isDayLightSavings", "isDeleted", "isLockedOut", "isOutboundFaxEnabled", "jobAssignments",
		"lastName", "loginRestrictions", "massMailOptOut", "middleName", "mobile", "name", "namePrefix", "nameSuffix", "nickName",
		"occupation", "pager", "phone", "phone2", "phone3", "primaryDepartment", "privateLabel", "privateLabels", "reportToPerson",
		"smsOptIn","taskAssignments", "timeZoneOffsetEST", "userDateAdded", "username" })
public class CorporateUser extends CustomFieldsA implements QueryEntity, AssociationEntity, EditHistoryEntity {

	private Integer id;

	private Address address;

	private DateTime dateLastComment;

	private OneToMany<CorporationDepartment> departments;

	private OneToMany<PrivateLabel> privateLabels;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((dateLastComment == null) ? 0 : dateLastComment.hashCode());
		result = prime * result + ((departments == null) ? 0 : departments.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result + ((emailNotify == null) ? 0 : emailNotify.hashCode());
		result = prime * result + ((emailSignature == null) ? 0 : emailSignature.hashCode());
		result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
		result = prime * result + ((externalEmail == null) ? 0 : externalEmail.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((fax2 == null) ? 0 : fax2.hashCode());
		result = prime * result + ((fax3 == null) ? 0 : fax3.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((inboundEmailEnabled == null) ? 0 : inboundEmailEnabled.hashCode());
		result = prime * result + ((isDayLightSavings == null) ? 0 : isDayLightSavings.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isLockedOut == null) ? 0 : isLockedOut.hashCode());
		result = prime * result + ((isOutboundFaxEnabled == null) ? 0 : isOutboundFaxEnabled.hashCode());
		result = prime * result + ((jobAssignments == null) ? 0 : jobAssignments.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((loginRestrictions == null) ? 0 : loginRestrictions.hashCode());
		result = prime * result + ((massMailOptOut == null) ? 0 : massMailOptOut.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((namePrefix == null) ? 0 : namePrefix.hashCode());
		result = prime * result + ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((pager == null) ? 0 : pager.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime * result + ((primaryDepartment == null) ? 0 : primaryDepartment.hashCode());
		result = prime * result + ((privateLabel == null) ? 0 : privateLabel.hashCode());
        result = prime * result + ((reportToPerson == null) ? 0 : reportToPerson.hashCode());
		result = prime * result + ((smsOptIn == null) ? 0 : smsOptIn.hashCode());
		result = prime * result + ((taskAssignments == null) ? 0 : taskAssignments.hashCode());
        result = prime * result + ((userDateAdded == null) ? 0 : userDateAdded.hashCode());
		result = prime * result + ((timeZoneOffsetEST == null) ? 0 : timeZoneOffsetEST.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CorporateUser other = (CorporateUser) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (dateLastComment == null) {
			if (other.dateLastComment != null)
				return false;
		} else if (!dateLastComment.equals(other.dateLastComment))
			return false;
		if (departments == null) {
			if (other.departments != null)
				return false;
		} else if (!departments.equals(other.departments))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (email3 == null) {
			if (other.email3 != null)
				return false;
		} else if (!email3.equals(other.email3))
			return false;
		if (emailNotify == null) {
			if (other.emailNotify != null)
				return false;
		} else if (!emailNotify.equals(other.emailNotify))
			return false;
		if (emailSignature == null) {
			if (other.emailSignature != null)
				return false;
		} else if (!emailSignature.equals(other.emailSignature))
			return false;
		if (enabled == null) {
			if (other.enabled != null)
				return false;
		} else if (!enabled.equals(other.enabled))
			return false;
		if (externalEmail == null) {
			if (other.externalEmail != null)
				return false;
		} else if (!externalEmail.equals(other.externalEmail))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (fax2 == null) {
			if (other.fax2 != null)
				return false;
		} else if (!fax2.equals(other.fax2))
			return false;
		if (fax3 == null) {
			if (other.fax3 != null)
				return false;
		} else if (!fax3.equals(other.fax3))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inboundEmailEnabled == null) {
			if (other.inboundEmailEnabled != null)
				return false;
		} else if (!inboundEmailEnabled.equals(other.inboundEmailEnabled))
			return false;
		if (isDayLightSavings == null) {
			if (other.isDayLightSavings != null)
				return false;
		} else if (!isDayLightSavings.equals(other.isDayLightSavings))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (isLockedOut == null) {
			if (other.isLockedOut != null)
				return false;
		} else if (!isLockedOut.equals(other.isLockedOut))
			return false;
		if (isOutboundFaxEnabled == null) {
			if (other.isOutboundFaxEnabled != null)
				return false;
		} else if (!isOutboundFaxEnabled.equals(other.isOutboundFaxEnabled))
			return false;
		if (jobAssignments == null) {
			if (other.jobAssignments != null)
				return false;
		} else if (!jobAssignments.equals(other.jobAssignments))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (loginRestrictions == null) {
			if (other.loginRestrictions != null)
				return false;
		} else if (!loginRestrictions.equals(other.loginRestrictions))
			return false;
		if (massMailOptOut == null) {
			if (other.massMailOptOut != null)
				return false;
		} else if (!massMailOptOut.equals(other.massMailOptOut))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (mobile == null) {
			if (other.mobile != null)
				return false;
		} else if (!mobile.equals(other.mobile))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (namePrefix == null) {
			if (other.namePrefix != null)
				return false;
		} else if (!namePrefix.equals(other.namePrefix))
			return false;
		if (nameSuffix == null) {
			if (other.nameSuffix != null)
				return false;
		} else if (!nameSuffix.equals(other.nameSuffix))
			return false;
		if (nickName == null) {
			if (other.nickName != null)
				return false;
		} else if (!nickName.equals(other.nickName))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		if (pager == null) {
			if (other.pager != null)
				return false;
		} else if (!pager.equals(other.pager))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (phone2 == null) {
			if (other.phone2 != null)
				return false;
		} else if (!phone2.equals(other.phone2))
			return false;
		if (phone3 == null) {
			if (other.phone3 != null)
				return false;
		} else if (!phone3.equals(other.phone3))
			return false;
		if (primaryDepartment == null) {
			if (other.primaryDepartment != null)
				return false;
		} else if (!primaryDepartment.equals(other.primaryDepartment))
			return false;
		if (privateLabel == null) {
			if (other.privateLabel != null)
				return false;
		} else if (!privateLabel.equals(other.privateLabel))
			return false;
		if (reportToPerson == null) {
			if (other.reportToPerson != null)
				return false;
	 	} else if (!reportToPerson.equals(other.reportToPerson))
			return false;
		if (smsOptIn == null) {
			if (other.smsOptIn != null)
				return false;
		} else if (!smsOptIn.equals(other.smsOptIn))
			return false;
		if (taskAssignments == null) {
			if (other.taskAssignments != null)
				return false;
		} else if (!taskAssignments.equals(other.taskAssignments))
			return false;
        if (userDateAdded == null) {
            if (other.userDateAdded != null)
                return false;
        } else if (!userDateAdded.equals(other.userDateAdded))
            return false;
		if (timeZoneOffsetEST == null) {
			if (other.timeZoneOffsetEST != null)
				return false;
		} else if (!timeZoneOffsetEST.equals(other.timeZoneOffsetEST))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getName());
		builder.append(" {\n\tid: ");
		builder.append(id);
		builder.append("\n\taddress: ");
		builder.append(address);
		builder.append("\n\tdateLastComment: ");
		builder.append(dateLastComment);
		builder.append("\n\tdepartments: ");
		builder.append(departments);
		builder.append("\n\temail: ");
		builder.append(email);
		builder.append("\n\temail2: ");
		builder.append(email2);
		builder.append("\n\temail3: ");
		builder.append(email3);
		builder.append("\n\temailNotify: ");
		builder.append(emailNotify);
		builder.append("\n\temailSignature: ");
		builder.append(emailSignature);
		builder.append("\n\tenabled: ");
		builder.append(enabled);
		builder.append("\n\texternalEmail: ");
		builder.append(externalEmail);
		builder.append("\n\tfax: ");
		builder.append(fax);
		builder.append("\n\tfax2: ");
		builder.append(fax2);
		builder.append("\n\tfax3: ");
		builder.append(fax3);
		builder.append("\n\tfirstName: ");
		builder.append(firstName);
		builder.append("\n\tinboundEmailEnabled: ");
		builder.append(inboundEmailEnabled);
		builder.append("\n\tisDayLightSavings: ");
		builder.append(isDayLightSavings);
		builder.append("\n\tisDeleted: ");
		builder.append(isDeleted);
		builder.append("\n\tisLockedOut: ");
		builder.append(isLockedOut);
		builder.append("\n\tisOutboundFaxEnabled: ");
		builder.append(isOutboundFaxEnabled);
		builder.append("\n\tjobAssignments: ");
		builder.append(jobAssignments);
		builder.append("\n\tlastName: ");
		builder.append(lastName);
		builder.append("\n\tloginRestrictions: ");
		builder.append(loginRestrictions);
		builder.append("\n\tmassMailOptOut: ");
		builder.append(massMailOptOut);
		builder.append("\n\tmiddleName: ");
		builder.append(middleName);
		builder.append("\n\tmobile: ");
		builder.append(mobile);
		builder.append("\n\tname: ");
		builder.append(name);
		builder.append("\n\tnamePrefix: ");
		builder.append(namePrefix);
		builder.append("\n\tnameSuffix: ");
		builder.append(nameSuffix);
		builder.append("\n\tnickName: ");
		builder.append(nickName);
		builder.append("\n\toccupation: ");
		builder.append(occupation);
		builder.append("\n\tpager: ");
		builder.append(pager);
		builder.append("\n\tphone: ");
		builder.append(phone);
		builder.append("\n\tphone2: ");
		builder.append(phone2);
		builder.append("\n\tphone3: ");
		builder.append(phone3);
		builder.append("\n\tprimaryDepartment: ");
		builder.append(primaryDepartment);
		builder.append("\n\tprivateLabel: ");
		builder.append(privateLabel);
		builder.append("\n\treportToPerson: ");
		builder.append(reportToPerson);
		builder.append("\n\tsmsOptIn: ");
		builder.append(smsOptIn);
		builder.append("\n\ttaskAssignments: ");
		builder.append(taskAssignments);
		builder.append("\n\ttimeZoneOffsetEST: ");
		builder.append(timeZoneOffsetEST);
        builder.append("\n\tuserDateAdded: ");
        builder.append(userDateAdded);
		builder.append("\n\tusername: ");
		builder.append(username);
		builder.append("\n\tuserType: ");
		builder.append(userType);
		builder.append("\n}");
		return builder.toString();
	}

}
