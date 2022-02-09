package com.itea.dimka.lection16;

import java.io.File;
import java.io.IOException;
import java.sql.Date;



public class FileRunner {
    public static void main(String[] args) {
        File fp = new File("FileTest2.java");
        if(fp.exists()){
            System.out.println("Name offile:" + fp.getName());
            if(fp.isFile()){
                System.out.println("Path to file:" + fp.getPath());
                System.out.println("Absolute Path to file:" + fp.getAbsolutePath());
                System.out.println("Size of file:" + fp.length());
                System.out.println("Last Modification of file:" + new Date(fp.lastModified()));
                System.out.println("Is file read? " + fp.canRead());
                System.out.println("Is file write? " + fp.canWrite());
                System.out.println("is file deleted? " + fp.delete());
            } else
                System.out.println("file" + fp.getName() + " not execute !");
        }

        try{
            if(fp.createNewFile()){
                System.out.println("File" + fp.getName() + " created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File dir = new File("com" +File.separator + "itea");
        if (dir.exists() && dir.isDirectory()){
            System.out.println("dir " + dir.getName() + " exist!");
        }

        File [] files = dir.listFiles();
        for (int i=0; i< files.length; i++){
            Date date = new Date(files[i].lastModified());
            System.out.println("\n" + files[i].getPath() + "\t |" + files[i].length() + "\t |" + date);
        }
    }


}
