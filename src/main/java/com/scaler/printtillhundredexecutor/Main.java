package com.scaler.printtillhundredexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; ++i) {
            Thread.sleep(50);
            if (i == 60) {
                System.out.println("STOP");
            }
            NumberPrinter np = new NumberPrinter(i);
            executor.execute(np);
        }
    }
}
