package com.bullhornsdk.data.exception;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.UnknownHttpStatusCodeException;

/**
 * Added to handle 400 and 500 errors. The DefaultResponseErrorHandler implementation does not return a responseBody.
 * 
 * It appears that trying to convert from InputStream responseBody = response.getBody(); to a byteArray returns an empty byte[].
 * Converting to String and the to byte[] returns the expected result.
 * 
 * @author magnus.palm
 * 
 */
public class CustomResponseErrorHandler extends DefaultResponseErrorHandler {

    private static Logger log = Logger.getLogger(CustomResponseErrorHandler.class);

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {

        HttpStatus statusCode = getHttpStatusCode(response);
        switch (statusCode.series()) {
        case CLIENT_ERROR:
            throw new HttpClientErrorException(statusCode, response.getStatusText(), response.getHeaders(),
                    getResponseBody(response), getCharset(response));
        case SERVER_ERROR:
            throw new HttpServerErrorException(statusCode, response.getStatusText(), response.getHeaders(),
                    getResponseBody(response), getCharset(response));
        default:
            throw new RestClientException("Unknown status code [" + statusCode + "]");
        }
    }

    private byte[] getResponseBody(ClientHttpResponse response) {
        try {
            InputStream responseBody = response.getBody();

            if (responseBody != null) {

                StringWriter writer = new StringWriter();
                IOUtils.copy(responseBody, writer, "UTF-8");
                String responseBodyString = writer.toString();

                byte[] bytes = responseBodyString.getBytes();
                return bytes;
            }
        } catch (IOException ex) {
            log.info("here");
        }
        return new byte[0];
    }

    private Charset getCharset(ClientHttpResponse response) {
        HttpHeaders headers = response.getHeaders();
        MediaType contentType = headers.getContentType();
        return contentType != null ? contentType.getCharSet() : null;
    }

    private HttpStatus getHttpStatusCode(ClientHttpResponse response) throws IOException {
        HttpStatus statusCode;
        try {
            statusCode = response.getStatusCode();
        } catch (IllegalArgumentException ex) {
            throw new UnknownHttpStatusCodeException(response.getRawStatusCode(), response.getStatusText(),
                    response.getHeaders(), getResponseBody(response), getCharset(response));
        }
        return statusCode;
    }

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return super.hasError(response);
    }
}