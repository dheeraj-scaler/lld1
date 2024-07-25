package com.scaler.lldbasics.designpatterns.prototype;

public class IntelligentStudent extends Student {
    int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {

    }

    public IntelligentStudent(IntelligentStudent is) {
        super(is); // fill thr attributes of student for us
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
