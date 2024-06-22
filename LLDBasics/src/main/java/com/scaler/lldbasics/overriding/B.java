package com.scaler.lldbasics.overriding;

public class B extends A {

    void doSome() {
        System.out.println("Child function");
    }

    void parentCannotAccessThis() {
        System.out.println("If we do A a= new B(). You cannot call" +
                "this function.");
    }
}
