package com.itea.dimka.lection12.homeTask;

import java.util.Set;
import java.util.TreeSet;

public class UnionIntersect {
    private Set<Integer> set1 = new TreeSet<Integer>();
    private Set<Integer> set2 = new TreeSet<Integer>();

    public void setSet1(Set set1) {
        this.set1 = set1;
    }

    public void setSet2(Set set2) {
        this.set2 = set2;
    }

    public Set union (){
        Set<Integer> unionSet = new TreeSet<Integer>();
        for(Integer element: set1){
            unionSet.add(element);
        }
        for(Integer element: set2){
            unionSet.add(element);
        }
        return unionSet;
    }

    public Set intersect(){
        Set<Integer> intersectSet = new TreeSet<Integer>();
        for(Integer element1: set1){
            for(Integer element2: set2){
                if(element1==element2)
                    intersectSet.add(element1);
            }
        }
        return intersectSet;
    }
}
