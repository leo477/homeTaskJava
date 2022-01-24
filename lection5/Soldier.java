package com.itea.dimka.lection5;

import java.util.Random;

public class Soldier {
    protected String rank;
    protected int health;
    protected boolean alive=false;
    protected int defense=0;
    protected static int count = 8;
    private int id=0;

    public Soldier(String rank){
        this.rank=rank;
        id=++count;
        health=100;
        alive=true;
        Random randomGen=new Random();
        defense=randomGen.nextInt(50);
        System.out.println(rank + " #" + id + " is created: " +
                "health=" + health+ " defence=" + defense);
    }

    public boolean isAlive() {
        return alive;
    }

    public int getHealth() {
        return health;
    }

    private void receiveHit(int hit){
        if(isAlive()==true){
            int damage = hit-defense;
            if (damage>0){
                health=health-damage;
            }else{
                return;
            }
            if(health<=0){
                alive=false;
                System.out.println("[X] " + rank + "" +
                        " #" + id + " take damage " + damage +
                        " and die as hero");
            }else {
                System.out.println(rank + " #" + id + "" +
                        " take damage " + damage +
                        ". Helth = " + health);
            }
        }
    }

    public void hit(Soldier targetSoldier, int hit){
        targetSoldier.receiveHit(hit);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return rank+" #" + id + ": health = " +
                health+ " ,defense = " + defense;
    }
}
