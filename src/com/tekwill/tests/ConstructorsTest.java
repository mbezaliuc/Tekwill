package com.tekwill.tests;

import java.awt.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ConstructorsTest {


}

//class Constructors{
//    public Constructors() {
//        System.out.println("hello");
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

//class Constructors{
//    public Constructors() {
//        System.out.println("hello");
//    }
//
//    public Constructors(String str) {
//        System.out.println(str);
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors("Hi");
//    }
//}
//
//class Constructors{
//
//    public Constructors(int i) {
//        System.out.println("Int");
//    }
//
//    public Constructors(String str) {
//        System.out.println("String");
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors(10);
//    }
//}
//
//class Constructors{
//
//    public Constructors(double d) {
//        System.out.println("Double");
//    }
//
//    public Constructors(float f) {
//        System.out.println("Float");
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors(10.0);
//    }
//}
//
//class Constructors{
//
//    public Constructors(double d) {
//        System.out.println("Double");
//    }
//
//    public Constructors(float f) {
//        System.out.println("Float");
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors(10D);
//    }
//}
//
//class Constructors{
//
//    public Constructors(String str) {
//        System.out.println(str);
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors();
//    }
//}

class Constructors {
    int num;
    private String name;
    double bablo;
    int numberOne;
    int numberTwo;
    int numberThree;
    boolean active;
    boolean drinksAlchahol;

    // TODO: to come back
    char gender;


    public Constructors() {
        num = 10;
        name = "This name";
        bablo = 100000000.0;
        numberOne = 1;
        numberTwo = 2;
        numberThree = 3;
        active = true;
        if (LocalDate.now().getDayOfWeek() == DayOfWeek.FRIDAY) {
            drinksAlchahol = true;
        } else {
            drinksAlchahol = false;
        }
        gender = 'M';
    }

    public Constructors(String name) {
        this();
        this.name = name;
    }

    public Constructors(String name, int num) {
        this(name);
        this.num = num;
    }

    public static void main(String[] args) {
//        Constructors firstObject = new Constructors();
//        firstObject.name = "TestNameOne";
//        firstObject.num = 1111;
//
//        firstObject.printObjectInfo();
//
//        System.out.println("##################################");
//
//        Constructors secondObject = new Constructors("TestNameTwo");
//        secondObject.num = 2222;
//
//        secondObject.printObjectInfo();
//
//        System.out.println("##################################");
//
        Constructors thirdObject = new Constructors("TestName123", 32156);
//        thirdObject.printObjectInfo();
        System.out.println(thirdObject.toString());

        System.out.println("" );

    }

    public void printObjectInfo(){
        System.out.println(num);
        System.out.println(name);
        System.out.println(bablo);
        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(active);
        System.out.println(drinksAlchahol);
        System.out.println(gender);
    }

    public String toString() {
        return name + " " + num;
    }
}
//
//class Constructors{
//
//    public void display() {
//        System.out.println("Display");
//    }
//
//    public Constructors() {
//        System.out.println("Default");
//        this.display();
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors();
//    }
//}
//
//class Constructors{
//    String name;
//    int id;
//
//    public Constructors(String name, int id) {
//        name = name;
//        id = id;
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors("Hi",1);
//        System.out.println(constructors.id);
//        System.out.println(constructors.name);
//    }
//}
//
//class Constructors{
//    String name;
//    int id;
//
//    public Constructors(String name, int id) {
//        this.name = name;
//        this.id = id;
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors("Hi", 1);
//        System.out.println(constructors.id);
//        System.out.println(constructors.name);
//    }
//}
//
//class Constructors{
//    String name = "Dima";
//    int id;
//
//    public Constructors(String name, int id) {
//        System.out.println(this.name);
//        this.name = name;
//        this.id = id;
//    }
//
//    public static void main(String[] args) {
//        Constructors constructors = new Constructors("Hi", 1);
//        System.out.println(constructors.id);
//        System.out.println(constructors.name);
//    }
//}