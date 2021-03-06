package com.itea.dimka.lection16;

import java.io.Serializable;

public class Student implements Serializable {
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID=1L;

    public Student(String nameOfFaculty,String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        faculty=nameOfFaculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
