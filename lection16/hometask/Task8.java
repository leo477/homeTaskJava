package com.itea.dimka.lection16.hometask;

import java.io.*;

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data" + File.separator + "spaceTest.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data" + File.separator + "data1" + File.separator + "spaceTextOutput.txt"));
        String line;
        while ((line= bufferedReader.readLine())!=null){
            bufferedWriter.write(line.replaceAll("\\b(\\s {2,})","\s").replaceAll("^\\B (\\s {5,})","\t"));
            bufferedWriter.newLine();
            //System.out.println();
        }
        bufferedWriter.close();
    }
}
