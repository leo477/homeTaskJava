package com.itea.dimka.lection17.hometask;


public class CargoType extends Entrance{
    private final String name;

    public CargoType(String name) {
        this.name = name;
    }


    public boolean loadCargo(int loadCapacity) {
        if(name.equals("Metal")) {
            if ((getMetalStorage() + loadCapacity) <= (MAX_STORAGE_PLANT - getProductStorage())) {
                setMetalStorage(getMetalStorage() + loadCapacity);
                return true;
            } else {
                return false;
            }
        }else{
            if ((getProductStorage() + loadCapacity) <= (MAX_STORAGE_PLANT - getProductStorage())) {
                setProductStorage(getProductStorage() + loadCapacity);
                return true;
            } else {
                return false;
            }
        }
    }

    public int uploadCargo(int loadCapacity) {
        if(name.equals("Metal")) {
            if ((getMetalStorage() - loadCapacity) >= 0 && loadCapacity > 0) {
                setMetalStorage(getMetalStorage() - loadCapacity);
                return loadCapacity;
            } else {
                return 0;
            }
        } else{
            if ((getProductStorage() - loadCapacity) >= 0 && loadCapacity > 0) {
                setProductStorage(getProductStorage() - loadCapacity);
                return loadCapacity;
            } else {
                return 0;
            }
        }
    }
}
