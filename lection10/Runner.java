package com.itea.dimka.lection10;

public class Runner {
    public static void main(String[] args) {
        SameResource f =new SameResource();
        try{
            Connector.loadResource(f);
        }catch(IllegalArgumentException e){
            System.err.println("обработка unchecked-выключение вне кода:: " + e);
        }
    }
}
