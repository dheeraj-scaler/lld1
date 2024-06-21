package com.scaler.lldbasics.constructorchain;

public class C extends B{
    public int val;
    public C(int val) {
        this.val = val;
        System.out.println("Constructor of C params");
    }

//    public C() {
//        System.out.println("Constructor of C");
//    }
}
