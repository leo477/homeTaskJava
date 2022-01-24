package com.itea.dimka.lection12.homeTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PetRun {
    public static void main(String[] args) {
        HashMap<String, Pet> petHashMap = new HashMap<>();
        petHashMap.put("Cat", new Cat("Dorris",5));
        petHashMap.put("Parrot", new Parrot("Kesha",3));
        petHashMap.put("Dog", new Parrot("Kerry",3));

        Iterator ite = petHashMap.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry entry;
            entry= (Map.Entry) ite.next();
            System.out.println(entry.getKey());
        }
    }
}
