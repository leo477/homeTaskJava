package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        File f = new File("data" + File.separator + "Student1.java");
        BufferedWriter bufferedWriter=null;
        try (BufferedReader bufferedReader= new BufferedReader(new FileReader(f))){
            ArrayList<String> textFile = new ArrayList<>();
            String line;
            System.out.println("Old File : \n");
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                textFile.add(line.replace("public","private"));
            }
            bufferedReader.close();
            System.out.println("New File : \n");
            for (String element : textFile)
                System.out.println(element);
            bufferedWriter = new BufferedWriter(new FileWriter(f));
            for (String element : textFile)
                bufferedWriter.append(element + System.lineSeparator());
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
