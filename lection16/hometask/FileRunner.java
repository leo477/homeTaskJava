package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileRunner {
    public static void main(String[] args) {

        Random random = new Random();
        int a[] = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = random.nextInt(50) - 1;
        System.out.println("Array: ");
        for (int element : a)
            System.out.print(element + " ");
        File f = new File("data" + File.separator + "file1.txt");
        try (FileWriter fileWriter = new FileWriter(f, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             PrintWriter printWriter = new PrintWriter(bufferedWriter)) {
            for (int element : a) {
                printWriter.print(element + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String str = bufferedReader.readLine();
            String[] b = str.split(" ");
            int d[] = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                d[i] = Integer.parseInt(b[i]);
            }
            Arrays.sort(d);
            System.out.println("\nSorted Array from File: ");
            for (int element : d)
                System.out.print(element + " ");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
