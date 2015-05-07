package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.CandidateEducation;

@Service
public class RestCandidateEducationValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return CandidateEducation.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {


    }

}
