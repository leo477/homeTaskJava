package com.itea.dimka.lection17;

public class SimpleThread extends Thread{
    @Override
    public void run() {
        try{
            if(isDaemon()){
                System.out.println("Start daemon-thread");
                Thread.sleep(10_000);
            }else{
                System.out.println("Start simple tread");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if(!isDaemon()){
                System.out.println("ending simple thread");
            } else {
                System.out.println("ending daemon-thread");
            }
        }
    }
}
