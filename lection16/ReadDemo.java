package com.itea.dimka.lection16;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        String file = "data\\file.txt";
        File f = new File(file);
        int b, count = 0;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(f);
            while ((b = fileReader.read()) != -1) {
                System.out.println((char) b);
                count++;
            }
            System.out.println("# of byte = " + count);
        } catch (IIOException e) {
            System.err.println("File's error:" + e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.err.println("Close error: " + e);
            }
        }
    }

}
