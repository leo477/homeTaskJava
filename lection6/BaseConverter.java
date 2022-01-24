package com.itea.dimka.lection6;

public class BaseConverter implements TemoeratureConvert {

    @Override
    public void convert(double t1, int t2) {
        switch (t2){
            case 1:
                System.out.println("Result of Convertation From Celcius to Kelvin : " +
                        "" + (t1+tF));
                break;
            case 2:
                System.out.println("Result of Convertation From Celcius to Farengate : " +
                        "" + (t1+tK));
                break;
            default:
                System.out.println("Wrong input!");
                break;
        }
    }
}
