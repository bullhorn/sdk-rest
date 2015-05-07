package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.ClientCorporation;

@Service
public class RestClientCorporationValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return ClientCorporation.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "address", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "annualRevenue", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "feeArrangement", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "name", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "numEmployees", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "numOffices", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");

    }

}
