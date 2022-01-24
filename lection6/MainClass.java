package com.itea.dimka.lection6;

public class MainClass {
    UkrainePrice ukrainePrice = null;
    EnglandPrice englandPrice = null;

    MainClass() {
        ukrainePrice = new UkrainePrice();
        englandPrice = new EnglandPrice();
        System.out.println("Цена автомобиля в Украине составляет : " + ukrainePrice.countLocaleCost());
        System.out.println("Цена автомобиля в Англии составляет : " + englandPrice.countLocaleCost());

    }

    public static void main(String[] args) {
        new MainClass();
    }
}
