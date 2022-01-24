package com.itea.dimka.lection8;

public class TeacherLogic {

    public void  excludeProcess(int rectorId, String nameStudent){
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Student: " + nameStudent + " fire:" + teacher.excludeStudent(nameStudent));
    }
}
