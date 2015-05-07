package com.bullhornsdk.data.model.entity.resume;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResumeFileWrapper {

    @JsonIgnore
    private MultipartFile multipartFile;

    public ResumeFileWrapper() {
        super();
    }

    public ResumeFileWrapper(MultipartFile multipartFile) {
        super();
        this.multipartFile = multipartFile;
    }

    public MultipartFile getMultipartFile() {
        return multipartFile;
    }

    public void setMultipartFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

}
