/**
 * 
 */
package com.bullhornsdk.data.exception;

/**
 * @author Yaniv Or-Shahar
 * 
 */
public class RestApiException extends RuntimeException {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public RestApiException() {
        super();
    }

    public RestApiException(Throwable cause) {
        super(cause);
    }

    public RestApiException(String message) {
        super(message);
    }

    public RestApiException(String message, Throwable cause) {
        super(message, cause);
    }

}
