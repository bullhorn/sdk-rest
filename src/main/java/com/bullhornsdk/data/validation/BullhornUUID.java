package com.bullhornsdk.data.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

/**
 * Checks that the format is 8-4-4-16 where all characters are A-Z or 0-9
 * 
 * @author magnus.palm
 * 
 */
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@ReportAsSingleViolation
@Pattern(regexp = BullhornUUID.PATTERN, flags = Pattern.Flag.CASE_INSENSITIVE)
public @interface BullhornUUID {

    String message() default "{javax.validation.constraints.Pattern.message}";

    static final String PATTERN = "[A-Z0-9]{8}-[A-Z0-9]{4}-[A-Z0-9]{4}-[A-Z0-9]{16}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}