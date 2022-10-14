package com.ecodation.todoapp.core.exception;

import org.modelmapper.internal.asm.commons.SerialVersionUIDAdder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serializable;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException implements Serializable {
    private static final Long SerialVersionUIDAdder=1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
