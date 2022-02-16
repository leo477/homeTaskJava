package com.itea.dimka.lection16.hometask;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File sourceFile = new File("data" + File.separator + "Student1.java");
        File resultFile = new File("data" + File.separator + "Student2.java");

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))){
            StringBuilder stringBuilder ;
            String line;
            while((line=bufferedReader.readLine())!=null) {
                stringBuilder= new StringBuilder();
                stringBuilder.append(line);
                bufferedWriter.append(stringBuilder.reverse() + System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
