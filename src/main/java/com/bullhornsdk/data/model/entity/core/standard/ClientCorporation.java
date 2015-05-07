package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.FileEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.customfields.CustomFieldsB;
import com.bullhornsdk.data.model.entity.embedded.Address;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.OneToMany;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "address", "annualRevenue", "billingAddress", "billingContact", "billingFrequency", "billingPhone",
		"businessSectorList", "childClientCorporations", "clientContacts", "companyDescription", "companyURL",
		"competitors", "culture", "customDate1", "customDate2", "customDate3", "customFloat1", "customFloat2", "customFloat3",
		"customInt1", "customInt2", "customInt3", "customText1", "customText10", "customText11", "customText12", "customText13",
		"customText14", "customText15", "customText16", "customText17", "customText18", "customText19", "customText2", "customText20",
		"customText3", "customText4", "customText5", "customText6", "customText7", "customText8", "customText9", "customTextBlock1",
		"customTextBlock2", "customTextBlock3", "customTextBlock4", "customTextBlock5", "dateAdded", "dateFounded", "department",
		"externalID", "fax", "feeArrangement", "funding", "industryList", "invoiceFormat", "name", "notes", "numEmployees", "numOffices",
		"ownership", "parentClientCorporation", "phone", "revenue", "status", "taxRate", "tickerSymbol", "workWeekStart" })
