package com.company;

public class DogIsNotReadyException extends Exception {
    public DogIsNotReadyException(String reason){
        super(reason);
    }
}
