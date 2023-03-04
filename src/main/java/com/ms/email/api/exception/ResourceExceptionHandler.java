package com.ms.email.api.exception;

import com.ms.email.domain.services.exception.EmailErrorException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(EmailErrorException.class)
        public ResponseEntity<StandardError> emailErrorException(EmailErrorException e){
            StandardError error = new StandardError(e.getMessage());
            return ResponseEntity.ok().body(error);
    }
}
