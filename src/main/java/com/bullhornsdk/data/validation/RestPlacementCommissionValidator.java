package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.PlacementCommission;

@Service
public class RestPlacementCommissionValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return PlacementCommission.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "commissionPercentage", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "flatPayout", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "grossMarginPercentage", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "hourlyPayout", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "placement", "cannot be empty");
    }

}
