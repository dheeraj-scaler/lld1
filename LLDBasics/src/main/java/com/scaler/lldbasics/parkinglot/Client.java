package com.scaler.lldbasics.parkinglot;

import com.scaler.lldbasics.parkinglot.controllers.TicketController;
import com.scaler.lldbasics.parkinglot.dtos.IssueTicketRequestDto;
import com.scaler.lldbasics.parkinglot.dtos.IssueTicketResponseDto;
import com.scaler.lldbasics.parkinglot.models.Ticket;
import com.scaler.lldbasics.parkinglot.models.VehicleType;
import com.scaler.lldbasics.parkinglot.repositories.GateRepository;
import com.scaler.lldbasics.parkinglot.repositories.ParkingLotRepository;
import com.scaler.lldbasics.parkinglot.repositories.TicketRepository;
import com.scaler.lldbasics.parkinglot.repositories.VehicleRepository;
import com.scaler.lldbasics.parkinglot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        // Crete a ticket

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleNumber("KA07J");
        requestDto.setVehicleOwnerName("Madhu");
        requestDto.setVehicleType(VehicleType.SUV);

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository, parkingLotRepository, ticketRepository, vehicleRepository);
        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto ticket = ticketController.issueTicket(requestDto);
        System.out.println(ticket.getTicket());
    }
}
