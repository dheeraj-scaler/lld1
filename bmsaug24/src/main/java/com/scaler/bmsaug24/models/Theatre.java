package com.scaler.bmsaug24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Theatre extends BaseModel {
    private String name;
    @OneToMany
    private List<Screen> screens;
    @ManyToOne
    private Region region;
}


/**
 1                   1
 Theatre ------ Region
 M                 1

 1                   M
 Theatre ------ Screen
 1                 1

 **/