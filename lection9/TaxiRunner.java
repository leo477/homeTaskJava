package com.itea.dimka.lection9;

import java.util.Locale;

public class TaxiRunner {
    public static void main(String[] args) {
        TaxiStation ts = TaxiStation.valueOf(
                TaxiStation.class, "Volvo".toUpperCase());
        System.out.println(ts + " : ordinal -> " + ts.ordinal());
        ts.setFreeCabs(3);

        TaxiStation[] stations = TaxiStation.values();

        for (TaxiStation element : stations){
            System.out.println(element);
        }
    }
}
