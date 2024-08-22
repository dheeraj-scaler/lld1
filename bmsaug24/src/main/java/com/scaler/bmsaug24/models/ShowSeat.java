package com.scaler.bmsaug24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}


/**
 1              1
 ShowSeat ------ Show
 M              1

 1              1
 ShowSeat ------ Seat
 M              1

 **/
