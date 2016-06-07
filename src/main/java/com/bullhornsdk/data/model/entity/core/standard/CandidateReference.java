package com.bullhornsdk.data.model.entity.core.standard;

import java.math.BigDecimal;

import javax.validation.constraints.Size;

import org.joda.time.DateTime;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SoftDeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.bullhornsdk.data.model.entity.embedded.LinkedId;
import com.bullhornsdk.data.model.entity.embedded.OneToManyLinkedId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "id", "candidate", "candidateTitle", "clientCorporation", "companyName", "customDate1", "customDate2", "customDate3",
		"customDate4", "customDate5", "customFloat1", "customFloat2", "customFloat3", "customFloat4", "customFloat5", "customInt1",
		"customInt2", "customInt3", "customInt4", "customInt5", "customMigrateGUID", "customText1", "customText2", "customText3",
		"customText4", "customText5", "customTextBlock1", "customTextBlock2", "customTextBlock3", "dateAdded", "employmentEnd",
		"employmentStart", "isDeleted", "jobOrder", "migrateGUID", "referenceClientContact", "referenceEmail", "referenceFirstName",
		"referenceLastName", "referencePhone", "referenceTitle", "responses", "status", "yearsKnown" })
public class CandidateReference extends AbstractEntity implements QueryEntity, UpdateEntity, CreateEntity, SoftDeleteEntity {

	private Integer id;

	private Candidate candidate;

	@JsonIgnore
	@Size(max = 50)
	private String candidateTitle;

	private LinkedId clientCorporation;

	@JsonIgnore
	@Size(max = 50)
	private String companyName;

	private DateTime customDate1;

	private DateTime customDate2;

	private DateTime customDate3;

	private DateTime customDate4;

	private DateTime customDate5;

	private BigDecimal customFloat1;

	private BigDecimal customFloat2;

	private BigDecimal customFloat3;

	private BigDecimal customFloat4;

	private BigDecimal customFloat5;

	private Integer customInt1;

	private Integer customInt2;

	private Integer customInt3;

	private Integer customInt4;

	private Integer customInt5;

	private Object customMigrateGUID;

	@JsonIgnore
	private String customText1;

	@JsonIgnore
	private String customText2;

	@JsonIgnore
	private String customText3;

	@JsonIgnore
	private String customText4;

	@JsonIgnore
	private String customText5;

	@JsonIgnore
	private String customTextBlock1;

	@JsonIgnore
	private String customTextBlock2;

	@JsonIgnore
	private String customTextBlock3;

	private DateTime dateAdded;

	private DateTime employmentEnd;

	private DateTime employmentStart;

	private Boolean isDeleted;

	private JobOrder jobOrder;

	private Object migrateGUID;

	private ClientContact referenceClientContact;

	@JsonIgnore
	@Size(max = 50)
	private String referenceEmail;

	@JsonIgnore
	@Size(max = 50)
	private String referenceFirstName;

	@JsonIgnore
	@Size(max = 50)
	private String referenceLastName;

	@JsonIgnore
	@Size(max = 20)
	private String referencePhone;

	@JsonIgnore
	@Size(max = 50)
	private String referenceTitle;

	private OneToManyLinkedId responses;

	@Size(max = 20)
	private String status;

	private Integer yearsKnown;

	public CandidateReference() {
		super();
	}

