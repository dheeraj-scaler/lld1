package com.scaler.lldbasics.parkinglot.services;

import com.scaler.lldbasics.parkinglot.factory.SpotAssignmentStrategyFactory;
import com.scaler.lldbasics.parkinglot.models.*;
import com.scaler.lldbasics.parkinglot.repositories.GateRepository;
import com.scaler.lldbasics.parkinglot.repositories.ParkingLotRepository;
import com.scaler.lldbasics.parkinglot.repositories.TicketRepository;
import com.scaler.lldbasics.parkinglot.repositories.VehicleRepository;
import com.scaler.lldbasics.parkinglot.strategies.SpotAssignmentStrategy;

import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository, VehicleRepository vehicleRepository) {
        this.gateRepository = gateRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber,
                              String ownerName, VehicleType vehicleType) {

        Ticket ticket = new Ticket();
        // Get the gate object from gateId
        Optional<Gate> gate = gateRepository.findGateById(gateId);
        Gate curGate;
        if(gate.isEmpty()) {
            // Throw some Exception
            curGate = new Gate();
            curGate.setGateNumber(123);
            curGate.setId(gateId);
        } else {
            curGate= gate.get();
        }
        ticket.setGate(curGate);
        // Get the vehicle object. If it is not present, save in the db

        Optional<Vehicle> vehicle = vehicleRepository.findVehicleByVehicleNumber(vehicleNumber);
        Vehicle current;
        if(vehicle.isEmpty()) {
            Vehicle newV = new Vehicle();
            newV.setVehicleOwner(ownerName);
            // set type and other params
            current = vehicleRepository.save(newV);

        } else {
            current = vehicle.get();
        }
        ticket.setVehicle(current);
        // Get the parking lot object using gateId
        // Use spot assignment strategy to find the spot

//        ParkingLot parkingLot = parkingLotRepository.getParkingLotByGateId(gateId);
//        SpotAssignmentStrategyType type = parkingLot.getSpotAssignmentStrategyType();
//
//        SpotAssignmentStrategy spotAssignmentStrategy = SpotAssignmentStrategyFactory.getSpotStrategy(type);
//        ParkingSpot ps = spotAssignmentStrategy.assignSpot(vehicleType, gateId);
//        ticket.setParkingSpot(ps);
        return ticket;
    }
}
