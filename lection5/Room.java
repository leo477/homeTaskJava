package com.itea.dimka.lection5;

public class Room {
    private double width = 0.0;
    private double length = 0.0;
    private double height = 0;

    public Room(double width, double length, double height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double calculateCapacity(){
        return  width*length*height;
    }

    public static void main(String[] args) {
        Room room= new Room(6,4,2.7);
       System.out.println("Room V = " + room.calculateCapacity());

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
