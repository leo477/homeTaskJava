package com.itea.dimka.lection6;

public class Dictionary implements Dict {

    private String[] ukWord = {"слово", "читать", "солнце", "делать"};
    private String[] enWord = {"word", "read", "sun", "do", "go"};

    public Dictionary() {

    }

    @Override
    public boolean addWord(String word, String translation) {
        return false;
    }

    @Override
    public boolean delWord(String word) {
        return false;
    }

    @Override
    public String findTranslation(String str) {
        for (int i = 0; i < ukWord.length; i++) {
            if (ukWord[i].compareToIgnoreCase(str) == 0) {
                return enWord[i];
            }
            if (enWord[i].compareToIgnoreCase(str) == 0)
                return ukWord[i];
        }
        return "Translate not found!!!";
    }
}
