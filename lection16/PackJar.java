package com.itea.dimka.lection16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PackJar {
    private String jarFileName;
    public final int BUFFER=2_048;

    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }

    public void pack(String dirName) throws FileNotFoundException{
        File dir = new File(dirName);
        if(!dir.exists() || !dir.isDirectory()){
            throw  new FileNotFoundException(dir + " not found");
        }
        File [] files = dir.listFiles();
        ArrayList<String> listFilesToJar = new ArrayList<>();
        for(int i=0; i< files.length; i++){
            if(!files[i].isDirectory()){
                listFilesToJar.add(files[i].getPath());
            }
        }

        String[] temp ={};
        String [] filesToJar = listFilesToJar.toArray(temp);
    }
}
