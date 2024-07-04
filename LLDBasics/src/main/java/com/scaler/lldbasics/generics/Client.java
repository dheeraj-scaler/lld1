package com.scaler.lldbasics.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        List<Pair> p = new ArrayList<>(Arrays.asList(
//                new Pair(1.2,1.3), new Pair("Dheeraj", 1.3)
//        ));
//
//        for( Pair cur : p) {
//            String f = (String) cur.getFirst();
//            String s = (String) cur.getSecond();
//            System.out.println(f);
//            System.out.println(s);
//        }
//
//        PairGeneric<Integer, String> a = new PairGeneric<>(1,"Dheeraj");
//        PairGeneric<String, Integer> b = new PairGeneric<>("Dheeraj", 1);
//
//        PairGeneric.doSomething("Dheeraj", 1);


        // RAW types, before Java 5
        // No compile time safety
//        HashMap hm = new HashMap();
//        hm.put(1,"Dheeraj");
//        hm.put("Dheeraj",1);
//        for(var v: hm.keySet()){
//            int i = (Integer) v;
//            System.out.println(i);
//        }

        // After Java 5, compile time safety
//        HashMap<String, Integer> hmap = new HashMap<>();
//        hmap.put(1, "Dheeraj");

//        List<String> l1 = new ArrayList<>();
//        List<Integer> l2 = new ArrayList<>();
//        List<Double> l3 = new ArrayList<>();
//        System.out.println("Done");




    }
}
