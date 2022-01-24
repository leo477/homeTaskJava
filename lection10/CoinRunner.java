package com.itea.dimka.lection10;

public class CoinRunner {
    public void doAction(String value) throws CoinLogicException {
        Coin ob = new Coin();
        try{
            double d= Double.parseDouble(value);
            ob.setDiameter(d);
        } catch (CoinException e){
            throw e;
        }
    }

}
