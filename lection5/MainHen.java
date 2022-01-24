package com.itea.dimka.lection5;

public class MainHen {
    public static void main(String[] args) {
        HenFactory henFactory= new HenFactory();
        System.out.println(henFactory.getHen("Ukraine"));
        System.out.println(henFactory.getHen("Belarus"));
        System.out.println(henFactory.getHen("Polish"));
        System.out.println(henFactory.getHen("Moldova"));
    }
}
