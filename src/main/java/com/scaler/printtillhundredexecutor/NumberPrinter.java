package com.scaler.printtillhundredexecutor;

public class NumberPrinter implements Runnable {
    private int numberToPrint;

    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        if (numberToPrint == 60) {
            System.out.println("Break");
        }
        System.out.println("Number: " + numberToPrint +
                " Printed By: " + Thread.currentThread().getName());
    }
}
