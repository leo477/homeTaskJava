package com.itea.dimka.lection12.homeTask;

public class SortBoots implements Comparable<SortBoots> {

    private String name;
    private int rate;
    private int price;
    private static int sort;

    public SortBoots() {
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public SortBoots(String name, int rate, int price) {
        this.name = name;
        this.rate = rate;
        this.price = price;
    }

    @Override
    public int compareTo(SortBoots o) {
        int value = this.name.compareTo(o.name);
        if (value != 0) {
            return value;
        }
        value = this.rate - o.rate;
        if (value != 0) {
            return value;
        }

        value = this.price - o.price;
        return value;
    }



    @Override
    public String toString() {
        return "SortBoots{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                '}';
    }
}
