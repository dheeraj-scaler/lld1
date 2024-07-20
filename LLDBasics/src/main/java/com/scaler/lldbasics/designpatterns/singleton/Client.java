package com.scaler.lldbasics.designpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance();
        DatabaseConnection dbc2 = DatabaseConnection.getInstance();

        System.out.println("Debug here");
    }
}
