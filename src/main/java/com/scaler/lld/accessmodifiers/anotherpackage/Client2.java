package com.scaler.lld.accessmodifiers.anotherpackage;

import com.scaler.lld.accessmodifiers.somepackage.Student;

public class Client2 {

    public static void main(String[] args) {
        Student student = new Student();
//        student.univName = "IIT";
//        student.batch = "May 21";
        student.parentName = "Sudhanshu";
    }
}
