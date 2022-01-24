package com.itea.dimka.lection4;

public class StaicInitializationTime {
    public int testField;
    public static class C {
        static int i ;
        static {
            System.out.println("C.i initialized");
            i= 1;
        }
    }

}
