package com.bullhornsdk.data.api.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;

import com.bullhornsdk.data.model.enums.ResumeFileFormat;
import com.bullhornsdk.data.model.response.resume.ParsedResume;
import com.bullhornsdk.data.model.response.resume.standard.StandardParsedResume;

public class RestFileManager {

    private final String formFileName = "file";

    private static Logger log = Logger.getLogger(RestFileManager.class);

    /**
     * Will create a unique sub folder in the temp directory. This is done so that we can name the file with the original file
     * name without having to worry about file name collisions. The bh rest apis will name the attached file what the system File
     * created in this method is named, which is why we are not using a randomly generated file name here.
     * 
     * Will create a file in tempDir\\uniqueSubFolder\\filename.type
     * 
     * 
     * @param multipartFile
     * @return
     * @throws IOException
     */
    public MultiValueMap<String, Object> addFileToMultiValueMap(MultipartFile multipartFile) throws IOException {

        String newFolderPath = FileUtils.getTempDirectoryPath() + "/" + System.currentTimeMillis();

        File newFolder = new File(newFolderPath);

        FileUtils.forceMkdir(newFolder);

        String originalFileName = multipartFile.getOriginalFilename();
        String filePath = newFolderPath + "/" + originalFileName;
        File file = new File(filePath);

        FileCopyUtils.copy(multipartFile.getBytes(), file);

        return addFileToMultiValueMap(file);

    }

    /**
     * Will create a unique sub folder in the temp directory. This is done so that we can name the file with the original file
     * name without having to worry about file name collisions. The bh rest apis will name the attached file what the system File
     * created in this method is named, which is why we are not using a randomly generated file name here.
     * 
     * Will create a file in tempDir\\uniqueSubFolder\\filename.type
     * 
     * @param file
     * @return
     */
    public MultiValueMap<String, Object> addFileToMultiValueMap(File file) {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<String, Object>();

        multiValueMap.add(formFileName, new FileSystemResource(file));

        return multiValueMap;
    }

    public void deleteTempFile(MultiValueMap<String, Object> multiValueMap) {
        // clean up file
        FileSystemResource fileSystemResource = (FileSystemResource) multiValueMap.getFirst("file");

        String filePath = fileSystemResource.getPath();
        String newFolderPath = StringUtils.substringBeforeLast(filePath, "/");
        File newFolder = new File(newFolderPath);
        try {
            FileUtils.deleteDirectory(newFolder);
        } catch (IOException e) {
            log.info("Unable to delete temp file " + filePath);
        }

    }

    public MultiValueMap<String, Object> addResumeToMultiValueMap(MultipartFile resume) throws IOException {
        MultiValueMap<String, Object> multiValueMap = new LinkedMultiValueMap<String, Object>();

        File file = File.createTempFile("temp", ".tmp");

        FileCopyUtils.copy(resume.getBytes(), file);

        multiValueMap.add(formFileName, new FileSystemResource(file));
        return multiValueMap;
    }

    public void deleteTempResume(MultiValueMap<String, Object> multiValueMap) {
        // clean up file
        FileSystemResource fileSystemResource = (FileSystemResource) multiValueMap.getFirst(formFileName);

        File file = fileSystemResource.getFile();

        if (!file.delete()) {
            log.info("Unable to delete temp resume " + file.getAbsolutePath());
        }
    }

    public String getFileType(MultipartFile resume) {

        if (resume == null) {
            return "null";
        }

        if (ResumeFileFormat.isValidFormat(resume.getContentType())) {

            return resume.getContentType();
        }

        String fileName = resume.getOriginalFilename();

        String fileEnding = StringUtils.substringAfterLast(fileName, ".");
        return fileEnding;

    }

    public String getFileParam(MultipartFile resume) {

        if (resume == null) {
            return "null";
        }

        if (ResumeFileFormat.isValidFormat(resume.getContentType())) {

            return ResumeFileFormat.fileFormatToUrlParam(resume.getContentType());
        }

        String fileName = resume.getOriginalFilename();

        String fileEnding = StringUtils.substringAfterLast(fileName, ".");
        return ResumeFileFormat.fileFormatToUrlParam(fileEnding);

    }

    private String getFileName(String originalFileName) {
        String fileName = StringUtils.substringBeforeLast(originalFileName, ".");
        if (fileName == null || fileName.isEmpty()) {
            return originalFileName;
        }
        return fileName;
    }

    private String getFileEnding(String originalFileName) {
        String fileEnding = StringUtils.substringAfterLast(originalFileName, ".");
        if (fileEnding == null || fileEnding.isEmpty()) {
            return ".tmp";
        }
        return "." + fileEnding;
    }

    public boolean validFile(MultipartFile resume) {

        if (resume == null) {
            return false;
        }

        String fileType = getFileType(resume);
        if (ResumeFileFormat.isValidFormat(fileType)) {
            return true;
        }

        return false;
    }

    public <P extends ParsedResume> P handleNotValidFileFormat(MultipartFile resume) {
        ParsedResume response = new StandardParsedResume();
        response.setErrorCode("Not a valid file");
        response.setErrorMessage("Not a valid file of type: " + getFileType(resume));
        return (P) response;

    }

    public String getFormFileName() {
        return formFileName;
    }

}
