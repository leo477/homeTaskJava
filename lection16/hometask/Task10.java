package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data" +
                File.separator + "data1" + File.separator + "CommentTset.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data" +
                File.separator + "data1" + File.separator + "Task10.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Pattern pattern = Pattern.compile("(\\S+)\\s(.+)(\\b\\w+)");
            Matcher matcher=pattern.matcher(line);
            bufferedWriter.write(matcher.replaceAll("$3 $2$1"));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
