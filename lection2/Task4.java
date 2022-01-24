package lection2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number >0 :");
        int a = in.nextInt();
        int sum = 0;
        if (a > 0) {
            for (int i = 1; i <= a; i++)
                sum += i;
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Entered num less or equal 0!");
        }
    }
}