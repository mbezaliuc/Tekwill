package com.tekwill.inheritance.experiments;

public class OneClass implements FirstInterface, SecondInterface {

    @Override
    public void method() {
        System.out.println("Default message");
    }

    @Override
    public String method(String s) {
        System.out.println("Our string is: " + s);
        return "";
    }

    public void methodSayHello(){
        System.out.println("Hello");
    }
}
