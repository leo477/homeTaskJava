package com.itea.dimka.lection17.hometask;

import java.util.ArrayList;

public class PlantRunner {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Entrance> entrances = new ArrayList<>();
        ArrayList<Train> trains = new ArrayList<>();
        entrances.add(new Entrance());
        entrances.add(new Entrance());
        entrances.add(new Entrance());

        trains.add(new Train(50, 1,50));
        trains.add(new Train(45, 2,50));
        trains.add(new Train(20, 3,50));
        trains.add(new Train(10, 4,50));
        trains.add(new Train(2, 5,50));

        trains.add(new Train(50, 6,1,50));
        trains.add(new Train(50, 7,1,50));
        trains.add(new Train(50, 8,1,50));
        trains.add(new Train(50, 9,1,50));
        trains.add(new Train(50, 10,1,100));

        trains.add(new Train(10, 11,2,50));
        trains.add(new Train(10, 12,2,50));
        trains.add(new Train(10, 13,2,50));
        trains.add(new Train(10, 14,2,50));
        trains.add(new Train(10, 15,2,50));

        trains.add(new Train(50, 16,3,50));
        trains.add(new Train(45, 17,3,50));
        trains.add(new Train(20, 18,3,50));
        trains.add(new Train(10, 19,3,50));
        trains.add(new Train(2, 20,3,50));

        new Plant(100, 100, entrances, trains).startProcess();
    }
}
