package com.itea.dimka.lection17;

public class SimpleThread2 extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of SimpleThread");
    }
}
