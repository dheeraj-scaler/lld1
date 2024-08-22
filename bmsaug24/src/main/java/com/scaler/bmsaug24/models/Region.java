package com.scaler.bmsaug24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Region extends BaseModel {
    private String name;
    //private List<Theatre> theatres;
}
