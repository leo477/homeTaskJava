package com.itea.dimka.lection8;

public class RunnerSwim {
    public static void main(String[] args) {
        Ship.LifeBoat.down();
        Ship.LifeBoat lifeBoat = new Ship.LifeBoat();
        lifeBoat.swim();
    }
}
