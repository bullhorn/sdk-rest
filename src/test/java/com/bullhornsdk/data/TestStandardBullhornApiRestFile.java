package com.bullhornsdk.data;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.annotation.Repeat;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;
import com.bullhornsdk.data.model.parameter.FileParams;
import com.bullhornsdk.data.model.parameter.standard.ParamFactory;
import com.bullhornsdk.data.model.response.file.FileApiResponse;
import com.bullhornsdk.data.model.response.file.FileContent;
import com.bullhornsdk.data.model.file.FileMeta;
import com.bullhornsdk.data.model.response.file.FileWrapper;

public class TestStandardBullhornApiRestFile extends BaseTest {
	private final Logger log = Logger.getLogger(TestStandardBullhornApiRestFile.class);

	private final static String FILE_NAME = "charlotte";

	private final static String FILE_ENDING = "rtf";

	private final static String FULL_FILE_NAME = FILE_NAME + "." + FILE_ENDING;

	FileContent fileContent;

	public TestStandardBullhornApiRestFile() {
		super();
	}

	@Repeat(1)
	@Test
	public void testGetFileContent() throws UnsupportedEncodingException, IOException {
		try {
			FileContent fileContent = bullhornData.getFileContent(Candidate.class, testEntities.getCandidateId(), getFileId());
			assertNotNull("FileContent is null", fileContent);
			assertNotNull("FileContent is null", fileContent.getContentType());
			assertNotNull("FileContent is null", fileContent.getName());
			assertNotNull("FileContent is null", fileContent.getFileContent());
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}
	}

	private Integer getFileId() {
		List<FileMeta> entityMetaFiles = bullhornData.getFileMetaData(Candidate.class, testEntities.getCandidateId());
		assertEntityMetaFiles(entityMetaFiles);

		FileMeta fileMeta = entityMetaFiles.get(0);
		return fileMeta.getId();
	}

	@Repeat(1)
	@Test
	public void testGetEntityMetaFiles() throws UnsupportedEncodingException, IOException {
		try {
			List<FileMeta> entityMetaFiles = bullhornData.getFileMetaData(Candidate.class, testEntities.getCandidateId());
			assertEntityMetaFiles(entityMetaFiles);
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}
	}

	@Repeat(1)
	@Test
	public void testGetFileContentWithMetaData() throws UnsupportedEncodingException, IOException {
		try {
			FileWrapper fileWrapper = bullhornData.getFile(Candidate.class, testEntities.getCandidateId(), getFileId());
			assertFileWrapper(fileWrapper);
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}
	}

	@Repeat(1)
	@Test
	public void testGetAllFileContentWithMetaData() throws UnsupportedEncodingException, IOException {
		try {
			List<FileWrapper> fileWrapperList = bullhornData.getAllFiles(Candidate.class, testEntities.getCandidateId());

			for (FileWrapper fileWrapper : fileWrapperList) {
				assertFileWrapper(fileWrapper);
			}
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}
	}

	@Repeat(1)
	@Test
	public void testAddFileUsingMultipartFile() throws UnsupportedEncodingException, IOException {
		MultipartFile file = getResume();
		FileParams params = ParamFactory.fileParams();
		try {
			FileWrapper fileWrapper = bullhornData.addFile(Candidate.class, testEntities.getCandidateId(), file, "portfolio", params);
			assertFileWrapperIncludingFileName(fileWrapper);

			FileApiResponse fileApiResponse = bullhornData.deleteFile(Candidate.class, testEntities.getCandidateId(),
					fileWrapper.getId());

			assertFileApiResponse(fileApiResponse, fileWrapper.getId());
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}

	}

	@Repeat(1)
	@Test
	public void testAddFileUsingFile() throws UnsupportedEncodingException, IOException {
		File file = getFile();
		FileParams params = ParamFactory.fileParams();
		try {
			FileWrapper fileWrapper = bullhornData.addFile(Candidate.class, testEntities.getCandidateId(), file, "portfolio", params);
			assertFileWrapperIncludingFileName(fileWrapper);

			FileApiResponse fileApiResponse = bullhornData.deleteFile(Candidate.class, testEntities.getCandidateId(),
					fileWrapper.getId());

			assertFileApiResponse(fileApiResponse, fileWrapper.getId());
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}

	}

