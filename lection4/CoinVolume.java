package com.itea.dimka.lection4;

public class CoinVolume extends Point {
    public static void main(String[] args) {
        double width = 10;
        double height = 15;
        double depth = 20;
        Safe mySafe1 = new Safe();
        Safe mySafe2 = new Safe();
        mySafe1.setSafeValue(width,height,depth);
        mySafe2.setSafeValue(10.0,15.0,15.5);
        System.out.println("Об'єм 1-го сейфа=" + mySafe1.getSafeVolume());
        System.out.println("Об'єм 2-го сейфа=" + mySafe2.getSafeVolume());
        Point point = new Point();

    }
}
