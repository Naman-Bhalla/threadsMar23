package com.scaler.lld.inheritance;

public class Student extends User {
    double psp;
    int userId = 4;
    String batch;
//    String name;

    void pauseBatch() {
        System.out.println(name + " is pausing batch");
        batch = null;
//        name = "Naman";
//        super.name = "ABCDE";
//        userId = 123;
    }
}
