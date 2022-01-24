package com.itea.dimka.lection12.homeTask;

import java.util.HashMap;
import java.util.Map;

public class Toy {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        toys.put("dog", new Product(15, 3));
        toys.put("cat", new Product(26, 3));
        toys.put("LEGO", new Product(100, 5));
        getEntries(toys);
        getNames(toys);
        getValues(toys);
    }

    private static void getEntries(HashMap<String, Product> toys) {
        for (Map.Entry entry : toys.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    private static void getNames(HashMap<String, Product> toys) {
        for (String entry : toys.keySet()) {
            System.out.println("Products Name : " + entry);
        }
    }

    private static void getValues(HashMap<String, Product> toys) {
        for (Product product : toys.values()) {
            System.out.println("Products Value : " + product.getPrice());
        }
    }
}
