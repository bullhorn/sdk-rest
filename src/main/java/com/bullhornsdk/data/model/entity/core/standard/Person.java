package com.bullhornsdk.data.model.entity.core.standard;


import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.UserType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "companyName", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3", "customInt1", "customInt2", "customInt3", "customText1",
		"customText2", "customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText20",	"dateLastComment", "email", "email2", "email3", "fax", "fax2", "fax3",
		"firstName", "isDayLightSavingsTime", "isDeleted", "isLockedOut", "lastName", "massMailOptOut",  "masterUserID", "middleName", "mobile", "name", "namePrefix", "nameSuffix", "nickName", 
		"occupation", "pager", "personSubtype", "phone", "phone2", "phone3", "smsOptIn", "status", "timeZoneOffsetEST", "userType", "username" })
public class Person extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity, AssociationEntity {

	private Integer id;

	private Address address;

	@JsonIgnore
	@Size(max = 100)
	private String companyName;

	private DateTime dateLastComment;

	@JsonIgnore
	@Email
	@Size(max = 100)
	private String email;

	@JsonIgnore
	@Email
	@Size(max = 100)
	private String email2;

	@JsonIgnore
	@Email
	@Size(max = 100)
	private String email3;

	@JsonIgnore
	@Size(max = 20)
	private String fax;

	@JsonIgnore
	@Size(max = 20)
	private String fax2;

	@JsonIgnore
	@Size(max = 20)
	private String fax3;

	@JsonIgnore
	@Size(max = 50)
	private String firstName;

	private Boolean isDayLightSavingsTime;

	private Boolean isDeleted;

	private Boolean isLockedOut;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	private Boolean massMailOptOut;

	private Integer masterUserID;

	@JsonIgnore
	@Size(max = 50)
	private String middleName;

	@JsonIgnore
	@Size(max = 20)
	private String mobile;

	@JsonIgnore
	private String name;

	@JsonIgnore
	@Size(max = 5)
	private String namePrefix;

	@JsonIgnore
	@Size(max = 5)
	private String nameSuffix;

	@JsonIgnore
	private String nickName;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	@JsonIgnore
	@Size(max = 20)
	private String pager;

	@JsonIgnore
	@Size(max = 13)
	private String personSubtype;

	@JsonIgnore
	@Size(max = 20)
	private String phone;

	@JsonIgnore
	@Size(max = 20)
	private String phone2;

	@JsonIgnore
	@Size(max = 20)
	private String phone3;

	private Boolean smsOptIn;

	@JsonIgnore
	@Size(max = 100)
	private String status;

	private Integer timeZoneOffsetEST;
	
	private UserType userType;

	@JsonIgnore
	@Size(max = 100)
	private String username;

	public Person() {
		super();
	}

	public Person(Integer id) {
		super();
		this.id = id;
	}

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

