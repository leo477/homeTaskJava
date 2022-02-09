package com.itea.dimka.lection16;

import java.io.FileNotFoundException;

public class PackDemo {
    public static void main(String[] args) {
        String dirName = "";
        PackJar pj = new PackJar("example.jar");
        try {
            pj.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
