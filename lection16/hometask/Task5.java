package com.itea.dimka.lection16.hometask;

import java.io.*;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws IOException{
        Task5 task5 = new Task5();
        File f = new File("data"+ File.separator + "data1" + File.separator + "StudentScores.txt");
        task5.createStudentsFile(f);

        Scanner scanner = new Scanner(f);
        PrintWriter printWriter= new PrintWriter("data" + File.separator + "data1" + File.separator + "output.txt");
        String [] student;
        String str;
        while (scanner.hasNextLine()){
            str= scanner.nextLine();
            student = str.split("\\s+");
            double sum=0;
            for(int i=0; i< student.length; i++)
                try {
                    sum+= Integer.parseInt(student[i]);
                }catch (NumberFormatException e){}
            if(sum/(student.length-1)>4)
                printWriter.println(student[0].toUpperCase());
            else
                printWriter.println(student[0]);
        }
        scanner.close();
        printWriter.close();
    }

    private void createStudentsFile(File f){
        File dir = new File("data" + File.separator + "data1");
        if(!dir.exists())
            dir.mkdir();

        //File f = new File("data"+ File.separator + "data1" + File.separator + "StudentScores.txt");
        if (!f.exists()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f))) {
                bufferedWriter.append("Student1 1 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student2 7 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student3 9 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student4 6 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student5 4 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student6 2 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student7 7 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student8 5 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student9 1 3 5 7" + System.lineSeparator());
                bufferedWriter.append("Student10 10" + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
