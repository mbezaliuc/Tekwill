package com.tekwill.inheritance;

public class Program {
    public static void main(String[] args) {
//        Woman olya = new Woman();
//        System.out.println("***************");
//        Woman tanea = new Woman("Tanea", 22);
//        System.out.println("***************");
//        Man  man = new Man ();
//        man.iWantEat("Karne");
//        man.setKodyk("patsanskii");
//        System.out.println(man.getKodyk());
//        System.out.println("####################################");
//
//        olya.display();
//        man.display();

        // Cannot see any fields or methods of Human or Woman
        Creature creature = new Woman();


        System.out.println("#########################");
        // Can see only Human and above methods
        Human human = new Woman();
        human.setAge(10);
        human.setName("Some name");
        human.display();

        Woman castFromHuman;
        castFromHuman = (Woman) human;

        ((Woman) human).goShopping();
        ((Woman) human).setHappy(true);

        castFromHuman.setHappy(false);
        castFromHuman.goShopping();



        System.out.println("#########################");
        // Can see all methods and fields
        Woman woman = new Woman();
        woman.setAge(24);
        woman.setName("New Woman name");
        woman.setHappy(true);
        woman.goShopping();
        woman.display();
        //

//
//        Human[] humans = new Human[5];
//
//        humans[0] = new Woman();
//        humans[1] = new Man();
//        humans[2] = new Human();


//        Woman[] womans = new Woman[5];
//
//        womans[0] = new Woman();
//        womans[1] = new Man();
//        womans[2] = new Human();

        int[] test = new int[10];

        int num = 10;
        char c = 3;
        short sh = 30;

        test[0] = num;
        test[1] = c;
        test[2] = sh;
        test[3] = (int) 10l;
    }
}
