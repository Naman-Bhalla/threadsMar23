package com.scaler.lld.designpatterns.prototype.sol3;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
