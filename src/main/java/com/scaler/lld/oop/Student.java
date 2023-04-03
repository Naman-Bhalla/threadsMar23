package com.scaler.lld.oop;

import javax.sound.midi.Soundbank;

public class Student {
    String name;
    String batch;
    int age;
    String gender;
    double psp;

    void changeBatch(String newBatch) {
        batch = newBatch;
    }

    void applyForJob(int jobId) {
        if (psp < 80) {
            System.out.println("Fail");
            return;
        }
        System.out.println("Success");
    }
}
