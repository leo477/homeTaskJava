package com.itea.dimka.lection5;

public class Room2 extends  Room{
    public Room2(double width, double heigth, double length){
        super(width, heigth, length);
    }

    @Override
    public double calculateCapacity(){
        return super.calculateCapacity()*1000;
    }

    public double calculateSquare(){
        return super.getWidth()*super.getHeight();
    }

    @Override
    public String toString(){
        return "Room V = " + calculateCapacity() +
                "\n" + "Square = " + calculateSquare();
    }
}
