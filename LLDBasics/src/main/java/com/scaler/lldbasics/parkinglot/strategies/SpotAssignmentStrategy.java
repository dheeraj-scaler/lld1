package com.scaler.lldbasics.parkinglot.strategies;

import com.scaler.lldbasics.parkinglot.models.ParkingLot;
import com.scaler.lldbasics.parkinglot.models.ParkingSpot;
import com.scaler.lldbasics.parkinglot.models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assignSpot(VehicleType vehicleType, Long gateId);
}
