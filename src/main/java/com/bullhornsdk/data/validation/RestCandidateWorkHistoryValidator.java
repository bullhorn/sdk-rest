package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.CandidateWorkHistory;

@Service
public class RestCandidateWorkHistoryValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return CandidateWorkHistory.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "candidate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isLastJob", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "companyName", "cannot be empty");

    }

}
