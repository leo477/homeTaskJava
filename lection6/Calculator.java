package com.itea.dimka.lection6;

public class Calculator implements GetOperation{
    private double a;
    private double b;
    private char operation;

    public void setOperation(String operation) {
        this.operation = getOperation(operation);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void result (){
        switch (operation){
            case '+':
                System.out.println("Result of a(" + a + ") " + operation + " " + "b(" + b + ") = " + (a+b));
                break;
            case '*':
                System.out.println("Result of a(" + a + ") " + operation + " " + "b(" + b + ") = " + (a*b));
                break;
            case '/':
                System.out.println("Result of a(" + a + ") " + operation + " " + "b(" + b + ") = " + (a/b));
                break;
            case '-':
                System.out.println("Result of a(" + a + ") " + operation + " " + "b(" + b + ") = " + (a-b));
                break;
            default:
                System.out.println("Operation not Found!");
        }
    }



}
