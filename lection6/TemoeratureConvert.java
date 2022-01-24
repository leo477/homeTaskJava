package com.itea.dimka.lection6;

public interface TemoeratureConvert<T> {

    public double tF = 273.15;
    public double tK = 32.0;

    public void convert(double t1, int t2);


}
