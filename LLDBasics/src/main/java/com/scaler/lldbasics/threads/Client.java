package com.scaler.lldbasics.threads;

public class Client {

    public static void main(String[] args) {
        //System.out.println("We are here " + Thread.currentThread().getName());

        for(int i=0; i<100; i++) {
            NumberPrinter num = new NumberPrinter(i);
            Thread t = new Thread(num);
            t.start();
        }

//        System.out.println("Name of the thread running " + Thread.currentThread().getName());
    }
}
