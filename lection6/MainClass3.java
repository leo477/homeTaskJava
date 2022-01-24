package com.itea.dimka.lection6;

public class MainClass3 {
    WordTranslator wordTranslator;
    Dictionary dictionary;

    public MainClass3() {
        dictionary = new Dictionary();
        wordTranslator = new WordTranslator(dictionary);
    }

    public static void main(String[] args) {
        new MainClass3();
    }
}
