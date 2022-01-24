package com.itea.dimka.lection5;

public class App1 {
    private Room2 r2;

    App1(){
        r2=new Room2(5.1,5.2,5.2);
        System.out.println("Room V = " + r2.calculateCapacity());
        System.out.println(r2);
        System.out.println(r2.toString());
    }

    public static void main(String[] args) {
        new App1();
    }
}
