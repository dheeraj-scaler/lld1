package com.scaler.bmsaug24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity (name = "shows")
@Getter
@Setter
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;
    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}

/**
 1              1
 Show ------ Movie
 M              1

 1              1
 Show ------ Screen
 M              1

 **/

