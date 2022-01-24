package com.itea.dimka.lection3;

public class Task2 {
    public static void main(String[] args) {
        String str1= new String("PHP Exercises and").intern();
        String str2=new String("Python Exercises").intern();
        System.out.println("Final String: " + String.join(" ",str1,str2));
    }
}
