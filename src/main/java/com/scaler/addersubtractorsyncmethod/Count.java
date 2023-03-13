package com.scaler.addersubtractorsyncmethod;

public class Count {
    int value;

    synchronized void add(int val) {
        // synchronized(this)
        value += val;
        // }
    }

    synchronized void subtract(int val) {
        // synchronized(this)
        value -= val;
        // }
    }
}
