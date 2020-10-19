package com.bullhornsdk.data.exception;

public class NoAllFieldsException extends RestApiException {

    public NoAllFieldsException() {
        super("Passing fields=* to the REST APIs can no longer be performed.  Pass literal fields instead.");
    }

}
