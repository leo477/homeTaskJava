package com.itea.dimka.lection8.task2;

import java.util.Scanner;

public class Payment {

    private Product[] pArr;

    private class Product {
        private String productName;
        private double productCost;
        public Product(String productName, double productCost) {
            super();
            this.productName = productName;
            this.productCost = productCost;
        }
    }

    public void sellProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input num of products which you want to buy: " );
        int n = scanner.nextInt();
        pArr= new Product[n];
        for (int i=0; i<n; i++){
            System.out.println("Product #" + i + " was added");
            pArr[i]= new Product("Product # " + i, (i+2.0)*(i+63));
        }
        System.out.println("------------Check-------------");
        for (int i=0; i< pArr.length; i++){
            System.out.println(pArr[i].productName + " was sell by " +
                    pArr[i].productCost + "$");
        }
    }
}
