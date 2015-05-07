package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.JobOrder;

@Service
public class RestJobOrderValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return JobOrder.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "clientContact", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "clientCorporation", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "employmentType", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "owner", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "startDate", "cannot be empty");

    }

}
