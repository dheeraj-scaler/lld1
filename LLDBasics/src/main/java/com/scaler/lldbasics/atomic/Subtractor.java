package com.scaler.lldbasics.atomic;

public class Subtractor implements Runnable{
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0; i<1000000; i++) {
            count.value.addAndGet(-1);
        }
    }
}
