package com.itea.dimka.lection7;

public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1._maker="Audi";
        car1._price=10000;
        car1._year="2000";
        car1._color="red";

        Car car2 = new Car("BMW", "black", 12000, "2001");
        Car car3 = new Car("Lada", "black", 12000, "2001");
        Car car4 = new Car("Giga", "black", 12000, "2001");
        System.out.println(car1);
        System.out.println(car2);
        int count  = Car.getCount();
        System.out.println(count);

        Car car[] = new Car[5];
        car[0]=car1;
        car[1]=car2;
        car[2]=car3;
        car[3]=car4;

        for ( int i =0; i< Car.getCount(); i++){
            System.out.println(car[i]);
        }
    }
}
