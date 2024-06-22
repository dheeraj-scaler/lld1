package com.scaler.lldbasics.overriding;

public class Client {

    public static void main(String[] args) {
        A a = new A();
        a.doSome();
        a = new B();
        a.doSome();

//        Do we know the exact doSome function
//        that is about to run in compile time?
//        No, and that's why it's called RunTime polymorphism

        // In case of method overriding,
        // runtime relies on actual object
    }
}
