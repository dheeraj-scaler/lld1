package com.scaler.lldbasics.interfaces;

public class Cat implements Animal {
    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    public void run() {
        System.out.println("Cat is Running");
    }
}
