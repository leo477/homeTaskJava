package com.itea.dimka.lection5;

import java.util.Random;

public class TestBattle {
    Soldier s1 = new Soldier("Soldier");
    Soldier s2=new Soldier("Soldier");

    public TestBattle(){
        battle(s1,s2);
    }

    public void battle(Soldier s1, Soldier s2){
        Random gen=new Random();
        while(s1.isAlive() && s2.isAlive()){
            s1.hit(s2, gen.nextInt(100));
            if (s2.isAlive()){
                s2.hit(s1, gen.nextInt(100));
            }
        }

        if(!s1.isAlive()) {
            System.out.println("****** Battle end! " +
                    s2 + " WIN !");
        }else
            System.out.println("****** Battle end! " +
                    s1 + " WIN !");
    }

    public static void main(String[] args) {
        new TestBattle();
    }
}
