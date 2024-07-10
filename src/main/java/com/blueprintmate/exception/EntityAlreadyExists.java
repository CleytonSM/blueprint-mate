package com.blueprintmate.exception;

import org.springframework.http.HttpStatus;

public class EntityAlreadyExists extends RuntimeException {

    private final String entityAlreadyExists;
    private final HttpStatus httpStatus;

    public EntityAlreadyExists(String entityAlreadyExists, HttpStatus httpStatus) {
        this.entityAlreadyExists = entityAlreadyExists;
        this.httpStatus = httpStatus;
    }

    public String getEntityAlreadyExists() {
        return entityAlreadyExists;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
