package com.itea.dimka.lection3;

public class Task4 {
    public static void main(String[] args) {
        String str="test string";
        String finalString="";
        System.out.println("Target String = " + str);
        int n=0;
        char[] arr= str.toCharArray();
        for (int i=0; i< arr.length; i++) {
            if (arr[i]==' ') {
                finalString += arr[i];
                n++;
            } else
            if ((i-n) % 2 == 0)
                finalString += arr[i];
        }
        System.out.println("FinalString = " + finalString);
    }
}
