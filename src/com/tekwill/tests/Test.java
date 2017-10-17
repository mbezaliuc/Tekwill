package com.tekwill.tests;

public class Test {
    public static final int ONE = 1;

    public static void main(String[] args) {
        int a = 10;
//        ONE = 123;
        switch (a) {
            case 10:
                System.out.println(" Ten ");

            case ONE:
                System.out.println(" One ");
                break;
            default:
                System.out.println(" I dont know any more numbers");
        }
    }

    public static boolean testIfs(boolean b1, boolean b2, boolean b3) {
        if (b1 == b2)
            b2 = false;
        if (b2 == b3) {
            return b3;
        }

        return !b3;
    }


}
