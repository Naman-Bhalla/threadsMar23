package com.scaler.printtillhundred;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10000000; i++) {

            if (i == 60) {
                System.out.println("Break");
            }
            NumberPrinter np = new NumberPrinter(i);
            Thread t = new Thread(np);
            t.start();
        }
    }
}
