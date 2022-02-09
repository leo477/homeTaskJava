package com.itea.dimka.lection16;

import java.io.*;

public class Serializator {
    public boolean serialization(Student s, String fileName){
        boolean flag=false;
        File f = new File(fileName);
        ObjectOutputStream ostream=null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if(fos!=null){
                ostream=new ObjectOutputStream(fos);
                ostream.writeObject(s);
                flag=true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if (ostream !=null){
                    ostream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }
}
