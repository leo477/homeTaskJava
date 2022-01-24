package com.itea.dimka.lection8;

public class Ship {
/*    private Engine eng;

    public class Engine{
        public void launch(){
            System.out.println("Engine Start");
        }
    }

    public final void init(){
        eng= new Engine();
        eng.launch();
    }*/

    private int id;
    public static class LifeBoat {
        private int boatId;
        public static void down(){
            System.out.println("шлюпки на воду!");
        }
        public void swim(){
            System.out.println("отплытие шлюпки");
        }
    }
}
