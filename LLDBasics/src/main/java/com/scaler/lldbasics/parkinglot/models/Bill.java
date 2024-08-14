package com.scaler.lldbasics.parkinglot.models;

import java.util.Date;

public class Bill extends BaseModel {
    private Ticket ticket;
    private Gate gate;
    private Date exitTime;
    private BillStatus billStatus;
    private Payment payment;
    private double amount;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
