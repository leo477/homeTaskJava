package com.itea.dimka.lection12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("01000004","Donald");
        map.put("01000003","Tom");
        map.put("01000002","Jerry");
        map.put("01000005","Tom");

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println("Phone:" + key);
        }
        System.out.println("-----");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry: entries) {
            System.out.println("Phone:" + entry.getKey());
        }
    }
}
