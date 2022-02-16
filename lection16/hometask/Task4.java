package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        File f = new File("data" + File.separator + "Student3.java");
        File f1 = new File("data" + File.separator + "Student3.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(f1))){
            String line, word;

            Pattern pattern = Pattern.compile(".{3,}");
            while ((line= bufferedReader.readLine())!=null){
                Scanner scanner= new Scanner(line);
                StringBuffer stringBuffer = new StringBuffer();
                while(scanner.hasNext()){
                    word= scanner.next();
                    Matcher matcher=pattern.matcher(word);

                    if(matcher.matches()){
                        System.out.println(matcher.group());
                        stringBuffer.append(matcher.group().toUpperCase()+ " ");
                    } else{
                        stringBuffer.append(word + " ");
                    }
                }
                bufferedWriter.append(stringBuffer,0, stringBuffer.length());
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
