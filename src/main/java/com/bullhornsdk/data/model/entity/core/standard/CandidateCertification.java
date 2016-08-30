package com.bullhornsdk.data.model.entity.core.standard;

import com.bullhornsdk.data.model.entity.core.type.AbstractEntity;
import com.bullhornsdk.data.model.entity.core.type.AssociationEntity;
import com.bullhornsdk.data.model.entity.core.type.CreateEntity;
import com.bullhornsdk.data.model.entity.core.type.DeleteEntity;
import com.bullhornsdk.data.model.entity.core.type.QueryEntity;
import com.bullhornsdk.data.model.entity.core.type.SearchEntity;
import com.bullhornsdk.data.model.entity.core.type.UpdateEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.joda.time.DateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({"id", "boardCertification", "candidate", "certification", "comments", "compact", "copyOnFile", "dateCertified",
		"dateExpiration", "dateLastModified", "issuedBy", "licenseNumber", "licenseType", "location", "modifyingUser", "results", "status"})
public class CandidateCertification extends AbstractEntity implements QueryEntity, AssociationEntity {

	private Integer id;

	private String boardCertification;

	private Candidate candidate;

	private Certification certification;

	private String comments;

	private Boolean compact;

	private Boolean copyOnFile;

	private DateTime dateCertified;

	private DateTime dateExpiration;

	private DateTime dateLastModified;

	private String issuedBy;

	private String licenseNumber;

	private String licenseType;

	private String location;

	private CorporateUser modifyingUser;

	private String results;

	private String status;

