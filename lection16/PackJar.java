package com.itea.dimka.lection16;

import java.io.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;
import java.util.zip.Deflater;

public class PackJar {
    private String jarFileName;
    public final int BUFFER = 2_048;

    public PackJar(String jarFileName) {
        this.jarFileName = jarFileName;
    }

    public void pack(String dirName) throws FileNotFoundException {
        File dir = new File(dirName);
        if (!dir.exists() || !dir.isDirectory()) {
            throw new FileNotFoundException(dir + " not found");
        }
        File[] files = dir.listFiles();
        ArrayList<String> listFilesToJar = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory()) {
                listFilesToJar.add(files[i].getPath());
            }
        }

        String[] temp = {};
        String[] filesToJar = listFilesToJar.toArray(temp);

        try (FileOutputStream fos = new FileOutputStream(jarFileName);
             JarOutputStream jos = new JarOutputStream(fos)) {
            byte[] buffer = new byte[BUFFER];
            jos.setLevel(Deflater.DEFAULT_COMPRESSION);
            for (int i = 0; i < filesToJar.length; i++) {
                jos.putNextEntry(new JarEntry(filesToJar[i]));
                try (FileInputStream in = new FileInputStream(filesToJar[i])) {
                    int len;
                    while ((len = in.read(buffer)) > 0) {
                        jos.write(buffer, 0, len);
                    }
                    jos.closeEntry();
                } catch (FileNotFoundException e) {
                    System.err.println("File not found!" + e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
