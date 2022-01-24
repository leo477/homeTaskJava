package com.itea.dimka.lection4;

public class Human {
    private String name;
    private String surname;
    private int age;
    //private String profession;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        //this.profession = profession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hi i'm " + name + " and I'm " + age + " year old. \nMy surname is " +
                surname; //+ " and I work as a " + profession;
    }
}

class HumanMain{
    public static void main(String[] args) {
       Human human = new Human("Gevorg", "Kikabidze", 18);
        System.out.println(human);
    }
}
