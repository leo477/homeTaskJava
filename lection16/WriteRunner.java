package com.itea.dimka.lection16;

import java.io.*;

public class WriteRunner {
    public static void main(String[] args) {
        String pArray[]={"2020", "Java SE 13"};
        File fByte = new File("data\\byte.data");
        File fSymb = new File("data\\symbol.txt");
        try(FileOutputStream fos=new FileOutputStream(fByte);
            FileWriter fw= new FileWriter(fSymb)){

            for (String a : pArray){
                fos.write(a.getBytes());
                fw.write(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
