package com.ms.email.services.exception;

public class EmailErrorException extends RuntimeException{

    public EmailErrorException(String msg){
        super(msg);
    }
}
