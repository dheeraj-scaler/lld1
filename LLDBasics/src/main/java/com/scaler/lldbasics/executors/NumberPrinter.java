package com.scaler.lldbasics.executors;

public class NumberPrinter implements Runnable{
    private int numberToPrint;
    NumberPrinter(int numberToPrint){
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run(){
        System.out.println("Printing " + this.numberToPrint + ". Printed by Thread " + Thread.currentThread().getName());
    }
}