public class ClientCorporation extends CustomFieldsB implements QueryEntity, UpdateEntity, CreateEntity, FileEntity, AssociationEntity,
		SearchEntity {

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

	private LinkedId department;

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

	private Integer workWeekStart;

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

	@JsonProperty("childClientCorporations")
	public void setChildClientCorporations(OneToMany<ClientCorporation> childClientCorporations) {
		this.childClientCorporations = childClientCorporations;
	}

	@JsonProperty("clientContacts")
	public OneToMany<ClientContact> getClientContacts() {
		return clientContacts;
	}

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

	@JsonProperty("department")
	public LinkedId getDepartment() {
		return department;
	}

	@JsonProperty("department")
	public void setDepartment(LinkedId department) {
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

	@JsonProperty("workWeekStart")
	public Integer getWorkWeekStart() {
		return workWeekStart;
	}

	@JsonProperty("workWeekStart")
	public void setWorkWeekStart(Integer workWeekStart) {
		this.workWeekStart = workWeekStart;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((annualRevenue == null) ? 0 : annualRevenue.hashCode());
		result = prime * result + ((billingAddress == null) ? 0 : billingAddress.hashCode());
		result = prime * result + ((billingContact == null) ? 0 : billingContact.hashCode());
		result = prime * result + ((billingFrequency == null) ? 0 : billingFrequency.hashCode());
		result = prime * result + ((billingPhone == null) ? 0 : billingPhone.hashCode());
		result = prime * result + ((businessSectorList == null) ? 0 : businessSectorList.hashCode());
		result = prime * result + ((childClientCorporations == null) ? 0 : childClientCorporations.hashCode());
		result = prime * result + ((clientContacts == null) ? 0 : clientContacts.hashCode());
		result = prime * result + ((companyDescription == null) ? 0 : companyDescription.hashCode());
		result = prime * result + ((companyURL == null) ? 0 : companyURL.hashCode());
		result = prime * result + ((competitors == null) ? 0 : competitors.hashCode());
		result = prime * result + ((culture == null) ? 0 : culture.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((dateFounded == null) ? 0 : dateFounded.hashCode());
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + ((externalID == null) ? 0 : externalID.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((feeArrangement == null) ? 0 : feeArrangement.hashCode());
		result = prime * result + ((funding == null) ? 0 : funding.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((industryList == null) ? 0 : industryList.hashCode());
		result = prime * result + ((invoiceFormat == null) ? 0 : invoiceFormat.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((numEmployees == null) ? 0 : numEmployees.hashCode());
		result = prime * result + ((numOffices == null) ? 0 : numOffices.hashCode());
		result = prime * result + ((ownership == null) ? 0 : ownership.hashCode());
		result = prime * result + ((parentClientCorporation == null) ? 0 : parentClientCorporation.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((revenue == null) ? 0 : revenue.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((taxRate == null) ? 0 : taxRate.hashCode());
		result = prime * result + ((tickerSymbol == null) ? 0 : tickerSymbol.hashCode());
		result = prime * result + ((workWeekStart == null) ? 0 : workWeekStart.hashCode());
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
		ClientCorporation other = (ClientCorporation) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (annualRevenue == null) {
			if (other.annualRevenue != null)
				return false;
		} else if (!annualRevenue.equals(other.annualRevenue))
			return false;
		if (billingAddress == null) {
			if (other.billingAddress != null)
				return false;
		} else if (!billingAddress.equals(other.billingAddress))
			return false;
		if (billingContact == null) {
			if (other.billingContact != null)
				return false;
		} else if (!billingContact.equals(other.billingContact))
			return false;
		if (billingFrequency == null) {
			if (other.billingFrequency != null)
				return false;
		} else if (!billingFrequency.equals(other.billingFrequency))
			return false;
		if (billingPhone == null) {
			if (other.billingPhone != null)
				return false;
		} else if (!billingPhone.equals(other.billingPhone))
			return false;
		if (businessSectorList == null) {
			if (other.businessSectorList != null)
				return false;
		} else if (!businessSectorList.equals(other.businessSectorList))
			return false;
		if (childClientCorporations == null) {
			if (other.childClientCorporations != null)
				return false;
		} else if (!childClientCorporations.equals(other.childClientCorporations))
			return false;
		if (clientContacts == null) {
			if (other.clientContacts != null)
				return false;
		} else if (!clientContacts.equals(other.clientContacts))
			return false;
		if (companyDescription == null) {
			if (other.companyDescription != null)
				return false;
		} else if (!companyDescription.equals(other.companyDescription))
			return false;
		if (companyURL == null) {
			if (other.companyURL != null)
				return false;
		} else if (!companyURL.equals(other.companyURL))
			return false;
		if (competitors == null) {
			if (other.competitors != null)
				return false;
		} else if (!competitors.equals(other.competitors))
			return false;
		if (culture == null) {
			if (other.culture != null)
				return false;
		} else if (!culture.equals(other.culture))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (dateFounded == null) {
			if (other.dateFounded != null)
				return false;
		} else if (!dateFounded.isEqual(other.dateFounded))
			return false;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (externalID == null) {
			if (other.externalID != null)
				return false;
		} else if (!externalID.equals(other.externalID))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (feeArrangement == null) {
			if (other.feeArrangement != null)
				return false;
		} else if (!feeArrangement.equals(other.feeArrangement))
			return false;
		if (funding == null) {
			if (other.funding != null)
				return false;
		} else if (!funding.equals(other.funding))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (industryList == null) {
			if (other.industryList != null)
				return false;
		} else if (!industryList.equals(other.industryList))
			return false;
		if (invoiceFormat == null) {
			if (other.invoiceFormat != null)
				return false;
		} else if (!invoiceFormat.equals(other.invoiceFormat))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (numEmployees == null) {
			if (other.numEmployees != null)
				return false;
		} else if (!numEmployees.equals(other.numEmployees))
			return false;
		if (numOffices == null) {
			if (other.numOffices != null)
				return false;
		} else if (!numOffices.equals(other.numOffices))
			return false;
		if (ownership == null) {
			if (other.ownership != null)
				return false;
		} else if (!ownership.equals(other.ownership))
			return false;
		if (parentClientCorporation == null) {
			if (other.parentClientCorporation != null)
				return false;
		} else if (!parentClientCorporation.equals(other.parentClientCorporation))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (revenue == null) {
			if (other.revenue != null)
				return false;
		} else if (!revenue.equals(other.revenue))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (taxRate == null) {
			if (other.taxRate != null)
				return false;
		} else if (!taxRate.equals(other.taxRate))
			return false;
		if (tickerSymbol == null) {
			if (other.tickerSymbol != null)
				return false;
		} else if (!tickerSymbol.equals(other.tickerSymbol))
			return false;
		if (workWeekStart == null) {
			if (other.workWeekStart != null)
				return false;
		} else if (!workWeekStart.equals(other.workWeekStart))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientCorporation {\nid=");
		builder.append(id);
		builder.append(", \naddress=");
		builder.append(address);
		builder.append(", \nannualRevenue=");
		builder.append(annualRevenue);
		builder.append(", \nbillingAddress=");
		builder.append(billingAddress);
		builder.append(", \nbillingContact=");
		builder.append(billingContact);
		builder.append(", \nbillingFrequency=");
		builder.append(billingFrequency);
		builder.append(", \nbillingPhone=");
		builder.append(billingPhone);
		builder.append(", \nbusinessSectorList=");
		builder.append(businessSectorList);
		builder.append(", \nchildClientCorporations=");
		builder.append(childClientCorporations);
		builder.append(", \nclientContacts=");
		builder.append(clientContacts);
		builder.append(", \ncompanyDescription=");
		builder.append(companyDescription);
		builder.append(", \ncompanyURL=");
		builder.append(companyURL);
		builder.append(", \ncompetitors=");
		builder.append(competitors);
		builder.append(", \nculture=");
		builder.append(culture);
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \ndateFounded=");
		builder.append(dateFounded);
		builder.append(", \ndepartment=");
		builder.append(department);
		builder.append(", \nexternalID=");
		builder.append(externalID);
		builder.append(", \nfax=");
		builder.append(fax);
		builder.append(", \nfeeArrangement=");
		builder.append(feeArrangement);
		builder.append(", \nfunding=");
		builder.append(funding);
		builder.append(", \nindustryList=");
		builder.append(industryList);
		builder.append(", \ninvoiceFormat=");
		builder.append(invoiceFormat);
		builder.append(", \nname=");
		builder.append(name);
		builder.append(", \nnotes=");
		builder.append(notes);
		builder.append(", \nnumEmployees=");
		builder.append(numEmployees);
		builder.append(", \nnumOffices=");
		builder.append(numOffices);
		builder.append(", \nownership=");
		builder.append(ownership);
		builder.append(", \nparentClientCorporation=");
		builder.append(parentClientCorporation);
		builder.append(", \nphone=");
		builder.append(phone);
		builder.append(", \nrevenue=");
		builder.append(revenue);
		builder.append(", \nstatus=");
		builder.append(status);
		builder.append(", \ntaxRate=");
		builder.append(taxRate);
		builder.append(", \ntickerSymbol=");
		builder.append(tickerSymbol);
		builder.append(", \nworkWeekStart=");
		builder.append(workWeekStart);
		builder.append("\n}");
		return builder.toString();
	}

}
