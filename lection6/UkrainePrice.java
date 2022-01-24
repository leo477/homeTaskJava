package com.itea.dimka.lection6;

public class UkrainePrice extends CarTransporationCosts{
    String country;
    @Override
    public double countLocaleCost() {
        double uaLocaleCosts=14000.00;
        return super.countPrimeCost()+
                super.countTransoprationCosts("Ukraine")+
                uaLocaleCosts;

    }
}
