package com.blueprintmate.exception;

public class InvalidJwtTokenException extends RuntimeException{

    public InvalidJwtTokenException(String message) {
        super(message);
    }
}
