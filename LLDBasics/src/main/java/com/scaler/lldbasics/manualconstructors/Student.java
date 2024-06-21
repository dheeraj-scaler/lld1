package com.scaler.lldbasics.manualconstructors;

public class Student {
    private String name;
    private int age;

//    public Student(String newName, int newAge) {
//        this.name = newName;
//        this.age = newAge;
//    }


    public Student(String name, int age) {
        System.out.println("Inside the manual constructor");
        this.name = name;
        this.age = age;
    }
}
