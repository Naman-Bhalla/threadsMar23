package com.scaler.lld.designpatterns.prototype.sol2;

public class Main {

    public static void main(String[] args) {
        Student st = null;
        Student copy;

        if (st instanceof IntelligentStudent) {
            copy = new IntelligentStudent((IntelligentStudent) st);
            // unable to access iq
            // unable to access private attrs
        } else if (st instanceof Student) {
            copy = new Student(st);
            // unable to access private attrs
        }


    }
}
