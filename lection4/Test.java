package com.itea.dimka.lection4;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before class loading");
        Class.forName(StaicInitializationTime.C.class.getName());
        System.out.println("After class loading");
        StaicInitializationTime staticInitializationTime = new StaicInitializationTime();
        staticInitializationTime.testField=1;

    }

    static  class B extends ObjectFieldInitOrder.A {
        int i4=ObjectFieldInitOrder.initialize("i4");
        int i5;
        {
            i5=ObjectFieldInitOrder.initialize("i5");
        }

        int i6;
        public B(){
            i6=ObjectFieldInitOrder.initialize("i6");
        }
    }
}
