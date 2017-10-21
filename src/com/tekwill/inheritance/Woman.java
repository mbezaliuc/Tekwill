package com.tekwill.inheritance;

public class Woman extends Human {

    private boolean isHappy;

//    public Woman() {
//        System.out.println("Default constructor woman");
//    }

    public Woman(String name, int age) {
        super(name, age);
        System.out.println("Constructor woman with parameters");
    }

    public void goShopping() {
        System.out.println("I like shopping! " + this.name);
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public void display(){
        System.out.println("Woman.dispay: I like people.");
    }
}
