package com.itea.dimka.lection5;

public class BelarusianHen extends Hen{
    String c;

    public BelarusianHen(String country) {
        this.c = country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 10*10;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + c + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
