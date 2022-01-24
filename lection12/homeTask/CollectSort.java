package com.itea.dimka.lection12.homeTask;

import java.util.*;

public class CollectSort {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        ArrayList<HeavyBox> heavyBoxes1 = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(50, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(400, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(5500, 2, 2, 2));

        int i=0;
        for (HeavyBox heavyBox : heavyBoxes) {
            if (heavyBox.getWeigt() > 300) {
                heavyBoxes1.add(heavyBox);
                //heavyBox
            }
            i++;
        }

        System.out.println("Second Collection");
        for (HeavyBox heavyBox : heavyBoxes1) {
            System.out.println(heavyBox);
            heavyBoxes.remove(heavyBox);
        }

        System.out.println("First Collection");
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }
//        ite = heavyBoxes.iterator();
//        while (ite.hasNext()){
//            System.out.println(ite.next());
//        }
    }
}
