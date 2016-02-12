package com.bullhornsdk.data.model.entity.core.standard;

import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.Email;
import org.joda.time.DateTime;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.PersonCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LinkedPerson;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.RestUtil;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "businessSectors", "categories",
		"category", "certifications", "clientContactID", "clientCorporation",
		"comments", "customDate1", "customDate2", "customDate3",
		"customFloat1", "customFloat2", "customFloat3", "customInt1",
		"customInt2", "customInt3", "customText1", "customText10",
		"customText11", "customText12", "customText13", "customText14",
		"customText15", "customText16", "customText17", "customText18",
		"customText19", "customText2", "customText20", "customText3",
		"customText4", "customText5", "customText6", "customText7",
		"customText8", "customText9", "customTextBlock1", "customTextBlock2",
		"customTextBlock3", "customTextBlock4", "customTextBlock5",
		"dateAdded", "dateLastComment", "dateLastVisit", "deleteMe",
		"description", "desiredCategories", "desiredSkills",
		"desiredSpecialties", "division", "email", "email2", "email3",
		"externalID", "fax", "fax2", "fax3", "firstName", "isDayLightSavings",
		"isDeleted", "isLockedOut", "lastName", "linkedPerson",
		"massMailOptOut", "middleName", "migrateGUID", "mobile", "name",
		"namePrefix", "nameSuffix", "nickName", "numEmployees", "occupation",
		"office", "owner", "pager", "password", "phone", "phone2", "phone3",
		"preferredContact", "referredByPerson", "reportToPerson",
		"secondaryAddress", "secondaryOwners", "skills", "smsOptIn", "source",
		"specialties", "status", "tearsheets", "timeZoneOffsetEST", "type",
		"username", "customObject1s", "customObject2s", "customObject3s",
        "customObject4s", "customObject5s", "customObject6s", "customObject7s",
        "customObject8s", "customObject9s", "customObject10s" })
