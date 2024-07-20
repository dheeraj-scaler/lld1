package com.scaler.lldbasics.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder();
        //Builder builder = Student.getBuilder();
        builder.setName("Sahil");
        builder.setBatch("Apr23 Tuesday Beginner Morning");
        builder.setGradYear(2023);
        builder.setPsp(89.0);
        builder.setAge(25);
        builder.setUniversityName("Scaler");

        //Student student = new Student(builder);
        Student student = builder.build();
        System.out.println("Debug");
    }
}
