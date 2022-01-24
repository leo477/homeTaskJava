package com.itea.dimka.lection7;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        BookInfo bookInfo=new BookInfo("Приключение Шерлока Холмса", "Артур Конан Дойль",
                "Publisher1", 15);
        System.out.println(bookInfo);
        System.out.print("Input new pice : ");
        Scanner in = new Scanner(System.in);
        bookInfo.setPrice(in.nextDouble());
        System.out.println(bookInfo);

    }
}
