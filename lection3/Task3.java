package com.itea.dimka.lection3;

public class Task3 {
    public static void main(String[] args) {
        String str1=new String("This is exercise 1").intern();
        String str2=new String("This is Exercise 1").intern();
        System.out.println("String 1 : " + str1 + "\n" + "String 2 : "  + str2);
        if(str1.equalsIgnoreCase(str2))
            System.out.println("Strings are equal!");
        else
            System.out.println("Strings aren't equal!");
    }
}
