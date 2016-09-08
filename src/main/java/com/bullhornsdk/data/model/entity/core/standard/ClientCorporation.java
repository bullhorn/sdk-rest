package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.api.helper.RestOneToManySerializer;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance1;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance10;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance2;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance3;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance4;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance5;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance6;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance7;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance8;
import com.bullhornsdk.data.model.entity.core.customobject.ClientCorporationCustomObjectInstance9;
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
		"businessSectorList", "childClientCorporations", "clientContacts", "companyDescription", "companyURL",
		"competitors", "culture", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
		"customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20",
		"customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
		"customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateFounded", "dateLastModified", "department",
		"externalID", "fax", "feeArrangement", "funding", "industryList", "invoiceFormat", "leads", "name", "notes", "numEmployees", "numOffices",
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
		result = 31 * result + (annualRevenue != null ? annualRevenue.hashCode() : 0);
		result = 31 * result + (billingAddress != null ? billingAddress.hashCode() : 0);
		result = 31 * result + (billingContact != null ? billingContact.hashCode() : 0);
		result = 31 * result + (billingFrequency != null ? billingFrequency.hashCode() : 0);
		result = 31 * result + (billingPhone != null ? billingPhone.hashCode() : 0);
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
		return "ClientCorporation{" +
				"id=" + id +
				", address=" + address +
				", annualRevenue=" + annualRevenue +
				", billingAddress=" + billingAddress +
				", billingContact='" + billingContact + '\'' +
				", billingFrequency='" + billingFrequency + '\'' +
				", billingPhone='" + billingPhone + '\'' +
				", businessSectorList='" + businessSectorList + '\'' +
				", childClientCorporations=" + childClientCorporations +
				", clientContacts=" + clientContacts +
				", companyDescription='" + companyDescription + '\'' +
				", companyURL='" + companyURL + '\'' +
				", competitors='" + competitors + '\'' +
				", culture='" + culture + '\'' +
				", dateAdded=" + dateAdded +
				", dateFounded=" + dateFounded +
				", dateLastModified=" + dateLastModified +
				", department=" + department +
				", externalID='" + externalID + '\'' +
				", fax='" + fax + '\'' +
				", feeArrangement=" + feeArrangement +
				", funding='" + funding + '\'' +
				", industryList='" + industryList + '\'' +
				", invoiceFormat='" + invoiceFormat + '\'' +
				", leads=" + leads +
				", name='" + name + '\'' +
				", notes='" + notes + '\'' +
				", numEmployees=" + numEmployees +
				", numOffices=" + numOffices +
				", ownership='" + ownership + '\'' +
				", owners=" + owners +
				", parentClientCorporation=" + parentClientCorporation +
				", phone='" + phone + '\'' +
				", revenue='" + revenue + '\'' +
				", status='" + status + '\'' +
				", taxRate=" + taxRate +
				", tickerSymbol='" + tickerSymbol + '\'' +
				", trackTitle='" + trackTitle + '\'' +
				", workWeekStart=" + workWeekStart +
				", customObject1s=" + customObject1s +
				", customObject2s=" + customObject2s +
				", customObject3s=" + customObject3s +
				", customObject4s=" + customObject4s +
				", customObject5s=" + customObject5s +
				", customObject6s=" + customObject6s +
				", customObject7s=" + customObject7s +
				", customObject8s=" + customObject8s +
				", customObject9s=" + customObject9s +
				", customObject10s=" + customObject10s +
				'}';
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
