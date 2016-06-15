package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.ClientContact;

@Service
public class RestClientContactValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ClientContact.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "category", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "clientCorporation", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "email", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "numEmployees", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "password", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "preferredContact", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "type", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "username", "cannot be empty");

    }

}