	@JsonProperty("address")
	public Address getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(Address address) {
		this.address = address;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonProperty("companyName")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("dateLastComment")
	public DateTime getLastComment() {
		return dateLastComment;
	}

	@JsonProperty("dateLastComment")
	public void setDateLastComment(DateTime dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("email2")
	public String getEmail2() {
		return email2;
	}

	@JsonProperty("email2")
	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	@JsonProperty("email3")
	public String getEmail3() {
		return email3;
	}

	@JsonProperty("email3")
	public void setEmail3(String email3) {
		this.email3 = email3;
	}

	@JsonProperty("fax")
	public String getFax() {
		return fax;
	}

	@JsonProperty("fax")
	public void setFax(String fax) {
		this.fax = fax;
	}

	@JsonProperty("fax2")
	public String getFax2() {
		return fax2;
	}

	@JsonProperty("fax2")
	public void setFax2(String fax2) {
		this.fax2 = fax2;
	}

	@JsonProperty("fax3")
	public String getFax3() {
		return fax3;
	}

	@JsonProperty("fax3")
	public void setFax3(String fax3) {
		this.fax3 = fax3;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("isDayLightSavingsTime")
	public Boolean getIsDayLightSavingsTime() {
		return isDayLightSavingsTime;
	}

	@JsonProperty("isDayLightSavingsTime")
	public void setIsDayLightSavingsTime(Boolean isDayLightSavingsTime) {
		this.isDayLightSavingsTime = isDayLightSavingsTime;
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

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("massMailOptOut")
	public Boolean getMassMailOptOut() {
		return massMailOptOut;
	}

	@JsonProperty("massMailOptOut")
	public void setMassMailOptOut(Boolean massMailOptOut) {
		this.massMailOptOut = massMailOptOut;
	}

	@JsonProperty("masterUserID")
	public Integer getMasterUserID() {
		return masterUserID;
	}

	@JsonProperty("masterUserID")
	public void setMasterUserID(Integer masterUserID) {
		this.masterUserID = masterUserID;
	}

	@JsonProperty("middleName")
	public String getMiddleName() {
		return middleName;
	}

	@JsonProperty("middleName")
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@JsonProperty("mobile")
	public String getMobile() {
		return mobile;
	}

	@JsonProperty("mobile")
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
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

	@JsonProperty("_subtype")
	public String getPersonSubtype() {
		return personSubtype;
	}

	@JsonProperty("_subtype")
	public void setPersonSubtype(String personSubtype) {
		this.personSubtype = personSubtype;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonProperty("phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("phone2")
	public String getPhone2() {
		return phone2;
	}

	@JsonProperty("phone2")
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	@JsonProperty("phone3")
	public String getPhone3() {
		return phone3;
	}

	@JsonProperty("phone3")
	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	@JsonProperty("smsOptIn")
	public Boolean getSmsOptIn() {
		return smsOptIn;
	}

	@JsonProperty("smsOptIn")
	public void setSmsOptIn(Boolean smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("timeZoneOffsetEST")
	public Integer getTimeZoneOffsetEST() {
		return timeZoneOffsetEST;
	}

	@JsonProperty("timeZoneOffsetEST")
	public void setTimeZoneOffsetEST(Integer timeZoneOffsetEST) {
		this.timeZoneOffsetEST = timeZoneOffsetEST;
	}

	@JsonProperty("userType")
	public UserType getUserType() {
		return userType;
	}

	@JsonIgnore
	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonIgnore
	public void setUsername(String username) {
		this.username = username;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((dateLastComment == null) ? 0 : dateLastComment.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((fax2 == null) ? 0 : fax2.hashCode());
		result = prime * result + ((fax3 == null) ? 0 : fax3.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isDayLightSavingsTime == null) ? 0 : isDayLightSavingsTime.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((isLockedOut == null) ? 0 : isLockedOut.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((massMailOptOut == null) ? 0 : massMailOptOut.hashCode());
		result = prime * result + ((masterUserID == null) ? 0 : masterUserID.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((namePrefix == null) ? 0 : namePrefix.hashCode());
		result = prime * result + ((nameSuffix == null) ? 0 : nameSuffix.hashCode());
		result = prime * result + ((nickName == null) ? 0 : nickName.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((pager == null) ? 0 : pager.hashCode());
		result = prime * result + ((personSubtype == null) ? 0 : personSubtype.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((phone2 == null) ? 0 : phone2.hashCode());
		result = prime * result + ((phone3 == null) ? 0 : phone3.hashCode());
		result = prime * result + ((smsOptIn == null) ? 0 : smsOptIn.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((timeZoneOffsetEST == null) ? 0 : timeZoneOffsetEST.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
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
		Person other = (Person) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (dateLastComment == null) {
			if (other.dateLastComment != null)
				return false;
		} else if (!dateLastComment.equals(other.dateLastComment))
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
		if (isDayLightSavingsTime == null) {
			if (other.isDayLightSavingsTime != null)
				return false;
		} else if (!isDayLightSavingsTime.equals(other.isDayLightSavingsTime))
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
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (massMailOptOut == null) {
			if (other.massMailOptOut != null)
				return false;
		} else if (!massMailOptOut.equals(other.massMailOptOut))
			return false;
		if (masterUserID == null) {
			if (other.masterUserID != null)
				return false;
		} else if (!masterUserID.equals(other.masterUserID))
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
		if (personSubtype == null) {
			if (other.personSubtype != null)
				return false;
		} else if (!personSubtype.equals(other.personSubtype))
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
		if (smsOptIn == null) {
			if (other.smsOptIn != null)
				return false;
		} else if (!smsOptIn.equals(other.smsOptIn))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timeZoneOffsetEST == null) {
			if (other.timeZoneOffsetEST != null)
				return false;
		} else if (!timeZoneOffsetEST.equals(other.timeZoneOffsetEST))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        if(includeLineBreaks)
            lbc = ",\n ";
        StringBuilder builder = new StringBuilder(getClass().getSimpleName()+" { ");
        if(includeLineBreaks)
            builder.append("\n");
        if(id != null){
            builder.append("id=");
            builder.append(id);
        }
        if(address != null){
            builder.append(lbc + "address=");
            builder.append(address.toStringNonNull(includeLineBreaks));
        }
        if(companyName != null){
            builder.append(lbc + "companyName=");
            builder.append(companyName);
        }
        if(dateLastComment != null){
            builder.append(lbc + "dateLastComment=");
            builder.append(dateLastComment);
        }
        if(email != null){
            builder.append(lbc + "email=");
            builder.append(email);
        }
        if(email2 != null){
            builder.append(lbc + "email2=");
            builder.append(email2);
        }
        if(email3 != null){
            builder.append(lbc + "email3=");
            builder.append(email3);
        }
        if(fax != null){
            builder.append(lbc + "fax=");
            builder.append(fax);
        }
        if(fax2 != null){
            builder.append(lbc + "fax2=");
            builder.append(fax2);
        }
        if(fax3 != null){
            builder.append(lbc + "fax3=");
            builder.append(fax3);
        }
        if(firstName != null){
            builder.append(lbc + "firstName=");
            builder.append(firstName);
        }
        if(isDayLightSavingsTime != null){
            builder.append(lbc + "isDayLightSavingsTime=");
            builder.append(isDayLightSavingsTime);
        }
        if(isDeleted != null){
            builder.append(lbc + "isDeleted=");
            builder.append(isDeleted);
        }
        if(isLockedOut != null){
            builder.append(lbc + "isLockedOut=");
            builder.append(isLockedOut);
        }
        if(lastName != null){
            builder.append(lbc + "lastName=");
            builder.append(lastName);
        }
        if(massMailOptOut != null){
            builder.append(lbc + "massMailOptOut=");
            builder.append(massMailOptOut);
        }
        if(masterUserID != null){
            builder.append(lbc + "masterUserID=");
            builder.append(masterUserID);
        }
        if(middleName != null){
            builder.append(lbc + "middleName=");
            builder.append(middleName);
        }
        if(mobile != null){
            builder.append(lbc + "mobile=");
            builder.append(mobile);
        }
        if(name != null){
            builder.append(lbc + "name=");
            builder.append(name);
        }
        if(namePrefix != null){
            builder.append(lbc + "namePrefix=");
            builder.append(namePrefix);
        }
        if(nameSuffix != null){
            builder.append(lbc + "nameSuffix=");
            builder.append(nameSuffix);
        }
        if(nickName != null){
            builder.append(lbc + "nickName=");
            builder.append(nickName);
        }
        if(occupation != null){
            builder.append(lbc + "occupation=");
            builder.append(occupation);
        }
        if(pager != null){
            builder.append(lbc + "pager=");
            builder.append(pager);
        }
        if(personSubtype != null){
            builder.append(lbc + "personSubtype=");
            builder.append(personSubtype);
        }
        if(phone != null){
            builder.append(lbc + "phone=");
            builder.append(phone);
        }
        if(phone2 != null){
            builder.append(lbc + "phone2=");
            builder.append(phone2);
        }
        if(phone3 != null){
            builder.append(lbc + "phone3=");
            builder.append(phone3);
        }
        if(smsOptIn != null){
            builder.append(lbc + "smsOptIn=");
            builder.append(smsOptIn);
        }
        if(status != null){
            builder.append(lbc + "status=");
            builder.append(status);
        }
        if(timeZoneOffsetEST != null){
            builder.append(lbc + "timeZoneOffsetEST=");
            builder.append(timeZoneOffsetEST);
        }
        if(username != null){
            builder.append(lbc + "username=");
            builder.append(username);
        }
        if(userType != null){
            builder.append(lbc + "userType=");
            builder.append(userType);
        }
        builder.append(super.toStringNonNull(includeLineBreaks));
        if(includeLineBreaks)
            builder.append("\n");
        builder.append("}");
        return builder.toString();
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        StringBuilder builder = new StringBuilder(getClass().getSimpleName()+" { ");
        if(id != null){
            builder.append("id=");
            builder.append(id);
        }
        if(address != null){
            builder.append(lbc + "address=");
            builder.append(address.toStringNonNull());
        }
        if(companyName != null){
            builder.append(lbc + "companyName=");
            builder.append(companyName);
        }
        if(dateLastComment != null){
            builder.append(lbc + "dateLastComment=");
            builder.append(dateLastComment);
        }
        if(email != null){
            builder.append(lbc + "email=");
            builder.append(email);
        }
        if(email2 != null){
            builder.append(lbc + "email2=");
            builder.append(email2);
        }
        if(email3 != null){
            builder.append(lbc + "email3=");
            builder.append(email3);
        }
        if(fax != null){
            builder.append(lbc + "fax=");
            builder.append(fax);
        }
        if(fax2 != null){
            builder.append(lbc + "fax2=");
            builder.append(fax2);
        }
        if(fax3 != null){
            builder.append(lbc + "fax3=");
            builder.append(fax3);
        }
        if(firstName != null){
            builder.append(lbc + "firstName=");
            builder.append(firstName);
        }
        if(isDayLightSavingsTime != null){
            builder.append(lbc + "isDayLightSavingsTime=");
            builder.append(isDayLightSavingsTime);
        }
        if(isDeleted != null){
            builder.append(lbc + "isDeleted=");
            builder.append(isDeleted);
        }
        if(isLockedOut != null){
            builder.append(lbc + "isLockedOut=");
            builder.append(isLockedOut);
        }
        if(lastName != null){
            builder.append(lbc + "lastName=");
            builder.append(lastName);
        }
        if(massMailOptOut != null){
            builder.append(lbc + "massMailOptOut=");
            builder.append(massMailOptOut);
        }
        if(masterUserID != null){
            builder.append(lbc + "masterUserID=");
            builder.append(masterUserID);
        }
        if(middleName != null){
            builder.append(lbc + "middleName=");
            builder.append(middleName);
        }
        if(mobile != null){
            builder.append(lbc + "mobile=");
            builder.append(mobile);
        }
        if(name != null){
            builder.append(lbc + "name=");
            builder.append(name);
        }
        if(namePrefix != null){
            builder.append(lbc + "namePrefix=");
            builder.append(namePrefix);
        }
        if(nameSuffix != null){
            builder.append(lbc + "nameSuffix=");
            builder.append(nameSuffix);
        }
        if(nickName != null){
            builder.append(lbc + "nickName=");
            builder.append(nickName);
        }
        if(occupation != null){
            builder.append(lbc + "occupation=");
            builder.append(occupation);
        }
        if(pager != null){
            builder.append(lbc + "pager=");
            builder.append(pager);
        }
        if(personSubtype != null){
            builder.append(lbc + "personSubtype=");
            builder.append(personSubtype);
        }
        if(phone != null){
            builder.append(lbc + "phone=");
            builder.append(phone);
        }
        if(phone2 != null){
            builder.append(lbc + "phone2=");
            builder.append(phone2);
        }
        if(phone3 != null){
            builder.append(lbc + "phone3=");
            builder.append(phone3);
        }
        if(smsOptIn != null){
            builder.append(lbc + "smsOptIn=");
            builder.append(smsOptIn);
        }
        if(status != null){
            builder.append(lbc + "status=");
            builder.append(status);
        }
        if(timeZoneOffsetEST != null){
            builder.append(lbc + "timeZoneOffsetEST=");
            builder.append(timeZoneOffsetEST);
        }
        if(username != null){
            builder.append(lbc + "username=");
            builder.append(username);
        }
        if(userType != null){
            builder.append(lbc + "userType=");
            builder.append(userType);
        }
        builder.append(super.toStringNonNull());
        builder.append("}");
        return builder.toString();
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(getClass().getSimpleName()+" { ");
		builder.append("id=");
		builder.append(id);
		builder.append(", address=");
		builder.append(address);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", dateLastComment=");
		builder.append(dateLastComment);
		builder.append(", email=");
		builder.append(email);
		builder.append(", email2=");
		builder.append(email2);
		builder.append(", email3=");
		builder.append(email3);
		builder.append(", fax=");
		builder.append(fax);
		builder.append(", fax2=");
		builder.append(fax2);
		builder.append(", fax3=");
		builder.append(fax3);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", isDayLightSavingsTime=");
		builder.append(isDayLightSavingsTime);
		builder.append(", isDeleted=");
		builder.append(isDeleted);
		builder.append(", isLockedOut=");
		builder.append(isLockedOut);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", massMailOptOut=");
		builder.append(massMailOptOut);
		builder.append(", masterUserID=");
		builder.append(masterUserID);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", mobile=");
		builder.append(mobile);
		builder.append(", name=");
		builder.append(name);
		builder.append(", namePrefix=");
		builder.append(namePrefix);
		builder.append(", nameSuffix=");
		builder.append(nameSuffix);
		builder.append(", nickName=");
		builder.append(nickName);
		builder.append(", occupation=");
		builder.append(occupation);
		builder.append(", pager=");
		builder.append(pager);
		builder.append(", personSubtype=");
		builder.append(personSubtype);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", phone2=");
		builder.append(phone2);
		builder.append(", phone3=");
		builder.append(phone3);
		builder.append(", smsOptIn=");
		builder.append(smsOptIn);
		builder.append(", status=");
		builder.append(status);
		builder.append(", timeZoneOffsetEST=");
		builder.append(timeZoneOffsetEST);
		builder.append(", username=");
		builder.append(username);
		builder.append(", userType=");
		builder.append(userType);
        builder.append(super.toString());
		builder.append("}");
		return builder.toString();
	}

}
