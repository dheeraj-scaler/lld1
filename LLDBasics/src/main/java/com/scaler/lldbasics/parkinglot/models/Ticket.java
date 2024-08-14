package com.scaler.lldbasics.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel {
    private Vehicle vehicle;
    private Gate gate;
    private ParkingSpot parkingSpot;
    private Date entryTime;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle=" + vehicle +
                ", gate=" + gate +
                ", parkingSpot=" + parkingSpot +
                ", entryTime=" + entryTime +
                '}';
    }
}
