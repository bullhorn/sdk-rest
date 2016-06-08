package com.bullhornsdk.data.validation;

import com.bullhornsdk.data.model.entity.core.standard.Tearsheet;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Service
public class RestTearsheetValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Tearsheet.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "name", "cannot be empty");
    }

}
