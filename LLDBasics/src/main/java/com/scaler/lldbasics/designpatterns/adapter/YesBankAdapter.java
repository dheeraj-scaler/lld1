package com.scaler.lldbasics.designpatterns.adapter;

public class YesBankAdapter implements BankApi {
    YesBankApi yesBankAPI = new YesBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("YB API: Sending " + amount + " rs from " + fromAcc + " to " + toAcc);
        return false;
    }
}