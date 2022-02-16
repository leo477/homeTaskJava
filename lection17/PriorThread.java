package com.itea.dimka.lection17;

public class PriorThread extends Thread{
    public PriorThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for(int i=0; i<71;i++){
            System.out.println(getName()+" "+ i);
            try{
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
