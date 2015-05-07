package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.AppointmentAttendee;

@Service
public class RestAppointmentAttendeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return AppointmentAttendee.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "appointment", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "attendee", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "acceptanceStatus", "cannot be empty");
    }

}
