package com.itea.dimka.lection12.homeTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DistinctNum {
    public static void main(String[] args) {
        String str = "1,2,3,4,4,5";
        char[] chars = str.toCharArray();
        Set<String> set = new HashSet<>();
        for (char ch : chars) {
            if (ch != ',') {
                set.add(String.valueOf(ch));
            }
        }

        Iterator<String> iterator = set.iterator();
        System.out.println("Old String : " + str);
        System.out.println("New String : ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
