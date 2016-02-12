package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Sendout;

@Service
public class RestSendoutValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Sendout.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "candidate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isRead", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "user", "cannot be empty");
    }

}
