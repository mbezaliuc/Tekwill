package com.tekwill.inheritance.inheritance;

public class InheritanceTest {
}


//1
//class Super {
//    public void display() {
//        System.out.println("Super display");
//    }
//}
//
//class Sub extends Super {
//    public static void main(String[] args) {
//        Sub object = new Sub();
//        object.display();
//    }
//}
//
//2
//class A {
//    public A(String s) {
//        System.out.println("default");
//        System.out.println(this);
//    }
//}
//
//class Sub extends A {
//    public Sub(String s) {
//        super(s);
//        System.out.println(s);
//        System.out.println(this);
//    }
//
//    public static void main(String[] args) {
//        Sub object = new Sub("Hello");
//    }
//}
//
//3
//class B extends A, B
//
//4
//class Super {
//    private void display() {
//        System.out.println("Super display");
//    }
//}
//
//class Sub extends Super {
//    public static void main(String[] args) {
//        Sub object = new Sub();
//        object.display();
//    }
//}
//
//5
//class A {
//    void display() {
//        System.out.println("Super display");
//    }
//}
//
//class Sub extends A {
//    void display() {
//        System.out.println("Sub display");
//    }
//    public static void main(String[] args) {
//        Sub object = new Sub();
//        object.display();
//    }
//}
//
//6
//class A {
//    void display() {
//        System.out.println("Super display");
//    }
//}
//
//class Sub extends A {
//    void display() {
//        System.out.println("Sub display");
//        super.display();
//    }
//    public static void main(String[] args) {
//        Sub object = new Sub();
//        object.display();
//    }
//}
//
//7
//class A {
//    public A() {
//        System.out.println("default");
//    }
//}
//
//class Sub extends A {
//    public Sub(String s) {
//        System.out.println(s);
//    }
//
//    public static void main(String[] args) {
//        Sub object = new Sub("Hello");
//    }
//}
//
//8
//class A {
//    public A(String s) {
//        System.out.println("default");
//    }
//}
//
//class Sub extends A {
//    public Sub(String s) {
//        System.out.println(s);
//    }
//
//    public static void main(String[] args) {
//        Sub object = new Sub("Hello");
//    }
//}
//
//9
//class A {
//    public A(String s) {
//        System.out.println("default");
//    }
//}
//
//class Sub extends A {
//    public Sub(String s) {
//        System.out.println(s);
//        super(s);
//    }
//
//    public static void main(String[] args) {
//        Sub object = new Sub("Hello");
//    }
//}