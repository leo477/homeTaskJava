package com.itea.dimka.lection16;

import java.io.*;

public class Serializator {
    public boolean serialization(Student s, String fileName) {
        boolean flag = false;
        File f = new File(fileName);
        ObjectOutputStream ostream = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            if (fos != null) {
                ostream = new ObjectOutputStream(fos);
                ostream.writeObject(s);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ostream != null) {
                    ostream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }

    public Student deserialization(String fileName) throws InvalidObjectException{
        File fr = new File(fileName);
        ObjectInputStream istream= null;
        try{
            FileInputStream fis= new FileInputStream(fr);
            istream=new ObjectInputStream(fis);
            Student st = (Student) istream.readObject();
            return st;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try{
                if(istream!=null){
                    istream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw  new InvalidObjectException("Object doesn't repair!");
    }
}
