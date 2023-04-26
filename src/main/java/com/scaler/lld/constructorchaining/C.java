package com.scaler.lld.constructorchaining;

public class C extends B {

    C(String name) {
        super(name, 10);
        System.out.println("C with name");
    }

    C() {
        super("Naman", 10);
        System.out.println("C with nothing");
    }
}
