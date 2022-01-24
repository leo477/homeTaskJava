package com.itea.dimka.lection8;

public class Program {
    public static void main(String[] args) {
/*        Account<String> acc1 = new Account<String>("2334",5000);
        String acc1Id =  acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);
        Integer acc2Id=acc2.getId();
        System.out.println(acc2Id);*/

/*        Printer printer = new Printer();
        String [] people = {"Tom","Alice","Sam","Kate","Bob","Helen"};
        Integer [] numbers = {23,4,5,2,13,456,4};
        printer.<String>print(people);
        printer.<Integer>print(numbers);*/

/*        Account<String, Double> acc1 = new Account<>("2334", 5000.7);
        String id= acc1.getId();
        Double sum= acc1.getSum();
        System.out.printf("Id: %s Sum: %f \n", id , sum);*/

        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53757,4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}

/*class Printer{
    public <T> void print(T[] items){
        for (T item: items){
            System.out.println(item);
        }
    }
}*/
