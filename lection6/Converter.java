package com.itea.dimka.lection6;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For Convert from Celcius to Kelvin push 1 :\n" +
                "For Convert from Celcius to Farengate push 2 : ");
        int a = in.nextInt();

        System.out.print("Input Temoerature: ");
        BaseConverter baseConverter= new BaseConverter();
        baseConverter.convert(in.nextDouble(),a);
    }
}
