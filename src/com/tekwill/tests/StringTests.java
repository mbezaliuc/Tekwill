package com.tekwill.tests;

import com.tekwill.classexample.Person;

public class StringTests {

    public static void main(String[] args) {

        String hello = new String("Hello");
        String world = " world";
        String helloWorld = hello.concat(world);
        System.out.println("Concatenation " + helloWorld);

        StringBuilder stringBuilder = new StringBuilder(hello);
        stringBuilder.append(world);
        System.out.println("" + stringBuilder);

//        test 1
        System.out.println("\n"); //create method for duplicate code
        System.out.println("TEST 1");
        String str1 = "test";
        String str2 = "test";

        if(str1 == str2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if(str1.equals(str2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        //test 2
        System.out.println("\n");
        System.out.println("TEST 2");
        String str3 = new String("test");
        String str4 = new String("test");

        if(str3 == str4) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        if(str3.equals(str4)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        //test 3
        String string = "abcdef";
        System.out.println(string.charAt(4));

        //test 4
        String stringIndex = "abcdef";
        System.out.println(stringIndex.indexOf('d'));

        //test 5
        String stringLastIndex = "hello friends";
        System.out.println(stringLastIndex.lastIndexOf('e'));

        //test 6
        String sub = "abcdefghijk";
        System.out.println(sub.substring(3, 8));

        //test 7
        String sub2 = "abcdefghijk";
        String e = sub2.substring(3, 8);
        System.out.println(e);

        //test 8
        String sub3 = "abcdefghi";
        System.out.println(sub3.substring(7, sub3.length()));

        //test 9
        String replaceExample = "hello world";
        replaceExample.replace("world", "tekwill");
        System.out.println(replaceExample);

        //test 10
        String s = "some string";
        boolean answer = s.contains("me st");
        System.out.println(answer);

        //test class Person
        Person person1 = new Person();
        person1.setFirstName("Maria");
        //person1.firstName = "Maria";
        System.out.println(person1.getFirstName());

        person1.setAge(-1);
        int ageToPrint = person1.getAge();
        System.out.println(ageToPrint);

        Person clonnedPerson = person1.clone();

        //System.out.println(clonnedPerson.getFirstName());

        //System.out.println(person1 == clonnedPerson);

        System.out.println(person1.sum(10,20));

        boolean result = person1.compareStrings("test", "test2");
        System.out.println("Compare strings " + result);

        System.out.println(Person.compareStrings("a", "a"));

        System.out.println(person1.compareStrings("", ""));

        System.out.println(Person.getCountHumans());
        System.out.println(Person.ispol("anna"));
    }
}
