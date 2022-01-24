package com.itea.dimka.lection8.task5;

import java.util.ArrayList;

public class Department {
    private static ArrayList<Position> positions = new ArrayList<>();

    public class Position extends Department{
        private ArrayList<Staff> staff = new ArrayList<>();
        private String position;

        public void addStaff(String staffName, String date) {
            staff.add(new Staff(staffName, date));
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public ArrayList<Staff> getStaff() {
            return staff;
        }

        private class Staff {
            private String staffName;
            private String date;

            public Staff(String staffName, String date) {
                this.staffName = staffName;
                this.date = date;
            }
        }
    }

    public void addPosition(Position position){
        positions.add(position);
    }

    public void getPositions(){
        for (Position p : positions) {
            System.out.println("PositionName : " + p.position);
            for (Position.Staff st : p.getStaff()){
                System.out.println("StaffName : " + st.staffName + " | Date : " + st.date);
            }
        }
    }
}
