package com.scaler.lld.designpatterns.prototype.sol3;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    @Override
    public IntelligentStudent copy() {
        IntelligentStudent isCopy = (IntelligentStudent) super.copy();
        isCopy.iq = 1800;

        return new IntelligentStudent(this);
    }
}
