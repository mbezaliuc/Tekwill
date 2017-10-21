package com.tekwill.inheritance.farm;

public class Cat extends Animal implements Jumpable, Climbable {

    public String animalString = "Cat";

    public void makeSound() {
        System.out.println("Mrrrrrrr!");
    }

    @Override
    public void jump() {
        System.out.println("Jumping like a cat");
    }

    @Override
    public void climb() {
        System.out.println("Climbing like a cat");
    }

    public static void printClassName() {
        System.out.println("Cat class");
    }

    @Override
    public String toString() {
        return "Every cat is fat";
    }
}
