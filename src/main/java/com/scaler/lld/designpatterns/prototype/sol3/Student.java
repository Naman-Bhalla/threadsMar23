package com.scaler.lld.designpatterns.prototype.sol3;

public class Student {
    private String name;
    private int age;
    private String gender;

    public Student(Student other) {
        this.age = other.age;
        this.gender = other.gender;
        this.name = other.name;
    }
    public Student() {}

    public Student copy() {
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.gender = this.gender;
//        return copy;
        return new Student(this);
    }
}
