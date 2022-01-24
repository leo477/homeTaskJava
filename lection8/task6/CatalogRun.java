package com.itea.dimka.lection8.task6;

public class CatalogRun {
    public static void main(String[] args) {
        Catalog.Book book = new Catalog().new Book("Witcher");
        book.addHistory("2021-01-01","Tom Holand");
        book.addHistory("2021-01-01","Jack Sparrow");
        book.addHistory("2021-01-01","John Dickon");
        book.addBook(book);
        Catalog catalog = (Catalog) book;
        catalog.printCatalog();
    }
}
