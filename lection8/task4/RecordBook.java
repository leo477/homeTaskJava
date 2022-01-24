package com.itea.dimka.lection8.task4;

import java.util.ArrayList;

public class RecordBook {
    private static final ArrayList<Session> sessions = new ArrayList<>();

    public void addSession(Session session){
        sessions.add(session);
    }

    public void printSession(){
        for (Session session : sessions){
            System.out.println("SessionName : " + session.sessionName + " is " +
                    "between " + session.startDate + " and " + session.endDate);
            System.out.println("Exams : ");
            for (Session.Exam exam : session.getExams()){
                System.out.println(exam.examName + " " + exam.date + " " + exam.teacher);
            }
            System.out.println("Offsets : ");
            for (Session.Offset offset : session.getOffsets()){
                System.out.println(offset.offsetName + " " + offset.date + " " + offset.teacher);
            }
        }
    }

    protected class Session extends RecordBook {
        private String sessionName;
        private String startDate;
        private String endDate;
        private ArrayList<Offset> offsets = new ArrayList<>();
        private ArrayList<Exam> exams = new ArrayList<>();

        public Session(String sessionName, String startDate, String endDate) {
            this.sessionName = sessionName;
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public ArrayList<Offset> getOffsets() {
            return offsets;
        }

        public ArrayList<Exam> getExams() {
            return exams;
        }

        public void addOffset(String offsetName, String date, String teacher) {
            offsets.add(new Offset(offsetName, date, teacher));
        }

        public void addExam(String examName, String date, String teacher) {
            exams.add(new Exam(examName, date, teacher));
        }

        private class Offset {
            private String offsetName;
            private String date;
            private String teacher;

            public Offset(String offsetName, String date, String teacher) {
                this.offsetName = offsetName;
                this.date = date;
                this.teacher = teacher;
            }
        }

        private class Exam {
            private String examName;
            private String date;
            private String teacher;

            public Exam(String examName, String date, String teacher) {
                this.examName = examName;
                this.date = date;
                this.teacher = teacher;
            }
        }
    }

}
