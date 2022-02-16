package com.itea.dimka.lection17;

public class JoinRunner {
    static{
        System.out.println("Begining thread main");
    }

    public static void main(String[] args) {
        JoinThread t1= new JoinThread("First");
        JoinThread t2= new JoinThread("Second");
        t1.start();
        t2.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
