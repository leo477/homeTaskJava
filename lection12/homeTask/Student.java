package com.itea.dimka.lection12.homeTask;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Student {
    private String name;
    private String group;
    private int course;
    private HashMap<String, Double> scores = new HashMap<>();

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void getSubjectsScopes(String nameSubject, double score){
        scores.put(nameSubject,score);
    }

    public double averageScore(){
        Iterator ite = scores.entrySet().iterator();
        double scope=0;
        int count=0;
        while(ite.hasNext()){
            Map.Entry entry = (Map.Entry) ite.next();
            scope+= (double) entry.getValue();
            count++;
        }
        return scope/count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", AVGScope=" + averageScore() +
                '}';
    }
}
