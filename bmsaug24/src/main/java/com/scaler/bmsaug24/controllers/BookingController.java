package com.scaler.bmsaug24.controllers;

import com.scaler.bmsaug24.dtos.BookMovieRequestDto;
import com.scaler.bmsaug24.dtos.BookMovieResponseDto;
import com.scaler.bmsaug24.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookMovieResponseDto BookMovieTicket(BookMovieRequestDto request) {
        return null;
    }
}
