package com.bullhornsdk.data.exception;


public class RestApiException extends RuntimeException {

    private String detailMessage;

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

    public RestApiException(String message, String detailMessage) {
        super(message);
        this.detailMessage = detailMessage;
    }


    public RestApiException(String message, String detailMessage, Throwable cause) {
        super(message, cause);
        this.detailMessage = detailMessage;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

}
