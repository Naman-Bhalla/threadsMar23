package com.scaler.lld.accessmodifiers.anotherpackage;

import com.scaler.lld.accessmodifiers.somepackage.Student;

import java.util.Stack;

public class StudentChild extends Student {

    StudentChild() {
        batch = "May 21";
    }

    public static void main(String[] args) {
        StudentChild student = new StudentChild();
        student.batch = "May 21";
        student.parentName = "Sudhanshu";
    }
}
