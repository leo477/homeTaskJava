package com.itea.dimka.lection8.task5;

public class DepartmentRun {
    public static void main(String[] args) {
        Department.Position position = new Department().new Position();
        position.setPosition("Manager");
        position.addStaff("Staff1","2021-10-12");
        position.addStaff("Staff2","2014-10-12");
        position.addStaff("Staff3","2015-10-12");
        position.addPosition(position);
        position = new Department().new Position();
        position.setPosition("Director");
        position.addStaff("Director1","2021-10-12");
        position.addStaff("Director2","2014-10-12");
        position.addStaff("Director3","2015-10-12");
        position.addStaff("Director4","2016-10-12");
        position.addStaff("Director5","2017-10-12");

        position.addPosition(position);
        position.getPositions();
    }
}
