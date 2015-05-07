package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.NoteEntity;

@Service
public class RestNoteEntityValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return NoteEntity.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "targetEntityID", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "targetEntityName", "cannot be empty");
    }

}
