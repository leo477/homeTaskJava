package com.itea.dimka.lection12.homeTask;

import java.util.ArrayList;
import java.util.List;

public class StudentRun {
    public static void main(String[] args) {

        Student student1 = new Student("Student1", "Group1", 3);
        student1.getSubjectsScopes("Subj1", 5.0);
        student1.getSubjectsScopes("Subj2", 4.0);
        student1.getSubjectsScopes("Subj3", 5.0);
        student1.getSubjectsScopes("Subj4", 3.0);
        student1.getSubjectsScopes("Subj5", 4.0);

        Student student2 = new Student("Student2", "Group1", 4);
        student2.getSubjectsScopes("Subj1", 3.0);
        student2.getSubjectsScopes("Subj2", 3.0);
        student2.getSubjectsScopes("Subj3", 2.0);
        student2.getSubjectsScopes("Subj4", 3.0);
        student2.getSubjectsScopes("Subj5", 4.0);

        Student student3 = new Student("Student3", "Group1", 2);
        student3.getSubjectsScopes("Subj1", 1.0);
        student3.getSubjectsScopes("Subj2", 4.0);
        student3.getSubjectsScopes("Subj3", 4.0);
        student3.getSubjectsScopes("Subj4", 5.0);
        student3.getSubjectsScopes("Subj5", 4.0);

        Student student4 = new Student("Student4", "Group1", 2);
        student4.getSubjectsScopes("Subj1", 1.0);
        student4.getSubjectsScopes("Subj2", 4.0);
        student4.getSubjectsScopes("Subj3", 2.0);
        student4.getSubjectsScopes("Subj4", 3.0);
        student4.getSubjectsScopes("Subj5", 4.0);

        Student student5 = new Student("Student5", "Group1", 2);
        student5.getSubjectsScopes("Subj1", 5.0);
        student5.getSubjectsScopes("Subj2", 5.0);
        student5.getSubjectsScopes("Subj3", 5.0);
        student5.getSubjectsScopes("Subj4", 5.0);
        student5.getSubjectsScopes("Subj5", 5.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students)
            System.out.println(student);
        List<Student> nextCourse = new ArrayList<>();

        for (Student student : students) {
            if (student.averageScore() >= 3) {
                nextCourse.add(student);
            }
        }
        System.out.println("Next Course : ");
        for (Student student : nextCourse)
            System.out.println(student);

        printStudents(students, 2);
    }



    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students on " + course + " course :");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
