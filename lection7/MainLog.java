package com.itea.dimka.lection7;

import java.util.Scanner;

public class MainLog {
    public static void main(String[] args) {
        login();
    }

    private static void login(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input LogIn : ");
        String log = in.next();
        System.out.print("Input Pass : ");
        String pass = in.next();

        String res="";
        SystemLogin systemLogin= new SystemLogin();
        if (!log.equals(systemLogin.getLog1()))
            res="Missing Login!";

        if (!pass.equals(systemLogin.getPass1()))
            res+="Missing Pass! ";

        if (res!=""){
            System.out.println(res);
        }else{
            System.out.println("Login " + systemLogin.getLog1() +
                    " and Pass " + systemLogin.getPass1() + " are equal!");
        }

    }
}
