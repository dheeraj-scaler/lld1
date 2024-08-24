package com.scaler.bmsaug24.repositories;

import com.scaler.bmsaug24.models.Show;
import com.scaler.bmsaug24.models.ShowSeatType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
    List<ShowSeatType> findAllByShowId(Long showId);
}