	/**
	 * Returns the entity with the required fields for an insert set.
	 * 
	 * @return
	 */
	public CandidateReference instantiateForInsert() {
		CandidateReference entity = new CandidateReference();
		entity.setIsDeleted(Boolean.FALSE);
		entity.setCandidate(new Candidate(1));
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

	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@JsonProperty("candidateTitle")
	public String getCandidateTitle() {
		return candidateTitle;
	}

	@JsonIgnore
	public void setCandidateTitle(String candidateTitle) {
		this.candidateTitle = candidateTitle;
	}

	@JsonProperty("clientCorporation")
	public LinkedId getClientCorporation() {
		return clientCorporation;
	}

	@JsonProperty("clientCorporation")
	public void setClientCorporation(LinkedId clientCorporation) {
		this.clientCorporation = clientCorporation;
	}

	@JsonProperty("companyName")
	public String getCompanyName() {
		return companyName;
	}

	@JsonIgnore
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@JsonProperty("customDate1")
	public DateTime getCustomDate1() {
		return customDate1;
	}

	@JsonProperty("customDate1")
	public void setCustomDate1(DateTime customDate1) {
		this.customDate1 = customDate1;
	}

	@JsonProperty("customDate2")
	public DateTime getCustomDate2() {
		return customDate2;
	}

	@JsonProperty("customDate2")
	public void setCustomDate2(DateTime customDate2) {
		this.customDate2 = customDate2;
	}

	@JsonProperty("customDate3")
	public DateTime getCustomDate3() {
		return customDate3;
	}

	@JsonProperty("customDate3")
	public void setCustomDate3(DateTime customDate3) {
		this.customDate3 = customDate3;
	}

	@JsonProperty("customDate4")
	public DateTime getCustomDate4() {
		return customDate4;
	}

	@JsonProperty("customDate4")
	public void setCustomDate4(DateTime customDate4) {
		this.customDate4 = customDate4;
	}

	@JsonProperty("customDate5")
	public DateTime getCustomDate5() {
		return customDate5;
	}

	@JsonProperty("customDate5")
	public void setCustomDate5(DateTime customDate5) {
		this.customDate5 = customDate5;
	}

	@JsonProperty("customFloat1")
	public BigDecimal getCustomFloat1() {
		return customFloat1;
	}

	@JsonProperty("customFloat1")
	public void setCustomFloat1(BigDecimal customFloat1) {
		this.customFloat1 = customFloat1;
	}

	@JsonProperty("customFloat2")
	public BigDecimal getCustomFloat2() {
		return customFloat2;
	}

	@JsonProperty("customFloat2")
	public void setCustomFloat2(BigDecimal customFloat2) {
		this.customFloat2 = customFloat2;
	}

	@JsonProperty("customFloat3")
	public BigDecimal getCustomFloat3() {
		return customFloat3;
	}

	@JsonProperty("customFloat3")
	public void setCustomFloat3(BigDecimal customFloat3) {
		this.customFloat3 = customFloat3;
	}

	@JsonProperty("customFloat4")
	public BigDecimal getCustomFloat4() {
		return customFloat4;
	}

	@JsonProperty("customFloat4")
	public void setCustomFloat4(BigDecimal customFloat4) {
		this.customFloat4 = customFloat4;
	}

	@JsonProperty("customFloat5")
	public BigDecimal getCustomFloat5() {
		return customFloat5;
	}

	@JsonProperty("customFloat5")
	public void setCustomFloat5(BigDecimal customFloat5) {
		this.customFloat5 = customFloat5;
	}

	@JsonProperty("customInt1")
	public Integer getCustomInt1() {
		return customInt1;
	}

	@JsonProperty("customInt1")
	public void setCustomInt1(Integer customInt1) {
		this.customInt1 = customInt1;
	}

	@JsonProperty("customInt2")
	public Integer getCustomInt2() {
		return customInt2;
	}

	@JsonProperty("customInt2")
	public void setCustomInt2(Integer customInt2) {
		this.customInt2 = customInt2;
	}

	@JsonProperty("customInt3")
	public Integer getCustomInt3() {
		return customInt3;
	}

	@JsonProperty("customInt3")
	public void setCustomInt3(Integer customInt3) {
		this.customInt3 = customInt3;
	}

	@JsonProperty("customInt4")
	public Integer getCustomInt4() {
		return customInt4;
	}

	@JsonProperty("customInt4")
	public void setCustomInt4(Integer customInt4) {
		this.customInt4 = customInt4;
	}

	@JsonProperty("customInt5")
	public Integer getCustomInt5() {
		return customInt5;
	}

	@JsonProperty("customInt5")
	public void setCustomInt5(Integer customInt5) {
		this.customInt5 = customInt5;
	}

	@JsonProperty("customMigrateGUID")
	public Object getCustomMigrateGUID() {
		return customMigrateGUID;
	}

	@JsonProperty("customMigrateGUID")
	public void setCustomMigrateGUID(Object customMigrateGUID) {
		this.customMigrateGUID = customMigrateGUID;
	}

	@JsonProperty("customText1")
	public String getCustomText1() {
		return customText1;
	}

	@JsonIgnore
	public void setCustomText1(String customText1) {
		this.customText1 = customText1;
	}

	@JsonProperty("customText2")
	public String getCustomText2() {
		return customText2;
	}

	@JsonIgnore
	public void setCustomText2(String customText2) {
		this.customText2 = customText2;
	}

	@JsonProperty("customText3")
	public String getCustomText3() {
		return customText3;
	}

	@JsonIgnore
	public void setCustomText3(String customText3) {
		this.customText3 = customText3;
	}

	@JsonProperty("customText4")
	public String getCustomText4() {
		return customText4;
	}

	@JsonIgnore
	public void setCustomText4(String customText4) {
		this.customText4 = customText4;
	}

	@JsonProperty("customText5")
	public String getCustomText5() {
		return customText5;
	}

	@JsonIgnore
	public void setCustomText5(String customText5) {
		this.customText5 = customText5;
	}

	@JsonProperty("customTextBlock1")
	public String getCustomTextBlock1() {
		return customTextBlock1;
	}

	@JsonIgnore
	public void setCustomTextBlock1(String customTextBlock1) {
		this.customTextBlock1 = customTextBlock1;
	}

	@JsonProperty("customTextBlock2")
	public String getCustomTextBlock2() {
		return customTextBlock2;
	}

	@JsonIgnore
	public void setCustomTextBlock2(String customTextBlock2) {
		this.customTextBlock2 = customTextBlock2;
	}

	@JsonProperty("customTextBlock3")
	public String getCustomTextBlock3() {
		return customTextBlock3;
	}

	@JsonIgnore
	public void setCustomTextBlock3(String customTextBlock3) {
		this.customTextBlock3 = customTextBlock3;
	}

	@JsonProperty("dateAdded")
	public DateTime getDateAdded() {
		return dateAdded;
	}

	@JsonProperty("dateAdded")
	public void setDateAdded(DateTime dateAdded) {
		this.dateAdded = dateAdded;
	}

	@JsonProperty("employmentEnd")
	public DateTime getEmploymentEnd() {
		return employmentEnd;
	}

	@JsonProperty("employmentEnd")
	public void setEmploymentEnd(DateTime employmentEnd) {
		this.employmentEnd = employmentEnd;
	}

	@JsonProperty("employmentStart")
	public DateTime getEmploymentStart() {
		return employmentStart;
	}

	@JsonProperty("employmentStart")
	public void setEmploymentStart(DateTime employmentStart) {
		this.employmentStart = employmentStart;
	}

	@JsonProperty("isDeleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	@JsonProperty("isDeleted")
	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@JsonProperty("jobOrder")
	public JobOrder getJobOrder() {
		return jobOrder;
	}

	@JsonProperty("jobOrder")
	public void setJobOrder(JobOrder jobOrder) {
		this.jobOrder = jobOrder;
	}

	@JsonProperty("migrateGUID")
	public Object getMigrateGUID() {
		return migrateGUID;
	}

	@JsonProperty("migrateGUID")
	public void setMigrateGUID(Object migrateGUID) {
		this.migrateGUID = migrateGUID;
	}

	@JsonProperty("referenceClientContact")
	public ClientContact getReferenceClientContact() {
		return referenceClientContact;
	}

	@JsonProperty("referenceClientContact")
	public void setReferenceClientContact(ClientContact referenceClientContact) {
		this.referenceClientContact = referenceClientContact;
	}

	@JsonProperty("referenceEmail")
	public String getReferenceEmail() {
		return referenceEmail;
	}

	@JsonIgnore
	public void setReferenceEmail(String referenceEmail) {
		this.referenceEmail = referenceEmail;
	}

	@JsonProperty("referenceFirstName")
	public String getReferenceFirstName() {
		return referenceFirstName;
	}

	@JsonIgnore
	public void setReferenceFirstName(String referenceFirstName) {
		this.referenceFirstName = referenceFirstName;
	}

	@JsonProperty("referenceLastName")
	public String getReferenceLastName() {
		return referenceLastName;
	}

	@JsonIgnore
	public void setReferenceLastName(String referenceLastName) {
		this.referenceLastName = referenceLastName;
	}

	@JsonProperty("referencePhone")
	public String getReferencePhone() {
		return referencePhone;
	}

	@JsonIgnore
	public void setReferencePhone(String referencePhone) {
		this.referencePhone = referencePhone;
	}

	@JsonProperty("referenceTitle")
	public String getReferenceTitle() {
		return referenceTitle;
	}

	@JsonIgnore
	public void setReferenceTitle(String referenceTitle) {
		this.referenceTitle = referenceTitle;
	}

	@JsonProperty("responses")
	public OneToManyLinkedId getResponses() {
		return responses;
	}

	@JsonProperty("responses")
	public void setResponses(OneToManyLinkedId responses) {
		this.responses = responses;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonIgnore
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("yearsKnown")
	public Integer getYearsKnown() {
		return yearsKnown;
	}

	@JsonProperty("yearsKnown")
	public void setYearsKnown(Integer yearsKnown) {
		this.yearsKnown = yearsKnown;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((candidateTitle == null) ? 0 : candidateTitle.hashCode());
		result = prime * result + ((clientCorporation == null) ? 0 : clientCorporation.hashCode());
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((customDate1 == null) ? 0 : customDate1.hashCode());
		result = prime * result + ((customDate2 == null) ? 0 : customDate2.hashCode());
		result = prime * result + ((customDate3 == null) ? 0 : customDate3.hashCode());
		result = prime * result + ((customDate4 == null) ? 0 : customDate4.hashCode());
		result = prime * result + ((customDate5 == null) ? 0 : customDate5.hashCode());
		result = prime * result + ((customFloat1 == null) ? 0 : customFloat1.hashCode());
		result = prime * result + ((customFloat2 == null) ? 0 : customFloat2.hashCode());
		result = prime * result + ((customFloat3 == null) ? 0 : customFloat3.hashCode());
		result = prime * result + ((customFloat4 == null) ? 0 : customFloat4.hashCode());
		result = prime * result + ((customFloat5 == null) ? 0 : customFloat5.hashCode());
		result = prime * result + ((customInt1 == null) ? 0 : customInt1.hashCode());
		result = prime * result + ((customInt2 == null) ? 0 : customInt2.hashCode());
		result = prime * result + ((customInt3 == null) ? 0 : customInt3.hashCode());
		result = prime * result + ((customInt4 == null) ? 0 : customInt4.hashCode());
		result = prime * result + ((customInt5 == null) ? 0 : customInt5.hashCode());
		result = prime * result + ((customMigrateGUID == null) ? 0 : customMigrateGUID.hashCode());
		result = prime * result + ((customText1 == null) ? 0 : customText1.hashCode());
		result = prime * result + ((customText2 == null) ? 0 : customText2.hashCode());
		result = prime * result + ((customText3 == null) ? 0 : customText3.hashCode());
		result = prime * result + ((customText4 == null) ? 0 : customText4.hashCode());
		result = prime * result + ((customText5 == null) ? 0 : customText5.hashCode());
		result = prime * result + ((customTextBlock1 == null) ? 0 : customTextBlock1.hashCode());
		result = prime * result + ((customTextBlock2 == null) ? 0 : customTextBlock2.hashCode());
		result = prime * result + ((customTextBlock3 == null) ? 0 : customTextBlock3.hashCode());
		result = prime * result + ((dateAdded == null) ? 0 : dateAdded.hashCode());
		result = prime * result + ((employmentEnd == null) ? 0 : employmentEnd.hashCode());
		result = prime * result + ((employmentStart == null) ? 0 : employmentStart.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((isDeleted == null) ? 0 : isDeleted.hashCode());
		result = prime * result + ((jobOrder == null) ? 0 : jobOrder.hashCode());
		result = prime * result + ((migrateGUID == null) ? 0 : migrateGUID.hashCode());
		result = prime * result + ((referenceClientContact == null) ? 0 : referenceClientContact.hashCode());
		result = prime * result + ((referenceEmail == null) ? 0 : referenceEmail.hashCode());
		result = prime * result + ((referenceFirstName == null) ? 0 : referenceFirstName.hashCode());
		result = prime * result + ((referenceLastName == null) ? 0 : referenceLastName.hashCode());
		result = prime * result + ((referencePhone == null) ? 0 : referencePhone.hashCode());
		result = prime * result + ((referenceTitle == null) ? 0 : referenceTitle.hashCode());
		result = prime * result + ((responses == null) ? 0 : responses.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((yearsKnown == null) ? 0 : yearsKnown.hashCode());
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
		CandidateReference other = (CandidateReference) obj;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (candidateTitle == null) {
			if (other.candidateTitle != null)
				return false;
		} else if (!candidateTitle.equals(other.candidateTitle))
			return false;
		if (clientCorporation == null) {
			if (other.clientCorporation != null)
				return false;
		} else if (!clientCorporation.equals(other.clientCorporation))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (customDate1 == null) {
			if (other.customDate1 != null)
				return false;
		} else if (!customDate1.isEqual(other.customDate1))
			return false;
		if (customDate2 == null) {
			if (other.customDate2 != null)
				return false;
		} else if (!customDate2.isEqual(other.customDate2))
			return false;
		if (customDate3 == null) {
			if (other.customDate3 != null)
				return false;
		} else if (!customDate3.isEqual(other.customDate3))
			return false;
		if (customDate4 == null) {
			if (other.customDate4 != null)
				return false;
		} else if (!customDate4.isEqual(other.customDate4))
			return false;
		if (customDate5 == null) {
			if (other.customDate5 != null)
				return false;
		} else if (!customDate5.isEqual(other.customDate5))
			return false;
		if (customFloat1 == null) {
			if (other.customFloat1 != null)
				return false;
		} else if (!customFloat1.equals(other.customFloat1))
			return false;
		if (customFloat2 == null) {
			if (other.customFloat2 != null)
				return false;
		} else if (!customFloat2.equals(other.customFloat2))
			return false;
		if (customFloat3 == null) {
			if (other.customFloat3 != null)
				return false;
		} else if (!customFloat3.equals(other.customFloat3))
			return false;
		if (customFloat4 == null) {
			if (other.customFloat4 != null)
				return false;
		} else if (!customFloat4.equals(other.customFloat4))
			return false;
		if (customFloat5 == null) {
			if (other.customFloat5 != null)
				return false;
		} else if (!customFloat5.equals(other.customFloat5))
			return false;
		if (customInt1 == null) {
			if (other.customInt1 != null)
				return false;
		} else if (!customInt1.equals(other.customInt1))
			return false;
		if (customInt2 == null) {
			if (other.customInt2 != null)
				return false;
		} else if (!customInt2.equals(other.customInt2))
			return false;
		if (customInt3 == null) {
			if (other.customInt3 != null)
				return false;
		} else if (!customInt3.equals(other.customInt3))
			return false;
		if (customInt4 == null) {
			if (other.customInt4 != null)
				return false;
		} else if (!customInt4.equals(other.customInt4))
			return false;
		if (customInt5 == null) {
			if (other.customInt5 != null)
				return false;
		} else if (!customInt5.equals(other.customInt5))
			return false;
		if (customMigrateGUID == null) {
			if (other.customMigrateGUID != null)
				return false;
		} else if (!customMigrateGUID.equals(other.customMigrateGUID))
			return false;
		if (customText1 == null) {
			if (other.customText1 != null)
				return false;
		} else if (!customText1.equals(other.customText1))
			return false;
		if (customText2 == null) {
			if (other.customText2 != null)
				return false;
		} else if (!customText2.equals(other.customText2))
			return false;
		if (customText3 == null) {
			if (other.customText3 != null)
				return false;
		} else if (!customText3.equals(other.customText3))
			return false;
		if (customText4 == null) {
			if (other.customText4 != null)
				return false;
		} else if (!customText4.equals(other.customText4))
			return false;
		if (customText5 == null) {
			if (other.customText5 != null)
				return false;
		} else if (!customText5.equals(other.customText5))
			return false;
		if (customTextBlock1 == null) {
			if (other.customTextBlock1 != null)
				return false;
		} else if (!customTextBlock1.equals(other.customTextBlock1))
			return false;
		if (customTextBlock2 == null) {
			if (other.customTextBlock2 != null)
				return false;
		} else if (!customTextBlock2.equals(other.customTextBlock2))
			return false;
		if (customTextBlock3 == null) {
			if (other.customTextBlock3 != null)
				return false;
		} else if (!customTextBlock3.equals(other.customTextBlock3))
			return false;
		if (dateAdded == null) {
			if (other.dateAdded != null)
				return false;
		} else if (!dateAdded.isEqual(other.dateAdded))
			return false;
		if (employmentEnd == null) {
			if (other.employmentEnd != null)
				return false;
		} else if (!employmentEnd.isEqual(other.employmentEnd))
			return false;
		if (employmentStart == null) {
			if (other.employmentStart != null)
				return false;
		} else if (!employmentStart.isEqual(other.employmentStart))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isDeleted == null) {
			if (other.isDeleted != null)
				return false;
		} else if (!isDeleted.equals(other.isDeleted))
			return false;
		if (jobOrder == null) {
			if (other.jobOrder != null)
				return false;
		} else if (!jobOrder.equals(other.jobOrder))
			return false;
		if (migrateGUID == null) {
			if (other.migrateGUID != null)
				return false;
		} else if (!migrateGUID.equals(other.migrateGUID))
			return false;
		if (referenceClientContact == null) {
			if (other.referenceClientContact != null)
				return false;
		} else if (!referenceClientContact.equals(other.referenceClientContact))
			return false;
		if (referenceEmail == null) {
			if (other.referenceEmail != null)
				return false;
		} else if (!referenceEmail.equals(other.referenceEmail))
			return false;
		if (referenceFirstName == null) {
			if (other.referenceFirstName != null)
				return false;
		} else if (!referenceFirstName.equals(other.referenceFirstName))
			return false;
		if (referenceLastName == null) {
			if (other.referenceLastName != null)
				return false;
		} else if (!referenceLastName.equals(other.referenceLastName))
			return false;
		if (referencePhone == null) {
			if (other.referencePhone != null)
				return false;
		} else if (!referencePhone.equals(other.referencePhone))
			return false;
		if (referenceTitle == null) {
			if (other.referenceTitle != null)
				return false;
		} else if (!referenceTitle.equals(other.referenceTitle))
			return false;
		if (responses == null) {
			if (other.responses != null)
				return false;
		} else if (!responses.equals(other.responses))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (yearsKnown == null) {
			if (other.yearsKnown != null)
				return false;
		} else if (!yearsKnown.equals(other.yearsKnown))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CandidateReference {\nid=");
		builder.append(id);
		builder.append(", \ncandidate=");
		builder.append(candidate);
		builder.append(", \ncandidateTitle=");
		builder.append(candidateTitle);
		builder.append(", \nclientCorporation=");
		builder.append(clientCorporation);
		builder.append(", \ncompanyName=");
		builder.append(companyName);
		builder.append(", \ncustomDate1=");
		builder.append(customDate1);
		builder.append(", \ncustomDate2=");
		builder.append(customDate2);
		builder.append(", \ncustomDate3=");
		builder.append(customDate3);
		builder.append(", \ncustomDate4=");
		builder.append(customDate4);
		builder.append(", \ncustomDate5=");
		builder.append(customDate5);
		builder.append(", \ncustomFloat1=");
		builder.append(customFloat1);
		builder.append(", \ncustomFloat2=");
		builder.append(customFloat2);
		builder.append(", \ncustomFloat3=");
		builder.append(customFloat3);
		builder.append(", \ncustomFloat4=");
		builder.append(customFloat4);
		builder.append(", \ncustomFloat5=");
		builder.append(customFloat5);
		builder.append(", \ncustomInt1=");
		builder.append(customInt1);
		builder.append(", \ncustomInt2=");
		builder.append(customInt2);
		builder.append(", \ncustomInt3=");
		builder.append(customInt3);
		builder.append(", \ncustomInt4=");
		builder.append(customInt4);
		builder.append(", \ncustomInt5=");
		builder.append(customInt5);
		builder.append(", \ncustomMigrateGUID=");
		builder.append(customMigrateGUID);
		builder.append(", \ncustomText1=");
		builder.append(customText1);
		builder.append(", \ncustomText2=");
		builder.append(customText2);
		builder.append(", \ncustomText3=");
		builder.append(customText3);
		builder.append(", \ncustomText4=");
		builder.append(customText4);
		builder.append(", \ncustomText5=");
		builder.append(customText5);
		builder.append(", \ncustomTextBlock1=");
		builder.append(customTextBlock1);
		builder.append(", \ncustomTextBlock2=");
		builder.append(customTextBlock2);
		builder.append(", \ncustomTextBlock3=");
		builder.append(customTextBlock3);
		builder.append(", \ndateAdded=");
		builder.append(dateAdded);
		builder.append(", \nemploymentEnd=");
		builder.append(employmentEnd);
		builder.append(", \nemploymentStart=");
		builder.append(employmentStart);
		builder.append(", \nisDeleted=");
		builder.append(isDeleted);
		builder.append(", \njobOrder=");
		builder.append(jobOrder);
		builder.append(", \nmigrateGUID=");
		builder.append(migrateGUID);
		builder.append(", \nreferenceClientContact=");
		builder.append(referenceClientContact);
		builder.append(", \nreferenceEmail=");
		builder.append(referenceEmail);
		builder.append(", \nreferenceFirstName=");
		builder.append(referenceFirstName);
		builder.append(", \nreferenceLastName=");
		builder.append(referenceLastName);
		builder.append(", \nreferencePhone=");
		builder.append(referencePhone);
		builder.append(", \nreferenceTitle=");
		builder.append(referenceTitle);
		builder.append(", \nresponses=");
		builder.append(responses);
		builder.append(", \nstatus=");
		builder.append(status);
		builder.append(", \nyearsKnown=");
		builder.append(yearsKnown);
		builder.append(", \nadditionalProperties=");
		builder.append(this.getAdditionalProperties());
		builder.append("\n}");
		return builder.toString();
	}

}