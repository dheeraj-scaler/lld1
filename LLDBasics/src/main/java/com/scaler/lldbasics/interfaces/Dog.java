package com.scaler.lldbasics.interfaces;

public class Dog implements Animal{
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void run() {
        System.out.println("Dog is Running");
    }
}
