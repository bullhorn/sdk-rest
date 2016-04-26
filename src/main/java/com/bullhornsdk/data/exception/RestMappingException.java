/**
 * 
 */
package com.bullhornsdk.data.exception;

/**
 * @author Ryan McDole
 * 
 */
public class RestMappingException extends RestApiException {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public RestMappingException() {
        super();
    }

    public RestMappingException(Throwable cause) {
        super(cause);
    }

    public RestMappingException(String message) {
        super(message);
    }

    public RestMappingException(String message, Throwable cause) {
        super(message, cause);
    }

}
