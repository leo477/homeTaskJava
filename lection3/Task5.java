package com.itea.dimka.lection3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {
        List<String> listStr = new ArrayList<String>();
        listStr.add("rabbit");
        listStr.add("bribe");
        listStr.add("dog");
        String strForCheck = "bib";
        for (String s: listStr) {
            if (check(s,strForCheck) == true)
                System.out.println(s);
        }
    }

    public static boolean check(String str, String strForCheck){
        boolean flag=false;
        int num=0;
        StringBuffer stringBuffer = new StringBuffer(str);
        char[] arr = new char[stringBuffer.length()];
        for(char sf: strForCheck.toCharArray()){

            stringBuffer.getChars(0, stringBuffer.length(),arr,0);
            flag=false;
            for (int i =0; i< arr.length;i++) {
                if(sf==arr[i]){
                    stringBuffer.deleteCharAt(i);
                    num++;
                    break;
                }
            }
        }

        return num==strForCheck.length() ? true : false;
    }
}

