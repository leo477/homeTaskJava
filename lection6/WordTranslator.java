package com.itea.dimka.lection6;

import java.util.Scanner;

public class WordTranslator {
    private Dict dict;

    public WordTranslator(Dict dict) {
        this.dict = dict;
        Scanner in = new Scanner(System.in);
        String word;
        do{
            System.out.println("Input word: ");
            word=in.next();
            System.out.println(" - " + dict.findTranslation(word));
        } while (!word.equalsIgnoreCase("ext"));

    }

    public String getTranslation(String word){
        return null;
    }
}
