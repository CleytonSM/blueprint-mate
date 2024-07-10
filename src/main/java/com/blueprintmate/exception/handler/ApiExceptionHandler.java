package com.blueprintmate.exception.handler;

import com.blueprintmate.exception.EntityAlreadyExists;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({EntityAlreadyExists.class})
    public ResponseEntity<String> entityAlreadyExists (EntityAlreadyExists e) {
        return new ResponseEntity<>(e.getEntityAlreadyExists(), e.getHttpStatus());
    }
}
