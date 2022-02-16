package com.itea.dimka.lection17;

public class ExceptThread extends Thread{
    @Override
    public void run(){
        boolean flag=true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
