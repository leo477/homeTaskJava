package com.itea.dimka.lection8;

public class Runner2 {
    public static void main(String[] args) {
        String ob = "qweRtRRR";
        WrapperString wrFirst = new WrapperString(ob);
        WrapperString wLast = new WrapperString(ob){
            private int position=2;
            @Override
            public String replace (char oldChar, char newChar){
                char[] array = new char [getStr().length()];
                getStr().getChars(0, getStr().length(), array, 0);
                for (int i = array.length-1; i>0; i--){
                    if(array[i]==oldChar){
                        array[i]=newChar;
                        break;
                    }
                }
                return  new String(array);
            }

            public boolean verify(char oldChar, char[] array) {
                int counter = 0;

                for (char c : array) {
                    if (c == oldChar) {
                        counter++;
                    }
                }

                return counter >= position;
            }

        };
    }
}
