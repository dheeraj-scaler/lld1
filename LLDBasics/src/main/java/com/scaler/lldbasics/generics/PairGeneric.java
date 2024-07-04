package com.scaler.lldbasics.generics;

public  class  PairGeneric <A,B> {
    A first;
    B second;

    public PairGeneric(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public static <K,V> void doSomething(K a, V b) {
        System.out.println("DO something");
        System.out.println(a);
        System.out.println(b);
    }

    public void doSomethingElse(A a, B b) {
        System.out.println("DO something else");
        System.out.println(a);
        System.out.println(b);
    }
}
