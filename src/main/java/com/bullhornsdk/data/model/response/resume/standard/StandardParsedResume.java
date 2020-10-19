package com.bullhornsdk.data.model.response.resume.standard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.entity.core.standard.Skill;
import com.bullhornsdk.data.model.response.file.FileWrapper;
import com.bullhornsdk.data.model.response.resume.ParsedResume;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "data")
@JsonPropertyOrder({ "candidate", "candidateEducation", "candidateWorkHistory" })
public class StandardParsedResume implements ParsedResume {

	private Candidate candidate;
	private List<CandidateEducation> candidateEducation;
	private List<CandidateWorkHistory> candidateWorkHistory;
	private List<String> skillList;
    private List<Skill> primarySkills;
	private FileWrapper fileWrapper;

	private String errorCode;
	private String errorMessage;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@Override
	@JsonProperty("candidate")
	public Candidate getCandidate() {
		return candidate;
	}

	@Override
	@JsonProperty("candidate")
	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	@Override
	@JsonProperty("candidateEducation")
	public List<CandidateEducation> getCandidateEducation() {
		return candidateEducation;
	}

	@Override
	@JsonProperty("candidateEducation")
	public void setCandidateEducation(List<CandidateEducation> candidateEducation) {
		this.candidateEducation = candidateEducation;
	}

	@Override
	@JsonProperty("candidateWorkHistory")
	public List<CandidateWorkHistory> getCandidateWorkHistory() {
		return candidateWorkHistory;
	}

	@Override
	@JsonProperty("candidateWorkHistory")
	public void setCandidateWorkHistory(List<CandidateWorkHistory> candidateWorkHistory) {
		this.candidateWorkHistory = candidateWorkHistory;
	}

	@Override
	@JsonProperty("skillList")
	public List<String> getSkillList() {
		return skillList;
	}

	@Override
	@JsonProperty("skillList")
	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}

    @Override
    @JsonProperty("primarySkills")
    public List<Skill> getPrimarySkills() {
        return primarySkills;
    }

    @Override
    @JsonProperty("primarySkills")
    public void setPrimarySkills(List<Skill> primarySkills) {
        this.primarySkills = primarySkills;
    }

    @Override
	@JsonIgnore
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	@JsonIgnore
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	@JsonIgnore
	public String getErrorMessage() {
		return errorMessage;
	}

	@Override
	@JsonIgnore
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public boolean isError() {
		if (errorMessage != null && errorMessage.trim().length() > 0) {
			return true;
		}
		return false;
	}

	@Override
	@JsonIgnore
	public FileWrapper getFileWrapper() {
		return fileWrapper;
	}

	@Override
	@JsonIgnore
	public void setFileWrapper(FileWrapper fileWrapper) {
		this.fileWrapper = fileWrapper;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperties(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

    @Override
    public String toString() {
        return "StandardParsedResume{" +
            "candidate=" + candidate +
            ", candidateEducation=" + candidateEducation +
            ", candidateWorkHistory=" + candidateWorkHistory +
            ", skillList=" + skillList +
            ", primarySkills=" + primarySkills +
            ", fileWrapper=" + fileWrapper +
            ", errorCode='" + errorCode + '\'' +
            ", errorMessage='" + errorMessage + '\'' +
            ", additionalProperties=" + additionalProperties +
            '}';
    }
}
