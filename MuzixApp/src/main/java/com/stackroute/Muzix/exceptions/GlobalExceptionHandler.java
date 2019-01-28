package com.stackroute.Muzix.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler
{
    @ResponseStatus(value = HttpStatus.CONFLICT,reason = "User already exists")
    @ExceptionHandler(TrackAlreadyExistsException.class)
    public void handletrackAlreadyExistsException(TrackAlreadyExistsException e){



    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Track does not exists")
    @ExceptionHandler(TrackNotFoundException.class)
    public void handletrackNotFoundException(TrackNotFoundException e)
    {

    }

}
