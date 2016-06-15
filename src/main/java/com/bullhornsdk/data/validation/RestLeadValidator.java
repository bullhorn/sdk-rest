package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Lead;

@Service
public class RestLeadValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Lead.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "clientCorporation", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "email", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "type", "cannot be empty");

    }

}
