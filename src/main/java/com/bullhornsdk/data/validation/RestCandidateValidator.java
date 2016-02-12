package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Candidate;

@Service
public class RestCandidateValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Candidate.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "category", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "comments", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "employeeType", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "firstName", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isEditable", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "lastName", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "name", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "owner", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "password", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "preferredContact", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "username", "cannot be empty");

    }

}
