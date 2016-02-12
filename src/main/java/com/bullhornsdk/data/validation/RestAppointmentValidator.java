package com.bullhornsdk.data.validation;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.bullhornsdk.data.model.entity.core.standard.Appointment;

@Service
public class RestAppointmentValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Appointment.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors e) {
        ValidationUtils.rejectIfEmpty(e, "communicationMethod", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "dateBegin", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "dateEnd", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "description", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isDeleted", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "isPrivate", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "notificationMinutes", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "owner", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "subject", "cannot be empty");
        ValidationUtils.rejectIfEmpty(e, "type", "cannot be empty");

    }

}
