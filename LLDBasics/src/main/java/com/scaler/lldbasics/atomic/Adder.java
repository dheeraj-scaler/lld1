package com.scaler.lldbasics.atomic;

public class Adder implements Runnable{

    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<1000000; i++) {
            count.value.addAndGet(1);
        }
    }
}
