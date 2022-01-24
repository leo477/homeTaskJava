package com.itea.dimka.lection7;

public class BookInfo {
    private String name;
    private String autor;
    private String publisher;
    private double price;

    public BookInfo(String name, String autor, String publisher, double price) {
        this.name = name;
        this.autor = autor;
        this.publisher = publisher;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>10) {
            this.price = price;
        } else{
            System.out.println("Price mast be greater than 10! So we changed your price to 10! ");
            this.price=10;
        }
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
