package com.stackroute.Muzix.exceptions;

public class TrackAlreadyExistsException extends Exception {
    private String message;

    public TrackAlreadyExistsException(){
        this.message= message;
    }

    public TrackAlreadyExistsException(String message)
    {
        super(message);
        this.message=message;
    }
}
