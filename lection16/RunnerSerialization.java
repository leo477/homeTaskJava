package com.itea.dimka.lection16;

import java.io.File;
import java.io.InvalidObjectException;

public class RunnerSerialization {
    public static void main(String[] args) {
        Student ob= new Student("MMF","Goncharenko",1,"Pass1");
        System.out.println(ob);
        String file="data" + File.separator + "demo.data";
        Serializator sz= new Serializator();
        boolean b= sz.serialization(ob,file);
        Student.faculty="GEO";
        Student res=null;
        try{
            res=sz.deserialization(file);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
