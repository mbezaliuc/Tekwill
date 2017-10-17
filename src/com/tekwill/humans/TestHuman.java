package com.tekwill.humans;

public class TestHuman {

    public static void main(String[] args) {
        Human ira = new Human();
        System.out.println(ira.getAge());

        ira.setAge(18);
        System.out.println(ira.getAge());
        System.out.println(ira.getName());
        ira.setName("Irina");
        System.out.println(ira.getName());


        System.out.println(ira.getEmail());
        ira.setEmail("ira_mail.ru");
        System.out.println(ira.getEmail ());

        ira.setEmail("ira@mail.ru", '@');
        System.out.println(ira.getEmail());

        ira.setEmail("ira@gmail.ru", '!');
        System.out.println(ira.getEmail());

        String s = "string";

        ira = new Human("Ira", 18, "ira@gmail.com");
        System.out.println(ira.getName() + " " + ira.getAge() + " " + ira.getEmail());

        ira = new Human("Ira", 130, "wre34t34");
        System.out.println(ira.getName() + " " + ira.getAge() + " " + ira.getEmail());

        ira = new Human();
        System.out.println(ira.getName() + " " + ira.getAge() + " " + ira.getEmail());
    }
}
