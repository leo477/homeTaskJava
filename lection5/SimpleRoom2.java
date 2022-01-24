package com.itea.dimka.lection5;

public class SimpleRoom2 extends SimpleRoom {
    protected double height;

    public SimpleRoom2(double w, double l, double h) {
        super(w, l);
        height = h;
        System.out.println("SimpleRoom2 Created");
    }


    public void info2() {
        System.out.println("Room width = " + super.width +
                " length = " + super.length +
                " height = " + this.height);
        System.out.println("Room square = " + width * length);
        System.out.println("Room V = " + width * length * height);
    }

    public static void main(String[] args) {
        SimpleRoom2 simpleRoom2 = new SimpleRoom2(5, 5, 3);
        System.out.println("Method info SimpleRoom");
        simpleRoom2.info();
        System.out.println();
        System.out.println("Method info SimpleRoom2");
        simpleRoom2.info2();
    }
}
