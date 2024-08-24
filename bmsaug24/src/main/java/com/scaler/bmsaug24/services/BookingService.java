package com.scaler.bmsaug24.services;

import com.scaler.bmsaug24.dtos.BookMovieRequestDto;
import com.scaler.bmsaug24.exceptions.SeatNotAvailableException;
import com.scaler.bmsaug24.exceptions.ShowNotFoundException;
import com.scaler.bmsaug24.exceptions.UserNotFoundException;
import com.scaler.bmsaug24.models.*;
import com.scaler.bmsaug24.repositories.ShowRepository;
import com.scaler.bmsaug24.repositories.ShowSeatRepository;
import com.scaler.bmsaug24.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    private  ShowRepository showRepository;
    private UserRepository userRepository;
    private ShowSeatRepository showSeatRepository;
    private PriceCalculationService priceCalculationService;


    public BookingService(ShowRepository showRepository, UserRepository userRepository, ShowSeatRepository showSeatRepository, PriceCalculationService priceCalculationService) {
        this.showRepository = showRepository;
        this.userRepository = userRepository;
        this.showSeatRepository = showSeatRepository;
        this.priceCalculationService = priceCalculationService;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(Long userId, Long showId, List<Long> seatIds) throws UserNotFoundException, ShowNotFoundException, SeatNotAvailableException {
        // Get the user from DB using userId
        // Get the show from DB using showId
        // Get all the ShowSeat using seatIds
        // check status
        // TAKE A LOCK (Check the status again inside)
        // If it is not available, throw error
        // If yes, mark the seat status to Blocked
        // RELEASE THE LOCK
        // Move to the payments page

        // 1. Get the user from DB using userId
        Optional<User> userOptional = userRepository.findById(userId);

        if(userOptional.isEmpty()) {
            throw new UserNotFoundException("Invalid User");
        }

        User user = userOptional.get();

        //2. Get the show from DB using showId
        Optional<Show> showOptional = showRepository.findById(showId);

        if(showOptional.isEmpty()) {
            throw new ShowNotFoundException("Invalid Swow");
        }

        Show show = showOptional.get();

        //3.  Get all the ShowSeat using seatIds
        List<ShowSeat> showSeats = showSeatRepository.findAllById(seatIds);

        //4.  check status
        //5.  If it is not available, throw error
        for(ShowSeat showSeat: showSeats) {
            if(!showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)) {
                // throw exception
                throw new SeatNotAvailableException("Seat is not available anymore");
            }
        }

        // 6. If yes, mark the seat status to Blocked
        for(ShowSeat showSeat: showSeats) {
            showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
            // 7. Change the status in the database
            showSeatRepository.save(showSeat);
        }

        Booking booking = new Booking();
        booking.setBookedBy(user);
        booking.setShowSeats(showSeats);
        booking.setBookedAt(new Date());
        booking.setAmount(priceCalculationService.calculatePrice(showSeats, show));


        // Call the payment service after calculating the price
        //         booking.setPayments();
        return booking;
    }
}
