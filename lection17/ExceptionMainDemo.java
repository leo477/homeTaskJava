package com.itea.dimka.lection17;

public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread2().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
