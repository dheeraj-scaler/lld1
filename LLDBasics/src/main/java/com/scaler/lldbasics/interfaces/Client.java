package com.scaler.lldbasics.interfaces;

public class Client {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        a = new Dog();
        a.eat();
    }
}
