package com.todoapp.todoapp.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Excep extends RuntimeException{

    public Excep(String message) {
        super(message);
    }
}
