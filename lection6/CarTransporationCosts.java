package com.itea.dimka.lection6;

public abstract class CarTransporationCosts extends CarCost {

    @Override
    public double countTransoprationCosts(String country) {
        if(country.compareToIgnoreCase("Ukraine")==0){
            return 3.000;
        }
        if (country.compareToIgnoreCase("England")==0){
            return 2.000;
        }
        return -1.0;
    }
}
