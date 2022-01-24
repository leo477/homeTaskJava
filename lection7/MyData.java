package com.itea.dimka.lection7;

public interface MyData {
    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("Клас MyDAta. Печатаем строчку: " + str);
        }
    }

    static boolean isNull(String str) {
        System.out.println("Статический метод проверки на null");
        return str == null ? true : "".equals(str) ? true : false;
    }
}
