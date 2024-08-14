package com.scaler.lldbasics.parkinglot.models;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
