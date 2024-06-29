package com.scaler.lldbasics.producerconsumer;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue< Object > queue;

    private int maxsize;
    public Producer (Queue<Object> queue, int maxsize) {
        this.queue = queue;
        this.maxsize = maxsize;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if (queue.size() < maxsize) {
                    queue.add((new Object()));
                }
            }
        }
    }
}