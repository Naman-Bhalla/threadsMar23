package com.scaler.lld.constructors;

public class Student {
    private String name;
    String univName;
    protected String batch;
    public String parentName;

    // Default access modifier of a custom constructor is default
    public Student() {

        System.out.println("Student constructor called");
    }

    public void doSomething() {
        System.out.println(name + " is doing something");
    }
}
