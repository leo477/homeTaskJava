package com.itea.dimka.lection4;

public class TestArgs {
    static double k[] = {5.1, 5.2, 5.3, 5.4, 5.5};

    public static double sum(double... nums) {
        double sum = 0;
        System.out.println("# of arguments " + nums.length);
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    static public void main(String[] args) {
        System.out.println("Sum = " + sum(k));
        System.out.println("Sum = " + sum(33.4, 2.0));
    }
}
