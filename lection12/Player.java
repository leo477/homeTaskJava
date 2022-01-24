package com.itea.dimka.lection12;

public class Player implements Comparable<Player>{
    private String name;
    private int goldMedal;
    private int silverMedal;
    private int bronzeMedal;

    public Player(String name, int goldMedal, int silverMedal, int bronzeMedal) {
        this.name = name;
        this.goldMedal = goldMedal;
        this.silverMedal = silverMedal;
        this.bronzeMedal = bronzeMedal;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", goldMedal=" + goldMedal +
                ", silverMedal=" + silverMedal +
                ", bronzeMedal=" + bronzeMedal +
                '}';
    }

    @Override
    public int compareTo(Player other) {
        int value = this.goldMedal-other.goldMedal;
        if (value!=0){
            return -value;
        }

        value=this.silverMedal-other.silverMedal;
        if(value!=0){
            return -value;
        }

        value=this.bronzeMedal- other.bronzeMedal;
        return -value;
    }
}
