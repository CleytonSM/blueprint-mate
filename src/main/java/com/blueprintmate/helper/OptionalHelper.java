package com.blueprintmate.helper;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

public class OptionalHelper {


    public static <T> T verifyOptionalEntity(Optional<T> optionalT) {
        if(optionalT.isEmpty()) {
            throw new EntityNotFoundException("This entity doesn't exist");
        }

        return optionalT.get();
    }
}
