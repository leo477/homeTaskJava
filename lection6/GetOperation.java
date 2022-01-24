package com.itea.dimka.lection6;

public interface GetOperation {

    char[] operation = {'+','-','/','*'};
    public default char getOperation(String t)
    {
        char c=';';
        for (char o: operation ) {
            if (t.charAt(0)==o){
                c=t.charAt(0);
            }
        }
        return c;
    }
}
