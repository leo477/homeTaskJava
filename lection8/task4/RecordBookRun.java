package com.itea.dimka.lection8.task4;

public class RecordBookRun {
    public static void main(String[] args) {
        RecordBook.Session session = new RecordBook().new Session("Session1","2021-12-01", "2021-12-27");
        session.addExam("Метематика","2021-12-05", "Волошко А.И.");
        session.addExam("Физика","2021-12-10", "Касюпимка А.И.");
        session.addExam("История","2021-12-15", "Висенка А.И.");
        session.addExam("Экология","2021-12-20", "Пепся А.И.");
        session.addExam("Язык","2021-12-25", "Эцио Аудиторе");

        session.addOffset("Физра","2021-12-03", "Єдвард Кенуєй");
        session.addOffset("Французкий","2021-12-07", "Арно Дориан");
        session.addOffset("История пиратства","2021-12-13", "Єдвард Тєтч");
        session.addOffset("Испанский","2021-12-12", "Габриєль Гарсиа");

        session.addSession(session);

        session = new RecordBook().new Session("Session2","2022-06-01", "2022-06-27");
        session.addExam("Метематика","2022-06-05", "Волошко А.И.");
        session.addExam("Физика","2022-06-10", "Касюпимка А.И.");
        session.addExam("История","2022-06-15", "Висенка А.И.");
        session.addExam("Экология","2022-06-20", "Пепся А.И.");
        session.addExam("Язык","2022-12-06", "Эцио Аудиторе");

        session.addOffset("Физра","2022-06-03", "Єдвард Кенуєй");
        session.addOffset("Французкий","2022-06-07", "Арно Дориан");
        session.addOffset("История пиратства","2022-06-13", "Єдвард Тєтч");
        session.addOffset("Испанский","2022-06-12", "Габриєль Гарсиа");
        session.addSession(session);

        session.printSession();
    }
}
