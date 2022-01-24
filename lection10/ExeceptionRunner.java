package com.itea.dimka.lection10;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ExeceptionRunner {

    public static void main(String[] args) {
        ExeceptionRunner execeptionRunner = new ExeceptionRunner();
        String number = "333";
        double result = 0;// = execeptionRunner.parseFromFrance(number));
        try {
            result = execeptionRunner.parseFromFrance(number);
        } catch (ParseException e) {
            System.out.println(e);
        }
        System.out.println(result);
    }

    public double parseFromFrance(String numberStr) throws ParseException {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);

        double numFR = numberFormat.parse(numberStr).doubleValue();
        return numFR;

    }

}
