package lection2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Троллейбус")) {
                System.out.println("Ответ правильный!");
                flag = false;
            } else if (answer.equalsIgnoreCase("Сдаюсь")) {
                System.out.println("Правильный ответ: \"Троллейбус\"");
                flag = false;
            } else {
                System.out.println("Подумайте еще");
            }
        }
        while (flag);
    }
}