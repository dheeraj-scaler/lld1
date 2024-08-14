package com.scaler.lldbasics.parkinglot.strategies;

import com.scaler.lldbasics.parkinglot.models.ParkingSpot;
import com.scaler.lldbasics.parkinglot.models.VehicleType;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Long gateId) {
        // Get Parking lot from repository using gate id
        // pick random parking sport for the vehicle type
        // hw
        return null;
    }
}
