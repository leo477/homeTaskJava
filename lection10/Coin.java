package com.itea.dimka.lection10;

public class Coin {
    private double diametr;
    private double weight;

    public double getDiameter() {
        return diametr;
    }

    public void setDiameter(double value) throws CoinLogicException {
        if (value<=0) {
            throw new CoinLogicException("diameter is incorrect");
        }
        diametr=value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
