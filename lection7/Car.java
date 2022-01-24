package com.itea.dimka.lection7;

public class Car {
    private static int count;
    private int id;
    public String _maker;
    public double _price;
    public String _year;
    public String _color;

    public Car() {
        count++;
        id = count;
    }

    public Car(String maker, String color, double price, String year) {
        this();
        _maker = maker;
        _price = price;
        _year = year;
        _color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {

            this.id = id;
        }
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Auto " + id + " " + _maker + " " + _color + " " +
                _price + " " + _year + " ";
    }
}
