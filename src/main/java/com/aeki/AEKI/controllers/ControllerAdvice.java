package com.aeki.AEKI.controllers;

import com.aeki.AEKI.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ControllerAdvice {
    private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ValidationError> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(new ValidationError(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
