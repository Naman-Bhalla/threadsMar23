package com.scaler.lld.inheritance;

public class User {
    private int userId = 6;
    String name;
    int age;
    String gender;

    void changeName(String newName) {
        this.name = newName;
    }

    void printUserId() {
        System.out.println(userId);
        printOk();
    }

    private void printOk() {
        System.out.println("OK");
    }
}
