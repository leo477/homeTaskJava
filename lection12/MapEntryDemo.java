package com.itea.dimka.lection12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEntryDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();
        map.put("01000004","Donald");
        map.put("01000003","Tom");
        map.put("01000002","Jerry");
        map.put("01000005","Tom");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry: entries) {
            System.out.println("Phone:" + entry.getKey() + ": " + entry.getValue());
        }
    }
}
