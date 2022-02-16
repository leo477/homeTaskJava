package com.itea.dimka.lection17;

public class YielRunner {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run(){
                System.out.println("Start thread 1");
                Thread.yield();
                System.out.println("ending 1");
            }
        }.start();
        new Thread(() ->{
                System.out.println("Start thread 2");
                System.out.println("ending 2");
        }).start();
    }
}
