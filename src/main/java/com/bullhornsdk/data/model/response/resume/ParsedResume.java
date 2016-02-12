package com.bullhornsdk.data.model.response.resume;

import java.util.List;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.response.file.FileWrapper;

/**
 * Holds the information from a parsed resume.
 * 
 * The FileWrapper field will only be set if the resume file is attached to a FileEntity as well as parsed, see
 * BullhornData.addFileThenParseResumeFile for this functionality.
 * 
 * @author Magnus Fiore Palm
 * 
 */
public interface ParsedResume {

	public Candidate getCandidate();

	public void setCandidate(Candidate candidate);

	public List<CandidateEducation> getCandidateEducation();

	public void setCandidateEducation(List<CandidateEducation> candidateEducation);

	public List<CandidateWorkHistory> getCandidateWorkHistory();

	public void setCandidateWorkHistory(List<CandidateWorkHistory> candidateWorkHistory);

	public List<String> getSkillList();

	public void setSkillList(List<String> skillList);

	public String getErrorCode();

	public void setErrorCode(String errorCode);

	public String getErrorMessage();

	public void setErrorMessage(String errorMessage);

	public boolean isError();

	/**
	 * Only contains a FileWrapper if the file was attached in the same api call as the resume parse.
	 * 
	 * @return null if the file wasn't attached otherwise the FileWrapper
	 */
	public FileWrapper getFileWrapper();

	public void setFileWrapper(FileWrapper fileWrapper);
}
