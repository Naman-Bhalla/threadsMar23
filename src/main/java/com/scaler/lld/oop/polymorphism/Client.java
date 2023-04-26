package com.scaler.lld.oop.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {

    void changePassword(User u) {}
    void changePassword(Student st) {}


    public static void main(String[] args) {
        User u = new Student();
        u.setAge(24);
        u.setGender("Male");

//        u.setPsp(81.0);

        List<User> users = List.of(
                new Student(),
                new TA(),
                new Mentor(),
                new User()
        );

        for (User user: users) {
            ((Student)user).setPsp(81.0);
        }

        List<User> u1 = new ArrayList<>();
//        List<User> u2 = new LinkedList<>();


    }
}
