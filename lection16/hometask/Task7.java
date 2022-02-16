package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        File f = new File("data" + File.separator + "data1" + File.separator + "task7.txt");
        task7.createStudentsFile(f);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data" + File.separator + "data1" + File.separator + "task7Output.txt"));) {
            String line;
            String str;
            ArrayList<String> arr = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                Scanner scanner = new Scanner(line);
                int counter = 0;
                while (scanner.hasNext()) {
                    str = scanner.next();
                    arr.add(str);
                    if (str.length() >= 3 && str.length() <= 5)
                        counter++;
                }
                if (counter % 2 != 0)
                    counter -= 1;

                int deleted = 0;
                for (String element : arr)
                    if ((element.length() < 3 || element.length() > 5) || deleted >= counter) {
                        bufferedWriter.write(element);
                        bufferedWriter.newLine();
                    } else
                        deleted++;


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createStudentsFile(File f) {
        File dir = new File("data" + File.separator + "data1");
        if (!dir.exists())
            dir.mkdir();
        if (!f.exists()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f))) {
                bufferedWriter.append("2 Java 1,5 t1.ru 6 kgkkgkgkg j kfgd wwww");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
