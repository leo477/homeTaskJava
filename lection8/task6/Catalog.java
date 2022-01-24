package com.itea.dimka.lection8.task6;

import java.util.ArrayList;

public class Catalog {
    private static ArrayList<Book> books = new ArrayList<>();

    public void printCatalog(){
        for(Book book : books){
            System.out.println("Book:" + book.bookName + "\nHistory : ");
            for (Book.History history : book.history){
                System.out.println(history.user + " " + history.date);
            }
        }
    }

    protected class Book extends Catalog{
        private ArrayList<History> history = new ArrayList<>();
        private String bookName;

        public Book(String bookName) {
            this.bookName = bookName;
        }

        public void addHistory(String date, String user)
        {
            history.add(new History(date, user));
        }

        protected void addBook (Book book){
            books.add(book);
        }

        private class History{
            private String date;
            private String user;

            public History(String date, String user) {
                this.date = date;
                this.user = user;
            }
        }
    }
}
