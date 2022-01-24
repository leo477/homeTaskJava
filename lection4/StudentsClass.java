package com.itea.dimka.lection4;

public class StudentsClass {
    public static void main(String[] args) {
        Student s1 = new Student("Name1","Aneo", 18,1,"Fakultet1", 1.1, 2020);
        Student s2 = new Student("Name2","Pianic", 18,2,"Fakultet1", 2.5, 2021);
        Student s3 = new Student("Name3","Bordo", 18,3,"Fakultet1", 4.4, 2021);
        Student s4 = new Student("Name4","Gulfdtsf", 18,4,"Fakultet1", 3.25, 2021);
        Student s5 = new Student("Name5","Gefferson", 18,5,"Fakultet1", 2.25, 2021);
        Student s6 = new Student("Name6","Ribery", 18,6,"Fakultet1", 1, 2021);
        Student s7 = new Student("Name7","Chan", 18,7,"Fakultet1", 0, 2021);
        Student s8 = new Student("Name8","Yatsiuk", 18,8,"Fakultet1", 4.87, 2021);
        Student s9 = new Student("Name9","Zakharchenko", 18,9,"Fakultet1", 5, 2021);
        Student s10 = new Student("Name10","Tesla", 18,10,"Fakultet1", 5, 2021);

        Group group = new Group();
        group.AddStudent(s1);
        group.AddStudent(s2);
        group.AddStudent(s3);
        group.AddStudent(s4);
        group.AddStudent(s5);
        group.AddStudent(s6);
        group.AddStudent(s7);
        group.AddStudent(s8);
        group.AddStudent(s9);
        group.AddStudent(s10);
        group.SearchStudent("Surname3");
       /* group.ListOfStudents();
        group.DeleteStudent(3);
        group.ListOfStudents();
        group.SearchStudent("Surname3");*/
        System.out.println("---------------------------------------------------------");
        System.out.println(group);
    }
}
