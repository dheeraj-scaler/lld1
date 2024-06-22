package com.scaler.lldbasics.statics;

public class Animal {

    public static int variable = 5;
    public int notStatic = 2;
    public static String printSomething() {
        System.out.println("We are in animal");
        System.out.println(variable);
        //System.out.println(notStatic);
        return "Hello";
    }
}
