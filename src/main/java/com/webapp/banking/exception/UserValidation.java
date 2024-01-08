package com.webapp.banking.exception;

public class UserValidation extends RuntimeException{

    public UserValidation(String message) {
        super(message);
    }
}
