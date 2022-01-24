package com.itea.dimka.lection6;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.print("Input a : ");
        Scanner in = new Scanner(System.in);
        calculator.setA(in.nextDouble());

        System.out.print("Input operation (+,-,*,/) : ");
        calculator.setOperation(in.next());

        System.out.print("Input b : ");
        calculator.setB(in.nextDouble());

        calculator.result();
    }
}
