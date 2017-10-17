package com.tekwill.shirt;

public class Shirt {

    private String color;

    public void setColor(String c) {
        color = c;
    }

    public static void main(String[] args) {
        Shirt redShirt = new Shirt();
        redShirt.setColor("Red");
        System.out.println(redShirt.color);
    }
}
