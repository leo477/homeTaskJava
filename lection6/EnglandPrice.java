package com.itea.dimka.lection6;

public class EnglandPrice extends CarTransporationCosts{
    @Override
    public double countLocaleCost() {
        double enLocaleCosts=15000.00;
        return super.countPrimeCost()+
                super.countTransoprationCosts("England")+
                enLocaleCosts;

    }
}
