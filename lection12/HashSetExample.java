package com.itea.dimka.lection12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(10,(float)0.8);
        set.add("One");
        set.add("Two");

        set.add("One");
        set.add("Two");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
