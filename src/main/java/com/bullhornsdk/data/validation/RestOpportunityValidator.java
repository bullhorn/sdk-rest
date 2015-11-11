package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Opportunity;

@Service
public class RestOpportunityValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Opportunity.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "clientContact", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "clientCorporation", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "type", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "owner", "cannot be empty");

    }

}
