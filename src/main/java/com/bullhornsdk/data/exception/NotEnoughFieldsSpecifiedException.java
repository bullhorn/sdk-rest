package com.bullhornsdk.data.exception;

/**
 * Created by hiqbal on 6/7/2016.
 */
public class NotEnoughFieldsSpecifiedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotEnoughFieldsSpecifiedException() {
        super();
    }

    public NotEnoughFieldsSpecifiedException(Throwable cause) {
        super(cause);
    }

    public NotEnoughFieldsSpecifiedException(String message) {
        super(message);
    }

    public NotEnoughFieldsSpecifiedException(String message, Throwable cause) {
        super(message, cause);
    }

}
