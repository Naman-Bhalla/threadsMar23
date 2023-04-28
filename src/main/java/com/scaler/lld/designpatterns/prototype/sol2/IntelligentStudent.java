package com.scaler.lld.designpatterns.prototype.sol2;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

}
