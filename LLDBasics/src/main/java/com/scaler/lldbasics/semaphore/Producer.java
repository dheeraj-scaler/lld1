package com.scaler.lldbasics.semaphore;

import java.util. Objects;
import java.util. Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Queue<Object> queue;

    private int maxsize;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;
    public Producer (Queue<Object> queue, int maxsize, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.queue = queue;
        this.maxsize = maxsize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }
    @Override
    public void run() {
        while (true) {
            try {producerSemaphore.acquire();
            }
            catch (InterruptedException e) {
                throw new RuntimeException (e);
            }
            if (queue.size() < maxsize) {
                System.out.println("Producer "+ Thread.currentThread().getName());
                queue.add((new Object()));
            }
            consumerSemaphore.release();
        }
    }
}
