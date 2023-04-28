package com.scaler.lld.designpatterns.prototype.sol2;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(Student other) {
        this.age = other.age;
        this.gender = other.gender;
        this.name = other.name;
    }
}
