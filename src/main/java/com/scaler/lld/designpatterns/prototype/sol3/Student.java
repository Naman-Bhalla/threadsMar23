package com.scaler.lld.designpatterns.prototype.sol3;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String batch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Student(Student other) {
        this.age = other.age;
        this.gender = other.gender;
        this.name = other.name;
        this.batch = other.batch;
    }
    public Student(String batch) {
        this.batch = batch;
    }

    public Student copy() {
//        Student copy = new Student();
//        copy.name = this.name;
//        copy.age = this.age;
//        copy.gender = this.gender;
//        return copy;
        return new Student(this);
    }
}
