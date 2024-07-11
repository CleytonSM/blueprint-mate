package com.blueprintmate.exception.handler;

import com.blueprintmate.exception.EntityAlreadyExistsException;
import com.blueprintmate.exception.WrongCredentialsException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler({EntityAlreadyExistsException.class})
    public ResponseEntity<Map<String, String>> entityAlreadyExists(EntityAlreadyExistsException e) {
        return new ResponseEntity<>(responseBuilder(e), HttpStatus.CONFLICT);
    }

    @ExceptionHandler({WrongCredentialsException.class})
    public ResponseEntity<Map<String, String>> wrongCredentials(WrongCredentialsException e) {
        return new ResponseEntity<>(responseBuilder(e), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<Map<String, String>> entityNotFound(EntityNotFoundException e) {
        return new ResponseEntity<>(responseBuilder(e), HttpStatus.NOT_FOUND);
    }

    private Map<String, String> responseBuilder(RuntimeException e) {
        Map<String, String> response = new HashMap<>();
        response.put("message", e.getMessage());

        return response;
    }
}
