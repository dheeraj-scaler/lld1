package com.scaler.lldbasics.collectionsExamples.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Dheeraj", 25, 80.0),
                new Student("Sachin", 24, 70.0),
                new Student("Kohli", 26, 60.0)
        ));

//        Collections.sort(
//                students
//        );

        students.sort(new StudentSorter());

        System.out.println(students);
    }
}
