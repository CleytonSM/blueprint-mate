package com.blueprintmate.helper;

import com.blueprintmate.exception.EntityAlreadyExists;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;

import java.util.Optional;

public class OptionalHelper {


    public static <T> T getOptionalEntity(Optional<T> optionalT) {
        if(optionalT.isEmpty()) {
            throw new EntityNotFoundException("This entity doesn't exist");
        }

        return optionalT.get();
    }

    public static <T> void verifyIfEntityAlreadyExists(final Optional<T> optionalT) {
        if(optionalT.isPresent()) {
            throw new EntityAlreadyExists("This entity already exists", HttpStatus.CONFLICT);
        }
    }
}