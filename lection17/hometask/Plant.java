package com.itea.dimka.lection17.hometask;

import java.util.ArrayList;

public class Plant {
    public final static int MAX_STORAGE_PLANT = 700;
    private static int metalStorage;
    private static int productStorage;
    private static ArrayList<Entrance> entrances;
    private static ArrayList<Train> trains;

    public Plant(int metalStorage, int productStorage, ArrayList<Entrance> entrances, ArrayList<Train> trains) {
        this.metalStorage = metalStorage;
        this.productStorage = productStorage;
        this.entrances = entrances;
        this.trains = trains;
    }

    public Plant() {
    }

    public static int getMetalStorage() {
        return metalStorage;
    }

    public static void setMetalStorage(int metalStorage) {
        Plant.metalStorage = metalStorage;
    }

    public static int getProductStorage() {
        return productStorage;
    }

    public static void setProductStorage(int productStorage) {
        Plant.productStorage = productStorage;
    }

    public void startProcess() throws InterruptedException {
        boolean flag;
        int num;
        for (int i = 0; i < trains.size(); i++) {
            num = 0;
            flag = false;
            for (int j = 0; j < entrances.size(); j++) {

                if (!entrances.get(j).isBusy()) {
                    num = j;
                    entrances.get(j).setBusy(true);
                    flag = true;
                    break;
                }
            }
            //System.out.println("nim = " + num);
            if (flag) {
                trains.get(i).setEntranceId(num + 1);
                trains.get(i).setEntrance(entrances.get(num));
                trains.get(i).start();
            } else {
                //System.out.println("---" + num);
                trains.get(i - (entrances.size() - 1)).join();
                trains.get(i).setEntranceId(num + 1);
                trains.get(i).setEntrance(entrances.get(num));
                trains.get(i).start();
            }
        }

    }


    public String loadCargo(int loadCapacity, String cargo) {
        CargoType cargoType = new CargoType(cargo);
        boolean f = cargoType.loadCargo(loadCapacity);
        return f == true ? "Metal Upload Success! Load " + loadCapacity + "T - > " + cargo : "Error";
    }


    public int uploadCargo(int loadCapacity, String cargo) {
//        if ((metalStorage - loadCapacity) >= 0 && loadCapacity > 0) {
//            metalStorage -= loadCapacity;
//            return loadCapacity;
//        } else {
//            return 0;
//        }
        CargoType cargoType = new CargoType(cargo);
        return cargoType.uploadCargo(loadCapacity);
    }


    @Override
    public String toString() {
        return "Metal Storage = " + metalStorage + " < - > Product Storage = " + productStorage;
    }
}
