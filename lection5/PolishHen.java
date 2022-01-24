package com.itea.dimka.lection5;

public class PolishHen extends Hen{
    String c;

    public PolishHen(String country) {
        this.c = country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 15*31;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + c + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
