package com.scaler.lld.oop;

public class Client {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.batch = "May 21";
        st1.name = "Naman";
        st1.changeBatch("Aug 21");

        Student st2 = new Student();
        st2.batch = "Jun 21";
        st2.name = "Sudhanshu";
        st2.psp = 91.0;
        st2.applyForJob(12);
        st2.changeBatch("Nov 21");
    }
}
