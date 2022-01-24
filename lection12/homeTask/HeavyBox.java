package com.itea.dimka.lection12.homeTask;

import java.util.LinkedList;

public class HeavyBox implements Comparable<HeavyBox>{
private int weigt;
private int height;
private int width;
private  int lenght;

    public HeavyBox(int weigt, int height, int width, int lenght) {
        this.weigt = weigt;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    public int getWeigt() {
        return weigt;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weigt=" + weigt +
                ", height=" + height +
                ", width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    @Override
    public int compareTo(HeavyBox o) {
        int value=this.weigt-o.weigt;
        if (value!=0){
            return value;
        }

        value=this.height-o.height;
        if (value!=0){
            return value;
        }

        value= this.lenght-o.lenght;

        if (value!=0){
            return value;
        }

        value=this.width-o.width;
        return value;

    }
}
