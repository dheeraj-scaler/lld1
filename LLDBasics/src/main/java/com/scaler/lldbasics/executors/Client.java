package com.scaler.lldbasics.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client{
    public static void main(String[] args){
        Executor executor = Executors.newFixedThreadPool(10);
        //Executor executor = Executors.newCachedThreadPool();
        for(int i = 0;i <= 100; ++ i){
//            if (i==5 || i==10 || i==15) {
//                System.out.println("Stop here");
//            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executor.execute(numberPrinter);
        }
    }
}