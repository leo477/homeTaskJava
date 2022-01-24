package com.itea.dimka.lection1;

/**
 * Class for ascending sort of Subsequence
 * int a - 1-st variable
 * int b - 2-nd variable
 * int c - 3-rd variable
 * int d - additional variable for swapping subsequence items
 */

public class Subsequence {
    public static void main(String[] args) {
        int a=5;
        int b=4;
        int c=2;
        int d;
        System.out.println("Initial subsequence : " + a + " " + b + " " + c);
        if (a>b){
            d=a; a=b; b=d;
        }
        if (a>c){
            d=a; a=c; c=d;
        }

        if (b>c){
            d=b; b=c; c=d;
        }
        System.out.println("Ordered subsequence ascending : " + a + " " + b + " " + c);
    }

}
