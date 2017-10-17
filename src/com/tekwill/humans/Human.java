package com.tekwill.humans;

public class Human {
    private int age;
    private String name;
    private String email;

    //overloaded constructors
    public Human() {
    }

    public Human(String n) {
        name = n;
    }

    public Human(int a) {
        age = a;
    }

    public Human(String n, int a, String e) {
        name = n;
        setAge(a);
        setEmail(e);
    }

    public Human(int a, String s) {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a < 120) {
            age = a;
        }
    }

    public void setName(String n) {
        name = n;
    }

    public String getEmail() {
        return email;

    }

    //overloaded methods
    public void setEmail(String mail) {
        if (mail.contains("@")) {
            email = mail;
        } else {
            email = "welcome Ira";
        }
    }

    public void setEmail(String mail, char ch) {
        if (mail.contains(String.valueOf(ch))) {
            email = mail;
        }
    }
}

