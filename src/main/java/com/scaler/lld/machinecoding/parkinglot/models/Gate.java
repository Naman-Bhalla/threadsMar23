package com.scaler.lld.machinecoding.parkinglot.models;

public class Gate extends BaseModel {
    private int gateNUmber;
    private Operator currentOperator;
    private GateStatus gateStatus;
    private GateType gateType;

    public int getGateNUmber() {
        return gateNUmber;
    }

    public void setGateNUmber(int gateNUmber) {
        this.gateNUmber = gateNUmber;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
