package com.scaler.lldbasics.designpatterns.prototype;

public class Client {

    public static void setValues(StudentRegistry studentRegistry) {
        Student july = new Student();
        july.setBatch("July 23 Beginner");
        july.setAvgPsp(50.0);
        july.setInstructorName("Dheeraj");
        studentRegistry.register("july", july);

        IntelligentStudent july24 = new IntelligentStudent();
        july24.setIq(180);
        july24.setBatch("July 24 Beginner");
        july24.setAvgPsp(80.0);
        july24.setInstructorName("Satwik");
        studentRegistry.register("july24", july24);


    }


    public static void main(String[] args) {
        StudentRegistry register = new StudentRegistry();
        setValues(register);

        Student sujit = register.get("july").clone();
        sujit.setName("Sujit");
        sujit.setAge(25);
        sujit.setCity("Bangalore");


        Student is = register.get("july24").clone();
        is.setName("Jyoti");
        is.setCity("Kota");

        System.out.println("Debug here");
    }
}
