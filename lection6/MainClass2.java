package com.itea.dimka.lection6;

import java.util.Scanner;

public class MainClass2 {
    Scanner in;
    CarCost cc;

    public MainClass2(){
        in=new Scanner(System.in);
        System.out.println("Input Country : ");
        String str= in.nextLine();
        if(str.equalsIgnoreCase("Ukraine") || str.equalsIgnoreCase(" Украина")) {
            cc=new UkrainePrice();
        } else if (str.equalsIgnoreCase("England") || str.equalsIgnoreCase("Англия")) {
            cc=new EnglandPrice();
        }else {
            System.out.println("Info about Countery isn't found!");
            return;
        }
        System.out.println("Car Price (" + str +"): " + cc.countLocaleCost());
    }

    public static void main(String[] args) {
        MainClass2 mainClass2= new MainClass2();
    }
}
