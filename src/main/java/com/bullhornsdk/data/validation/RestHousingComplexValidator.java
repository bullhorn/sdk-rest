package com.bullhornsdk.data.validation;

import com.bullhornsdk.data.model.entity.core.standard.HousingComplex;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Service
public class RestHousingComplexValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return HousingComplex.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
    }

}
