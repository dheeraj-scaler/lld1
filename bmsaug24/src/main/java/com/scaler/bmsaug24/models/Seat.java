package com.scaler.bmsaug24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel {
    private String seatNumber;
    private int rowVal;
    private int colVal;

    @ManyToOne
    private SeatType seatType;
}

/**
 1              1
 Seat ------ SeatType
 M              1


 **/
