package com.scaler.lldbasics.threads;

//public class NumberPrinter implements Runnable{
//    private int numberToPrint;
//    NumberPrinter(int numberToPrint){
//        this.numberToPrint = numberToPrint;
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Printing" + this.numberToPrint + ". Printed by Thread" + Thread.currentThread().getName());
//    }
//}

public class NumberPrinter implements Runnable {

    private int currentNumber;

    public NumberPrinter(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    @Override
    public void run() {
        System.out.println("We are printing" + this.currentNumber + " The thread executing this function is " + Thread.currentThread().getName());
    }
}
