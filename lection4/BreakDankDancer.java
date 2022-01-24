package com.itea.dimka.lection4;

public class BreakDankDancer extends Dancer{
    public BreakDankDancer (String name, int age){
        super(name,age);
    }

    @Override
    public void dance(){
        System.out.println(toString() + "I dance BreakDank!");
    }
}
