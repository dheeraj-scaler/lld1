package com.scaler.lldbasics.addersubsync;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            synchronized (count) {
                count.value += i;
            }
//            count.increment();
        }
    }
}
