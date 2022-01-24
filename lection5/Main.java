package com.itea.dimka.lection5;

public class Main {
    public static void main(String[] args) {
        //System.out.println(sqrt(Math.pow(2,5)+pow(3,6)));
        Soldier sg= new General("General");
        sg.getHealth();
        General general = (General) sg;
        general.getSlogan();
        System.out.println(sg.getClass());
        System.out.println(general.getClass());
    }
}
