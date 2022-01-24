package com.itea.dimka.lection8;

public class Account  {
    private String id;
    private int sum;

    public <T>Account(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }
}
