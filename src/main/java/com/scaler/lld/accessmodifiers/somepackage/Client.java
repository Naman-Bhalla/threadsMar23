package com.scaler.lld.accessmodifiers.somepackage;

public class Client {

    public static void main(String[] args) {

        Student student = new Student();

//        student.name = "Naman";
        student.univName = "IIT";
        student.batch = "May 21";
        student.parentName = "Sudhanshu";

        student.doSomething();
    }
}
