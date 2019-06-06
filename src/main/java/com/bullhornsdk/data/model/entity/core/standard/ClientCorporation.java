package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance11;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance12;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance13;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance14;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance15;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance16;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance17;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance18;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance19;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance20;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance21;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance22;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance23;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance24;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance25;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance26;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance27;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance28;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance29;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance30;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance31;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance32;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance33;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance34;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance35;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobjectinstances.clientcorporation.ClientCorporationCustomObjectInstance9;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DateLastModifiedEntity;
import com.bullhornsdk.data.model.entity.core.type.EditHistoryEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.bullhornsdk.data.util.ReadOnly;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.joda.time.DateTime;

import javax.validation.constraints.Size;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "annualRevenue", "billingAddress", "billingContact", "billingFrequency", "billingPhone",
        "branch", "businessSectorList", "certifications", "requirements", "certificationGroups", "childClientCorporations", "clientContacts",
        "companyDescription", "companyURL", "competitors", "culture", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2",
        "customFloat3", "customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20",
		"customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
		"customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateFounded", "dateLastModified", "department",
		"externalID", "fax", "feeArrangement", "funding", "industryList", "invoiceFormat", "leads", "linkedinProfileName", "name", "notes", "numEmployees", "numOffices",
		"ownership", "parentClientCorporation", "phone", "revenue", "status", "taxRate", "tickerSymbol", "trackTitle", "workWeekStart",
        "customObject1s", "customObject2s", "customObject3s", "customObject4s", "customObject5s", "customObject6s", "customObject7s",
        "customObject8s", "customObject9s", "customObject10s" })
