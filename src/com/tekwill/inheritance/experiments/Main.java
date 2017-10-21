package com.tekwill.inheritance.experiments;

public class Main {
    public static void main(String[] args) {
        SecondInterface secondInterface = new OneClass();

        OneClass oneClass;
        SecondClass secondClass;
        if (secondInterface instanceof OneClass) {
            System.out.println(" Instance of OneClass");
            oneClass = (OneClass) secondInterface;
        }
        if (secondInterface instanceof SecondClass) {
            System.out.println(" Instance of SecondClass");
            secondClass = (SecondClass) secondInterface;
        }
    }
}
