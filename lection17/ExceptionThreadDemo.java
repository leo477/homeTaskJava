package com.itea.dimka.lection17;

public class ExceptionThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1_000);
        System.out.println("end of main");
    }
}
