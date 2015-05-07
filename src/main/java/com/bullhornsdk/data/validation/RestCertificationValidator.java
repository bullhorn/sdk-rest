package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Certification;

@Service
public class RestCertificationValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Certification.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {


    }

}
