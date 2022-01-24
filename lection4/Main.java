package com.itea.dimka.lection4;

public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Anton", 18);
        Dancer breakDankDancer =  new BreakDankDancer("Alex", 19);
        Dancer electricBoogieDancer = new ElectricBoogieDancer("Igor",20);
        Dancer[] discothegue = {dancer, breakDankDancer,electricBoogieDancer};

        for (Dancer d: discothegue){
            d.dance();
        }
    }
}
