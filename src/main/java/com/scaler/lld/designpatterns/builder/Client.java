package com.scaler.lld.designpatterns.builder;

public class Client {

    public static void main(String[] args) throws Exception {
//        Builder b = Student.getBuilder();
//        b.setName("Naman");
//        b.setAge(24);
//        b.setGender("Male");
//
//        if (!b.validate()) {
//            throw  new Exception("Blah blah blah");
//        }
//
//        Student st = new Student(b);

        // Metod Chaining
        // student.getBuilder().setName(naman).setAge(24).setGender(Male).build();

        Student s = Student.getBuilder()
                .setAddress("House Number 1041")
                .setPsp(87.0)
                .setName("Naman")
                .setGender("Male")
                .build();

//        Student s2 = new Student(null);
    }

}
