package com.scaler.addersubtractor;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subtractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; ++i) {
            lock.lock();
            this.count.value -= i;
            lock.unlock();
        }
    }
}

// Data Synchronization Problem