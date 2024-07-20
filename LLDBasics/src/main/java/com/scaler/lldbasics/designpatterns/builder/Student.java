package com.scaler.lldbasics.designpatterns.builder;

public class Student {
    String name;
    int age;
    String batch;
    String universityName;
    double psp;
    int gradYear;
    String phoneNumber;

    public Student(Builder builder) {

        if (builder.getGradYear() <= 2022) {
            throw new RuntimeException("Grad year should me after 2020");
        }
        if (builder.getPsp() < 80) {
            throw new RuntimeException("Psp should be more than 80");
        }

        this.name = builder.name;
        this.age = builder.age;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
    }
}
