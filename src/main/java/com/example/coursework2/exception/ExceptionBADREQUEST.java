package com.example.coursework2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ExceptionBADREQUEST extends RuntimeException {
    public ExceptionBADREQUEST(String message) {
        super(message);
    }

    public ExceptionBADREQUEST(String message, Throwable cause) {
        super(message, cause);
    }
}
