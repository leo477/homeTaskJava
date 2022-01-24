package com.itea.dimka.lection7;

import java.io.*;

public class BasketCats {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat vaska = new Cat("Vaska","grey", 4);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream ous= new ObjectOutputStream(baos);

        ous.writeObject(vaska);
        ous.close();

        byte [] bytes= baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);

        Cat cloneVaska= (Cat)ois.readObject();
        System.out.println(vaska);
        System.out.println(cloneVaska);
        System.out.println("********************");
        cloneVaska.setColor("black");
        System.out.println(vaska);
        System.out.println(cloneVaska);
    }
}