	public CandidateCertification() {
		super();
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

	@JsonProperty("boardCertification")
	public String getBoardCertification() {
		return boardCertification;
	}

	@JsonProperty("boardCertification")
	public void setBoardCertification(String boardCertification) {
		this.boardCertification = boardCertification;
	}

	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@JsonProperty("certification")
	public Certification getCertification() {
		return certification;
	}

	@JsonProperty("certification")
	public void setCertification(Certification certification) {
		this.certification = certification;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("compact")
	public Boolean getCompact() {
		return compact;
	}

	@JsonProperty("compact")
	public void setCompact(Boolean compact) {
		this.compact = compact;
	}

	@JsonProperty("copyOnFile")
	public Boolean getCopyOnFile() {
		return copyOnFile;
	}

	@JsonProperty("copyOnFile")
	public void setCopyOnFile(Boolean copyOnFile) {
		this.copyOnFile = copyOnFile;
	}

	@JsonProperty("dateCertified")
	public DateTime getDateCertified() {
		return dateCertified;
	}

	@JsonProperty("dateCertified")
	public void setDateCertified(DateTime dateCertified) {
		this.dateCertified = dateCertified;
	}

	@JsonProperty("dateExpiration")
	public DateTime getDateExpiration() {
		return dateExpiration;
	}

	@JsonProperty("dateExpiration")
	public void setDateExpiration(DateTime dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@JsonProperty("dateLastModified")
	public DateTime getDateLastModified() {
		return dateLastModified;
	}

	@JsonProperty("dateLastModified")
	public void setDateLastModified(DateTime dateLastModified) {
		this.dateLastModified = dateLastModified;
	}

	@JsonProperty("issuedBy")
	public String getIssuedBy() {
		return issuedBy;
	}

	@JsonProperty("issuedBy")
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	@JsonProperty("licenseNumber")
	public String getLicenseNumber() {
		return licenseNumber;
	}

	@JsonProperty("licenseNumber")
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	@JsonProperty("licenseType")
	public String getLicenseType() {
		return licenseType;
	}

	@JsonProperty("licenseType")
	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	@JsonProperty("location")
	public String getLocation() {
		return location;
	}

	@JsonProperty("location")
	public void setLocation(String location) {
		this.location = location;
	}

	@JsonProperty("modifyingUser")
	public CorporateUser getModifyingUser() {
		return modifyingUser;
	}

	@JsonProperty("modifyingUser")
	public void setModifyingUser(CorporateUser modifyingUser) {
		this.modifyingUser = modifyingUser;
	}

	@JsonProperty("results")
	public String getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(String results) {
		this.results = results;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((boardCertification == null) ? 0 : boardCertification.hashCode());
		result = prime * result + ((candidate == null) ? 0 : candidate.hashCode());
		result = prime * result + ((certification == null) ? 0 : certification.hashCode());
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((compact == null) ? 0 : compact.hashCode());
		result = prime * result + ((copyOnFile == null) ? 0 : copyOnFile.hashCode());
		result = prime * result + ((dateCertified == null) ? 0 : dateCertified.hashCode());
		result = prime * result + ((dateExpiration == null) ? 0 : dateExpiration.hashCode());
		result = prime * result + ((dateLastModified == null) ? 0 : dateLastModified.hashCode());
		result = prime * result + ((issuedBy == null) ? 0 : issuedBy.hashCode());
		result = prime * result + ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
		result = prime * result + ((licenseType == null) ? 0 : licenseType.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((modifyingUser == null) ? 0 : modifyingUser.hashCode());
		result = prime * result + ((results == null) ? 0 : results.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		CandidateCertification other = (CandidateCertification) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (boardCertification == null) {
			if (other.boardCertification != null)
				return false;
		} else if (!boardCertification.equals(other.boardCertification))
			return false;
		if (candidate == null) {
			if (other.candidate != null)
				return false;
		} else if (!candidate.equals(other.candidate))
			return false;
		if (certification == null) {
			if (other.certification != null)
				return false;
		} else if (!certification.equals(other.certification))
			return false;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (compact == null) {
			if (other.compact != null)
				return false;
		} else if (!compact.equals(other.compact))
			return false;
		if (copyOnFile == null) {
			if (other.copyOnFile != null)
				return false;
		} else if (!copyOnFile.equals(other.copyOnFile))
			return false;
		if (dateCertified == null) {
			if (other.dateCertified != null)
				return false;
		} else if (!dateCertified.equals(other.dateCertified))
			return false;
		if (dateExpiration == null) {
			if (other.dateExpiration != null)
				return false;
		} else if (!dateExpiration.equals(other.dateExpiration))
			return false;
		if (dateLastModified == null) {
			if (other.dateLastModified != null)
				return false;
		} else if (!dateLastModified.equals(other.dateLastModified))
			return false;
		if (issuedBy == null) {
			if (other.issuedBy != null)
				return false;
		} else if (!issuedBy.equals(other.issuedBy))
			return false;
		if (licenseNumber == null) {
			if (other.licenseNumber != null)
				return false;
		} else if (!licenseNumber.equals(other.licenseNumber))
			return false;
		if (licenseType == null) {
			if (other.licenseType != null)
				return false;
		} else if (!licenseType.equals(other.licenseType))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (modifyingUser == null) {
			if (other.modifyingUser != null)
				return false;
		} else if (!modifyingUser.equals(other.modifyingUser))
			return false;
		if (results == null) {
			if (other.results != null)
				return false;
		} else if (!results.equals(other.results))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Certification {\nid=");
		builder.append(id);
		builder.append(", \nboardCertification=");
		builder.append(boardCertification);
		builder.append(", \ncandidate=");
		builder.append(candidate);
		builder.append(", \ncertification=");
		builder.append(certification);
		builder.append(", \ncomments=");
		builder.append(comments);
		builder.append(", \ncompact=");
		builder.append(compact);
		builder.append(", \ncopyOnFile=");
		builder.append(copyOnFile);
		builder.append(", \ndateCertified=");
		builder.append(dateCertified);
		builder.append(", \ndateExpiration=");
		builder.append(dateExpiration);
		builder.append(", \ndateLastModified=");
		builder.append(dateLastModified);
		builder.append(", \nissuedBy=");
		builder.append(issuedBy);
		builder.append(", \nlicenseNumber=");
		builder.append(licenseNumber);
		builder.append(", \nlicenseType=");
		builder.append(licenseType);
		builder.append(", \nlocation=");
		builder.append(location);
		builder.append(", \nmodifyingUser=");
		builder.append(modifyingUser);
		builder.append(", \nresults=");
		builder.append(results);
		builder.append(", \nstatus=");
		builder.append(status);
		builder.append("\n}");
		return builder.toString();
	}
}
