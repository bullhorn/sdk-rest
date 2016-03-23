package com.bullhornsdk.data;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.annotation.Repeat;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;
import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.crud.CrudResponse;
import com.bullhornsdk.data.model.response.file.FileWrapper;
import com.bullhornsdk.data.model.response.resume.ParsedResume;

public class TestStandardBullhornApiRestResumeParse extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRestResumeParse.class);

	private final static String FILE_NAME = "Amy L";

	private final static String FILE_ENDING = "txt";

	private final static String FULL_FILE_NAME = FILE_NAME + "." + FILE_ENDING;

	ParsedResume parsedResume;

	public TestStandardBullhornApiRestResumeParse() {
		super();
	}

	@Repeat(1)
	@Test
	public void testParseResumeFile() {

		MultipartFile resume = getResume();
		ParsedResume parsedResume = bullhornData.parseResumeFile(resume, ParamFactory.resumeFileParseParams());
		assertParsedResume(parsedResume);

	}

	@Repeat(1)
	@Test
	public void testParseResumeText() throws UnsupportedEncodingException, IOException {

		MultipartFile resume = getResume();
		String resumeText = new String(resume.getBytes(), "UTF-8");

		ParsedResume parsedResume = bullhornData.parseResumeText(resumeText, ParamFactory.resumeTextParseParams());
		assertParsedResume(parsedResume);

	}

	@Repeat(1)
	@Test
	public void testSaveParseResume() {

		MultipartFile resume = getResume();
		ParsedResume parsedResume = bullhornData.parseResumeFile(resume, ParamFactory.resumeFileParseParams());
		assertParsedResume(parsedResume);

		ParsedResume savedParsedResume = bullhornData.saveParsedResumeDataToBullhorn(parsedResume);
		assertNotNull("ParsedResume.candidate.id is null", savedParsedResume.getCandidate().getId());
		this.parsedResume = savedParsedResume;

	}

	@Repeat(1)
	@Test
	public void testAddFileThenParseResumeFile() {

		MultipartFile resume = getResume();
		ParsedResume parsedResume = bullhornData.parseResumeThenAddfile(Candidate.class, testEntities.getCandidateId(), resume,
				"portfolio", ParamFactory.fileParams(), ParamFactory.resumeFileParseParams());
		assertParsedResume(parsedResume);
		assertFileWrapperIncludingFileName(parsedResume.getFileWrapper());

	}

	private void assertParsedResume(ParsedResume parsedResume) {
		assertNotNull("ParsedResume is null", parsedResume);
		assertFalse("Error parsing resume" + parsedResume.getErrorMessage(), parsedResume.isError());
		assertNotNull("ParsedResume.candidate is null", parsedResume.getCandidate());
		assertNotNull("ParsedResume.candidateEducation is null", parsedResume.getCandidateEducation());
		assertNotNull("ParsedResume.candidateWorkHistory is null", parsedResume.getCandidateWorkHistory());
		assertNotNull("ParsedResume.skillList is null", parsedResume.getSkillList());
	}

	private void assertFileWrapperIncludingFileName(FileWrapper fileWrapper) {
		assertNotNull("fileWrapper is null", fileWrapper);
		File file = fileWrapper.getFile();
		assertNotNull("file is null", file);
		byte[] fileContentAsByteArray = fileWrapper.getFileContentAsByteArray();
		assertNotNull("fileContentAsByteArray is null", fileContentAsByteArray);

		assertTrue("File name incorrectly saved in bullhorn", FULL_FILE_NAME.equals(fileWrapper.getName()));
	}

	private MultipartFile getResume() {
		ClassPathResource cpr = new ClassPathResource("testdata/"+FILE_NAME + "." + FILE_ENDING);

		MultipartFile file = null;
		try {

			file = new MockMultipartFile(FILE_NAME + "." + FILE_ENDING, cpr.getFilename(), FILE_ENDING, cpr.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return file;
	}

	@After
	public void cleanUp() {
		if (parsedResume != null) {
			Candidate candidate = parsedResume.getCandidate();
			CrudResponse crudResponse = bullhornData.deleteEntity(Candidate.class, candidate.getId());
			assertFalse("Error deleting candidate", crudResponse.isError());

			List<CandidateEducation> candidateEducationList = parsedResume.getCandidateEducation();

			if (candidateEducationList != null) {

				for (CandidateEducation candidateEducation : candidateEducationList) {
					candidateEducation.setCandidate(candidate);
					CrudResponse response = bullhornData.deleteEntity(CandidateEducation.class, candidateEducation.getId());
					assertFalse("Error deleting CandidateEducation", response.isError());
				}
			}

			List<CandidateWorkHistory> candidateWorkHistoryList = parsedResume.getCandidateWorkHistory();

			if (candidateWorkHistoryList != null) {

				for (CandidateWorkHistory candidateWorkHistory : candidateWorkHistoryList) {
					candidateWorkHistory.setCandidate(candidate);
					CrudResponse response = bullhornData.deleteEntity(CandidateWorkHistory.class, candidateWorkHistory.getId());
					assertFalse("Error deleting CandidateWorkHistory", response.isError());
				}
			}

		}
	}

}
