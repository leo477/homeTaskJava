package com.itea.dimka.lection5;

public class MoldovanHen extends Hen{
    String c;

    public MoldovanHen(String country) {
        this.c = country;
    }

    @Override
    public int getCountOfEggsPerMonth() {
        return 15*15;
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + c + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