	@Repeat(1)
	@Test
	public void testAddResumeFileAndPopulateCandidateDescription() throws UnsupportedEncodingException, IOException {
		File file = getFile();
		FileParams params = ParamFactory.fileParams();
		try {

			Candidate testCandidate = new Candidate();
			testCandidate.setId(testEntities.getCandidateId());
			testCandidate.setDescription("");
			bullhornData.updateEntity(testCandidate);

			Set<String> fields = new HashSet<String>(Arrays.asList(new String[] { "id", "description" }));

			Candidate shouldHaveNoDescription = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), fields);
			assertTrue("The test candidate should have a blank description. But it is not.",
					StringUtils.isBlank(shouldHaveNoDescription.getDescription()));

			String candidateDescription = "new description";
			FileWrapper fileWrapper = bullhornData.addResumeFileAndPopulateCandidateDescription(testEntities.getCandidateId(), file,
					candidateDescription, "portfolio", params);
			assertFileWrapperIncludingFileName(fileWrapper);

			Candidate shouldHaveDescription = bullhornData.findEntity(Candidate.class, testEntities.getCandidateId(), fields);

			assertTrue("Error with addResumeFileAndPopulateCandidateDescription. Description not populated",
					StringUtils.equalsIgnoreCase(candidateDescription, shouldHaveDescription.getDescription()));

			FileApiResponse fileApiResponse = bullhornData.deleteFile(Candidate.class, testEntities.getCandidateId(),
					fileWrapper.getId());

			assertFileApiResponse(fileApiResponse, fileWrapper.getId());
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}

	}

	@Repeat(1)
	@Test
	public void testDeleteFile() throws UnsupportedEncodingException, IOException {
		MultipartFile file = getResume();
		FileParams params = ParamFactory.fileParams();
		try {
			FileWrapper fileWrapper = bullhornData.addFile(Candidate.class, testEntities.getCandidateId(), file, "portfolio", params);

			assertFileWrapper(fileWrapper);

			FileApiResponse fileApiResponse = bullhornData.deleteFile(Candidate.class, testEntities.getCandidateId(),
					fileWrapper.getId());

			assertFileApiResponse(fileApiResponse, fileWrapper.getId());
		} catch (HttpStatusCodeException error) {
			assertTrue(StringUtils.equals("" + error.getStatusCode().value(), "500"));
		}

	}

	private void assertFileApiResponse(FileApiResponse fileApiResponse, Integer fileId) {
		assertNotNull("fileApiResponse is null", fileApiResponse);
		assertNotNull("fileApiResponse.fileId is null", fileApiResponse.getFileId());
		assertTrue("file not deleted properly", fileApiResponse.getFileId().equals(fileId));

	}

	private void assertFileWrapper(FileWrapper fileWrapper) {
		assertNotNull("fileWrapper is null", fileWrapper);
		File file = fileWrapper.getFile();
		assertNotNull("file is null", file);
		byte[] fileContentAsByteArray = fileWrapper.getFileContentAsByteArray();
		assertNotNull("fileContentAsByteArray is null", fileContentAsByteArray);

	}

	private void assertFileWrapperIncludingFileName(FileWrapper fileWrapper) {
		assertFileWrapper(fileWrapper);

		assertTrue("File name incorrectly saved in bullhorn", FULL_FILE_NAME.equals(fileWrapper.getName()));
	}

	private void assertEntityMetaFiles(List<FileMeta> entityMetaFiles) {
		assertNotNull("entityMetaFiles is null", entityMetaFiles);
		assertTrue("entityMetaFiles.getFileMetas is empty", entityMetaFiles.size() > 0);
	}

	private MultipartFile getResume() {
		ClassPathResource cpr = new ClassPathResource("testdata/" + FILE_NAME + "." + FILE_ENDING);

		MultipartFile file = null;
		try {

			file = new MockMultipartFile(FILE_NAME + "." + FILE_ENDING, cpr.getFilename(), FILE_ENDING, cpr.getInputStream());
		} catch (IOException e) {
			throw new IllegalStateException("Error getting file.", e);
		}

		return file;
	}

	private File getFile() throws IOException {
		MultipartFile multipartFile = getResume();
		String newFolderPath = FileUtils.getTempDirectoryPath() + "/" + System.currentTimeMillis();

		File newFolder = new File(newFolderPath);

		FileUtils.forceMkdir(newFolder);

		String originalFileName = multipartFile.getOriginalFilename();
		String filePath = newFolderPath + "/" + originalFileName;
		File file = new File(filePath);

		FileCopyUtils.copy(multipartFile.getBytes(), file);

		return file;

	}

}
