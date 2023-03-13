package com.scaler.addersubtractorimplicitlock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }


    @Override
    public void run() {
//        lock.lock();
        for (int i = 1; i <= 100000; ++i) {

            ///

            ////

            ///
            //


            synchronized (count) {  // count.lock()
                if (i >= 500) {
//                    System.out.println("STOP");
                }
                // 1
                // 1
                // 1
                count.value += i;
            } // count.unlock()

            ///
            ///
            ///
            ///
            
        }
//        lock.unlock();
    }
}
