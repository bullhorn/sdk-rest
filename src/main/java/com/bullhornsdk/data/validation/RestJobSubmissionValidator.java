package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.JobSubmission;

@Service
public class RestJobSubmissionValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return JobSubmission.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "candidate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "jobOrder", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "sendingUser", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");

    }

}
