package com.itea.dimka.lection16.hometask;

import java.io.*;

public class Task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data" +
                File.separator + "data1" + File.separator + "CommentTset.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data" +
                File.separator + "data1" + File.separator + "CommentTset.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line.replaceAll("//.*", ""));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
