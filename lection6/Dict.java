package com.itea.dimka.lection6;

public interface Dict {
    boolean addWord(String word, String translation);

    boolean delWord(String word);

    String findTranslation(String word);
}
