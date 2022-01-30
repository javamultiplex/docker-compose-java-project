package com.javamultiplex.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

/**
 * @author Rohit Agarwal on 30/01/22 6:08 PM
 * @copyright www.javamultiplex.com
 */
@Component
@Slf4j
public class RestTemplateErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        final HttpStatus.Series series = response.getStatusCode().series();
        return series == HttpStatus.Series.CLIENT_ERROR || series == HttpStatus.Series.SERVER_ERROR;
    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        final HttpStatus.Series series = response.getStatusCode().series();
        String message;
        if (series == HttpStatus.Series.CLIENT_ERROR) {
            message = "Client error occurred";
        } else {
            message = "Server error occurred";
        }
        throw new RuntimeException(message);
    }
}
