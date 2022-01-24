package com.itea.dimka.lection4;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group {
    private Student[] listStudent = new Student[10];

    public void AddStudent(Student newStudent) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] == null) {
                listStudent[i] = newStudent;
                System.out.println("Student id = " + newStudent.getId() + " added");
                break;
            }
        }
    }

    public void DeleteStudent(int idStudent) {
        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i].getId() == idStudent) {
                System.out.println("Student id = " + listStudent[i].getId() + " deleted");
                listStudent[i] = null;
                break;
            }
        }
    }

    public void ListOfStudents() {
        for (Student sur : listStudent) {
            System.out.println("**********************");
            System.out.println(sur);
            System.out.println("**********************");
        }
    }

    public void SearchStudent(String surname) {
        boolean flag = false;
        for (Student sur : listStudent)
            if (sur != null)
                if (sur.getSurname().equalsIgnoreCase(surname)) {
                    flag = true;
                    System.out.println(sur);
                    break;
                }

        if (flag == false)
            System.out.println("Student isn't found!");
    }

    @Override
    public String toString() {
        Arrays.sort(listStudent, Student.studentComparator);

       return Arrays.toString(listStudent);
    }
}
