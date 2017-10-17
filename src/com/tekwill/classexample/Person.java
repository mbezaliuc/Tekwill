package com.tekwill.classexample;

public class Person {

    private String firstName;
    private String lastName;
    private boolean isFemale;
    private int age;

    private static int countHumans;

    public Person() {
        this.firstName = "Anonymous";
        this.lastName = "Anonymous";
        this.isFemale = true;
        countHumans++;
    }

    public static int getCountHumans() {
        return countHumans;
    }

    public  static boolean ispol(String any){
     int l = any.length();
     for (int i=0;i<l; i++){
         if(any.charAt(i)!=any.charAt(l-1))
          return false;
         l--;
     }
     return true;
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }

    public void notSleeping() {
        System.out.println("I'm not sleeping");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public Person clone() {
        Person personToClone = new Person();

        personToClone.setFirstName(this.firstName);
        personToClone.setAge(this.age);

        return personToClone;
    }

    public int sum(int x, int y ){
        int rest = x + y;
        return rest;
    }

    public static boolean compareStrings(String s1, String s2) {
        if(s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public boolean compareStrings2(String s1, String s2) {
        return s1.equals(s2);
    }
}
