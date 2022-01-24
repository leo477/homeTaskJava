package com.itea.dimka.lection4;

public class ObjectFieldInitOrder {
    public static int initialize(String message) {
        System.out.println(message);
        return 0;
    }

    static class A {
        int i0=initialize("i0");
        int i1;
        {
            i1=initialize("i1");
        }
        int i2=initialize("i2");

        int i3;
        public A(){
            i3=initialize("i3");
        }
    }



    public static void main(String[] args) {
        System.out.println("start in main");
        new Test.B();
        //new B();//B b= new B();
    }
}
