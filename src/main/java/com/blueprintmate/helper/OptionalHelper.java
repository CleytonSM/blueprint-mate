package com.blueprintmate.helper;

import com.blueprintmate.exception.EntityAlreadyExistsException;
import jakarta.persistence.EntityNotFoundException;

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
            throw new EntityAlreadyExistsException("This entity already exists");
        }
    }
}