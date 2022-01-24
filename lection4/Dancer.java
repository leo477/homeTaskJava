package com.itea.dimka.lection4;

public class Dancer {
    private String name;
    private int age;

    public Dancer(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void dance(){
        System.out.println(toString() + "I'm dancing like others");
    }

    @Override
    public String toString(){
        return "I'm" + name + ", I'm" + age + " old. ";
    }
}
