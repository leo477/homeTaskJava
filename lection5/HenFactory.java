package com.itea.dimka.lection5;

public class HenFactory{
    String country;

    public String getHen(String country){
        if(country.compareToIgnoreCase("Ukraine")==0){
            return new UkrainianHen(country).getDescription();
        }
        if(country.compareToIgnoreCase("Belarus")==0){
            return new BelarusianHen(country).getDescription();
        }
        if(country.compareToIgnoreCase("Moldova")==0){
            return new MoldovanHen(country).getDescription();
        }
        if(country.compareToIgnoreCase("Polish")==0){
            return new PolishHen(country).getDescription();
        }
        return "Not Found!";
    }

}
