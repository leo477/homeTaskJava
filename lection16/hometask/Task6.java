package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException {
        Task6 task6 = new Task6();
        File f = new File("data" + File.separator + "data1" + File.separator + "test.txt");
        task6.createStudentsFile(f);
        Task6Work task6Work = new Task6Work("data" + File.separator + "data1" + File.separator + "test.txt");
        task6Work.printData(task6Work.chosePattern(task6Work.chooseType()));
    }

    private void createStudentsFile(File f) {
        File dir = new File("data" + File.separator + "data1");
        if (!dir.exists())
            dir.mkdir();

        //File f = new File("data"+ File.separator + "data1" + File.separator + "StudentScores.txt");
        if (!f.exists()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f))) {
                bufferedWriter.append("2 Java 1,5 true 1.6 ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
