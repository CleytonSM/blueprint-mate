package com.blueprintmate.exception.handler;

import com.blueprintmate.exception.EntityAlreadyExistsException;
import com.blueprintmate.exception.WrongCredentialsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({EntityAlreadyExistsException.class})
    public ResponseEntity<EntityAlreadyExistsException> entityAlreadyExists(EntityAlreadyExistsException e) {
        return new ResponseEntity<>(e, e.getHttpStatus());
    }

    @ExceptionHandler({WrongCredentialsException.class})
    public ResponseEntity<WrongCredentialsException> wrongCredentials(WrongCredentialsException e) {
        return new ResponseEntity<>(e, e.getHttpStatus());
    }
}
