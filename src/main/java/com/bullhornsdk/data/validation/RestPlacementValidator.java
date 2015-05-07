package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Placement;

@Service
public class RestPlacementValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Placement.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "candidate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "dateBegin", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "daysGuaranteed", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "daysProRated", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "durationWeeks", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "employmentType", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "fee", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "hoursPerDay", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "jobOrder", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "payRate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "recruitingManagerPercentGrossMargin", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "referralFee", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "salary", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "salaryUnit", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "salesManagerPercentGrossMargin", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "status", "cannot be empty");

    }

}
