package com.itea.dimka.lection6;

public class Cat {
    int age;
    int birthday;

    Cat (int i, int j){
        age=i;
        birthday=j;
    }

    Cat (int i){
/*        age=i;
        birthday=i;*/
        this(i,i);
    }

    Cat(){
/*        age=8;
        birthday=8;*/
        this(0);
    }
}
