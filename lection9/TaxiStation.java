package com.itea.dimka.lection9;

public enum TaxiStation {
    MERCEDES(10), TOYOTA(7), VOLVO;

    private int freeCabs;

    TaxiStation(int freeCabs) {
        this.freeCabs = freeCabs;
    }

    TaxiStation() {
    }

    public int getFreeCabs() {
        return freeCabs;
    }

    public void setFreeCabs(int freeCabs) {
        this.freeCabs = freeCabs;
    }


    @Override
    public String toString() {
        return String.format("%s : free cabs = %d", name(), freeCabs);
    }
}
