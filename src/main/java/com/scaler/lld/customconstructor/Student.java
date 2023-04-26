package com.scaler.lld.customconstructor;

public class Student {
    String name;
    int age;

    public Student() {}

    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }
}
