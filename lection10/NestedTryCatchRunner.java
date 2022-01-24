package com.itea.dimka.lection10;

public class NestedTryCatchRunner {
    public void doAction(){
        try {
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try {
                int b = 1 / a;
                StringBuilder sb = new StringBuilder(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("недопустимый размер буфера: " + e);
            }
        }catch (ArithmeticException e){
            System.err.println("div by 0: " + e);
        }
    }
}
