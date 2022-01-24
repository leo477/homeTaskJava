package com.itea.dimka.lection5;

public class UkrainianHen extends Hen{

    String c;
    public UkrainianHen(String country) {
        this.c = country;
    }


    @Override
    public int getCountOfEggsPerMonth() {
        return 20*31;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + c + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
