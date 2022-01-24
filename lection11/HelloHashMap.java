package com.itea.dimka.lection11;

import java.util.HashMap;

public class HelloHashMap {
    public static void main(String[] args) {
        HashMap <String, Float> salaryMap = new HashMap<>();
        salaryMap.put("E01", 1000f);
        salaryMap.put("E02", 12000f);
        salaryMap.put("E03", 1230f);
        salaryMap.put("E04", 1000f);
        salaryMap.put("E05", 300f);
        Float salary = salaryMap.get("E01");
        System.out.println("Salary of employee E01 = " + salary);
        salaryMap.put("E05", 400f);

        System.out.println("Salary of Employee E05 =" + salaryMap.get("E05"));
    }
}
