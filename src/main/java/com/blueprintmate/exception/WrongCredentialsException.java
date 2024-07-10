package com.blueprintmate.exception;

import org.springframework.http.HttpStatus;

public class WrongCredentialsException extends RuntimeException {

    private final String message;
    private final HttpStatus httpStatus;

    public WrongCredentialsException (String message, HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
