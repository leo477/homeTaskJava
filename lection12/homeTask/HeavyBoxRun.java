package com.itea.dimka.lection12.homeTask;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;

public class HeavyBoxRun {
    public static void main(String[] args) {
        LinkedList<HeavyBox> heavyBoxes = new LinkedList<>();
        heavyBoxes.add(new HeavyBox(500, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(4, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(5, 2, 2, 2));

        for (HeavyBox heavyBoxe : heavyBoxes) {
            System.out.println(heavyBoxe);
        }

        HeavyBox h = (HeavyBox) heavyBoxes.get(0);
        h.setWeigt(1);
        heavyBoxes.set(0, h);
        System.out.println("****************************");
        for (HeavyBox heavyBoxe : heavyBoxes) {
            System.out.println(heavyBoxe);
        }
        heavyBoxes.removeLast();
        System.out.println("****************************");
        for (HeavyBox heavyBoxe : heavyBoxes) {
            System.out.println(heavyBoxe);
        }
        heavyBoxes.clear();
        System.out.println("****************************");
        for (HeavyBox heavyBoxe : heavyBoxes) {
            System.out.println(heavyBoxe);
        }


        heavyBoxes.add(new HeavyBox(500, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(46, 2, 2, 2));
        heavyBoxes.add(new HeavyBox(5, 2, 2, 2));
        System.out.println("********************ForEach");
        for (HeavyBox heavyBoxe : heavyBoxes) {
            System.out.println(heavyBoxe);
        }
        Iterator<HeavyBox> iterator = heavyBoxes.iterator();
        System.out.println("********************************Iterator");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("********************************For");
        for (int i = 0; i < heavyBoxes.size(); i++) {
            System.out.println(heavyBoxes.get(i));
        }
        System.out.println("********************************PrintLn");
        System.out.println(heavyBoxes);

        SortedSet<HeavyBox> sortedSet = new TreeSet<>();
        sortedSet.add(new HeavyBox(500, 2, 2, 2));
        sortedSet.add(new HeavyBox(46, 2, 2, 2));
        sortedSet.add(new HeavyBox(550, 2, 2, 2));
        System.out.println("TreeSet");
        for(HeavyBox heavyBox: sortedSet){
            System.out.println(heavyBox);
        }
    }
}
