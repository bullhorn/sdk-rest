package com.bullhornsdk.data;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
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
        Assertions.assertNotNull(savedParsedResume.getCandidate().getId(), "ParsedResume.candidate.id is null");
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
        Assertions.assertNotNull(parsedResume, "ParsedResume is null");
        Assertions.assertFalse(parsedResume.isError(), "Error parsing resume" + parsedResume.getErrorMessage());
        Assertions.assertNotNull(parsedResume.getCandidate(), "ParsedResume.candidate is null");
        Assertions.assertNotNull(parsedResume.getCandidateEducation(), "ParsedResume.candidateEducation is null");
        Assertions.assertNotNull(parsedResume.getCandidateWorkHistory(), "ParsedResume.candidateWorkHistory is null");
        Assertions.assertNotNull(parsedResume.getSkillList(), "ParsedResume.skillList is null");
    }

    private void assertFileWrapperIncludingFileName(FileWrapper fileWrapper) {
        Assertions.assertNotNull(fileWrapper,"fileWrapper is null");
        File file = fileWrapper.getFile();
        Assertions.assertNotNull(file, "file is null");
        byte[] fileContentAsByteArray = fileWrapper.getFileContentAsByteArray();
        Assertions.assertNotNull(fileContentAsByteArray, "fileContentAsByteArray is null");

        Assertions.assertTrue(FULL_FILE_NAME.equals(fileWrapper.getName()), "File name incorrectly saved in bullhorn");
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

    @AfterEach
    public void cleanUp() {
        if (parsedResume != null) {
            Candidate candidate = parsedResume.getCandidate();
            CrudResponse crudResponse = bullhornData.deleteEntity(Candidate.class, candidate.getId());
            Assertions.assertFalse(crudResponse.isError(), "Error deleting candidate");

            List<CandidateEducation> candidateEducationList = parsedResume.getCandidateEducation();

            if (candidateEducationList != null) {

                for (CandidateEducation candidateEducation : candidateEducationList) {
                    candidateEducation.setCandidate(candidate);
                    CrudResponse response = bullhornData.deleteEntity(CandidateEducation.class, candidateEducation.getId());
                    Assertions.assertFalse(response.isError(), "Error deleting CandidateEducation");
                }
            }

            List<CandidateWorkHistory> candidateWorkHistoryList = parsedResume.getCandidateWorkHistory();

            if (candidateWorkHistoryList != null) {

                for (CandidateWorkHistory candidateWorkHistory : candidateWorkHistoryList) {
                    candidateWorkHistory.setCandidate(candidate);
                    CrudResponse response = bullhornData.deleteEntity(CandidateWorkHistory.class, candidateWorkHistory.getId());
                    Assertions.assertFalse(response.isError(), "Error deleting CandidateWorkHistory");
                }
            }

        }
    }

}
