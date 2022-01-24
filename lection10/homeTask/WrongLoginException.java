package com.itea.dimka.lection10.homeTask;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
