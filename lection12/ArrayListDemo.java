package com.itea.dimka.lection12;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(123);
        list.add(245);
        list.add(Integer.valueOf(345));
        list.add(null);
        System.out.println("Size: " + list.size());
        Integer i = list.get(1);
        System.out.println("Element index 1 = " + i);
        Integer newInt=1000;
        Integer old = list.set(1, newInt);
        System.out.println("Old value: " + old);
        System.out.println("New value: " + list.get(1));
    }
}
