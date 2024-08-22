package com.scaler.bmsaug24.services;

import com.scaler.bmsaug24.dtos.BookMovieRequestDto;
import com.scaler.bmsaug24.models.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    public Booking bookMovie(Long userId, Long showId, List<Long> seatIds) {
        return null;
    }
}
