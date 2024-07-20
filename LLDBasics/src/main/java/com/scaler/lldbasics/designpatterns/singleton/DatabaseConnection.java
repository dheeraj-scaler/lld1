package com.scaler.lldbasics.designpatterns.singleton;

public class DatabaseConnection {

    // Double check locking
    //private static  DatabaseConnection dbc = null;

    // Eager implementation
    //private static DatabaseConnection dbc = new DatabaseConnection();

    // Synchronized impl
    private static  DatabaseConnection dbc = null;

    private DatabaseConnection() {

    }


    // Double check locking
//    public static DatabaseConnection getInstance() {
//        if (dbc == null) {
//            synchronized (DatabaseConnection.class) {
//                if(dbc == null) {
//                    dbc = new DatabaseConnection();
//                }
//            }
//        }
//        return dbc;
//    }


    // Eager implementation
//    public static DatabaseConnection getInstance() {
//        return dbc;
//    }

    public synchronized static DatabaseConnection getInstance() {
        if( dbc == null) {
            dbc = new DatabaseConnection();
        }
        return dbc;
    }
}
