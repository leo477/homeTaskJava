package com.itea.dimka.lection12.homeTask;

import java.util.Set;
import java.util.TreeSet;

public class UnionIntersectRun {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        UnionIntersect unionIntersect = new UnionIntersect();
        unionIntersect.setSet1(set1);
        unionIntersect.setSet2(set2);
        System.out.println(unionIntersect.union());
        System.out.println(unionIntersect.intersect());
    }
}
