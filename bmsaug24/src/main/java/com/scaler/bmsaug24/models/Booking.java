package com.scaler.bmsaug24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {

    @ManyToOne
    private User bookedBy;

    @OneToMany
    private List<ShowSeat> showSeats;
    private Date bookedAt;
    private int amount;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;

    @OneToMany
    private List<Payment> payments;
}
/**
1              1
Booking ------ User
 M              1


 1              M
Booking ------ ShowSeat
 1              1

 1            M
 Booking --- Payment
 1            1
 **/