public class ClientContact extends CustomFieldsB implements QueryEntity,
		UpdateEntity, CreateEntity, SoftDeleteEntity, FileEntity,
		AssociationEntity, SearchEntity {

	private Integer id;

	private Address address;

	private OneToMany<BusinessSector> businessSectors;

	private OneToMany<Category> categories;

	private Category category;

	@JsonIgnore
	private String certifications;

	private Integer clientContactID;

	private ClientCorporation clientCorporation;

	@JsonIgnore
	private String comments;

	private DateTime dateAdded;

	private DateTime dateLastComment;

	private DateTime dateLastVisit;

	private Boolean deleteMe;

	@JsonIgnore
	private String description;

	@JsonIgnore
	private String desiredCategories;

	@JsonIgnore
	private String desiredSkills;

	@JsonIgnore
	private String desiredSpecialties;

	@JsonIgnore
	@Size(max = 40)
	private String division;

	@JsonIgnore
	@Email
	@Size(max = 60)
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
	@Size(max = 30)
	private String externalID;

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

	private Boolean isDayLightSavings;

	private Boolean isDeleted;

	private Boolean isLockedOut;

	@JsonIgnore
	@Size(max = 50)
	private String lastName;

	private LinkedPerson linkedPerson;

	private Boolean massMailOptOut;

	@JsonIgnore
	@Size(max = 50)
	private String middleName;

	private Object migrateGUID;

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

	private Integer numEmployees;

	@JsonIgnore
	@Size(max = 50)
	private String occupation;

	@JsonIgnore
	@Size(max = 40)
	private String office;

	private CorporateUser owner;

	@JsonIgnore
	@Size(max = 20)
	private String pager;

	@JsonIgnore
	private String password;

	@JsonIgnore
	@Size(max = 20)
	private String phone;

	@JsonIgnore
	@Size(max = 20)
	private String phone2;

	@JsonIgnore
	@Size(max = 20)
	private String phone3;

	@JsonIgnore
	@Size(max = 15)
	private String preferredContact;

	private LinkedPerson referredByPerson;

	private LinkedPerson reportToPerson;

	private Address secondaryAddress;

	private OneToMany<CorporateUser> secondaryOwners;

	private OneToMany<Skill> skills;

	private Boolean smsOptIn;

	@JsonIgnore
	@Size(max = 200)
	private String source;

	private OneToMany<Specialty> specialties;

	@JsonIgnore
	@Size(max = 30)
	private String status;

	private OneToManyLinkedId tearsheets;

	private Integer timeZoneOffsetEST;

	@JsonIgnore
	@Size(max = 30)
	private String type;

	@JsonIgnore
	private String username;

    private OneToMany<PersonCustomObjectInstance1> customObject1s;

    private OneToMany<PersonCustomObjectInstance2> customObject2s;

    private OneToMany<PersonCustomObjectInstance3> customObject3s;

    private OneToMany<PersonCustomObjectInstance4> customObject4s;

    private OneToMany<PersonCustomObjectInstance5> customObject5s;

    private OneToMany<PersonCustomObjectInstance6> customObject6s;

    private OneToMany<PersonCustomObjectInstance7> customObject7s;

    private OneToMany<PersonCustomObjectInstance8> customObject8s;

    private OneToMany<PersonCustomObjectInstance9> customObject9s;

    private OneToMany<PersonCustomObjectInstance10> customObject10s;

	public ClientContact() {
		super();
	}

	public ClientContact(Integer id) {
		super();
		this.id = id;
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public ClientContact instantiateForInsert() {
		ClientContact entity = new ClientContact();
		entity.setIsDeleted(Boolean.FALSE);
		entity.setCategory(new Category(512973));
		entity.setClientCorporation(new ClientCorporation(1));
		entity.setDateAdded(RestUtil.nowInESTWithUTCTimeZone());
		entity.setEmail("unknown");
		entity.setNumEmployees(1);
		entity.setIsDeleted(Boolean.FALSE);
		entity.setPreferredContact("Email");
		entity.setStatus("Client");
		entity.setOwner(new CorporateUser(1));
		entity.setUsername(new DateTime().toString());
		entity.setPassword("secret");
		entity.setType("Unknown");
		return entity;
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

	@JsonProperty("businessSectors")
	public OneToMany<BusinessSector> getBusinessSectors() {
		return businessSectors;
	}

	@JsonProperty("businessSectors")
	public void setBusinessSectors(OneToMany<BusinessSector> businessSectors) {
		this.businessSectors = businessSectors;
	}

	@JsonProperty("categories")
	public OneToMany<Category> getCategories() {
		return categories;
	}

	@JsonProperty("categories")
	public void setCategories(OneToMany<Category> categories) {
		this.categories = categories;
	}

	@JsonProperty("category")
	public Category getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(Category category) {
		this.category = category;
	}

	@JsonProperty("certifications")
	public String getCertifications() {
		return certifications;
	}

	@JsonIgnore
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	@JsonProperty("clientContactID")
	public Integer getClientContactID() {
		return clientContactID;
	}

	@JsonProperty("clientContactID")
	public void setClientContactID(Integer clientContactID) {
		this.clientContactID = clientContactID;
	}

	@JsonProperty("clientCorporation")
	public ClientCorporation getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(ClientCorporation clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonIgnore
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("dateLastComment")
	public DateTime getDateLastComment() {
		return dateLastComment;
	}

	@JsonProperty("dateLastComment")
	public void setDateLastComment(DateTime dateLastComment) {
		this.dateLastComment = dateLastComment;
	}

	@JsonProperty("dateLastVisit")
	public DateTime getDateLastVisit() {
		return dateLastVisit;
	}

	@JsonProperty("dateLastVisit")
	public void setDateLastVisit(DateTime dateLastVisit) {
		this.dateLastVisit = dateLastVisit;
	}

	@JsonProperty("deleteMe")
	public Boolean getDeleteMe() {
		return deleteMe;
	}

	@JsonProperty("deleteMe")
	public void setDeleteMe(Boolean deleteMe) {
		this.deleteMe = deleteMe;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonIgnore
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("desiredCategories")
	public String getDesiredCategories() {
		return desiredCategories;
	}

	@JsonIgnore
	public void setDesiredCategories(String desiredCategories) {
		this.desiredCategories = desiredCategories;
	}

	@JsonProperty("desiredSkills")
	public String getDesiredSkills() {
		return desiredSkills;
	}

	@JsonIgnore
	public void setDesiredSkills(String desiredSkills) {
		this.desiredSkills = desiredSkills;
	}

	@JsonProperty("desiredSpecialties")
	public String getDesiredSpecialties() {
		return desiredSpecialties;
	}

	@JsonIgnore
	public void setDesiredSpecialties(String desiredSpecialties) {
		this.desiredSpecialties = desiredSpecialties;
	}

	@JsonProperty("division")
	public String getDivision() {
		return division;
	}

	@JsonIgnore
	public void setDivision(String division) {
		this.division = division;
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

	@JsonProperty("externalID")
	public String getExternalID() {
		return externalID;
	}

	@JsonIgnore
	public void setExternalID(String externalID) {
		this.externalID = externalID;
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

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonIgnore
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("linkedPerson")
	public LinkedPerson getLinkedPerson() {
		return linkedPerson;
	}

	@JsonProperty("linkedPerson")
	public void setLinkedPerson(LinkedPerson linkedPerson) {
		this.linkedPerson = linkedPerson;
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

	@JsonProperty("migrateGUID")
	public Object getMigrateGUID() {
		return migrateGUID;
	}

	@JsonIgnore
	public void setMigrateGUID(String migrateGUID) {
		this.migrateGUID = migrateGUID;
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

	@JsonProperty("numEmployees")
	public Integer getNumEmployees() {
		return numEmployees;
	}

	@JsonProperty("numEmployees")
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@JsonProperty("occupation")
	public String getOccupation() {
		return occupation;
	}

	@JsonIgnore
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	@JsonProperty("office")
	public String getOffice() {
		return office;
	}

	@JsonIgnore
	public void setOffice(String office) {
		this.office = office;
	}

	@JsonProperty("owner")
	public CorporateUser getOwner() {
		return owner;
	}

	@JsonProperty("owner")
	public void setOwner(CorporateUser owner) {
		this.owner = owner;
	}

	@JsonProperty("pager")
	public String getPager() {
		return pager;
	}

	@JsonIgnore
	public void setPager(String pager) {
		this.pager = pager;
	}

	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	@JsonIgnore
	public void setPassword(String password) {
		this.password = password;
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

	@JsonProperty("preferredContact")
	public String getPreferredContact() {
		return preferredContact;
	}

	@JsonIgnore
	public void setPreferredContact(String preferredContact) {
		this.preferredContact = preferredContact;
	}

	@JsonProperty("referredByPerson")
	public LinkedPerson getReferredByPerson() {
		return referredByPerson;
	}

	@JsonProperty("referredByPerson")
	public void setReferredByPerson(LinkedPerson referredByPerson) {
		this.referredByPerson = referredByPerson;
	}

	@JsonProperty("reportToPerson")
	public LinkedPerson getReportToPerson() {
		return reportToPerson;
	}

	@JsonProperty("reportToPerson")
	public void setReportToPerson(LinkedPerson reportToPerson) {
		this.reportToPerson = reportToPerson;
	}

	@JsonProperty("secondaryAddress")
	public Address getSecondaryAddress() {
		return secondaryAddress;
	}

	@JsonProperty("secondaryAddress")
	public void setSecondaryAddress(Address secondaryAddress) {
		this.secondaryAddress = secondaryAddress;
	}

	@JsonProperty("secondaryOwners")
	public OneToMany<CorporateUser> getSecondaryOwners() {
		return secondaryOwners;
	}

	@JsonProperty("secondaryOwners")
	public void setSecondaryOwners(OneToMany<CorporateUser> secondaryOwners) {
		this.secondaryOwners = secondaryOwners;
	}

	@JsonProperty("skills")
	public OneToMany<Skill> getSkills() {
		return skills;
	}

	@JsonProperty("skills")
	public void setSkills(OneToMany<Skill> skills) {
		this.skills = skills;
	}

	@JsonProperty("smsOptIn")
	public Boolean getSmsOptIn() {
		return smsOptIn;
	}

	@JsonProperty("smsOptIn")
	public void setSmsOptIn(Boolean smsOptIn) {
		this.smsOptIn = smsOptIn;
	}

	@JsonProperty("source")
	public String getSource() {
		return source;
	}

	@JsonIgnore
	public void setSource(String source) {
		this.source = source;
	}

	@JsonProperty("specialties")
	public OneToMany<Specialty> getSpecialties() {
		return specialties;
	}

	@JsonProperty("specialties")
	public void setSpecialties(OneToMany<Specialty> specialties) {
		this.specialties = specialties;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("tearsheets")
	public OneToManyLinkedId getTearsheets() {
		return tearsheets;
	}

	@JsonProperty("tearsheets")
	public void setTearsheets(OneToManyLinkedId tearsheets) {
		this.tearsheets = tearsheets;
	}

	@JsonProperty("timeZoneOffsetEST")
	public Integer getTimeZoneOffsetEST() {
		return timeZoneOffsetEST;
	}

	@JsonProperty("timeZoneOffsetEST")
	public void setTimeZoneOffsetEST(Integer timeZoneOffsetEST) {
		this.timeZoneOffsetEST = timeZoneOffsetEST;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonIgnore
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	@JsonIgnore
	public void setUsername(String username) {
		this.username = username;
	}

    @JsonProperty("customObject1s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance1> getCustomObject1s() {
        return customObject1s;
    }

    @JsonProperty("customObject1s")
    public void setCustomObject1s(OneToMany<PersonCustomObjectInstance1> customObject1s) {
        this.customObject1s = customObject1s;
    }

    @JsonProperty("customObject2s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance2> getCustomObject2s() {
        return customObject2s;
    }

    @JsonProperty("customObject2s")
    public void setCustomObject2s(OneToMany<PersonCustomObjectInstance2> customObject2s) {
        this.customObject2s = customObject2s;
    }

    @JsonProperty("customObject3s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance3> getCustomObject3s() {
        return customObject3s;
    }

    @JsonProperty("customObject3s")
    public void setCustomObject3s(OneToMany<PersonCustomObjectInstance3> customObject3s) {
        this.customObject3s = customObject3s;
    }

    @JsonProperty("customObject4s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance4> getCustomObject4s() {
        return customObject4s;
    }

    @JsonProperty("customObject4s")
    public void setCustomObject4s(OneToMany<PersonCustomObjectInstance4> customObject4s) {
        this.customObject4s = customObject4s;
    }

    @JsonProperty("customObject5s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance5> getCustomObject5s() {
        return customObject5s;
    }

    @JsonProperty("customObject5s")
    public void setCustomObject5s(OneToMany<PersonCustomObjectInstance5> customObject5s) {
        this.customObject5s = customObject5s;
    }

    @JsonProperty("customObject6s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance6> getCustomObject6s() {
        return customObject6s;
    }

    @JsonProperty("customObject6s")
    public void setCustomObject6s(OneToMany<PersonCustomObjectInstance6> customObject6s) {
        this.customObject6s = customObject6s;
    }

    @JsonProperty("customObject7s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance7> getCustomObject7s() {
        return customObject7s;
    }

    @JsonProperty("customObject7s")
    public void setCustomObject7s(OneToMany<PersonCustomObjectInstance7> customObject7s) {
        this.customObject7s = customObject7s;
    }

    @JsonProperty("customObject8s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance8> getCustomObject8s() {
        return customObject8s;
    }

    @JsonProperty("customObject8s")
    public void setCustomObject8s(OneToMany<PersonCustomObjectInstance8> customObject8s) {
        this.customObject8s = customObject8s;
    }

    @JsonProperty("customObject9s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance9> getCustomObject9s() {
        return customObject9s;
    }

    @JsonProperty("customObject9s")
    public void setCustomObject9s(OneToMany<PersonCustomObjectInstance9> customObject9s) {
        this.customObject9s = customObject9s;
    }

    @JsonProperty("customObject10s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<PersonCustomObjectInstance10> getCustomObject10s() {
        return customObject10s;
    }

    @JsonProperty("customObject10s")
    public void setCustomObject10s(OneToMany<PersonCustomObjectInstance10> customObject10s) {
        this.customObject10s = customObject10s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientContact)) return false;
        if (!super.equals(o)) return false;

        ClientContact that = (ClientContact) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (businessSectors != null ? !businessSectors.equals(that.businessSectors) : that.businessSectors != null)
            return false;
        if (categories != null ? !categories.equals(that.categories) : that.categories != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (certifications != null ? !certifications.equals(that.certifications) : that.certifications != null)
            return false;
        if (clientContactID != null ? !clientContactID.equals(that.clientContactID) : that.clientContactID != null)
            return false;
        if (clientCorporation != null ? !clientCorporation.equals(that.clientCorporation) : that.clientCorporation != null)
            return false;
        if (comments != null ? !comments.equals(that.comments) : that.comments != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (dateLastComment != null ? !dateLastComment.equals(that.dateLastComment) : that.dateLastComment != null)
            return false;
        if (dateLastVisit != null ? !dateLastVisit.equals(that.dateLastVisit) : that.dateLastVisit != null)
            return false;
        if (deleteMe != null ? !deleteMe.equals(that.deleteMe) : that.deleteMe != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (desiredCategories != null ? !desiredCategories.equals(that.desiredCategories) : that.desiredCategories != null)
            return false;
        if (desiredSkills != null ? !desiredSkills.equals(that.desiredSkills) : that.desiredSkills != null)
            return false;
        if (desiredSpecialties != null ? !desiredSpecialties.equals(that.desiredSpecialties) : that.desiredSpecialties != null)
            return false;
        if (division != null ? !division.equals(that.division) : that.division != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (email2 != null ? !email2.equals(that.email2) : that.email2 != null) return false;
        if (email3 != null ? !email3.equals(that.email3) : that.email3 != null) return false;
        if (externalID != null ? !externalID.equals(that.externalID) : that.externalID != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (fax2 != null ? !fax2.equals(that.fax2) : that.fax2 != null) return false;
        if (fax3 != null ? !fax3.equals(that.fax3) : that.fax3 != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (isDayLightSavings != null ? !isDayLightSavings.equals(that.isDayLightSavings) : that.isDayLightSavings != null)
            return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (isLockedOut != null ? !isLockedOut.equals(that.isLockedOut) : that.isLockedOut != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (linkedPerson != null ? !linkedPerson.equals(that.linkedPerson) : that.linkedPerson != null) return false;
        if (massMailOptOut != null ? !massMailOptOut.equals(that.massMailOptOut) : that.massMailOptOut != null)
            return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (migrateGUID != null ? !migrateGUID.equals(that.migrateGUID) : that.migrateGUID != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (namePrefix != null ? !namePrefix.equals(that.namePrefix) : that.namePrefix != null) return false;
        if (nameSuffix != null ? !nameSuffix.equals(that.nameSuffix) : that.nameSuffix != null) return false;
        if (nickName != null ? !nickName.equals(that.nickName) : that.nickName != null) return false;
        if (numEmployees != null ? !numEmployees.equals(that.numEmployees) : that.numEmployees != null) return false;
        if (occupation != null ? !occupation.equals(that.occupation) : that.occupation != null) return false;
        if (office != null ? !office.equals(that.office) : that.office != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (pager != null ? !pager.equals(that.pager) : that.pager != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (phone2 != null ? !phone2.equals(that.phone2) : that.phone2 != null) return false;
        if (phone3 != null ? !phone3.equals(that.phone3) : that.phone3 != null) return false;
        if (preferredContact != null ? !preferredContact.equals(that.preferredContact) : that.preferredContact != null)
            return false;
        if (referredByPerson != null ? !referredByPerson.equals(that.referredByPerson) : that.referredByPerson != null)
            return false;
        if (reportToPerson != null ? !reportToPerson.equals(that.reportToPerson) : that.reportToPerson != null)
            return false;
        if (secondaryAddress != null ? !secondaryAddress.equals(that.secondaryAddress) : that.secondaryAddress != null)
            return false;
        if (secondaryOwners != null ? !secondaryOwners.equals(that.secondaryOwners) : that.secondaryOwners != null)
            return false;
        if (skills != null ? !skills.equals(that.skills) : that.skills != null) return false;
        if (smsOptIn != null ? !smsOptIn.equals(that.smsOptIn) : that.smsOptIn != null) return false;
        if (source != null ? !source.equals(that.source) : that.source != null) return false;
        if (specialties != null ? !specialties.equals(that.specialties) : that.specialties != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tearsheets != null ? !tearsheets.equals(that.tearsheets) : that.tearsheets != null) return false;
        if (timeZoneOffsetEST != null ? !timeZoneOffsetEST.equals(that.timeZoneOffsetEST) : that.timeZoneOffsetEST != null)
            return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (customObject1s != null ? !customObject1s.equals(that.customObject1s) : that.customObject1s != null)
            return false;
        if (customObject2s != null ? !customObject2s.equals(that.customObject2s) : that.customObject2s != null)
            return false;
        if (customObject3s != null ? !customObject3s.equals(that.customObject3s) : that.customObject3s != null)
            return false;
        if (customObject4s != null ? !customObject4s.equals(that.customObject4s) : that.customObject4s != null)
            return false;
        if (customObject5s != null ? !customObject5s.equals(that.customObject5s) : that.customObject5s != null)
            return false;
        if (customObject6s != null ? !customObject6s.equals(that.customObject6s) : that.customObject6s != null)
            return false;
        if (customObject7s != null ? !customObject7s.equals(that.customObject7s) : that.customObject7s != null)
            return false;
        if (customObject8s != null ? !customObject8s.equals(that.customObject8s) : that.customObject8s != null)
            return false;
        if (customObject9s != null ? !customObject9s.equals(that.customObject9s) : that.customObject9s != null)
            return false;
        return !(customObject10s != null ? !customObject10s.equals(that.customObject10s) : that.customObject10s != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (businessSectors != null ? businessSectors.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (certifications != null ? certifications.hashCode() : 0);
        result = 31 * result + (clientContactID != null ? clientContactID.hashCode() : 0);
        result = 31 * result + (clientCorporation != null ? clientCorporation.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateLastComment != null ? dateLastComment.hashCode() : 0);
        result = 31 * result + (dateLastVisit != null ? dateLastVisit.hashCode() : 0);
        result = 31 * result + (deleteMe != null ? deleteMe.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (desiredCategories != null ? desiredCategories.hashCode() : 0);
        result = 31 * result + (desiredSkills != null ? desiredSkills.hashCode() : 0);
        result = 31 * result + (desiredSpecialties != null ? desiredSpecialties.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (email2 != null ? email2.hashCode() : 0);
        result = 31 * result + (email3 != null ? email3.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (fax2 != null ? fax2.hashCode() : 0);
        result = 31 * result + (fax3 != null ? fax3.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (isDayLightSavings != null ? isDayLightSavings.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isLockedOut != null ? isLockedOut.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (linkedPerson != null ? linkedPerson.hashCode() : 0);
        result = 31 * result + (massMailOptOut != null ? massMailOptOut.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (migrateGUID != null ? migrateGUID.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (namePrefix != null ? namePrefix.hashCode() : 0);
        result = 31 * result + (nameSuffix != null ? nameSuffix.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (numEmployees != null ? numEmployees.hashCode() : 0);
        result = 31 * result + (occupation != null ? occupation.hashCode() : 0);
        result = 31 * result + (office != null ? office.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (pager != null ? pager.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (phone2 != null ? phone2.hashCode() : 0);
        result = 31 * result + (phone3 != null ? phone3.hashCode() : 0);
        result = 31 * result + (preferredContact != null ? preferredContact.hashCode() : 0);
        result = 31 * result + (referredByPerson != null ? referredByPerson.hashCode() : 0);
        result = 31 * result + (reportToPerson != null ? reportToPerson.hashCode() : 0);
        result = 31 * result + (secondaryAddress != null ? secondaryAddress.hashCode() : 0);
        result = 31 * result + (secondaryOwners != null ? secondaryOwners.hashCode() : 0);
        result = 31 * result + (skills != null ? skills.hashCode() : 0);
        result = 31 * result + (smsOptIn != null ? smsOptIn.hashCode() : 0);
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (specialties != null ? specialties.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tearsheets != null ? tearsheets.hashCode() : 0);
        result = 31 * result + (timeZoneOffsetEST != null ? timeZoneOffsetEST.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (customObject1s != null ? customObject1s.hashCode() : 0);
        result = 31 * result + (customObject2s != null ? customObject2s.hashCode() : 0);
        result = 31 * result + (customObject3s != null ? customObject3s.hashCode() : 0);
        result = 31 * result + (customObject4s != null ? customObject4s.hashCode() : 0);
        result = 31 * result + (customObject5s != null ? customObject5s.hashCode() : 0);
        result = 31 * result + (customObject6s != null ? customObject6s.hashCode() : 0);
        result = 31 * result + (customObject7s != null ? customObject7s.hashCode() : 0);
        result = 31 * result + (customObject8s != null ? customObject8s.hashCode() : 0);
        result = 31 * result + (customObject9s != null ? customObject9s.hashCode() : 0);
        result = 31 * result + (customObject10s != null ? customObject10s.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringBuilder("ClientContact {")
                .append("\n\t\"address\": ")
                .append(address)
                .append(",\n\t\"id\": ")
                .append(id)
                .append(",\n\t\"businessSectors\": ")
                .append(businessSectors)
                .append(",\n\t\"categories\": ")
                .append(categories)
                .append(",\n\t\"category\": ")
                .append(category)
                .append(",\n\t\"certifications\": ")
                .append("'")
                .append(certifications).append('\'')
                .append(",\n\t\"clientContactID\": ")
                .append(clientContactID)
                .append(",\n\t\"clientCorporation\": ")
                .append(clientCorporation)
                .append(",\n\t\"comments\": ")
                .append("'")
                .append(comments).append('\'')
                .append(",\n\t\"dateAdded\": ")
                .append(dateAdded)
                .append(",\n\t\"dateLastComment\": ")
                .append(dateLastComment)
                .append(",\n\t\"dateLastVisit\": ")
                .append(dateLastVisit)
                .append(",\n\t\"deleteMe\": ")
                .append(deleteMe)
                .append(",\n\t\"description\": ")
                .append("'")
                .append(description).append('\'')
                .append(",\n\t\"desiredCategories\": ")
                .append("'")
                .append(desiredCategories).append('\'')
                .append(",\n\t\"desiredSkills\": ")
                .append("'")
                .append(desiredSkills).append('\'')
                .append(",\n\t\"desiredSpecialties\": ")
                .append("'")
                .append(desiredSpecialties).append('\'')
                .append(",\n\t\"division\": ")
                .append("'")
                .append(division).append('\'')
                .append(",\n\t\"email\": ")
                .append("'")
                .append(email).append('\'')
                .append(",\n\t\"email2\": ")
                .append("'")
                .append(email2).append('\'')
                .append(",\n\t\"email3\": ")
                .append("'")
                .append(email3).append('\'')
                .append(",\n\t\"externalID\": ")
                .append("'")
                .append(externalID).append('\'')
                .append(",\n\t\"fax\": ")
                .append("'")
                .append(fax).append('\'')
                .append(",\n\t\"fax2\": ")
                .append("'")
                .append(fax2).append('\'')
                .append(",\n\t\"fax3\": ")
                .append("'")
                .append(fax3).append('\'')
                .append(",\n\t\"firstName\": ")
                .append("'")
                .append(firstName).append('\'')
                .append(",\n\t\"isDayLightSavings\": ")
                .append(isDayLightSavings)
                .append(",\n\t\"isDeleted\": ")
                .append(isDeleted)
                .append(",\n\t\"isLockedOut\": ")
                .append(isLockedOut)
                .append(",\n\t\"lastName\": ")
                .append("'")
                .append(lastName).append('\'')
                .append(",\n\t\"linkedPerson\": ")
                .append(linkedPerson)
                .append(",\n\t\"massMailOptOut\": ")
                .append(massMailOptOut)
                .append(",\n\t\"middleName\": ")
                .append("'")
                .append(middleName).append('\'')
                .append(",\n\t\"migrateGUID\": ")
                .append(migrateGUID)
                .append(",\n\t\"mobile\": ")
                .append("'")
                .append(mobile).append('\'')
                .append(",\n\t\"name\": ")
                .append("'")
                .append(name).append('\'')
                .append(",\n\t\"namePrefix\": ")
                .append("'")
                .append(namePrefix).append('\'')
                .append(",\n\t\"nameSuffix\": ")
                .append("'")
                .append(nameSuffix).append('\'')
                .append(",\n\t\"nickName\": ")
                .append("'")
                .append(nickName).append('\'')
                .append(",\n\t\"numEmployees\": ")
                .append(numEmployees)
                .append(",\n\t\"occupation\": ")
                .append("'")
                .append(occupation).append('\'')
                .append(",\n\t\"office\": ")
                .append("'")
                .append(office).append('\'')
                .append(",\n\t\"owner\": ")
                .append(owner)
                .append(",\n\t\"pager\": ")
                .append("'")
                .append(pager).append('\'')
                .append(",\n\t\"password\": ")
                .append("'")
                .append(password).append('\'')
                .append(",\n\t\"phone\": ")
                .append("'")
                .append(phone).append('\'')
                .append(",\n\t\"phone2\": ")
                .append("'")
                .append(phone2).append('\'')
                .append(",\n\t\"phone3\": ")
                .append("'")
                .append(phone3).append('\'')
                .append(",\n\t\"preferredContact\": ")
                .append("'")
                .append(preferredContact).append('\'')
                .append(",\n\t\"referredByPerson\": ")
                .append(referredByPerson)
                .append(",\n\t\"reportToPerson\": ")
                .append(reportToPerson)
                .append(",\n\t\"secondaryAddress\": ")
                .append(secondaryAddress)
                .append(",\n\t\"secondaryOwners\": ")
                .append(secondaryOwners)
                .append(",\n\t\"skills\": ")
                .append(skills)
                .append(",\n\t\"smsOptIn\": ")
                .append(smsOptIn)
                .append(",\n\t\"source\": ")
                .append("'")
                .append(source).append('\'')
                .append(",\n\t\"specialties\": ")
                .append(specialties)
                .append(",\n\t\"status\": ")
                .append("'")
                .append(status).append('\'')
                .append(",\n\t\"tearsheets\": ")
                .append(tearsheets)
                .append(",\n\t\"timeZoneOffsetEST\": ")
                .append(timeZoneOffsetEST)
                .append(",\n\t\"type\": ")
                .append("'")
                .append(type).append('\'')
                .append(",\n\t\"username\": ")
                .append("'")
                .append(username).append('\'')
                .append(",\n\t\"customObject1s\": ")
                .append(customObject1s)
                .append(",\n\t\"customObject2s\": ")
                .append(customObject2s)
                .append(",\n\t\"customObject3s\": ")
                .append(customObject3s)
                .append(",\n\t\"customObject4s\": ")
                .append(customObject4s)
                .append(",\n\t\"customObject5s\": ")
                .append(customObject5s)
                .append(",\n\t\"customObject6s\": ")
                .append(customObject6s)
                .append(",\n\t\"customObject7s\": ")
                .append(customObject7s)
                .append(",\n\t\"customObject8s\": ")
                .append(customObject8s)
                .append(",\n\t\"customObject9s\": ")
                .append(customObject9s)
                .append(",\n\t\"customObject10s\": ")
                .append(customObject10s)
                .append('}')
                .toString();
    }
}
