package com.itea.dimka.lection12.homeTask;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Queue {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> arrayDeque= new ArrayDeque<>();
        arrayDeque.offer(new HeavyBox(1,2,3,4));
        arrayDeque.offer(new HeavyBox(2,2,3,4));
        arrayDeque.offer(new HeavyBox(3,2,3,4));
        arrayDeque.offer(new HeavyBox(4,2,3,4));

        while(arrayDeque.peek()!=null){
            System.out.println(arrayDeque.pop());
        }

        arrayDeque.poll();

        System.out.println("RES : ");
        while(arrayDeque.peek()!=null){
            System.out.println(arrayDeque.pop());
        }
    }
}
