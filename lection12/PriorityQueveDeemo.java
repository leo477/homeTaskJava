package com.itea.dimka.lection12;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueveDeemo {
    public static void main(String[] args) {
        Queue<String> names = new PriorityQueue<>(Comparator.reverseOrder());
        names.offer("E");
        names.offer("A");
        names.offer("M");

        names.add("G");
        names.add("B");
        while (true){
            String name= names.poll();
            if(name==null)
                break;
            System.out.println("Name =" + name);
        }
    }
}
