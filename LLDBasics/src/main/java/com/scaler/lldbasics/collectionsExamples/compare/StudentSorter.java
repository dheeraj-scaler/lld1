package com.scaler.lldbasics.collectionsExamples.compare;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getPsp() - o2.getPsp() < 0) {
            return -1;
        }
        return 1;
    }
}
