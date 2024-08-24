package com.scaler.bmsaug24.services;

import com.scaler.bmsaug24.models.Show;
import com.scaler.bmsaug24.models.ShowSeat;
import com.scaler.bmsaug24.models.ShowSeatType;
import com.scaler.bmsaug24.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculationService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculationService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(List<ShowSeat> showSeats, Show show) {
        // Get the showSeatType using showId

        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShowId(show.getId());

        int amount = 0;

        // O(n*n)
        for(ShowSeat showSeat: showSeats) { // 10
            for(ShowSeatType showSeatType : showSeatTypes) { // 10
                if(showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
