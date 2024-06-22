package com.scaler.lldbasics.pbv;

public class PassByValueObject {
    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println("Before method call, person name = " + person.getName());
        modifyObject(person);
        System.out.println("After method call, person name = " + person.getName());

        reassignObject(person);
        System.out.println("After reassign method call, person name = " + person.getName());
    }

    public static void modifyObject(Person person) {
        person.setName("Jane");
        System.out.println("Inside modifyObject method, person name = " + person.getName());
    }

    public static void reassignObject(Person person) {
        person = new Person("Mike");
        System.out.println("Inside reassignObject method, person name = " + person.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
