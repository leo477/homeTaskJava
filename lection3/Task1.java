package com.itea.dimka.lection3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your String : ");
        String str1 = in.next();
        StringBuffer stringBuffer=new StringBuffer(str1);
        if(str1.equals(stringBuffer.reverse().toString()))
            System.out.println("String : " + str1 + "\nIs palindrome");
        else
            System.out.println("String : " + str1 + "\nIsn't palindrome");

    }
}
