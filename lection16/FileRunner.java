package com.itea.dimka.lection16;

import java.io.File;
import java.io.IOException;
import java.sql.Date;



public class FileRunner {
    public static void main(String[] args) {
        File fp = new File("FileTest2.java");
        if(fp.exists()){
            System.out.println(fp.getName() + " exist");
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

        File dir = new File("src" + File.separator + "com" +File.separator + "itea" + File.separator + "dimka" + File.separator + "lection16");
        if (dir.exists() && dir.isDirectory()){
            System.out.println("dir " + dir.getName() + " exist!");
        }

        File [] files = dir.listFiles();
        for (int i=0; i< files.length; i++){
            Date date = new Date(files[i].lastModified());
            System.out.println("\n" + files[i].getPath() + "\t |" + files[i].length() + "\t |" + date);
        }

        File root[] = File.listRoots();
        if(root!= null){
            for (int i=0; i< root.length; i++){
                System.out.printf("\n %s %d from %D free", root[i].getPath(), root[i].getUsableSpace(), root[i].getTotalSpace());
            }
        }
        else
            System.out.println("There are no roots");
    }


}
