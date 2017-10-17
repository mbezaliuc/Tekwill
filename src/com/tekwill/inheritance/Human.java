package com.tekwill.inheritance;

public class Human extends Creature{

    protected String name;
    protected int age;

    public Human() {
        System.out.println("Human default constructor");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Human constructor with parameters");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Human.display: information about Human");
    }
}