public class ClientCorporation extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, FileEntity, AssociationEntity,
		SearchEntity, DateLastModifiedEntity, EditHistoryEntity {

	private Integer id;

	private Address address;

	private BigDecimal annualRevenue;

	private Address billingAddress;

	@JsonIgnore
	@Size(max = 100)
	private String billingContact;

	@JsonIgnore
	@Size(max = 20)
	private String billingFrequency;

	@JsonIgnore
	@Size(max = 20)
	private String billingPhone;

	private Branch branch;

	@JsonIgnore
	private String businessSectorList;

	private OneToMany<ClientCorporation> childClientCorporations;

	private OneToMany<ClientContact> clientContacts;


	@JsonIgnore
	private String companyDescription;

	@JsonIgnore
	@Size(max = 100)
	private String companyURL;

	@JsonIgnore
	private String competitors;

	@JsonIgnore
	private String culture;

	private DateTime dateAdded;

	private DateTime dateFounded;

	private DateTime dateLastModified;

	private CorporationDepartment department;

	@JsonIgnore
	private String externalID;

	@JsonIgnore
	private String fax;

	private BigDecimal feeArrangement;

	@JsonIgnore
	private String funding;

	@JsonIgnore
	private String industryList;

	@JsonIgnore
	private String invoiceFormat;

	private OneToMany<Lead> leads;

    @JsonIgnore
    @Size(max = 200)
    private String linkedinProfileName;

	@JsonIgnore
	@Size(max = 100)
	private String name;

	@JsonIgnore
	private String notes;

	private Integer numEmployees;

	private Integer numOffices;

	@JsonIgnore
	@Size(max = 30)
	private String ownership;

	private OneToManyLinkedId owners;

	private ClientCorporation parentClientCorporation;

	@JsonIgnore
	@Size(max = 20)
	private String phone;

	@JsonIgnore
	private String revenue;

	@JsonIgnore
	@Size(max = 30)
	private String status;

	private BigDecimal taxRate;

	@JsonIgnore
	@Size(max = 20)
	private String tickerSymbol;

	@JsonIgnore
	@Size(max = 200)
	private String trackTitle;

	private Integer workWeekStart;

    private OneToMany<Certification> requirements;

    private OneToMany<CertificationGroup> certificationGroups;

    private OneToMany<ClientCorporationCertification> certifications; // legacy certifications

    private OneToMany<ClientCorporationCustomObjectInstance1> customObject1s;

    private OneToMany<ClientCorporationCustomObjectInstance2> customObject2s;

    private OneToMany<ClientCorporationCustomObjectInstance3> customObject3s;

    private OneToMany<ClientCorporationCustomObjectInstance4> customObject4s;

    private OneToMany<ClientCorporationCustomObjectInstance5> customObject5s;

    private OneToMany<ClientCorporationCustomObjectInstance6> customObject6s;

    private OneToMany<ClientCorporationCustomObjectInstance7> customObject7s;

    private OneToMany<ClientCorporationCustomObjectInstance8> customObject8s;

    private OneToMany<ClientCorporationCustomObjectInstance9> customObject9s;

    private OneToMany<ClientCorporationCustomObjectInstance10> customObject10s;

    private OneToMany<ClientCorporationCustomObjectInstance11> customObject11s;

    private OneToMany<ClientCorporationCustomObjectInstance12> customObject12s;

    private OneToMany<ClientCorporationCustomObjectInstance13> customObject13s;

    private OneToMany<ClientCorporationCustomObjectInstance14> customObject14s;

    private OneToMany<ClientCorporationCustomObjectInstance15> customObject15s;

    private OneToMany<ClientCorporationCustomObjectInstance16> customObject16s;

    private OneToMany<ClientCorporationCustomObjectInstance17> customObject17s;

    private OneToMany<ClientCorporationCustomObjectInstance18> customObject18s;

    private OneToMany<ClientCorporationCustomObjectInstance19> customObject19s;

    private OneToMany<ClientCorporationCustomObjectInstance20> customObject20s;

    private OneToMany<ClientCorporationCustomObjectInstance21> customObject21s;

    private OneToMany<ClientCorporationCustomObjectInstance22> customObject22s;

    private OneToMany<ClientCorporationCustomObjectInstance23> customObject23s;

    private OneToMany<ClientCorporationCustomObjectInstance24> customObject24s;

    private OneToMany<ClientCorporationCustomObjectInstance25> customObject25s;

    private OneToMany<ClientCorporationCustomObjectInstance26> customObject26s;

    private OneToMany<ClientCorporationCustomObjectInstance27> customObject27s;

    private OneToMany<ClientCorporationCustomObjectInstance28> customObject28s;

    private OneToMany<ClientCorporationCustomObjectInstance29> customObject29s;

    private OneToMany<ClientCorporationCustomObjectInstance30> customObject30s;

    private OneToMany<ClientCorporationCustomObjectInstance31> customObject31s;

    private OneToMany<ClientCorporationCustomObjectInstance32> customObject32s;

    private OneToMany<ClientCorporationCustomObjectInstance33> customObject33s;

    private OneToMany<ClientCorporationCustomObjectInstance34> customObject34s;

    private OneToMany<ClientCorporationCustomObjectInstance35> customObject35s;

	public ClientCorporation() {
		super();
	}
	
	public ClientCorporation(Integer id) {
		super();
		this.id = id;
	}
	
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

    @ReadOnly
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

	@JsonProperty("annualRevenue")
	public BigDecimal getAnnualRevenue() {
		return annualRevenue;
	}

	@JsonProperty("annualRevenue")
	public void setAnnualRevenue(BigDecimal annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@JsonProperty("billingAddress")
	public Address getBillingAddress() {
		return billingAddress;
	}

	@JsonProperty("billingAddress")
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	@JsonProperty("billingContact")
	public String getBillingContact() {
		return billingContact;
	}

	@JsonIgnore
	public void setBillingContact(String billingContact) {
		this.billingContact = billingContact;
	}

	@JsonProperty("billingFrequency")
	public String getBillingFrequency() {
		return billingFrequency;
	}

	@JsonIgnore
	public void setBillingFrequency(String billingFrequency) {
		this.billingFrequency = billingFrequency;
	}

	@JsonProperty("billingPhone")
	public String getBillingPhone() {
		return billingPhone;
	}

	@JsonIgnore
	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}

    @JsonProperty("branch")
    public Branch getBranch() {
        return branch;
    }

    @JsonProperty("branch")
    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @JsonProperty("businessSectorList")
	public String getBusinessSectorList() {
		return businessSectorList;
	}

	@JsonIgnore
	public void setBusinessSectorList(String businessSectorList) {
		this.businessSectorList = businessSectorList;
	}

	@JsonProperty("childClientCorporations")
	public OneToMany<ClientCorporation> getChildClientCorporations() {
		return childClientCorporations;
	}

    @ReadOnly
	@JsonProperty("childClientCorporations")
	public void setChildClientCorporations(OneToMany<ClientCorporation> childClientCorporations) {
		this.childClientCorporations = childClientCorporations;
	}

	@JsonProperty("clientContacts")
	public OneToMany<ClientContact> getClientContacts() {
		return clientContacts;
	}

    @ReadOnly
	@JsonProperty("clientContacts")
	public void setClientContacts(OneToMany<ClientContact> clientContacts) {
		this.clientContacts = clientContacts;
	}

	@JsonProperty("companyDescription")
	public String getCompanyDescription() {
		return companyDescription;
	}

	@JsonIgnore
	public void setCompanyDescription(String companyDescription) {
		this.companyDescription = companyDescription;
	}

	@JsonProperty("companyURL")
	public String getCompanyURL() {
		return companyURL;
	}

	@JsonIgnore
	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}

	@JsonProperty("competitors")
	public String getCompetitors() {
		return competitors;
	}

	@JsonIgnore
	public void setCompetitors(String competitors) {
		this.competitors = competitors;
	}

	@JsonProperty("culture")
	public String getCulture() {
		return culture;
	}

	@JsonIgnore
	public void setCulture(String culture) {
		this.culture = culture;
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

	@JsonProperty("dateFounded")
	public DateTime getDateFounded() {
		return dateFounded;
	}

	@JsonProperty("dateFounded")
	public void setDateFounded(DateTime dateFounded) {
		this.dateFounded = dateFounded;
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

	@JsonProperty("department")
	public CorporationDepartment getDepartment() {
		return department;
	}

	@JsonProperty("department")
	public void setDepartment(CorporationDepartment department) {
		this.department = department;
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

	@JsonProperty("fax")
	public void setFax(String fax) {
		this.fax = fax;
	}

	@JsonProperty("feeArrangement")
	public BigDecimal getFeeArrangement() {
		return feeArrangement;
	}

	@JsonProperty("feeArrangement")
	public void setFeeArrangement(BigDecimal feeArrangement) {
		this.feeArrangement = feeArrangement;
	}

	@JsonProperty("funding")
	public String getFunding() {
		return funding;
	}

	@JsonIgnore
	public void setFunding(String funding) {
		this.funding = funding;
	}

	@JsonProperty("industryList")
	public String getIndustryList() {
		return industryList;
	}

	@JsonIgnore
	public void setIndustryList(String industryList) {
		this.industryList = industryList;
	}

	@JsonProperty("invoiceFormat")
	public String getInvoiceFormat() {
		return invoiceFormat;
	}

	@JsonProperty("invoiceFormat")
	public void setInvoiceFormat(String invoiceFormat) {
		this.invoiceFormat = invoiceFormat;
	}

	@JsonProperty("leads")
	public OneToMany<Lead> getLeads() {
		return leads;
	}

	@JsonProperty("leads")
	public void setLeads(OneToMany<Lead> leads) {
		this.leads = leads;
	}

    @JsonProperty("linkedinProfileName")
    public String getLinkedinProfileName() {
        return linkedinProfileName;
    }

    @JsonIgnore
    public void setLinkedinProfileName(String linkedinProfileName) {
        this.linkedinProfileName = linkedinProfileName;
    }

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonIgnore
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("notes")
	public String getNotes() {
		return notes;
	}

	@JsonIgnore
	public void setNotes(String notes) {
		this.notes = notes;
	}

	@JsonProperty("numEmployees")
	public Integer getNumEmployees() {
		return numEmployees;
	}

	@JsonProperty("numEmployees")
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@JsonProperty("numOffices")
	public Integer getNumOffices() {
		return numOffices;
	}

	@JsonProperty("numOffices")
	public void setNumOffices(Integer numOffices) {
		this.numOffices = numOffices;
	}

	@JsonProperty("ownership")
	public String getOwnership() {
		return ownership;
	}

	@JsonIgnore
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}

	@JsonIgnore
	public OneToManyLinkedId getOwners() {
		return owners;
	}

    @ReadOnly
	@JsonProperty("owners")
	public void setOwners(OneToManyLinkedId owners) {
		this.owners = owners;
	}

	@JsonProperty("parentClientCorporation")
	public ClientCorporation getParentClientCorporation() {
		return parentClientCorporation;
	}

	@JsonProperty("parentClientCorporation")
	public void setParentClientCorporation(ClientCorporation parentClientCorporation) {
		this.parentClientCorporation = parentClientCorporation;
	}

	@JsonProperty("phone")
	public String getPhone() {
		return phone;
	}

	@JsonIgnore
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@JsonProperty("revenue")
	public String getRevenue() {
		return revenue;
	}

	@JsonIgnore
	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("taxRate")
	public BigDecimal getTaxRate() {
		return taxRate;
	}

	@JsonProperty("taxRate")
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}

	@JsonProperty("tickerSymbol")
	public String getTickerSymbol() {
		return tickerSymbol;
	}

	@JsonIgnore
	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	@JsonProperty("trackTitle")
	public String getTrackTitle() {
		return trackTitle;
	}

	@JsonIgnore
	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

	@JsonProperty("workWeekStart")
	public Integer getWorkWeekStart() {
		return workWeekStart;
	}

	@JsonProperty("workWeekStart")
	public void setWorkWeekStart(Integer workWeekStart) {
		this.workWeekStart = workWeekStart;
	}



    @JsonProperty("requirements")
    public OneToMany<Certification> getRequirements() {
        return requirements;
    }

    @ReadOnly
    @JsonProperty("requirements")
    public void setRequirements(OneToMany<Certification> requirements) {
        this.requirements = requirements;
    }

    @JsonProperty("certificationGroups")
    public OneToMany<CertificationGroup> getCertificationGroups() {
        return certificationGroups;
    }

    @ReadOnly
    @JsonProperty("certificationGroups")
    public void setCertificationGroups(OneToMany<CertificationGroup> certificationGroups) {
        this.certificationGroups = certificationGroups;
    }

    @JsonProperty("certifications")
    public OneToMany<ClientCorporationCertification> getCertifications() {
        return certifications;
    }

    @ReadOnly
    @JsonProperty("certifications")
    public void setCertifications(OneToMany<ClientCorporationCertification> certifications) {
        this.certifications = certifications;
    }

    @JsonProperty("customObject1s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance1> getCustomObject1s() {
        return customObject1s;
    }

    @JsonProperty("customObject1s")
    public void setCustomObject1s(OneToMany<ClientCorporationCustomObjectInstance1> customObject1s) {
        this.customObject1s = customObject1s;
    }

    @JsonProperty("customObject2s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance2> getCustomObject2s() {
        return customObject2s;
    }

    @JsonProperty("customObject2s")
    public void setCustomObject2s(OneToMany<ClientCorporationCustomObjectInstance2> customObject2s) {
        this.customObject2s = customObject2s;
    }

    @JsonProperty("customObject3s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance3> getCustomObject3s() {
        return customObject3s;
    }

    @JsonProperty("customObject3s")
    public void setCustomObject3s(OneToMany<ClientCorporationCustomObjectInstance3> customObject3s) {
        this.customObject3s = customObject3s;
    }

    @JsonProperty("customObject4s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance4> getCustomObject4s() {
        return customObject4s;
    }

    @JsonProperty("customObject4s")
    public void setCustomObject4s(OneToMany<ClientCorporationCustomObjectInstance4> customObject4s) {
        this.customObject4s = customObject4s;
    }

    @JsonProperty("customObject5s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance5> getCustomObject5s() {
        return customObject5s;
    }

    @JsonProperty("customObject5s")
    public void setCustomObject5s(OneToMany<ClientCorporationCustomObjectInstance5> customObject5s) {
        this.customObject5s = customObject5s;
    }

    @JsonProperty("customObject6s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance6> getCustomObject6s() {
        return customObject6s;
    }

    @JsonProperty("customObject6s")
    public void setCustomObject6s(OneToMany<ClientCorporationCustomObjectInstance6> customObject6s) {
        this.customObject6s = customObject6s;
    }

    @JsonProperty("customObject7s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance7> getCustomObject7s() {
        return customObject7s;
    }

    @JsonProperty("customObject7s")
    public void setCustomObject7s(OneToMany<ClientCorporationCustomObjectInstance7> customObject7s) {
        this.customObject7s = customObject7s;
    }

    @JsonProperty("customObject8s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance8> getCustomObject8s() {
        return customObject8s;
    }

    @JsonProperty("customObject8s")
    public void setCustomObject8s(OneToMany<ClientCorporationCustomObjectInstance8> customObject8s) {
        this.customObject8s = customObject8s;
    }

    @JsonProperty("customObject9s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance9> getCustomObject9s() {
        return customObject9s;
    }

    @JsonProperty("customObject9s")
    public void setCustomObject9s(OneToMany<ClientCorporationCustomObjectInstance9> customObject9s) {
        this.customObject9s = customObject9s;
    }

    @JsonProperty("customObject10s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance10> getCustomObject10s() {
        return customObject10s;
    }

    @JsonProperty("customObject10s")
    public void setCustomObject10s(OneToMany<ClientCorporationCustomObjectInstance10> customObject10s) {
        this.customObject10s = customObject10s;
    }

    @JsonProperty("customObject11s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance11> getCustomObject11s() {
        return customObject11s;
    }

    @JsonProperty("customObject11s")
    public void setCustomObject11s(OneToMany<ClientCorporationCustomObjectInstance11> customObject11s) {
        this.customObject11s = customObject11s;
    }

    @JsonProperty("customObject12s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance12> getCustomObject12s() {
        return customObject12s;
    }

    @JsonProperty("customObject12s")
    public void setCustomObject12s(OneToMany<ClientCorporationCustomObjectInstance12> customObject12s) {
        this.customObject12s = customObject12s;
    }

    @JsonProperty("customObject13s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance13> getCustomObject13s() {
        return customObject13s;
    }

    @JsonProperty("customObject13s")
    public void setCustomObject13s(OneToMany<ClientCorporationCustomObjectInstance13> customObject13s) {
        this.customObject13s = customObject13s;
    }

    @JsonProperty("customObject14s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance14> getCustomObject14s() {
        return customObject14s;
    }

    @JsonProperty("customObject14s")
    public void setCustomObject14s(OneToMany<ClientCorporationCustomObjectInstance14> customObject14s) {
        this.customObject14s = customObject14s;
    }

    @JsonProperty("customObject15s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance15> getCustomObject15s() {
        return customObject15s;
    }

    @JsonProperty("customObject15s")
    public void setCustomObject15s(OneToMany<ClientCorporationCustomObjectInstance15> customObject15s) {
        this.customObject15s = customObject15s;
    }

    @JsonProperty("customObject16s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance16> getCustomObject16s() {
        return customObject16s;
    }

    @JsonProperty("customObject16s")
    public void setCustomObject16s(OneToMany<ClientCorporationCustomObjectInstance16> customObject16s) {
        this.customObject16s = customObject16s;
    }

    @JsonProperty("customObject17s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance17> getCustomObject17s() {
        return customObject17s;
    }

    @JsonProperty("customObject17s")
    public void setCustomObject17s(OneToMany<ClientCorporationCustomObjectInstance17> customObject17s) {
        this.customObject17s = customObject17s;
    }

    @JsonProperty("customObject18s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance18> getCustomObject18s() {
        return customObject18s;
    }

    @JsonProperty("customObject18s")
    public void setCustomObject18s(OneToMany<ClientCorporationCustomObjectInstance18> customObject18s) {
        this.customObject18s = customObject18s;
    }

    @JsonProperty("customObject19s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance19> getCustomObject19s() { return customObject19s; }

    @JsonProperty("customObject19s")
    public void setCustomObject19s(OneToMany<ClientCorporationCustomObjectInstance19> customObject19s) { this.customObject19s = customObject19s; }

    @JsonProperty("customObject20s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance20> getCustomObject20s() {
        return customObject20s;
    }

    @JsonProperty("customObject20s")
    public void setCustomObject20s(OneToMany<ClientCorporationCustomObjectInstance20> customObject20s) {
        this.customObject20s = customObject20s;
    }

    @JsonProperty("customObject21s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance21> getCustomObject21s() {
        return customObject21s;
    }

    @JsonProperty("customObject21s")
    public void setCustomObject21s(OneToMany<ClientCorporationCustomObjectInstance21> customObject21s) {
        this.customObject21s = customObject21s;
    }

    @JsonProperty("customObject22s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance22> getCustomObject22s() {
        return customObject22s;
    }

    @JsonProperty("customObject22s")
    public void setCustomObject22s(OneToMany<ClientCorporationCustomObjectInstance22> customObject22s) {
        this.customObject22s = customObject22s;
    }

    @JsonProperty("customObject23s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance23> getCustomObject23s() {
        return customObject23s;
    }

    @JsonProperty("customObject23s")
    public void setCustomObject23s(OneToMany<ClientCorporationCustomObjectInstance23> customObject23s) {
        this.customObject23s = customObject23s;
    }

    @JsonProperty("customObject24s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance24> getCustomObject24s() {
        return customObject24s;
    }

    @JsonProperty("customObject24s")
    public void setCustomObject24s(OneToMany<ClientCorporationCustomObjectInstance24> customObject24s) {
        this.customObject24s = customObject24s;
    }

    @JsonProperty("customObject25s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance25> getCustomObject25s() {
        return customObject25s;
    }

    @JsonProperty("customObject25s")
    public void setCustomObject25s(OneToMany<ClientCorporationCustomObjectInstance25> customObject25s) {
        this.customObject25s = customObject25s;
    }

    @JsonProperty("customObject26s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance26> getCustomObject26s() {
        return customObject26s;
    }

    @JsonProperty("customObject26s")
    public void setCustomObject26s(OneToMany<ClientCorporationCustomObjectInstance26> customObject26s) {
        this.customObject26s = customObject26s;
    }

    @JsonProperty("customObject27s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance27> getCustomObject27s() {
        return customObject27s;
    }

    @JsonProperty("customObject27s")
    public void setCustomObject27s(OneToMany<ClientCorporationCustomObjectInstance27> customObject27s) {
        this.customObject27s = customObject27s;
    }

    @JsonProperty("customObject28s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance28> getCustomObject28s() {
        return customObject28s;
    }

    @JsonProperty("customObject28s")
    public void setCustomObject28s(OneToMany<ClientCorporationCustomObjectInstance28> customObject28s) {
        this.customObject28s = customObject28s;
    }

    @JsonProperty("customObject29s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance29> getCustomObject29s() {
        return customObject29s;
    }

    @JsonProperty("customObject29s")
    public void setCustomObject29s(OneToMany<ClientCorporationCustomObjectInstance29> customObject29s) {
        this.customObject29s = customObject29s;
    }

    @JsonProperty("customObject30s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance30> getCustomObject30s() {
        return customObject30s;
    }

    @JsonProperty("customObject30s")
    public void setCustomObject30s(OneToMany<ClientCorporationCustomObjectInstance30> customObject30s) {
        this.customObject30s = customObject30s;
    }

    @JsonProperty("customObject31s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance31> getCustomObject31s() {
        return customObject31s;
    }

    @JsonProperty("customObject31s")
    public void setCustomObject31s(OneToMany<ClientCorporationCustomObjectInstance31> customObject31s) {
        this.customObject31s = customObject31s;
    }

    @JsonProperty("customObject32s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance32> getCustomObject32s() {
        return customObject32s;
    }

    @JsonProperty("customObject32s")
    public void setCustomObject32s(OneToMany<ClientCorporationCustomObjectInstance32> customObject32s) {
        this.customObject32s = customObject32s;
    }

    @JsonProperty("customObject33s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance33> getCustomObject33s() {
        return customObject33s;
    }

    @JsonProperty("customObject33s")
    public void setCustomObject33s(OneToMany<ClientCorporationCustomObjectInstance33> customObject33s) {
        this.customObject33s = customObject33s;
    }

    @JsonProperty("customObject34s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance34> getCustomObject34s() {
        return customObject34s;
    }

    @JsonProperty("customObject34s")
    public void setCustomObject34s(OneToMany<ClientCorporationCustomObjectInstance34> customObject34s) {
        this.customObject34s = customObject34s;
    }

    @JsonProperty("customObject35s")
    @JsonSerialize(using = RestOneToManySerializer.class)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OneToMany<ClientCorporationCustomObjectInstance35> getCustomObject35s() {
        return customObject35s;
    }

    @JsonProperty("customObject35s")
    public void setCustomObject35s(OneToMany<ClientCorporationCustomObjectInstance35> customObject35s) {
        this.customObject35s = customObject35s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ClientCorporation that = (ClientCorporation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (annualRevenue != null ? !annualRevenue.equals(that.annualRevenue) : that.annualRevenue != null)
            return false;
        if (billingAddress != null ? !billingAddress.equals(that.billingAddress) : that.billingAddress != null)
            return false;
        if (billingContact != null ? !billingContact.equals(that.billingContact) : that.billingContact != null)
            return false;
        if (billingFrequency != null ? !billingFrequency.equals(that.billingFrequency) : that.billingFrequency != null)
            return false;
        if (billingPhone != null ? !billingPhone.equals(that.billingPhone) : that.billingPhone != null) return false;
        if (branch != null ? !branch.equals(that.branch) : that.branch != null) return false;
        if (businessSectorList != null ? !businessSectorList.equals(that.businessSectorList) : that.businessSectorList != null)
            return false;
        if (childClientCorporations != null ? !childClientCorporations.equals(that.childClientCorporations) : that.childClientCorporations != null)
            return false;
        if (clientContacts != null ? !clientContacts.equals(that.clientContacts) : that.clientContacts != null)
            return false;
        if (companyDescription != null ? !companyDescription.equals(that.companyDescription) : that.companyDescription != null)
            return false;
        if (companyURL != null ? !companyURL.equals(that.companyURL) : that.companyURL != null) return false;
        if (competitors != null ? !competitors.equals(that.competitors) : that.competitors != null) return false;
        if (culture != null ? !culture.equals(that.culture) : that.culture != null) return false;
        if (dateAdded != null ? !dateAdded.equals(that.dateAdded) : that.dateAdded != null) return false;
        if (dateFounded != null ? !dateFounded.equals(that.dateFounded) : that.dateFounded != null) return false;
        if (dateLastModified != null ? !dateLastModified.equals(that.dateLastModified) : that.dateLastModified != null)
            return false;
        if (department != null ? !department.equals(that.department) : that.department != null) return false;
        if (externalID != null ? !externalID.equals(that.externalID) : that.externalID != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (feeArrangement != null ? !feeArrangement.equals(that.feeArrangement) : that.feeArrangement != null)
            return false;
        if (funding != null ? !funding.equals(that.funding) : that.funding != null) return false;
        if (industryList != null ? !industryList.equals(that.industryList) : that.industryList != null) return false;
        if (invoiceFormat != null ? !invoiceFormat.equals(that.invoiceFormat) : that.invoiceFormat != null)
            return false;
        if (leads != null ? !leads.equals(that.leads) : that.leads != null) return false;
        if (linkedinProfileName != null ? !linkedinProfileName.equals(that.linkedinProfileName) : that.linkedinProfileName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (numEmployees != null ? !numEmployees.equals(that.numEmployees) : that.numEmployees != null) return false;
        if (numOffices != null ? !numOffices.equals(that.numOffices) : that.numOffices != null) return false;
        if (ownership != null ? !ownership.equals(that.ownership) : that.ownership != null) return false;
        if (owners != null ? !owners.equals(that.owners) : that.owners != null) return false;
        if (parentClientCorporation != null ? !parentClientCorporation.equals(that.parentClientCorporation) : that.parentClientCorporation != null)
            return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (revenue != null ? !revenue.equals(that.revenue) : that.revenue != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (taxRate != null ? !taxRate.equals(that.taxRate) : that.taxRate != null) return false;
        if (tickerSymbol != null ? !tickerSymbol.equals(that.tickerSymbol) : that.tickerSymbol != null) return false;
        if (trackTitle != null ? !trackTitle.equals(that.trackTitle) : that.trackTitle != null) return false;
        if (workWeekStart != null ? !workWeekStart.equals(that.workWeekStart) : that.workWeekStart != null)
            return false;
        if (requirements != null ? !requirements.equals(that.requirements) : that.requirements != null)
            return false;
        if (certificationGroups != null ? !certificationGroups.equals(that.certificationGroups) : that.certificationGroups != null)
            return false;
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
        if (customObject10s != null ? !customObject10s.equals(that.customObject10s) : that.customObject10s != null)
            return false;
        if (customObject11s != null ? !customObject11s.equals(that.customObject11s) : that.customObject11s != null)
            return false;
        if (customObject12s != null ? !customObject12s.equals(that.customObject12s) : that.customObject12s != null)
            return false;
        if (customObject13s != null ? !customObject13s.equals(that.customObject13s) : that.customObject13s != null)
            return false;
        if (customObject14s != null ? !customObject14s.equals(that.customObject14s) : that.customObject14s != null)
            return false;
        if (customObject15s != null ? !customObject15s.equals(that.customObject15s) : that.customObject15s != null)
            return false;
        if (customObject16s != null ? !customObject16s.equals(that.customObject16s) : that.customObject16s != null)
            return false;
        if (customObject17s != null ? !customObject17s.equals(that.customObject17s) : that.customObject17s != null)
            return false;
        if (customObject18s != null ? !customObject18s.equals(that.customObject18s) : that.customObject18s != null)
            return false;
        if (customObject19s != null ? !customObject19s.equals(that.customObject19s) : that.customObject19s != null)
            return false;
        return customObject20s != null ? customObject20s.equals(that.customObject20s) : that.customObject20s == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (annualRevenue != null ? annualRevenue.hashCode() : 0);
        result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
        result = 31 * result + (billingContact != null ? billingContact.hashCode() : 0);
        result = 31 * result + (billingFrequency != null ? billingFrequency.hashCode() : 0);
        result = 31 * result + (billingPhone != null ? billingPhone.hashCode() : 0);
        result = 31 * result + (branch != null ? branch.hashCode() : 0);
        result = 31 * result + (businessSectorList != null ? businessSectorList.hashCode() : 0);
        result = 31 * result + (childClientCorporations != null ? childClientCorporations.hashCode() : 0);
        result = 31 * result + (clientContacts != null ? clientContacts.hashCode() : 0);
        result = 31 * result + (companyDescription != null ? companyDescription.hashCode() : 0);
        result = 31 * result + (companyURL != null ? companyURL.hashCode() : 0);
        result = 31 * result + (competitors != null ? competitors.hashCode() : 0);
        result = 31 * result + (culture != null ? culture.hashCode() : 0);
        result = 31 * result + (dateAdded != null ? dateAdded.hashCode() : 0);
        result = 31 * result + (dateFounded != null ? dateFounded.hashCode() : 0);
        result = 31 * result + (dateLastModified != null ? dateLastModified.hashCode() : 0);
        result = 31 * result + (department != null ? department.hashCode() : 0);
        result = 31 * result + (externalID != null ? externalID.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (feeArrangement != null ? feeArrangement.hashCode() : 0);
        result = 31 * result + (funding != null ? funding.hashCode() : 0);
        result = 31 * result + (industryList != null ? industryList.hashCode() : 0);
        result = 31 * result + (invoiceFormat != null ? invoiceFormat.hashCode() : 0);
        result = 31 * result + (leads != null ? leads.hashCode() : 0);
        result = 31 * result + (linkedinProfileName != null ? linkedinProfileName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (numEmployees != null ? numEmployees.hashCode() : 0);
        result = 31 * result + (numOffices != null ? numOffices.hashCode() : 0);
        result = 31 * result + (ownership != null ? ownership.hashCode() : 0);
        result = 31 * result + (owners != null ? owners.hashCode() : 0);
        result = 31 * result + (parentClientCorporation != null ? parentClientCorporation.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (revenue != null ? revenue.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (taxRate != null ? taxRate.hashCode() : 0);
        result = 31 * result + (tickerSymbol != null ? tickerSymbol.hashCode() : 0);
        result = 31 * result + (trackTitle != null ? trackTitle.hashCode() : 0);
        result = 31 * result + (workWeekStart != null ? workWeekStart.hashCode() : 0);
        result = 31 * result + (requirements != null ? requirements.hashCode() : 0);
        result = 31 * result + (certificationGroups != null ? certificationGroups.hashCode() : 0);
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
        result = 31 * result + (customObject11s != null ? customObject11s.hashCode() : 0);
        result = 31 * result + (customObject12s != null ? customObject12s.hashCode() : 0);
        result = 31 * result + (customObject13s != null ? customObject13s.hashCode() : 0);
        result = 31 * result + (customObject14s != null ? customObject14s.hashCode() : 0);
        result = 31 * result + (customObject15s != null ? customObject15s.hashCode() : 0);
        result = 31 * result + (customObject16s != null ? customObject16s.hashCode() : 0);
        result = 31 * result + (customObject17s != null ? customObject17s.hashCode() : 0);
        result = 31 * result + (customObject18s != null ? customObject18s.hashCode() : 0);
        result = 31 * result + (customObject19s != null ? customObject19s.hashCode() : 0);
        result = 31 * result + (customObject20s != null ? customObject20s.hashCode() : 0);
        return result;
    }

    @Override
    public String toStringNonNull() {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass() + " { ");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(lbc + "address=").append(address.toStringNonNull());
        }
        if(annualRevenue != null){
            sb.append(lbc + "annualRevenue=").append(annualRevenue);
        }
        if(billingAddress != null){
            sb.append(lbc + "billingAddress=").append(billingAddress.toStringNonNull());
        }
        if(billingContact != null){
            sb.append(lbc + "billingContact=").append(billingContact);
        }
        if(billingFrequency != null){
            sb.append(lbc + "billingFrequency=").append(billingFrequency);
        }
        if(billingPhone != null){
            sb.append(lbc + "billingPhone=").append(billingPhone);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull());
        }
        if(businessSectorList != null){
            sb.append(lbc + "businessSectorList=").append(businessSectorList);
        }
        if(childClientCorporations != null){
            sb.append(lbc + "childClientCorporations=").append(childClientCorporations.toStringNonNull());
        }
        if(clientContacts != null){
            sb.append(lbc + "clientContacts=").append(clientContacts.toStringNonNull());
        }
        if(companyDescription != null){
            sb.append(lbc + "companyDescription=").append(companyDescription);
        }
        if(companyURL != null){
            sb.append(lbc + "companyURL=").append(companyURL);
        }
        if(competitors != null){
            sb.append(lbc + "competitors=").append(competitors);
        }
        if(culture != null){
            sb.append(lbc + "culture=").append(culture);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateFounded != null){
            sb.append(lbc + "dateFounded=").append(dateFounded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(department != null){
            sb.append(lbc + "department=").append(department.toStringNonNull());
        }
        if(externalID != null){
            sb.append(lbc + "externalID=").append(externalID);
        }
        if(fax != null){
            sb.append(lbc + "fax=").append(fax);
        }
        if(feeArrangement != null){
            sb.append(lbc + "feeArrangement=").append(feeArrangement);
        }
        if(funding != null){
            sb.append(lbc + "funding=").append(funding);
        }
        if(industryList != null){
            sb.append(lbc + "industryList=").append(industryList);
        }
        if(invoiceFormat != null){
            sb.append(lbc + "invoiceFormat=").append(invoiceFormat);
        }
        if(leads != null){
            sb.append(lbc + "leads=").append(leads.toStringNonNull());
        }
        if(linkedinProfileName != null){
            sb.append(lbc + "linkedinProfileName=").append(linkedinProfileName);
        }
        if(name != null){
            sb.append(lbc + "name=").append(name);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes);
        }
        if(numEmployees != null){
            sb.append(lbc + "numEmployees=").append(numEmployees);
        }
        if(numOffices != null){
            sb.append(lbc + "numOffices=").append(numOffices);
        }
        if(ownership != null){
            sb.append(lbc + "ownership=").append(ownership);
        }
        if(owners != null){
            sb.append(lbc + "owners=").append(owners.toStringNonNull());
        }
        if(parentClientCorporation != null){
            sb.append(lbc + "parentClientCorporation=").append(parentClientCorporation.toStringNonNull());
        }
        if(phone != null){
            sb.append(lbc + "phone=").append(phone);
        }
        if(revenue != null){
            sb.append(lbc + "revenue=").append(revenue);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(tickerSymbol != null){
            sb.append(lbc + "tickerSymbol=").append(tickerSymbol);
        }
        if(trackTitle != null){
            sb.append(lbc + "trackTitle=").append(trackTitle);
        }
        if(workWeekStart != null){
            sb.append(lbc + "workWeekStart=").append(workWeekStart);
        }
        if(requirements != null){
            sb.append(lbc + "requirements=").append(requirements);
        }
        if(certificationGroups != null){
            sb.append(lbc + "certificationGroups=").append(certificationGroups.toStringNonNull());
        }
        if(customObject1s != null){
            sb.append(lbc + "customObject1s=").append(customObject1s.toStringNonNull());
        }
        if(customObject2s != null){
            sb.append(lbc + "customObject2s=").append(customObject2s.toStringNonNull());
        }
        if(customObject3s != null){
            sb.append(lbc + "customObject3s=").append(customObject3s.toStringNonNull());
        }
        if(customObject4s != null){
            sb.append(lbc + "customObject4s=").append(customObject4s.toStringNonNull());
        }
        if(customObject5s != null){
            sb.append(lbc + "customObject5s=").append(customObject5s.toStringNonNull());
        }
        if(customObject6s != null){
            sb.append(lbc + "customObject6s=").append(customObject6s.toStringNonNull());
        }
        if(customObject7s != null){
            sb.append(lbc + "customObject7s=").append(customObject7s.toStringNonNull());
        }
        if(customObject8s != null){
            sb.append(lbc + "customObject8s=").append(customObject8s.toStringNonNull());
        }
        if(customObject9s != null){
            sb.append(lbc + "customObject9s=").append(customObject9s.toStringNonNull());
        }
        if(customObject10s != null){
            sb.append(lbc + "customObject10s=").append(customObject10s.toStringNonNull());
        }
        if(customObject11s != null){
            sb.append(lbc + "customObject11s=").append(customObject11s.toStringNonNull());
        }
        if(customObject12s != null){
            sb.append(lbc + "customObject12s=").append(customObject12s.toStringNonNull());
        }
        if(customObject13s != null){
            sb.append(lbc + "customObject13s=").append(customObject13s.toStringNonNull());
        }
        if(customObject14s != null){
            sb.append(lbc + "customObject14s=").append(customObject14s.toStringNonNull());
        }
        if(customObject15s != null){
            sb.append(lbc + "customObject15s=").append(customObject15s.toStringNonNull());
        }
        if(customObject16s != null){
            sb.append(lbc + "customObject16s=").append(customObject16s.toStringNonNull());
        }
        if(customObject17s != null){
            sb.append(lbc + "customObject17s=").append(customObject17s.toStringNonNull());
        }
        if(customObject18s != null){
            sb.append(lbc + "customObject18s=").append(customObject18s.toStringNonNull());
        }
        if(customObject19s != null){
            sb.append(lbc + "customObject19s=").append(customObject19s.toStringNonNull());
        }
        if(customObject20s != null){
            sb.append(lbc + "customObject20s=").append(customObject20s.toStringNonNull());
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toStringNonNull(boolean includeLineBreaks) {
        String lbc = ", ";
        final StringBuilder sb = new StringBuilder(getClass() + " { ");
        if(includeLineBreaks)
            sb.append("\n");
        if(id != null){
            sb.append("id=").append(id);
        }
        if(address != null){
            sb.append(lbc + "address=").append(address.toStringNonNull(includeLineBreaks));
        }
        if(annualRevenue != null){
            sb.append(lbc + "annualRevenue=").append(annualRevenue);
        }
        if(billingAddress != null){
            sb.append(lbc + "billingAddress=").append(billingAddress.toStringNonNull(includeLineBreaks));
        }
        if(billingContact != null){
            sb.append(lbc + "billingContact=").append(billingContact);
        }
        if(billingFrequency != null){
            sb.append(lbc + "billingFrequency=").append(billingFrequency);
        }
        if(billingPhone != null){
            sb.append(lbc + "billingPhone=").append(billingPhone);
        }
        if(branch != null){
            sb.append(lbc + "branch=").append(branch.toStringNonNull(includeLineBreaks));
        }
        if(businessSectorList != null){
            sb.append(lbc + "businessSectorList=").append(businessSectorList);
        }
        if(childClientCorporations != null){
            sb.append(lbc + "childClientCorporations=").append(childClientCorporations.toStringNonNull(includeLineBreaks));
        }
        if(clientContacts != null){
            sb.append(lbc + "clientContacts=").append(clientContacts.toStringNonNull(includeLineBreaks));
        }
        if(companyDescription != null){
            sb.append(lbc + "companyDescription=").append(companyDescription);
        }
        if(companyURL != null){
            sb.append(lbc + "companyURL=").append(companyURL);
        }
        if(competitors != null){
            sb.append(lbc + "competitors=").append(competitors);
        }
        if(culture != null){
            sb.append(lbc + "culture=").append(culture);
        }
        if(dateAdded != null){
            sb.append(lbc + "dateAdded=").append(dateAdded);
        }
        if(dateFounded != null){
            sb.append(lbc + "dateFounded=").append(dateFounded);
        }
        if(dateLastModified != null){
            sb.append(lbc + "dateLastModified=").append(dateLastModified);
        }
        if(department != null){
            sb.append(lbc + "department=").append(department.toStringNonNull(includeLineBreaks));
        }
        if(externalID != null){
            sb.append(lbc + "externalID=").append(externalID);
        }
        if(fax != null){
            sb.append(lbc + "fax=").append(fax);
        }
        if(feeArrangement != null){
            sb.append(lbc + "feeArrangement=").append(feeArrangement);
        }
        if(funding != null){
            sb.append(lbc + "funding=").append(funding);
        }
        if(industryList != null){
            sb.append(lbc + "industryList=").append(industryList);
        }
        if(invoiceFormat != null){
            sb.append(lbc + "invoiceFormat=").append(invoiceFormat);
        }
        if(leads != null){
            sb.append(lbc + "leads=").append(leads);
        }
        if(linkedinProfileName != null){
            sb.append(lbc + "linkedinProfileName=").append(linkedinProfileName);
        }
        if(name != null){
            sb.append(lbc + "name=").append(name);
        }
        if(notes != null){
            sb.append(lbc + "notes=").append(notes);
        }
        if(numEmployees != null){
            sb.append(lbc + "numEmployees=").append(numEmployees);
        }
        if(numOffices != null){
            sb.append(lbc + "numOffices=").append(numOffices);
        }
        if(ownership != null){
            sb.append(lbc + "ownership=").append(ownership);
        }
        if(owners != null){
            sb.append(lbc + "owners=").append(owners.toStringNonNull(includeLineBreaks));
        }
        if(parentClientCorporation != null){
            sb.append(lbc + "parentClientCorporation=").append(parentClientCorporation.toStringNonNull(includeLineBreaks));
        }
        if(phone != null){
            sb.append(lbc + "phone=").append(phone);
        }
        if(revenue != null){
            sb.append(lbc + "revenue=").append(revenue);
        }
        if(status != null){
            sb.append(lbc + "status=").append(status);
        }
        if(taxRate != null){
            sb.append(lbc + "taxRate=").append(taxRate);
        }
        if(tickerSymbol != null){
            sb.append(lbc + "tickerSymbol=").append(tickerSymbol);
        }
        if(trackTitle != null){
            sb.append(lbc + "trackTitle=").append(trackTitle);
        }
        if(workWeekStart != null){
            sb.append(lbc + "workWeekStart=").append(workWeekStart);
        }
        if(requirements != null){
            sb.append(lbc + "requirements=").append(requirements);
        }
        if(certificationGroups != null){
            sb.append(lbc + "certificationGroups=").append(certificationGroups.toStringNonNull(includeLineBreaks));
        }
        if(customObject1s != null){
            sb.append(lbc + "customObject1s=").append(customObject1s.toStringNonNull(includeLineBreaks));
        }
        if(customObject2s != null){
            sb.append(lbc + "customObject2s=").append(customObject2s.toStringNonNull(includeLineBreaks));
        }
        if(customObject3s != null){
            sb.append(lbc + "customObject3s=").append(customObject3s.toStringNonNull(includeLineBreaks));
        }
        if(customObject4s != null){
            sb.append(lbc + "customObject4s=").append(customObject4s.toStringNonNull(includeLineBreaks));
        }
        if(customObject5s != null){
            sb.append(lbc + "customObject5s=").append(customObject5s.toStringNonNull(includeLineBreaks));
        }
        if(customObject6s != null){
            sb.append(lbc + "customObject6s=").append(customObject6s.toStringNonNull(includeLineBreaks));
        }
        if(customObject7s != null){
            sb.append(lbc + "customObject7s=").append(customObject7s.toStringNonNull(includeLineBreaks));
        }
        if(customObject8s != null){
            sb.append(lbc + "customObject8s=").append(customObject8s.toStringNonNull(includeLineBreaks));
        }
        if(customObject9s != null){
            sb.append(lbc + "customObject9s=").append(customObject9s.toStringNonNull(includeLineBreaks));
        }
        if(customObject10s != null){
            sb.append(lbc + "customObject10s=").append(customObject10s.toStringNonNull(includeLineBreaks));
        }
        if(customObject11s != null){
            sb.append(lbc + "customObject11s=").append(customObject11s.toStringNonNull(includeLineBreaks));
        }
        if(customObject12s != null){
            sb.append(lbc + "customObject12s=").append(customObject12s.toStringNonNull(includeLineBreaks));
        }
        if(customObject13s != null){
            sb.append(lbc + "customObject13s=").append(customObject13s.toStringNonNull(includeLineBreaks));
        }
        if(customObject14s != null){
            sb.append(lbc + "customObject14s=").append(customObject14s.toStringNonNull(includeLineBreaks));
        }
        if(customObject15s != null){
            sb.append(lbc + "customObject15s=").append(customObject15s.toStringNonNull(includeLineBreaks));
        }
        if(customObject16s != null){
            sb.append(lbc + "customObject16s=").append(customObject16s.toStringNonNull(includeLineBreaks));
        }
        if(customObject17s != null){
            sb.append(lbc + "customObject17s=").append(customObject17s.toStringNonNull(includeLineBreaks));
        }
        if(customObject18s != null){
            sb.append(lbc + "customObject18s=").append(customObject18s.toStringNonNull(includeLineBreaks));
        }
        if(customObject19s != null){
            sb.append(lbc + "customObject19s=").append(customObject19s.toStringNonNull(includeLineBreaks));
        }
        if(customObject20s != null){
            sb.append(lbc + "customObject20s=").append(customObject20s.toStringNonNull(includeLineBreaks));
        }
        if(includeLineBreaks)
            sb.append("\n");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientCorporation{");
        sb.append("id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", annualRevenue=").append(annualRevenue);
        sb.append(", billingAddress=").append(billingAddress);
        sb.append(", billingContact='").append(billingContact).append('\'');
        sb.append(", billingFrequency='").append(billingFrequency).append('\'');
        sb.append(", billingPhone='").append(billingPhone).append('\'');
        sb.append(", branch=").append(branch);
        sb.append(", businessSectorList='").append(businessSectorList).append('\'');
        sb.append(", childClientCorporations=").append(childClientCorporations);
        sb.append(", clientContacts=").append(clientContacts);
        sb.append(", companyDescription='").append(companyDescription).append('\'');
        sb.append(", companyURL='").append(companyURL).append('\'');
        sb.append(", competitors='").append(competitors).append('\'');
        sb.append(", culture='").append(culture).append('\'');
        sb.append(", dateAdded=").append(dateAdded);
        sb.append(", dateFounded=").append(dateFounded);
        sb.append(", dateLastModified=").append(dateLastModified);
        sb.append(", department=").append(department);
        sb.append(", externalID='").append(externalID).append('\'');
        sb.append(", fax='").append(fax).append('\'');
        sb.append(", feeArrangement=").append(feeArrangement);
        sb.append(", funding='").append(funding).append('\'');
        sb.append(", industryList='").append(industryList).append('\'');
        sb.append(", invoiceFormat='").append(invoiceFormat).append('\'');
        sb.append(", leads=").append(leads);
        sb.append(", linkedinProfileName='").append(linkedinProfileName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", notes='").append(notes).append('\'');
        sb.append(", numEmployees=").append(numEmployees);
        sb.append(", numOffices=").append(numOffices);
        sb.append(", ownership='").append(ownership).append('\'');
        sb.append(", owners=").append(owners);
        sb.append(", parentClientCorporation=").append(parentClientCorporation);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", revenue='").append(revenue).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", taxRate=").append(taxRate);
        sb.append(", tickerSymbol='").append(tickerSymbol).append('\'');
        sb.append(", trackTitle='").append(trackTitle).append('\'');
        sb.append(", workWeekStart=").append(workWeekStart);
        sb.append(", requirements=").append(requirements);
        sb.append(", certificationGroups=").append(certificationGroups);
        sb.append(", customObject1s=").append(customObject1s);
        sb.append(", customObject2s=").append(customObject2s);
        sb.append(", customObject3s=").append(customObject3s);
        sb.append(", customObject4s=").append(customObject4s);
        sb.append(", customObject5s=").append(customObject5s);
        sb.append(", customObject6s=").append(customObject6s);
        sb.append(", customObject7s=").append(customObject7s);
        sb.append(", customObject8s=").append(customObject8s);
        sb.append(", customObject9s=").append(customObject9s);
        sb.append(", customObject10s=").append(customObject10s);
        sb.append(", customObject11s=").append(customObject11s);
        sb.append(", customObject12s=").append(customObject12s);
        sb.append(", customObject13s=").append(customObject13s);
        sb.append(", customObject14s=").append(customObject14s);
        sb.append(", customObject15s=").append(customObject15s);
        sb.append(", customObject16s=").append(customObject16s);
        sb.append(", customObject17s=").append(customObject17s);
        sb.append(", customObject18s=").append(customObject18s);
        sb.append(", customObject19s=").append(customObject19s);
        sb.append(", customObject20s=").append(customObject20s);
        sb.append('}');
        return sb.toString();
    }

    public ClientCorporation instantiateForInsert() {
		ClientCorporation entity = new ClientCorporation();
		entity.setAddress(new Address().instantiateForInsert());
		entity.setAnnualRevenue(new BigDecimal(10000.00));
		entity.setFeeArrangement(new BigDecimal(100.00));
		entity.setName("Test Corp");
		entity.setNumEmployees(500);
		entity.setNumOffices(1);
		entity.setStatus("Active");
		return entity;
	}
}
