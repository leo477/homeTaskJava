package com.itea.dimka.lection16.hometask;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6Work {
    private String path;

    public Task6Work(String path) {
        this.path = path;
    }

    public Pattern chosePattern(Task6Types type){
        return switch (type){
            case DOUBLE -> Pattern.compile("[-]?[0-9]*\\.{1}[0-9]++");
            case STRING -> Pattern.compile("[a-zA-zа-яА-я]");
            case SYMBOL -> Pattern.compile("[^\\w\\.\\s]");
            case INTEGER -> Pattern.compile("[0-9]++");
            default -> Pattern.compile("");
        };
    }

    public void printData(Pattern pattern){
        String data = FileData.map(path);
        int counter=0;
        Matcher matcher = pattern.matcher(data);
        while(matcher.find()){
            System.out.println(matcher.group());
            counter++;
        }
        if (counter==0)
            System.out.println("Not found!");
    }

    public Task6Types chooseType(){
        System.out.println("Input data type wich you're interest : ");
        for (Task6Types t : Task6Types.values())
            System.out.println(t);
        String type ="";

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            type= bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Task6Types.valueOf(type);
    }
}
