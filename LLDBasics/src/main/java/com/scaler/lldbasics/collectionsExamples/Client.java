package com.scaler.lldbasics.collectionsExamples;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


enum PaymentStatus {
    SUCEESS,
    FAILURE,
    PENDING,
    AWAITING_FOR_BANK_APPROVAL
}


public class Client {

    public static void main(String[] args) {
        Set<Integer> curr = new LinkedHashSet<>();
//        curr.add(12);
//        curr.add(50);
//        curr.add(24);
//        curr.remove(12);
//        curr.add(70);
//        curr.add(12);
//
//        System.out.println(curr);
//
        //EnumSet<PaymentStatus> paymentStatuses = EnumSet.of(PaymentStatus.SUCEESS, PaymentStatus.PENDING, PaymentStatus.FAILURE);
        //EnumSet<PaymentStatus> allOf = EnumSet.noneOf(PaymentStatus.class);
        // Iterating over the EnumSet
//        for (PaymentStatus status : allOf) {
//            System.out.println(status);
//        }
    }
}
