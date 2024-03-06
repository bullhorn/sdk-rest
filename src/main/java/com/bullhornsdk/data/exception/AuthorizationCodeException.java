package com.bullhornsdk.data.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class AuthorizationCodeException extends RestApiException {

    private static final Pattern GET_DETAIL_ERROR = Pattern.compile(".*?<p class=\"error\">(.*?)</p>", Pattern.DOTALL);

    public AuthorizationCodeException(String message, String responseBody) {
        super(message, parseErrorMessageFromHtml(responseBody));
    }

    public AuthorizationCodeException(String message, String responseBody, Throwable cause) {
        super(message, parseErrorMessageFromHtml(responseBody), cause);
    }

    public AuthorizationCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    private static String parseErrorMessageFromHtml(String responseBody) {
        if (StringUtils.isBlank(responseBody)) {
            return "";
        }

        Matcher matcher = GET_DETAIL_ERROR.matcher(responseBody);

        if (matcher.find()) {
            return matcher.group(1).trim();
        }

        return "";
    }

}
