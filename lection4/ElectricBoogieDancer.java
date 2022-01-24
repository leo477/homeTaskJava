package com.itea.dimka.lection4;

public class ElectricBoogieDancer extends Dancer{
    public ElectricBoogieDancer (String name, int age){
        super(name,age);
    }

    @Override
    public void dance(){
        System.out.println(toString() + "I dance electric boogie!");
    }
}



