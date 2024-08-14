package com.scaler.lldbasics.parkinglot.models;

public class ParkingSpot extends BaseModel{
    private int number;
    private ParkingSpotStatus parkingSpotStatus;
    private VehicleType vehicleType;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
