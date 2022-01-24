package com.itea.dimka.lection4;

import java.util.Comparator;

public class Student extends Human{
    //public static Comparator<? super Student> studentComparator;
    private int id;
    private String fakultet;
    private double avgScore;
    private int year;

    public Student(String name, String surname, int age,  int id, String fakultet, double avgScore, int year) {
        super(name, surname, age);
        this.id = id;
        this.fakultet = fakultet;
        this.avgScore = avgScore;
        this.year = year;
    }

    public static Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
    };

    public int getId() {
        return id;
    }

    public String getFakultet() {
        return fakultet;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {

        return "Studen : " + super.getSurname() + " " + super.getName() + " Rating : " + avgScore + "\n";
    }
}
