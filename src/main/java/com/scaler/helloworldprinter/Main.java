package com.scaler.helloworldprinter;

public class Main {

    public static void main(String[] args) {
        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        hwp.run();
        Thread t = new Thread(hwp);
        t.start();
        System.out.println("Going to Delhi " + Thread.currentThread().getName());
    }
}
