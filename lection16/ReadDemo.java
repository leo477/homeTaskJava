package com.itea.dimka.lection16;

import javax.imageio.IIOException;
import java.io.*;

public class ReadDemo {
    public static void main(String[] args) {
        String file = "data\\file.txt";
        File f = new File(file);
        int b, count = 0;

        try (FileInputStream fileReader = new FileInputStream(new File(file))){
            //fileReader = new FileReader(f);
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
        }
    }

}
