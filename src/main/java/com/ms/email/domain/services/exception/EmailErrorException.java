package com.ms.email.domain.services.exception;

public class EmailErrorException extends RuntimeException{

    public EmailErrorException(String msg){
        super(msg);
    }
}
