package com.scaler.lldbasics.designpatterns.adapter;

public class PhonePe {
    public static void main(String[] args) {
        BankApi bankAPI = new ICICIBankAdapter();

        String rajatAccNo = "1234";
        String sharmiliAccNo = "4321";

        double amount = 100.0;

        bankAPI.sendMoney(rajatAccNo, sharmiliAccNo, amount);
    }
}
