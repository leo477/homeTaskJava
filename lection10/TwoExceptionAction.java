package com.itea.dimka.lection10;

public class TwoExceptionAction {

    public static void main(String[] args) {
        TwoExceptionAction twoExceptionAction = new TwoExceptionAction();
        twoExceptionAction.doAction();
    }

    public void doAction(){
        try{
            int a = (int)(Math.random()*2);
            System.out.println("a = " + a);
            int c[]={1/a};
            c[a]=71;
        } catch (ArithmeticException e){
            System.err.println("div by 0 " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("out of bound " + e);
        }
        System.out.println("after try-catch ");
    }
}
