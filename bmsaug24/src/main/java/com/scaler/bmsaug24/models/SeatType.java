package com.scaler.bmsaug24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SeatType extends BaseModel {
    // You can make this enum of you know all the
    // seat types
    private String value;
}
