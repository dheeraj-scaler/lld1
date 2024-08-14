package com.scaler.lldbasics.parkinglot.controllers;

import com.scaler.lldbasics.parkinglot.dtos.IssueTicketRequestDto;
import com.scaler.lldbasics.parkinglot.dtos.IssueTicketResponseDto;
import com.scaler.lldbasics.parkinglot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        // call service method here
        return null;
    }
}
