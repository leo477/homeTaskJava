package com.itea.dimka.lection12.homeTask;

import java.util.*;

public class SortBootsRun {
    public static void main(String[] args) {
        SortedSet<SortBoots> boots = new TreeSet<>();
        boots.add(new SortBoots("bread", 4, 4));
        boots.add(new SortBoots("fish", 4, 1));
        boots.add(new SortBoots("milk", 2, 44));
        boots.add(new SortBoots("soup", 4, 14));
        boots.add(new SortBoots("bear", 4, 4));
        boots.add(new SortBoots("bear", 4, 3));
        System.out.println("ASC : ");
        List<SortBoots> list = new ArrayList<>();
        list.addAll(boots);
        ListIterator<SortBoots> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("DESC : ");

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        //*****
    }
}
