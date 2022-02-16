package com.itea.dimka.lection17;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class HelloWorld {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Runnable task = () -> {
//            System.out.println("Hello World");
//        };
//        new Thread(task).start();
       Callable task = () ->{
           return "Hello World";
       };
        FutureTask<String> futureTask = new FutureTask<>(task);
        new Thread(futureTask).start();

        System.out.println(futureTask.get());
    }
}
