package com.blueprintmate.exception;

import org.springframework.http.HttpStatus;

public class EntityAlreadyExistsException extends RuntimeException {

    private final String message;
    private final HttpStatus httpStatus;

    public EntityAlreadyExistsException(String message, HttpStatus httpStatus) {
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
